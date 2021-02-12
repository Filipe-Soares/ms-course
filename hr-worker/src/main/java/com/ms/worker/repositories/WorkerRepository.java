package com.ms.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
