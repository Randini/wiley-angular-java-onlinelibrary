package com.wiley.OnlineLibrary.service.implementation;

import com.wiley.OnlineLibrary.DAO.interfaces.AdminDAO;
import com.wiley.OnlineLibrary.entity.AdminDetail;
import com.wiley.OnlineLibrary.service.interfaces.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO adminDAO;

	@Transactional
	public int saveAdminDetail(AdminDetail adminDetail) {
		return adminDAO.saveAdminDetail(adminDetail);
	}
	
	@Transactional
	public int adminLogin(String emailId, String password) {
		return adminDAO.adminLogin(emailId, password);
	}

	@Transactional
	public List<AdminDetail> getAdminData() {
		return adminDAO.getAdminData();
	}
	
	

}
