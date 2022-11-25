package com.ledonchung.luyentap.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavawed.service.ICategoryService;
import com.laptrinhjavawed.service.INewService;
import com.laptrinhjavawed.service.impl.NewService;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet{

	@Inject
	private INewService newService;
	
	@Inject 
	ICategoryService categoryService;
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("news", newService.findByCategoryId(1));
		req.setAttribute("categories", categoryService.findAll());
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}