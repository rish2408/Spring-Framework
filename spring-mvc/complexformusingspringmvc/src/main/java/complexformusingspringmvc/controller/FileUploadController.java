package complexformusingspringmvc.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/file-upload")
	public String fileupload()
	{
		System.out.println("Upload File....");
		return "fileupload";
	}
	
	@RequestMapping(value = "/uploaddata", method = RequestMethod.POST)
	public String uploaddata(@RequestParam("file") CommonsMultipartFile file, HttpSession session,Model model)
	{
		System.out.println("Data Uploaded Successfully....");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		byte[] data = file.getBytes();
		String path = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
	
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File Uploaded Successfully....");
			
			model.addAttribute("msg", "Successfully Uploaded!!");
			model.addAttribute("filename", file.getOriginalFilename());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Uploading Error!");
			model.addAttribute("msg", "Uploading Error!!");
		}
		
		return "uploadeddata";
	}
}
