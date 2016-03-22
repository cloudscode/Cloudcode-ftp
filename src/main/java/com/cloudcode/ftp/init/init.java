package com.cloudcode.ftp.init;

import java.io.File;

import javax.annotation.PostConstruct;

import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.FtpServerFactory;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.listener.ListenerFactory;
import org.apache.ftpserver.usermanager.PropertiesUserManagerFactory;
import org.springframework.stereotype.Component;

@Component
public class init {

	@PostConstruct
	public void init() throws FtpException {
		FtpServerFactory serverFactory = new FtpServerFactory();
		ListenerFactory factory = new ListenerFactory();
		factory.setPort(21);
		PropertiesUserManagerFactory userManagerFactory = new PropertiesUserManagerFactory();
		userManagerFactory.setFile(new File(init.class.getClassLoader()
				.getResource("users.properties").getPath()));
		//serverFactory.addListener("default", factory.createListener());
		//serverFactory.addListener("default1", new ListenerFactory2());
		serverFactory.setUserManager(userManagerFactory.createUserManager());
		FtpServer server = serverFactory.createServer();
		server.start();
	}

	public static void main(String[] args) {
		System.out.println(new File(init.class.getClassLoader()
				.getResource("users.properties").getPath()));
	}
}
