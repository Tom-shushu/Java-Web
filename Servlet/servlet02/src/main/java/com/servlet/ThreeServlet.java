package com.servlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/three")
public class ThreeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置响应时,流输出格式为:JPEG
		response.setContentType("image/jpeg");
		//产生一个图片对象,长:200,宽:80,三原色
		BufferedImage image = new BufferedImage(200, 80, BufferedImage.TYPE_INT_RGB);
		//产生一支笔
		Graphics g = image.getGraphics();
		//将笔的颜色设置为:红色
		g.setColor(new Color(255,0,0));
		//填充
		g.fillRect(0, 0, 200, 80);
		//设置图片输出:被输出的图片,格式,方式
		ImageIO.write(image, "jpg", response.getOutputStream());

		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
		
	}
}
