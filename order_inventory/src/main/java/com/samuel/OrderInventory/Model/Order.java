package com.samuel.OrderInventory.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="OrderInventory")
public class Order {

		@Id
		private int id;
		private String DrugName;
		private String DrugPrice ;
		public int getId() {
			return id;
		}
		
		@Override
		public String toString() {
			return "Order [id=" + id + ", DrugName=" + DrugName + ", DrugPrice=" + DrugPrice + "]";
		}

		public void setId(int id) {
			this.id = id;
		}
		public String getDrugName() {
			return DrugName;
		}
		public void setDrugName(String drugName) {
			DrugName = drugName;
		}
		public String getDrugPrice() {
			return DrugPrice;
		}
		public void setDrugPrice(String drugPrice) {
			DrugPrice = drugPrice;
		}
		
}
