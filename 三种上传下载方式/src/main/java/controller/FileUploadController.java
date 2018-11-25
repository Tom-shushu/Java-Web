package controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("/up")
public class FileUploadController {

	/*
	 * ���������ʾ��ͨ�����ķ�ʽʵ���ļ��ϴ�
	 * ԭ���ķ�ʽ,��ʵ������˵�����ļ��ĸ���
	 * ͨ����ȡ����ȡһ��д��һ��,��ȡ���,д�����
	 * @RequestParam("file"):�����ݵĲ��������β����ֲ�һ��ʱ,ָ���ĸ�������ƥ���β�
	 */
	@RequestMapping("/a")
	public String a(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest request) {
		long startTime = System.currentTimeMillis();
		// �ҵ��ϴ��ļ���content��·��
		String path = request.getSession().getServletContext().getRealPath("content");
		// ����һ���µ��ļ���
		String fileName = new Date().getTime()+file.getOriginalFilename();
		// ���ϴ����ļ�
		String filePath = path + "//" + fileName ;
		File outFile = new File(filePath);
		try {
			// ͨ�����ķ����ϴ�
			InputStream in = file.getInputStream();
			OutputStream out = new FileOutputStream(outFile);
			int size ;
			while((size=in.read())!=-1){
				out.write(size);
			}
			out.flush();
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�·������!");
		} catch (IOException e) {
			System.out.println("�ϴ�����!");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ͨ���������ϴ�����:" + (endTime - startTime));
		return "index";
	}
	/*
	 * ͨ���ļ����Ƶķ�ʽ,�Ѿ���װ����
	 */
	@RequestMapping("/b")
	public String b(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest request){
		long startTime = System.currentTimeMillis();
		// �ҵ��ϴ��ļ���content��·��
		String path = request.getSession().getServletContext().getRealPath("content");
		// ����һ���µ��ļ���
		String fileName = new Date().getTime()+file.getOriginalFilename();
		// ���ϴ����ļ�
		String filePath = path + "//" + fileName ;
		File outFile = new File(filePath);
		
		try {
			file.transferTo(outFile);
		} catch (IllegalStateException | IOException e) {
			System.out.println(e.getMessage());
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("ͨ���ļ����ƽ����ϴ�����:" + (endTime - startTime));
		
		return "index";
	}
	
	/*
	 * springMVC�Դ��ķ�ʽ,��ʵ��Ҳ�ǽ����ڶ��ַ�ʽ�ڽ����ϴ�
	 * ����Ҫ���ݲ���,ֱ��ͨ��spring���������ݻ�ȡ��
	 */
	@RequestMapping("/c")
	public String c(HttpServletRequest request){
		long startTime = System.currentTimeMillis();
		// �ҵ��ϴ��ļ���content��·��
		String path = request.getSession().getServletContext().getRealPath("content");
		
		
		// �������Ķ�����resolver
		CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		MultipartHttpServletRequest req = resolver.resolveMultipart(request);
		
		Iterator<String> it = req.getFileNames();
		while(it.hasNext()){
			String name = it.next();
			MultipartFile file = req.getFile(name);
			// ����һ���µ��ļ���
			String fileName = new Date().getTime()+file.getOriginalFilename();
			// ���ϴ����ļ�
			String filePath = path + "//" + fileName ;
			File outFile = new File(filePath);
			try {
				file.transferTo(outFile);
			} catch (IllegalStateException | IOException e) {
				System.out.println(e.getMessage());
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ͨ��SpringMVC�Դ���ʽ�����ϴ�����:" + (endTime - startTime));
		
		return "index";
	}
	/*
	 * ͨ��������
	 */
	@RequestMapping("/d")
	public void d(String name,HttpServletRequest request,HttpServletResponse response){
		// �ҵ��ϴ��ļ���content��·��
		String path = request.getSession().getServletContext().getRealPath("content");
		path = path + "//" + name;		
		try {
			InputStream in = new FileInputStream(new File(path));
			OutputStream out = response.getOutputStream();
			
			int size ;
			while((size=in.read())!=-1){
				out.write(size);
			}
			out.flush();
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�·������!");
		} catch (IOException e) {
			System.out.println("�ϴ�����!");
		}		
		
	}
}
