package com.nbptechnologies.aaplaneta.controllers;

import com.nbptechnologies.aaplaneta.models.AppInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ApplicationDetails {

@GetMapping("/appinfo")
public AppInfo getAppDetails(){
return new AppInfo(1,"Applinfo");
}
}
