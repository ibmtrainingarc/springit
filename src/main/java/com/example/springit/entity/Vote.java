package com.example.springit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
@Data
public class Vote extends Auditable {
	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	private int vote;
}
