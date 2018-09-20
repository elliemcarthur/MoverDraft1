package springwork.controller.dao;

import java.util.List;

import springwork.controller.models.CustSchedule;


public interface CustScheduleDAOI {


	int registerCustSchedule(CustSchedule custschedule);


	int updateCustSched(CustSchedule custschedule);


	long delete(long cid);


	CustSchedule getCustScheduleById(long sid);


	List<CustSchedule> getCustSchedules();
}
