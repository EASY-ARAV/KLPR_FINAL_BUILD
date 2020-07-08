package com.klpr.biz.file.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klpr.biz.file.FileDAO;
import com.klpr.biz.file.FileService;

@Service("fileService")
public class FileServiceImpl implements FileService {
	@Autowired
	private FileDAO fileDAO;

	@Override
	public int returnFile(int uno, HttpServletRequest request) {
		return fileDAO.returnFile(uno, request);
	}

}
