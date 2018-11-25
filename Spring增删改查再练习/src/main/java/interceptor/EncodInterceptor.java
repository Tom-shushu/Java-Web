package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class EncodInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		return true;
	}
}
