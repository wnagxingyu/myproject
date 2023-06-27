package com.example.wxy.Controller;

import com.example.wxy.entity.Family;
import com.example.wxy.service.FamilyService;
import com.example.wxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Family")
public class FamilyController {
    @Autowired
    private FamilyService familyService;
    @GetMapping("/list")
    public List<Family>list(){
        return familyService.list();
    }

}
