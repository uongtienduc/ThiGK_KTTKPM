package com.example.OnThiGKKTTKPM.controller;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnThiGKKTTKPM.model.Orther;
import com.example.OnThiGKKTTKPM.repository.OrtherService;
import com.fasterxml.jackson.databind.util.JSONPObject;



@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
	@Autowired
	private OrtherService  chuyenBayRepository;
	
	@GetMapping("/dschuyenbay")
	public List<Orther> getAllChuyenBay(){
		return chuyenBayRepository.findAll();
	}
	
	
    @PostMapping("/createOrther")
    public Orther sendmessage(@RequestBody JSONObject data ){
    	String idOrther = data.get("idOrther") + "";
    	String name = data.get("name") + "";
    	String price = data.get("price") + "";
		Orther orther = new Orther(idOrther, name, price);
       return chuyenBayRepository.saveAndFlush(orther);
    }
	
}
