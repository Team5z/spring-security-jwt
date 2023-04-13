package com.agile.demo.repository;

import com.agile.demo.biz.backlog.BacklogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BacklogRepository extends JpaRepository<BacklogEntity, Long> {
}
