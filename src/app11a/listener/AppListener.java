package app11a.listener;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

public class AppListener implements ServletContextListener
{
	public void contextInitialized(ServletContextEvent sce)
	{
		try
		{
			Context context = (Context) new InitialContext()
					.lookup("java:comp/env");

			// Look up our data source
			
			DataSource ds = (DataSource) context.lookup("jdbc/TestDB");

			sce.getServletContext().setAttribute("datasource", ds);
		}
		catch (NamingException e)
		{
			e.printStackTrace();
		}

	}

	public void contextDestroyed(ServletContextEvent cse)
	{
	}
}
