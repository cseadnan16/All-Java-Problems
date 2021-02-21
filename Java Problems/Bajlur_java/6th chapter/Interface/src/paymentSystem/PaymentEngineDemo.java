package paymentSystem;

interface Payment{
	long getAmount();
}

class PaymentEngine{
	void accept(Payment payment){
		System.out.println("Accepting payment: "+ payment.getAmount());
	}
}

class BkashPayment implements Payment{
	@Override
	public long getAmount(){
		System.out.println("Taking bKash payment.");
		return 100;
	}
}

class Cashpayment implements Payment{
	@Override
	public long getAmount(){
		System.out.println("Taking cash payment.");
		return 500;
	}
}

public class PaymentEngineDemo {
	public static void main(String[] args) {
		PaymentEngine paymentEngine = new PaymentEngine();
		BkashPayment bkashPayment = new BkashPayment();
		Cashpayment cashpayment = new Cashpayment();
		
		paymentEngine.accept(cashpayment);
		System.out.println();
		paymentEngine.accept(bkashPayment);
	}

}
