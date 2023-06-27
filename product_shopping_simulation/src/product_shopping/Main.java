package product_shopping;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product huawei = new Product(11, "Huawei", 1000, "Huawei, bilgi ve iletişim teknolojileri (ICT) altyapısı ve akıllı cihazlarda lider bir küresel sağlayıcıdır.", 50);

		ProductManager.addToOrder(huawei);
		
		double unitPrice = huawei.getUnitPrice();
		double unitPriceAfterDiscount = huawei.getUnitPriceAfterDiscount();
		
		System.out.println(
				"Unit Price: " + unitPrice 
				+ "\n" +
				"Unit Price After Discount: " + unitPriceAfterDiscount
		);
		
	}

}
