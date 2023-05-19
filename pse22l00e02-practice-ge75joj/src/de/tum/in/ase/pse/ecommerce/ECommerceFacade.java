package de.tum.in.ase.pse.ecommerce;

public class ECommerceFacade {

	private OrderController orderController;
	private ShippingController shippingController;
	private AdvertisementController advertisementController;
	
	public ECommerceFacade() {
		this.orderController = new OrderController();
		this.shippingController = new ShippingController();
		this.advertisementController = new AdvertisementController();
	}

	public void processOrder(Order order) {
		this.orderController.processOrder(order);
	}
	
	public void processOrder(Order order, String phoneNumber) {
		this.orderController.processOrder(order, phoneNumber);
	}
	
	public Order retrieveLatestOrder(int id) {
		return this.orderController.retrieveLatestOrder(id);
	}
	
	public void playAdvertisement(int ageRestriction) {
		this.advertisementController.playAdvertisement(ageRestriction);
	}
	
	public void shipOrder(Order order) {
		this.shippingController.shipOrder(order);
	}
	
	public void shipOrder(Order order, String address) {
		order.setShipping(this.createShipping(address));
		this.shipOrder(order);
	}
	
	public Shipping createShipping(String address) {
		return this.shippingController.createShipping(address);
	}
	
}
