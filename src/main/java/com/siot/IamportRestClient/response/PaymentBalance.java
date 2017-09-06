package com.siot.IamportRestClient.response;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

public class PaymentBalance {

	@SerializedName("amount")
	BigDecimal amount;
	
	@SerializedName("cash_receipt")
	Balance cash_receipt;
	
	@SerializedName("primary")
	Balance primary;
	
	@SerializedName("secondary")
	Balance secondary;
	
	@SerializedName("discount")
	Balance discount;

	public BigDecimal getAmount() {
		return amount;
	}

	public Balance getCashReceipt() {
		return cash_receipt;
	}

	public Balance getPrimary() {
		return primary;
	}

	public Balance getSecondary() {
		return secondary;
	}

	public Balance getDiscount() {
		return discount;
	}
	
	
	
}
