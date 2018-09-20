package springwork.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springwork.controller.models.CreditCardInfo;


public class CreditCardInfoDAO implements CreditCardInfoDAOI{
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	@Override
	public int addCreditCard(CreditCardInfo creditcardinfo){  
	    String sql="insert into creditcardinfo(cid,ccnumber,secid, zip, expires) values(?, ?, ?, ?)";  
	    return template.update(sql, creditcardinfo.getCid(), creditcardinfo.getCcnumber(), creditcardinfo.getSecId(), creditcardinfo.getZip(), creditcardinfo.getExpires());  
	}  

	@Override
	public int updateCreditCard(CreditCardInfo creditcardinfo) {
		String sql="update creditcardinfo set ccnumber=?,sid=?, zip=?,expires=?";
		return template.update(sql, creditcardinfo.getCcnumber(),creditcardinfo.getSecId(), creditcardinfo.getZip(), creditcardinfo.getExpires());
	}
	
	@Override
	public long delete(long cid){  
	    String sql="delete from customers where ccid=?";  
	    return template.update(sql, cid);  
	}  
	@Override
	public CreditCardInfo getCreditCardById(long ccid){  
	    String sql="select * from creditcardinfo where ccid=?";  
	    return template.queryForObject(sql, new Object[]{ccid},new BeanPropertyRowMapper<CreditCardInfo>(CreditCardInfo.class));  
	}  
	@Override
	public List<CreditCardInfo> getCreditCards(){  
	    return template.query("select * from creditcardinfo",new RowMapper<CreditCardInfo>(){  
	        public CreditCardInfo mapRow(ResultSet rs, int row) throws SQLException {  
	            CreditCardInfo creditcardinfo=new CreditCardInfo();  
	            creditcardinfo.setCcid(rs.getLong("ccid"));
	            creditcardinfo.setCid(rs.getLong("cid"));  
	            creditcardinfo.setCcnumber(rs.getLong("ccnumber"));  
	            creditcardinfo.setSecId(rs.getInt("secId"));  
	            creditcardinfo.setZip(rs.getInt("zip"));
	            return creditcardinfo;  
	        }  
	    });  
	}  

}
