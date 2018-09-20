package springwork.controller.dao;

import java.util.List;

import springwork.controller.models.CreditCardInfo;


public interface CreditCardInfoDAOI {


	int addCreditCard(CreditCardInfo creditcardinfo);

	int updateCreditCard(CreditCardInfo creditcardinfo);

	long delete(long cid);

	CreditCardInfo getCreditCardById(long ccid);

	List<CreditCardInfo> getCreditCards();
}
