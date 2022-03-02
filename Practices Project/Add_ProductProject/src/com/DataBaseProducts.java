package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class DataBaseProducts {
	@Id
   private  String ProductName;
   private int ProductId;
   private int productPrice;
 
   
public DataBaseProducts(String productName, int productId, int productPrice) {
	super();
	ProductName = productName;
	ProductId = productId;
	this.productPrice = productPrice;
}
@Override
public String toString() {
	return "DataBaseProducts [ProductName=" + ProductName + ", ProductId=" + ProductId + ", productPrice="
			+ productPrice + "]";
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
   
}
