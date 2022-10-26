package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.boot.entity.CustomerCare;

public interface CustomerCareRepo extends JpaRepository<CustomerCare, Long>{

}
