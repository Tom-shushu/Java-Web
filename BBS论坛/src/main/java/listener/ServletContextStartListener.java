package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import biz.BlocksBiz;
import biz.PostsBiz;

@WebListener
public class ServletContextStartListener implements ServletContextListener{

	private BlocksBiz bb = new BlocksBiz();
	private PostsBiz pb = new PostsBiz();
	@Override
	public void contextInitialized(ServletContextEvent e) {
		e.getServletContext().setAttribute("ALLBLOCKS", bb.findAllBlocks());
		e.getServletContext().setAttribute("POSTSLIST", pb.findPostsByBlocksId(1));
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent e) {
		
	}
}
