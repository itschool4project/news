package javacode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by Ivan on 5/4/15.
 */
//@Configuration
public class RepositoryConfiguration
{
	private String dbName = "news";
	private String dbAddress = "127.0.0.1";

	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
		driverManagerDataSource.setUrl( "jdbc:postgresql://localhost:5432/news" );
		driverManagerDataSource.setUsername( "adminq2e2qhx" );
		driverManagerDataSource.setPassword( "_vkeSkQeDMDg" );
		return driverManagerDataSource;
	}
}
