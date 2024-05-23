package com.example.springbhootcrudapp.app.servicei;

import java.util.List;
import java.util.Optional;

import com.example.springbhootcrudapp.app.model.Product;

public interface ProductServicei {

	Product saveProduct(Product p);

	List<Product> getProducts();

	Product updateProduct(Integer productId, Product p);

   void  deleteProduct(Integer productId);

   Optional<Product> getProductById(Integer productId);

Product getByproductName(String productName);



}
