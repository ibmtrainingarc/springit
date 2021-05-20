package com.example.springit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springit.entity.Link;
import com.example.springit.repository.LinkRepository;

@Service
public class LinkService {
	
	@Autowired
	private LinkRepository linkRepository;

	public List<Link> getLinks() {
		return linkRepository.findAll();
	}

	public Optional<Link> getLink(Long id) {
		return linkRepository.findById(id);
	}

	public Link createLink(Link link) {
		Link savedLink = linkRepository.save(link);
		return savedLink;
	}

	public Link updateLink(Link link) {
		return linkRepository.save(link);
	}

	public void deleteLink(Long id) {
		linkRepository.deleteById(id);
	}
	
	

	
	
}
