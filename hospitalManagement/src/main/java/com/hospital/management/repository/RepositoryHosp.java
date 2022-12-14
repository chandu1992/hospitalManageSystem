package com.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.entities.RegisterUser;

@Repository
public interface RepositoryHosp extends JpaRepository<RegisterUser, Long> {

}
