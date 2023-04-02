//package com.promineo.controller;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.promineo.model.Gardner;
//import com.promineo.repository.GardnerRepository;
//
//@Controller
//public class AppController {
//	
//	@Autowired
//	private GardnerRepository repo;
//	
//	@GetMapping("/")
//	public String viewHomePage() {
//		return "Home";
//	}
//	
//	@PostMapping("/upload")
//	public String uploadFile(@RequestParam("Gardner") MultipartFile multipartFile,
//			RedirectAttributes ra) throws IOException{
//		String fileName= StringUtils.cleanPath(multipartFile.getOriginalFilename());
//		
//		Gardner gardner = new Gardner();
//		gardner.setFirstName(fileName);
//		gardner.setContent(multipartFile.getBytes());
//		gardner.setSize(multipartFile.getSize());
//		
//		repo.save(gardner);
//		ra.addFlashAttribute("message", "File uploaded!");
//		return "redirect:/";
//		
//	}
//		
//
//}
