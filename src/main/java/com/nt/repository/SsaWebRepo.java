package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.SsaWebEntity;

@Repository
public interface SsaWebRepo extends JpaRepository<SsaWebEntity, Integer> {

}
