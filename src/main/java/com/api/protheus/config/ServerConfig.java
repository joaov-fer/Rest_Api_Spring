
package com.api.protheus.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
public class ServerConfig {
	 
	 Operations op = new Operations();
	 Conexao con = op.getConexao();
	 
	 @Bean(name="dsCustom")
	    public DataSource dataSource() {
	        return DataSourceBuilder
	                .create()
	                .username(con.getUser())
	                .password(con.getSenha())
	                .url("jdbc:sqlserver://"+con.getIp()+":"+con.getPorta()+";databaseName="+con.getBanco())
	                .driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
	                .build();
	    }

	    @Bean(name = "jdbcCustom")
	    @Autowired
	    public JdbcTemplate jdbcTemplate(@Qualifier("dsCustom") DataSource dsCustom) {
	        return new JdbcTemplate(dsCustom);
	    }

}