package com.gft.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
