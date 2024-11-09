package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entity.Admin;
import org.example.repository.AdminRepository;
import org.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

@Autowired
private ObjectMapper objectMapper;
    @Override
    public void saveAdmin(org.example.dto.Admin admin) {
        adminRepository.save(objectMapper.convertValue(admin,Admin.class));
    }

    @Override
    public List<org.example.dto.Admin> getAllAdmin() {
        List<Admin> all = adminRepository.findAll();
        ArrayList<org.example.dto.Admin> admins = new ArrayList<>();
        for (Admin admin:all){
            org.example.dto.Admin admin1 = objectMapper.convertValue(admin, org.example.dto.Admin.class);
            admins.add(admin1);

        }
        return admins;
    }
}
