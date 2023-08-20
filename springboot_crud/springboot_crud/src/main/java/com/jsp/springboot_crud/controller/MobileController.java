package com.jsp.springboot_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot_crud.dto.Mobile;
import com.jsp.springboot_crud.service.MobileService;

@RestController
public class MobileController {
 @Autowired
 MobileService mobileService;
 @PostMapping("/mobile")
 public Mobile saveMobile(@RequestBody Mobile mobile) {
	return mobileService.saveMobile(mobile);
 }
 @GetMapping("/mobile")
 public List<Mobile> getAllMobile(){
	return mobileService.getAllMobile();
 }
 @GetMapping("/mobile/{id}")
  public Mobile geMobileById(@PathVariable int id) {
	  return mobileService.getMobileById(id);
  }
  @DeleteMapping("/mobile/{id}")
  public String deleteMobile(@PathVariable int id) {
	  return mobileService.deleteMobile(id);
  }
  @PutMapping("/mobile")
  public Mobile updateMobile(@RequestBody Mobile mobile) {
	  return mobileService.updateMobile(mobile);
  }
}
