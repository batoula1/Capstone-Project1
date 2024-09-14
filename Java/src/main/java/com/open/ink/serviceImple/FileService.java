package com.open.ink.serviceImple;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	//imageValidation
	Map<String, String> userImageValidation(MultipartFile file);
	//uploading User image
	String uploadUserImage(MultipartFile file);

		
}
