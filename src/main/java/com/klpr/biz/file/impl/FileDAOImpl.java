package com.klpr.biz.file.impl;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

import com.klpr.biz.file.FileDAO;

@Repository("fileDAO")
public class FileDAOImpl implements FileDAO {

	@Override
	public int returnFile(int uno, HttpServletRequest request) {
		File f = new File(request.getContextPath() + "/images/" + uno + ".png");
		if (f.exists())
			return uno;
		else
			return 0;
	}

}
