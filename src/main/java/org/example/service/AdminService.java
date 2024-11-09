package org.example.service;

import org.example.dto.Admin;

import java.util.List;

public interface AdminService {
    void saveAdmin(Admin admin);
    List<Admin> getAllAdmin();
}
