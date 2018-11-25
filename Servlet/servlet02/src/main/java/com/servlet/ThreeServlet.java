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
		//������Ӧʱ,�������ʽΪ:JPEG
		response.setContentType("image/jpeg");
		//����һ��ͼƬ����,��:200,��:80,��ԭɫ
		BufferedImage image = new BufferedImage(200, 80, BufferedImage.TYPE_INT_RGB);
		//����һ֧��
		Graphics g = image.getGraphics();
		//���ʵ���ɫ����Ϊ:��ɫ
		g.setColor(new Color(255,0,0));
		//���
		g.fillRect(0, 0, 200, 80);
		//����ͼƬ���:�������ͼƬ,��ʽ,��ʽ
		ImageIO.write(image, "jpg", response.getOutputStream());

		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
		
	}
}
