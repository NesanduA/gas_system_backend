package org.example.controller;

import org.example.dto.Admin;
import org.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/save")
    public void create(@RequestBody Admin admin){
        adminService.saveAdmin(admin);

    }
    @GetMapping("/get-all")
    public List<Admin> getAllAdmins(){
        return adminService.getAllAdmin();

    }
}

