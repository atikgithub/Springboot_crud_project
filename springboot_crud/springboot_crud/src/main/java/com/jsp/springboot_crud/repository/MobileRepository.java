package com.jsp.springboot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot_crud.dto.Mobile;

public interface MobileRepository extends JpaRepository<Mobile,Integer> {

}
