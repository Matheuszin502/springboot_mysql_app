package com.matheus.app.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheus.app.entities.Order;
import com.matheus.app.entities.OrderItem;
import com.matheus.app.entities.Product;
import com.matheus.app.entities.pk.OrderItemPK;

public class OrderItemDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quantity;
	private Double price;
	
	public OrderItemDto() {
	}

	public OrderItemDto(OrderItem obj) {
		id.setOrder(obj.getOrder());
		id.setProduct(obj.getProduct());
		quantity = obj.getQuantity();
		price = obj.getPrice();
	}
	
	@JsonIgnore
	public OrderDto getOrder() {
		return new OrderDto(id.getOrder());
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public ProductDto getProduct() {
		return new ProductDto(id.getProduct());
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getSubTotal() {
		return price * quantity;
	}
}
