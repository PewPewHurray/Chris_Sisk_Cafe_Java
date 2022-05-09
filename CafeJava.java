public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welecome to Cafa Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 3.0;
        double cappucinoPrice = 3.0;
        double DripCoffeePrice = 2.0;
        double LattePrice = 3.0;
        double CappucinoPrice = 3.0;

        String customer1 = "Cindguri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        System.out.printf("%s%.2f\n", displayTotalMessage, dripCoffeePrice);
        if(isReadyOrder1){
            System.out.println(customer1 + readyMessage);
        }
        else {
            System.out.println(customer1 + pendingMessage);
        }

        System.out.println(generalGreeting + customer4);
        System.out.printf("%s%.2f\n", displayTotalMessage, cappucinoPrice);
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println(generalGreeting + customer2);
        System.out.printf("%s%.2f\n", displayTotalMessage, lattePrice*2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(generalGreeting + customer3);
        System.out.printf("%s%.2f\n", displayTotalMessage, DripCoffeePrice);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }
        System.out.printf("%s%.2f\n", displayTotalMessage, (LattePrice - dripCoffeePrice));
    }
}