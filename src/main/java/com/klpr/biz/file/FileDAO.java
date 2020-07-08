package com.klpr.biz.file;

import javax.servlet.http.HttpServletRequest;

public interface FileDAO {
	public int returnFile(int uno, HttpServletRequest request);
}