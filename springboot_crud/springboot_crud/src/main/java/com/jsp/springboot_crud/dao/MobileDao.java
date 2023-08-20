package com.jsp.springboot_crud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springboot_crud.dto.Mobile;
import com.jsp.springboot_crud.repository.MobileRepository;
@Repository
public class MobileDao {
	@Autowired
	MobileRepository mobileRepository;
	//save code
   public Mobile saveMobile(Mobile mobile) {   
	return mobileRepository.save(mobile);   
   }
   //display code
   public List<Mobile> getAllMobile() {
	   return mobileRepository.findAll();   
   }
   // Find by Id code
   public Mobile getMobileById(int id) {
	    Optional<Mobile> optional = mobileRepository.findById(id);
	    return optional.get();
   }
   
   public String  deleteMobile(int id) {
	  Optional< Mobile> optional= mobileRepository.findById(id);
	  if(optional.get() != null) {
		  mobileRepository.delete(optional.get());
		  return "date Deleted";
	  }
	  return null;
   }
   public Mobile updateMobile(Mobile mobile) {
	   Optional<Mobile> optional= mobileRepository.findById( mobile.getId());
	   if(optional.get() != null) {
			return mobileRepository.save(mobile);
			  
		  }
		  return null;
   }
}
