package com.matheus.app.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.matheus.app.entities.Category;
import com.matheus.app.entities.Order;
import com.matheus.app.entities.OrderItem;
import com.matheus.app.entities.Payment;
import com.matheus.app.entities.Product;
import com.matheus.app.entities.User;
import com.matheus.app.entities.enums.OrderStatus;
import com.matheus.app.repositories.CategoryRepository;
import com.matheus.app.repositories.OrderItemRepository;
import com.matheus.app.repositories.OrderRepository;
import com.matheus.app.repositories.ProductRepository;
import com.matheus.app.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers");
		Category cat4 = new Category(null, "Clothing");
		
		Product p1 = new Product(null, "The Wealth of Nations", "Lorem ipsum dolor sit amet, consectetur.", 120.5, "");
		Product p2 = new Product(null, "The Prince", "tempor incididunt ut labore et dolore magna aliqua", 80.0, "");
		Product p3 = new Product(null, "The Illiad", "Ut enim ad minim veniam, quis nostrud exercitation", 70.5, "");
		Product p4 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p5 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p6 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p7 = new Product(null, "On the Origin of Species", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		Product p8 = new Product(null, "Shoes", "Etiam eget ligula eu lectus lobortis.", 200.99, "");
		Product p9 = new Product(null, "Jeans", "netus et malesuada fames.", 80.99, "");
		Product p10 = new Product(null, "T-shirt", "Pellentesque habitant morbi tristique", 50.99, "");
		
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat2);
		p3.getCategories().add(cat2);
		p4.getCategories().add(cat1);
		p5.getCategories().add(cat3);
		p5.getCategories().add(cat1);
		p6.getCategories().add(cat3);
		p6.getCategories().add(cat1);
		p7.getCategories().add(cat2);
		p8.getCategories().add(cat4);
		p9.getCategories().add(cat4);
		p10.getCategories().add(cat4);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
		
		User u1 = new User(null, "Maria do Carmo", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Pedro Silveira", "pedro@gmail.com", "977777777", "123456");
		User u3 = new User(null, "João Batista", "joão@gmail.com", "922222222", "123456");
		User u4 = new User(null, "Laura Duarte", "laura@gmail.com", "955555555", "123456");
		
		Order o1 = new Order(null, Instant.parse("2025-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2025-07-21T03:42:10Z"), OrderStatus.CANCELED, u2); 
		Order o3 = new Order(null, Instant.parse("2025-07-22T15:21:22Z"), OrderStatus.WAITTING_PAYMENT, u4);
		Order o4 = new Order(null, Instant.parse("2025-08-04T12:33:08Z"), OrderStatus.PAID, u1); 
		Order o5 = new Order(null, Instant.parse("2025-08-10T05:12:20Z"), OrderStatus.PAID, u3); 
		Order o6 = new Order(null, Instant.parse("2025-08-18T11:21:02Z"), OrderStatus.PAID, u2);
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		orderRepository.saveAll(Arrays.asList(o1, o2 , o3, o4, o5, o6));
		
		OrderItem oi1 = new OrderItem(o1, p1, 1, p1.getPrice()); 
		OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice()); 
		OrderItem oi3 = new OrderItem(o2, p8, 2, p8.getPrice()); 
		OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());
		OrderItem oi5 = new OrderItem(o4, p10, 3, p10.getPrice());
		OrderItem oi6 = new OrderItem(o5, p6, 1, p6.getPrice());
		OrderItem oi7 = new OrderItem(o5, p4, 1, p4.getPrice());
		OrderItem oi8 = new OrderItem(o6, p9, 2, p9.getPrice());
		OrderItem oi9 = new OrderItem(o6, p10, 2, p10.getPrice());
		
		
		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4, oi5, oi6, oi7, oi8, oi9));
		
		Payment pay1 = new Payment(null, Instant.parse("2025-06-22T15:13:42Z"), o1);
		o1.setPayment(pay1);
		Payment pay2 = new Payment(null, Instant.parse("2025-08-05T21:53:07Z"), o4);
		o4.setPayment(pay2);
		Payment pay3 = new Payment(null, Instant.parse("2025-08-11T18:41:05Z"), o5);
		o5.setPayment(pay3);
		Payment pay4 = new Payment(null, Instant.parse("2025-08-19T20:55:02Z"), o6);
		o6.setPayment(pay4);
		
		orderRepository.save(o1);
		orderRepository.save(o4);
		orderRepository.save(o5);
		orderRepository.save(o6);
	}
}
