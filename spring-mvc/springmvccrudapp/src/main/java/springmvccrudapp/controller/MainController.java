package springmvccrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.bytebuddy.matcher.ModifierMatcher.Mode;
import springmvccrudapp.entity.Product;
import springmvccrudapp.repository.ProductDao;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home(Model model)
	{
		List<Product> allProduct = productDao.getAllProduct();
		model.addAttribute("allProducts", allProduct);
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addProduct(Model model)
	{
		model.addAttribute("title", "Add Product");
		return "addproduct";
	}
	
	@RequestMapping(path = "/handle-product", method = RequestMethod.POST)
	public String handleAddProduct(@ModelAttribute Product product, HttpServletRequest request)
	{
		productDao.createProduct(product);
		 System.out.println(product);
		 return "redirect:/";
	}
	
	@RequestMapping("/delete/{productId}")
	public String handleDeleteProduct(@PathVariable("productId") int productId)
	{
		 this.productDao.deleteProduct(productId);
		 return "redirect:/";
	}
	
	@RequestMapping("/update/{productId}")
	public String handleUpdateProduct(@PathVariable("productId") int productId, Model model)
	{
		
		 Product productById = this.productDao.getProductById(productId);
		 model.addAttribute("productById", productById);
		 return "updateproduct";
	}
}
