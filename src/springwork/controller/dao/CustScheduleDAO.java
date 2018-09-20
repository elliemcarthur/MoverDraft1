package springwork.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springwork.controller.models.CustSchedule;



public class CustScheduleDAO implements CustScheduleDAOI{
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	@Override
	public int registerCustSchedule(CustSchedule custschedule){  
	    String sql="insert into custschedule(ampm,sched,city,state, ccid) values(?, ?, ?, ?,?)";  
	    return template.update(sql, custschedule.getAmpm(), custschedule.getSched(), custschedule.getCity(), custschedule.getState(), custschedule.getCcid());  
	}  

	@Override
	public int updateCustSched(CustSchedule custschedule) {
		String sql="update custschedule set ampm=?,sched=?,city=?,state=?, ccid=?";
		return template.update(sql, custschedule.getAmpm(), custschedule.getSched(), custschedule.getCity(),custschedule.getState(), custschedule.getCcid());
	}
	
	@Override
	public long delete(long cid){  
	    String sql="delete from reguser where cid=?";  
	    return template.update(sql, cid);  
	}  
	@Override
	public CustSchedule getCustScheduleById(long sid){  
	    String sql="select * from custschedule where sid=?";  
	    return template.queryForObject(sql, new Object[]{sid},new BeanPropertyRowMapper<CustSchedule>(CustSchedule.class));  
	}  
	@Override
	public List<CustSchedule> getCustSchedules(){  
	    return template.query("select * from custschedule",new RowMapper<CustSchedule>(){  
	        public CustSchedule mapRow(ResultSet rs, int row) throws SQLException {  
	            CustSchedule custschedule=new CustSchedule();  
	            custschedule.setSid(rs.getLong("sid"));
	            custschedule.setAmpm(rs.getString("ampm"));  
	            custschedule.setCity(rs.getString("city"));  
	            custschedule.setState(rs.getString("state"));  
	            return custschedule;  
	        }  
	    });  
	}  

}
