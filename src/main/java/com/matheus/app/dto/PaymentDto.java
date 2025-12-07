package com.matheus.app.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheus.app.entities.Payment;

public class PaymentDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant moment;
	
	@JsonIgnore
	private OrderDto order;
	
	public PaymentDto() {
	}

	public PaymentDto(Payment obj) {
		id = obj.getId();
		moment = obj.getMoment();
		order =  new OrderDto(obj.getOrder());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderDto getOrder() {
		return order;
	}

	public void setOrder(OrderDto order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentDto other = (PaymentDto) obj;
		return Objects.equals(id, other.id);
	}
}
