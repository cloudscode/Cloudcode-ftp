package com.cloudcode.ftp.impl;

import java.net.InetAddress;

import org.apache.ftpserver.impl.StatisticsObserver;

public class StatisticsObserver2 implements StatisticsObserver {

	public void notifyCloseConnection() {
		// TODO Auto-generated method stub
		System.out.println("*****************************notifyCloseConnection**************************");
	}

	public void notifyDelete() {
		// TODO Auto-generated method stub
		System.out.println("****************************notifyDelete***************************");
	}

	public void notifyDownload() {
		// TODO Auto-generated method stub
		System.out.println("*****************************notifyDownload**************************");
	}

	public void notifyLogin(boolean arg0) {
		// TODO Auto-generated method stub
		System.out.println("**********************notifyLogin*********************************");
	}

	public void notifyLoginFail(InetAddress arg0) {
		// TODO Auto-generated method stub
		System.out.println("**************************notifyLoginFail*****************************");
	}

	public void notifyLogout(boolean arg0) {
		// TODO Auto-generated method stub
		System.out.println("**************************notifyLogout*****************************");
	}

	public void notifyMkdir() {
		// TODO Auto-generated method stub
		System.out.println("***************************notifyMkdir****************************");
	}

	public void notifyOpenConnection() {
		// TODO Auto-generated method stub
		System.out.println("**************************notifyOpenConnection*****************************");
	}

	public void notifyRmdir() {
		// TODO Auto-generated method stub
		System.out.println("***********************notifyRmdir********************************");
	}

	public void notifyUpload() {
		// TODO Auto-generated method stub
		System.out.println("**************************notifyUpload*****************************");
	}

}
