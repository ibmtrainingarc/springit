package com.example.springit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springit.entity.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {

	List<Link> findByTitle(String title);
}
