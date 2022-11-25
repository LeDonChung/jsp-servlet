package com.laptrinhjavawed.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavawed.dao.INewDAO;
import com.laptrinhjavawed.model.NewModel;
import com.laptrinhjavawed.utils.HttpUtil;

@WebServlet(urlPatterns = "/api-admin-new")
public class NewAPI extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Inject
	private INewDAO iNewDAO;
	/**
	 * Thêm mới
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*Nhận dữ liệu từ serve ko bị lỗi font*/
		// nhận vào
		req.setCharacterEncoding("UTF-8");
		// server xuử lí xong rồi trả về client nhận đc dùng response
		resp.setContentType("application/json");
		NewModel newModel = HttpUtil.of(req.getReader()).toModel(NewModel.class);
		System.out.println(iNewDAO.save(newModel));
	}
	
	/**
	 * Cập nhật
	 */
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
	
	/**
	 * Xóa
	 */
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
