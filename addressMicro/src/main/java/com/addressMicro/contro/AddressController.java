package com.addressMicro.contro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	@GetMapping("/addressEmp")
	public String addressController()
	{
		return "this is address";
	}
	

}
