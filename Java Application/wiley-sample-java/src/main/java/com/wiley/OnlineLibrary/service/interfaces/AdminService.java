package com.wiley.OnlineLibrary.service.interfaces;

import com.wiley.OnlineLibrary.entity.AdminDetail;

import java.util.List;

public interface AdminService {

	public int saveAdminDetail(AdminDetail adminDetail);
	
	public int adminLogin(String emailId , String password);
	
	public List<AdminDetail> getAdminData();
}
