package br.com.lmarques.domin;

public class Product {
	
	private Long id;
	private String name;
	private String description;
	private Long code;
	private Double price;
	
	public Product(Long id, String name, String description, Long code, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.code = code;
		this.price = price;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getCode() {
		return code;
	}
	
	public void setCode(Long code) {
		this.code = code;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", code=" + code + ", price="
				+ price + "]";
	}
	
	
}
