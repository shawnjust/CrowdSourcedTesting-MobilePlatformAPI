package com.restful.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.entity.Customer;

@Path("customer")
public class CustomerResources {

	@GET
	@Produces("application/xml")
	public List<Customer> getAllCustomers() {
		throw new UnsupportedOperationException("Not yet implemented.");
	}
}