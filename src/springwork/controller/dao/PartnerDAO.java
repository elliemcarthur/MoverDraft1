package springwork.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import springwork.controller.models.Partner;

public class PartnerDAO implements PartnerDAOI {


	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	@Override
	public int pickCarPreferences(Partner partner){  
	    String sql="insert into partners(userid,city,state, gotcar,cartype) values(?, ?, ?,?, ?)";  
	    return template.update(sql, partner.getUserid(), partner.getCity(), partner.getState(), partner.getGotcar(), partner.getCartype());  
	}  

	@Override
	public int updatePartnerInfo(Partner partner) {
		String sql="update partners set city=?,state=?, gotcar=?, cartype=?";
		return template.update(sql, partner.getCity(), partner.getState(), partner.getGotcar(), partner.getCartype());
	}
	
	@Override
	public long delete(long partid){  
	    String sql="delete from partners where partid=?";  
	    return template.update(sql, partid);  
	}  
	@Override
	public Partner getPartnerById(long partid){  
	    String sql="select * from partners where partid=?";  
	    return template.queryForObject(sql, new Object[]{partid},new BeanPropertyRowMapper<Partner>(Partner.class));  
	}  
	@Override
	public List<Partner> getPartnerpref(){  
	    return template.query("select * from partners",new RowMapper<Partner>(){  
	        public Partner mapRow(ResultSet rs, int row) throws SQLException {  
	            Partner partner=new Partner();  
	            partner.setPartid(rs.getLong("partid"));
	            partner.setUserid(rs.getLong("userid"));  
	            partner.setCity(rs.getString("city"));  
	            partner.setState(rs.getString("state"));  
	            partner.setGotcar(rs.getInt("gotcar"));
	            partner.setCartype(rs.getString("cartype"));
	            return partner;  
	        }  
	    });  
	}  

}
