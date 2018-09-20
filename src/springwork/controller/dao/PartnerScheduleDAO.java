package springwork.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import springwork.controller.models.PartnerSchedule;

public class PartnerScheduleDAO implements PartnerScheduleDAOI {

	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	@Override
	public int saveSchedule(PartnerSchedule partnerSchedule){  
	    String sql="insert into partnerschedule(ampm, partid, schedule,city,state, sid) values(?, ?, ?,?, ?)";  
	    return template.update(sql, partnerSchedule.getAmpm(),partnerSchedule.getPartid(), partnerSchedule.getSchedule(),partnerSchedule.getCity(), partnerSchedule.getState(), partnerSchedule.getSid());  
	}  

	@Override
	public int updatePartnerSchedule(PartnerSchedule partnerSchedule) {
		String sql="update partnerschedule set ampm=?, schedule=?,city=?,state=?,sid=?";
		return template.update(sql, partnerSchedule.getAmpm(), partnerSchedule.getSchedule(),partnerSchedule.getCity(), partnerSchedule.getState(), partnerSchedule.getSid());
	}
	
	@Override
	public long delete(long scheduleid){  
	    String sql="delete from partnerschedule where scheduleid=?";  
	    return template.update(sql, scheduleid);  
	}  
	@Override
	public PartnerSchedule getScheduleById(long scheduleid){  
	    String sql="select * from partnerschedule where scheduleid=?";  
	    return template.queryForObject(sql, new Object[]{scheduleid},new BeanPropertyRowMapper<PartnerSchedule>(PartnerSchedule.class));  
	}  
	@Override
	public List<PartnerSchedule> getPartnersSchedules(){  
	    return template.query("select * from partnerschedule",new RowMapper<PartnerSchedule>(){  
	        public PartnerSchedule mapRow(ResultSet rs, int row) throws SQLException {  
	            PartnerSchedule partnerSchedule=new PartnerSchedule();  
	            partnerSchedule.setScheduleid(rs.getLong("scheduleid"));
	            partnerSchedule.setAmpm(rs.getString("ampm"));  
	            partnerSchedule.setPartid(rs.getLong("partid"));
	            partnerSchedule.setSchedule(rs.getDate("schedule"));
	            partnerSchedule.setCity(rs.getString("city"));  
	            partnerSchedule.setState(rs.getString("state"));  
	            partnerSchedule.setSid(rs.getLong("sid"));
	            return partnerSchedule;  
	        }  
	    });  
	}  

}
