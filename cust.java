class Customer {

    double calculateBill(double amount) {
        return amount;
    }
}
class RegularCustomer extends Customer {
    @Override
    double calculateBill(double amount) {
        return amount - (amount * 0.05);
    }
}
class PrimeCustomer extends Customer {
    @Override
    double calculateBill(double amount) {
        return amount - (amount * 0.10);
    }
}
class CorporateCustomer extends Customer {
    String tier;
    CorporateCustomer(String tier) {
        this.tier = tier;
    }
    @Override
    double calculateBill(double amount) {
        double bill = super.calculateBill(amount);
        if (amount > 50000) {
            if (tier.equals("Platinum")) {
                bill = bill - (bill * 0.15);
            } else {
                System.out.println("Not a Platinum corporate customer.");
            }
        } else {
            System.out.println("Amount is not greater than 50000.");
        }
          return bill;
    }
}
class cust {
    public static void main(String[] args) {
        Customer c = new CorporateCustomer("Platinum");
        double amount = 80000;
        System.out.println("Final Bill = ₹" + c.calculateBill(amount));
    }
}