package com.study.servlet.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.study.servlet.entity.Role;
import com.study.servlet.entity.User;
import com.study.servlet.util.DBConnectionMgr;

public class RoleRepositoryImpl implements RoleRepository {
	// Repository 객체 싱글톤 정의
	private static RoleRepository instance;
	public static RoleRepository getInstance() {
		if(instance == null) {
			instance = new RoleRepositoryImpl();
		}
		return instance;
	}
	
	// DBConnectionMgr DI
	private DBConnectionMgr pool;
	
	private RoleRepositoryImpl() {
		pool = DBConnectionMgr.getInstance();
	}

	@Override
	public Role findroleByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}