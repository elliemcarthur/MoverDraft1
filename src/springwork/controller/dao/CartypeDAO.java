package springwork.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springwork.controller.models.Cartype;


public class CartypeDAO implements CartypeDAOI {
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	@Override
	public int pickCarPreferences(Cartype cartype){  
	    String sql="insert into custcartype(needcar,carpref,ccid) values(?, ?, ?)";  
	    return template.update(sql, cartype.getNeedcar(), cartype.getCarpref(), cartype.getCcid());  
	}  

	@Override
	public int updateCarType(Cartype cartype) {
		String sql="update custcartype set needcar=?,carpref=?, ccid=?";
		return template.update(sql, cartype.getNeedcar(), cartype.getCarpref(), cartype.getCcid());
	}
	
	@Override
	public long delete(long sid){  
	    String sql="delete from custcartype where sid=?";  
	    return template.update(sql, sid);  
	}  
	@Override
	public Cartype getCartypeById(long carreqno){  
	    String sql="select * from custcartype where carreqno=?";  
	    return template.queryForObject(sql, new Object[]{carreqno},new BeanPropertyRowMapper<Cartype>(Cartype.class));  
	}  
	@Override
	public List<Cartype> getCartypepref(){  
	    return template.query("select * from custcartype",new RowMapper<Cartype>(){  
	        public Cartype mapRow(ResultSet rs, int row) throws SQLException {  
	            Cartype cartype=new Cartype();  
	            cartype.setCarreqno(rs.getLong("carreqno"));
	            cartype.setNeedcar(rs.getInt("neecar"));  
	            cartype.setCarpref(rs.getString("carpref"));  
	            cartype.setCcid(rs.getLong("ccid"));  
	            return cartype;  
	        }  
	    });  
	}  

}
