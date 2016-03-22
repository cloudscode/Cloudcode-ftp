package com.cloudcode.ftp.impl;

import org.apache.ftpserver.ftplet.FtpFile;
import org.apache.ftpserver.impl.FileObserver;
import org.apache.ftpserver.impl.FtpIoSession;

public class FileObserver2 implements FileObserver{

	public void notifyDelete(FtpIoSession arg0, FtpFile arg1) {
		// TODO Auto-generated method stub
		
	}

	public void notifyDownload(FtpIoSession arg0, FtpFile arg1, long arg2) {
		// TODO Auto-generated method stub
		
	}

	public void notifyMkdir(FtpIoSession arg0, FtpFile arg1) {
		// TODO Auto-generated method stub
		
	}

	public void notifyRmdir(FtpIoSession arg0, FtpFile arg1) {
		// TODO Auto-generated method stub
		
	}

	public void notifyUpload(FtpIoSession arg0, FtpFile arg1, long arg2) {
		// TODO Auto-generated method stub
		System.out.println("**************************notifyUpload2*****************************"+arg1.getName());
	}

}
