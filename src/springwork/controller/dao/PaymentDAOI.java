package springwork.controller.dao;

import java.util.List;

import springwork.controller.models.Payment;


public interface PaymentDAOI {
	

	int savePayment(Payment payment);

	int verifyAndModifyCreditCard(Payment payment);

	int cancel(int payid);

	List<Payment> getPayments();

	Payment getPaymentById(long payid);






}
