package springwork.controller.dao;

import java.util.List;

import springwork.controller.models.Cartype;



public interface CartypeDAOI {
	
	int pickCarPreferences(Cartype cartype);


	int updateCarType(Cartype cartype);


	long delete(long sid);


	Cartype getCartypeById(long carreqno);


	List<Cartype> getCartypepref();


}