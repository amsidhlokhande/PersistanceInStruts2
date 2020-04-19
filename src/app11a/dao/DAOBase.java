package app11a.dao;

import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.sql.DataSource;

import org.apache.struts2.ServletActionContext;



public class DAOBase implements DAO
{
	public Connection getConnection() throws DAOException
	{
		ServletContext servletContext = ServletActionContext
				.getServletContext();
		Connection connection = null;
		try
		{
			DataSource datasource=(DataSource)servletContext.getAttribute("datasource");
			connection=datasource.getConnection();
          
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return connection;
	}
}
