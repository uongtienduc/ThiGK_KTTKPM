package com.example.OnThiGKKTTKPM.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnThiGKKTTKPM.model.Orther;
@Repository
public interface OrtherService extends JpaRepository<Orther, String>{
}
