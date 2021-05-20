package com.example.springit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springit.entity.Link;
import com.example.springit.service.LinkService;

@RestController
@RequestMapping("/links")
public class LinkController {
	
	@Autowired
	private LinkService linkService;
	
	@GetMapping("/")
	public List<Link> getLinks(){
		return linkService.getLinks();
	}
	
	@GetMapping("/{id}")
	public Optional<Link> getLink(@PathVariable("id") Long id){
		return linkService.getLink(id);
	}
	
	
	@PostMapping("/create")
	public Link createLink(@ModelAttribute Link link) {
		return linkService.createLink(link);
	}
	
	@PutMapping("/update/{id}")
	public Link updateLink(@ModelAttribute Link link, @PathVariable("id") Long id) {
		link.setId(id);
		return linkService.updateLink(link);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLink(@PathVariable("id") Long id) {
		 linkService.deleteLink(id);
	}
}
