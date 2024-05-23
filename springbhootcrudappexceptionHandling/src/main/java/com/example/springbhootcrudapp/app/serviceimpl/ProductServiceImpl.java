package com.example.springbhootcrudapp.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbhootcrudapp.app.exception.ProductNotFoundException;
import com.example.springbhootcrudapp.app.model.Product;
import com.example.springbhootcrudapp.app.repository.ProductRepository;
import com.example.springbhootcrudapp.app.servicei.ProductServicei;

@Service
public class ProductServiceImpl implements ProductServicei
{
	@Autowired
	ProductRepository pri;

	@Override
	public Product saveProduct(Product p) {
		
		return pri.save(p);
	}

	@Override
	public List<Product> getProducts() {
		
		return pri.findAll();
	}

	@Override
	public Product updateProduct(Integer productId, Product p)
	{
		return pri.save(p);
//	Optional<Product> op= pri.findById(productId);
//	   if(op.isPresent())
//	   {
//		   Product product=op.get();
//		   if(p.getProductName()!=null)
//		   {
//			   product.setProductName(p.getProductName());
//		    }
//		   if(p.getProductType()!=null)
//		   {
//			   product.setProductType(p.getProductType());
//		    }
//		   if(p.getProductPrice()!=null)
//		   {
//			   product.setProductPrice(p.getProductPrice());
//		    }
//	 
//	  return pri.save(product);
//	   }
//
//	else 
//	{
//		return null;
//	}
   }

	@Override
	public void deleteProduct(Integer productId) {
	     pri.deleteById(productId);	
	}

	@Override
	public Optional<Product> getProductById(Integer productId) {
		 
		return pri.findById(productId); 
		
	}

	@Override
	public Product getByproductName(String productName) 
	{
     	Product p=pri.getByproductName(productName);
	
	
		if(p!=null)
		{
			return p;
		} else {
			throw new ProductNotFoundException("Product not Found");
		}
	
		
	}
	
}