package com.experience.dto;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileUpload {

	private CommonsMultipartFile files;

	public CommonsMultipartFile getFiles() {
		return files;
	}

	public void setFiles(CommonsMultipartFile files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "FileUpload [files=" + files + "]";
	}
	
	
	
	
}
