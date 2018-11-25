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
	 * 这个方法演示了通过流的方式实现文件上传
	 * 原生的方式,其实本质上说就是文件的复制
	 * 通过读取流读取一段写入一段,读取完毕,写入完毕
	 * @RequestParam("file"):当传递的参数名和形参名字不一致时,指定哪个参数名匹配形参
	 */
	@RequestMapping("/a")
	public String a(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest request) {
		long startTime = System.currentTimeMillis();
		// 找到上传文件夹content的路径
		String path = request.getSession().getServletContext().getRealPath("content");
		// 生成一个新的文件名
		String fileName = new Date().getTime()+file.getOriginalFilename();
		// 被上传的文件
		String filePath = path + "//" + fileName ;
		File outFile = new File(filePath);
		try {
			// 通过流的方法上传
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
			System.out.println("文件路径错误!");
		} catch (IOException e) {
			System.out.println("上传出错!");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("通过流进行上传花费:" + (endTime - startTime));
		return "index";
	}
	/*
	 * 通过文件复制的方式,已经封装好了
	 */
	@RequestMapping("/b")
	public String b(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest request){
		long startTime = System.currentTimeMillis();
		// 找到上传文件夹content的路径
		String path = request.getSession().getServletContext().getRealPath("content");
		// 生成一个新的文件名
		String fileName = new Date().getTime()+file.getOriginalFilename();
		// 被上传的文件
		String filePath = path + "//" + fileName ;
		File outFile = new File(filePath);
		
		try {
			file.transferTo(outFile);
		} catch (IllegalStateException | IOException e) {
			System.out.println(e.getMessage());
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("通过文件复制进行上传花费:" + (endTime - startTime));
		
		return "index";
	}
	
	/*
	 * springMVC自带的方式,其实他也是借助第二种方式在进行上传
	 * 不需要传递参数,直接通过spring将所有内容获取到
	 */
	@RequestMapping("/c")
	public String c(HttpServletRequest request){
		long startTime = System.currentTimeMillis();
		// 找到上传文件夹content的路径
		String path = request.getSession().getServletContext().getRealPath("content");
		
		
		// 将上下文对象赋予resolver
		CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		MultipartHttpServletRequest req = resolver.resolveMultipart(request);
		
		Iterator<String> it = req.getFileNames();
		while(it.hasNext()){
			String name = it.next();
			MultipartFile file = req.getFile(name);
			// 生成一个新的文件名
			String fileName = new Date().getTime()+file.getOriginalFilename();
			// 被上传的文件
			String filePath = path + "//" + fileName ;
			File outFile = new File(filePath);
			try {
				file.transferTo(outFile);
			} catch (IllegalStateException | IOException e) {
				System.out.println(e.getMessage());
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("通过SpringMVC自带方式进行上传花费:" + (endTime - startTime));
		
		return "index";
	}
	/*
	 * 通过流下载
	 */
	@RequestMapping("/d")
	public void d(String name,HttpServletRequest request,HttpServletResponse response){
		// 找到上传文件夹content的路径
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
			System.out.println("文件路径错误!");
		} catch (IOException e) {
			System.out.println("上传出错!");
		}		
		
	}
}
