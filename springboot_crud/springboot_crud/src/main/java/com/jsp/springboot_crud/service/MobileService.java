package com.jsp.springboot_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot_crud.dao.MobileDao;
import com.jsp.springboot_crud.dto.Mobile;

@Service
public class MobileService {
  @Autowired
  MobileDao mobileDao;
  public Mobile saveMobile(Mobile mobile) {
	return mobileDao.saveMobile(mobile);
  }
  public List<Mobile> getAllMobile(){
	  return mobileDao.getAllMobile();
  }
  public Mobile getMobileById(int id) {
	  return mobileDao.getMobileById(id);
  }
  public String deleteMobile(int id) {
	  return mobileDao.deleteMobile(id);
  }
  public Mobile updateMobile(Mobile mobile) {
	  return mobileDao.updateMobile(mobile);
  }
}
