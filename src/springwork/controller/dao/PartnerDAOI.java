package springwork.controller.dao;

import java.util.List;

import springwork.controller.models.Partner;

public interface PartnerDAOI {


	int pickCarPreferences(Partner partner);

	int updatePartnerInfo(Partner partner);

	long delete(long partid);

	Partner getPartnerById(long partid);

	List<Partner> getPartnerpref();
}
