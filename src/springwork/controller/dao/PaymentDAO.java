package springwork.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springwork.controller.models.Payment;



public class PaymentDAO implements PaymentDAOI{
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
@Override
public int savePayment(Payment payment){  
    String sql="insert into payments(ccid,sid,carreqno) values(?,?,?)";  
    return template.update(sql, payment.getCcid(), payment.getSid(),payment.getCarreqno()); 
}  

@Override
public int verifyAndModifyCreditCard(Payment payment) {
	String sql="update payments set ccid=?, sid=?,carreqno=?";
	return template.update(sql, payment.getCcid(),payment.getSid(),payment.getCarreqno());
}
@Override
public int cancel(int payid){  
    String sql="delete from payments where payid=?";  
    return template.update(sql, payid);  
}  

@Override
public Payment getPaymentById(long payid){  
    String sql="select * from payments where payid=?";  
    return template.queryForObject(sql, new Object[]{payid},new BeanPropertyRowMapper<Payment>(Payment.class));  
}  
@Override
public List<Payment> getPayments(){  
    return template.query("select * from payments",new RowMapper<Payment>(){  
        public Payment mapRow(ResultSet rs, int row) throws SQLException {  
            Payment payment=new Payment();  
            payment.setPayid(rs.getLong("payid"));
            payment.setCcid(rs.getLong("ccid"));
            payment.setSid(rs.getLong("sid"));
            payment.setCarreqno(rs.getLong("carreqno"));
           
            return payment;  
        }  
    });  
}  
}
