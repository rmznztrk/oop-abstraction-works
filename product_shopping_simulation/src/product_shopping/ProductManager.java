package product_shopping;

public class ProductManager {
	
	public static void addToOrder(Product product) {
		System.out.println("*Siparis eklendi: " + product.getName());
	}
	
	public static double caculateUnitPriceAfterDiscount(double unitPrice, double discount) {
		double unitPriceAfterDiscount =  unitPrice - (unitPrice*(discount/100));
		return unitPriceAfterDiscount; 
	}

}
