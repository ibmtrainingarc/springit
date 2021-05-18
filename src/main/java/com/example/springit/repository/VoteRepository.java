package com.example.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springit.entity.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
