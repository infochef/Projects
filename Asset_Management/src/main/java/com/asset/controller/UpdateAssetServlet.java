package com.asset.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asset.dto.Asset;
import com.asset.services.AssetServiceJDBCimpl;



@WebServlet("/updateassetserv")
public class UpdateAssetServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String aid = req.getParameter("aid");
		String aname = req.getParameter("aname");
		String aquant=req.getParameter("aquant");
		String astatus=req.getParameter("astatus");
		
		int id =Integer.parseInt(aid);
		int quant=Integer.parseInt(aquant);
		
		Asset ast=new Asset();
		ast.setAssetId(id);
		ast.setAssetName(aname);
		ast.setQuantity(quant);
		ast.setStatus(astatus);		
		
		AssetServiceJDBCimpl impl=new AssetServiceJDBCimpl();
		boolean b=impl.updateAsset(ast);
		
		if(b)
		{
			resp.sendRedirect("./Success.jsp");
		}
		else
		{
			resp.sendRedirect("./Failed.jsp");
		}
		
	}

}
