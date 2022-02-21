package com.dormain.ch06;

public class furnitureExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			furniture product = new furniture();
					System.out.println("product.name : " + product.name);
					System.out.println("product.model: " + product.model);
					System.out.println("product.price : " + product.price);
					
			furniture product1 = new furniture("시몬스침대", "트윈배드");
			System.out.println("-------------");
					System.out.println("product1.name : " + product1.name);
					System.out.println("product1.model : " + product1.model);
					System.out.println("product1.price: " + product1.price);
	
			furniture product2 = new furniture("장수돌침대", "더블배드", 300000);
			System.out.println("-------------");
					System.out.println("product2.name : " + product2.name);
					System.out.println("product2.model : " + product2.model);
					System.out.println("product2.price: " + product2.price);
	}

}
