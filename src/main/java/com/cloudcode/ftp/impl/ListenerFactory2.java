package com.cloudcode.ftp.impl;

import java.net.InetAddress;
import java.util.List;
import java.util.Set;

import org.apache.ftpserver.DataConnectionConfiguration;
import org.apache.ftpserver.impl.FtpIoSession;
import org.apache.ftpserver.impl.FtpServerContext;
import org.apache.ftpserver.ipfilter.IpFilter;
import org.apache.ftpserver.listener.Listener;
import org.apache.ftpserver.ssl.SslConfiguration;
import org.apache.mina.filter.firewall.Subnet;

public class ListenerFactory2 implements Listener {

	public Set<FtpIoSession> getActiveSessions() {System.out.println("************************");
		// TODO Auto-generated method stub
		return null;
	}

	public List<InetAddress> getBlockedAddresses() {System.out.println("************************");
		// TODO Auto-generated method stub
		return null;
	}

	public List<Subnet> getBlockedSubnets() {System.out.println("************************");
		// TODO Auto-generated method stub
		return null;
	}

	public DataConnectionConfiguration getDataConnectionConfiguration() {System.out.println("************************");
		// TODO Auto-generated method stub
		return null;
	}

	public int getIdleTimeout() {System.out.println("************************");
		// TODO Auto-generated method stub
		return 0;
	}

	public IpFilter getIpFilter() {System.out.println("************************");
		// TODO Auto-generated method stub
		return null;
	}

	public int getPort() {System.out.println("************************");
		// TODO Auto-generated method stub
		return 0;
	}

	public String getServerAddress() {System.out.println("************************");
		// TODO Auto-generated method stub
		return null;
	}

	public SslConfiguration getSslConfiguration() {System.out.println("************************");
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isImplicitSsl() {System.out.println("************************");
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isStopped() {System.out.println("************************");System.out.println("************************");
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSuspended() {System.out.println("************************");
		// TODO Auto-generated method stub
		return false;
	}

	public void resume() {
		// TODO Auto-generated method stub
		System.out.println("************************");
	}

	public void start(FtpServerContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("************************");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("************************");
	}

	public void suspend() {
		// TODO Auto-generated method stub
		System.out.println("************************");
	}

}
