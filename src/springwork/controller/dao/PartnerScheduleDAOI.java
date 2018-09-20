package springwork.controller.dao;

import java.util.List;

import springwork.controller.models.PartnerSchedule;

public interface PartnerScheduleDAOI {

	int saveSchedule(PartnerSchedule partnerSchedule);

	int updatePartnerSchedule(PartnerSchedule partnerSchedule);

	long delete(long scheduleid);

	PartnerSchedule getScheduleById(long scheduleid);

	List<PartnerSchedule> getPartnersSchedules();



}
