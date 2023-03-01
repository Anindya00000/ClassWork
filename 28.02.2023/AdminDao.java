package com.ars.dao;

import com.ars.entity.Admin;

public interface AdminDao 
{
  void registerAdmin(Admin admin);
  boolean loginAdmin(String username,String password);
}
