package com.study.servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 데이터베이스에서 파리미터로 넘어온 RoleName이 존재하는지 여부 확인
 * 존재한다면 ResponseDto Json(200, success, true)
 * 존재하지 않으면 ResponseDto Json(400, error, faluse)
 * 
 * RoleService
 * RoleREpository
 */

@WebServlet("/role")
public class Role extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Role() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roleName = request.getParameter("roleName");
		System.out.println("roleName: " + roleName);
		
	}

}
