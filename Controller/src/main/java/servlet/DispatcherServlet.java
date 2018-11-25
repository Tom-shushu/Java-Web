package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DispatcherServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	private Map<String, Element> map = new HashMap<String,Element>();
	@Override
	public void init() throws ServletException {
		try {
			InputStream is = DispatcherServlet.class.getClassLoader().getResourceAsStream("springmvc.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(is);
			Element root = doc.getDocumentElement();
			NodeList list = root.getElementsByTagName("bean");
			for (int i = 0; i < list.getLength(); i++) {
				Element e = (Element)list.item(i);
				String url = e.getAttribute("url");
				map.put(url, e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("进入到了核心Servlet!");
		String url = request.getRequestURI();
		//  mn/first/methodA.mvc
		System.out.println(url);
		String methodName = url.substring(url.lastIndexOf("/")+1,url.lastIndexOf("."));
		System.out.println(methodName);
		url = url.substring(0,url.lastIndexOf("/"));
		String urlName = url.substring(url.lastIndexOf("/")+1);
		System.out.println(methodName);
		System.out.println(urlName);
		
		try {
			Element e = map.get(urlName);
			String classPath = e.getAttribute("class");
			Class c = Class.forName(classPath);
			Object obj = c.newInstance();
			Method method = c.getMethod(methodName, new Class[]{});
			Object value = method.invoke(obj, new Object[]{});
			response.sendRedirect("/mn/"+value.toString()+".jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
