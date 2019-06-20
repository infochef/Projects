package com.asset.dao;

import java.util.List;

import com.asset.jpa.dto.Asset;
import com.asset.jpa.dto.AssetRequest;
import com.asset.jpa.dto.Employee;
import com.asset.jpa.dto.User;


	public interface AssetDAOJPA {
	
		User login(String userName, String password,String usertype);
		
		public boolean createUser(User u);
		
		public boolean updateUser(User u);
		
		public boolean deleteUser(int userId);
		
		boolean addEmployee(Employee e);

		boolean updateEmployee(Employee e);

		boolean deleteEmployee(int empNo);

		public boolean createAsset(Asset a);
		
		public boolean updateAsset(Asset a);
		
		public boolean deleteAsset(int assetId,String assetName);
		
		public boolean requestAsset(AssetRequest r);
		
		List <Asset> statusRequest(); 
		
		public List<AssetRequest> fetchRequest();
		
		public List<Asset> fetchAllocatedAsset();
		
		public List<Asset> fetchUnallocatedAsset();

		
		
		


	

	

}
