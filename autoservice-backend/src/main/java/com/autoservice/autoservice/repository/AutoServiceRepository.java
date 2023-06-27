package com.autoservice.autoservice.repository;

import com.autoservice.autoservice.model.AutoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoServiceRepository extends JpaRepository<AutoService, Integer> {

}
