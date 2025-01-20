// Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategy 1: CreditCard Payment
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder Name: " + cardHolderName);
    }
}

// Concrete Strategy 2: PayPal Payment
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal.");
        System.out.println("PayPal Email: " + email);
    }
}

// Concrete Strategy 3: Bitcoin Payment
class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Bitcoin.");
        System.out.println("Bitcoin Wallet Address: " + walletAddress);
    }
}

// Context Class that uses the Strategy
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set the payment method dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Perform the payment with the selected strategy
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Test the Strategy pattern
public class StrategyPatternTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Using CreditCard Payment
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "John Doe"));
        cart.checkout(1000);

        // Using PayPal Payment
        cart.setPaymentStrategy(new PayPalPayment("johndoe@example.com"));
        cart.checkout(500);

        // Using Bitcoin Payment
        cart.setPaymentStrategy(new BitcoinPayment("1A2B3C4D5E6F7G8H9I0J"));
        cart.checkout(200);
    }
}
