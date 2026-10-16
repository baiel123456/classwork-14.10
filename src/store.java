import java.util.Scanner;

class Simple_Store{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        double total=0;
        double subtotal;
        double discount=0;
        double Total=0;
        int totalamount=0;
        double discountAmount;
        for (int i=1; i>=1; i++)
        {
            System.out.println("==== SIMPLE STORE ====");
            System.out.println(" ");
            System.out.println("1. Mouse          - $20");
            System.out.println("2. Keyboard       - $40");
            System.out.println("3. Headphones     - $50");
            System.out.println("4. Laptop Stand   - $30");
            System.out.println("5. Checkout");
            System.out.println("");
            System.out.print("Choose what you want to buy: ");
            int num = sc.nextInt();
            if(num ==1)
            {
                System.out.println("You selected: Mouse");
                System.out.println("Price: $20");
                System.out.println("");
                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();
                subtotal = quantity * 20;
                totalamount+=quantity;
                total+=subtotal;
                discountAmount=subtotal;
                if(quantity<=0 )
                {
                    System.out.println("Invalid quantity" );
                    System.out.println("Quantity must be greater than 0.");
                }
                else if(quantity>=1) {
                    if (quantity >= 5) {
                        discountAmount = subtotal * 0.1;
                        subtotal -= discountAmount;
                        System.out.println("We gave you 10% discount cause you purchased " + quantity + " items of this product.");
                        System.out.println("Added to card!");
                        System.out.println("Current total: $" + subtotal);
                    }
                    else {
                        System.out.println("Added to card!");
                        System.out.println("Current total: $" + subtotal);
                    }
                }
            }
            else if(num==2)
            {
                System.out.println("You selected Keyboard");
                System.out.println("Price: $40");
                System.out.print("Enter quantity: ");
                int quantity= sc.nextInt();
                subtotal = quantity * 40;
                totalamount+=quantity;
                total += subtotal;
                if(quantity<=0)
                {
                    System.out.println("Invalid quantity" );
                    System.out.println("Quantity must be greater than 0.");
                }
                else if(quantity>=1)
                {
                    if (quantity >= 5) {
                        discountAmount = subtotal * 0.1;
                        subtotal -= discountAmount;
                        System.out.println("We gave you 10% discount cause you purchased " + quantity + " items of this product.");
                        System.out.println("Added to card!");
                        System.out.println("Current total: $" + subtotal);
                    }
                    else
                    {
                        System.out.println("Added to card!");
                        System.out.println("Current total: $" + subtotal);
                    }
                }
                else 
                {
                    System.out.println("Added to card!");
                    System.out.println("Current total: $" + subtotal);
                }
            }
            else if(num==3)
            {
                System.out.println("You selected Headphones");
                System.out.println("Price: $50");
                System.out.print("Enter quantity: ");
                int quantity= sc.nextInt();
                subtotal=quantity*50;
                totalamount+=quantity;
                total += subtotal;
                if(quantity<=0)
                {
                    System.out.println("Invalid quantity" );
                    System.out.println("Quantity must be greater than 0.");
                }
                else if(quantity>=1)
                {
                    if (quantity >= 5) {
                        discountAmount = subtotal * 0.1;
                        subtotal -= discountAmount;
                        System.out.println("We gave you 10% discount cause you purchased " + quantity + " items of this product.");
                        System.out.println("Added to card!");
                        System.out.println("Current total: $" + subtotal);
                    }
                    else {
                        System.out.println("Added to card!");
                        System.out.println("Current total: $" + subtotal);
                    }
                }
            }
            else if(num==4)
            {
                System.out.println("You selected Laptop Stand");
                System.out.println("Price: $30");
                System.out.print("Enter quantity: ");
                int quantity= sc.nextInt();
                subtotal=quantity*30;
                totalamount+=quantity;
                total += subtotal;

                if(quantity<=0)
                {
                    System.out.println("Invalid quantity" );
                    System.out.println("Quantity must be greater than 0.");
                }
                else if(quantity>=1)
                {
                    if (quantity >= 5) {
                        discountAmount = subtotal * 0.1;
                        subtotal -= discountAmount;
                        System.out.println("We gave you 10% discount cause you purchased " + quantity + " items of this product.");
                        System.out.println("Added to card!");
                        System.out.println("Current total: $" + subtotal);
                    }
                    else {
                        System.out.println("Added to card!");
                        System.out.println("Current total: $" + subtotal);
                    }
                }
            } 
            else if (num==5)
            {
                if(total==0){
                    System.out.println("You haven't purchased anything!");
                    continue;
                }
                System.out.println("===== CHECKOUT =====");
                System.out.println("Subtotal: $"+ total);
                if(total>=100 && total<200)
                {
                    discount = total*.10;
                    Total= total-discount;
                    System.out.println("Discount: "+ discount);
                }
                else if (total>=200)
                {
                    discount = total*0.15;
                    Total= total-discount;
                    System.out.println("Discount: "+ discount);
                }
                else
                {
                    discount=0;
                    Total= total-discount;
                }
                System.out.println("Final total: $"+Total);
                System.out.print("Enter payment amount: $");
                double pay=sc.nextDouble();
                if(pay>Total)
                {
                    double change=pay-Total;
                    System.out.println("Payment successful");
                    System.out.println("Change: $"+change);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("       SIMPLE STORE     ");
                    System.out.println("==========================");
                    System.out.println("");
                    System.out.println("Items purchased: "+totalamount);
                    System.out.println("Subtotal: $"+ total);
                    System.out.println("Discount: "+ discount);
                    System.out.println("Final total: $"+Total);
                    System.out.println("Payment: $"+pay);
                    System.out.println("Change: $"+change);
                    System.out.println("");
                    System.out.println("=========================");
                    System.out.println(" Thank you for shopping! ");
                    System.out.println("=========================");
                    return;
                }
                else if(pay==Total){
                    System.out.println("Payment successful");
                    System.out.println("==========================");
                    System.out.println("       SIMPLE STORE     ");
                    System.out.println("==========================");
                    System.out.println("");
                    System.out.println("Items purchased: "+totalamount);
                    System.out.println("Subtotal: $"+ total);
                    System.out.println("Discount: "+ discount);
                    System.out.println("Final total: $"+Total);
                    System.out.println("Payment: $"+pay);
                    System.out.println("Change: $0");
                    System.out.println("");
                    System.out.println("=========================");
                    System.out.println(" Thank you for shopping! ");
                    System.out.println("=========================");
                    return;
                }
                else if (pay<Total) {
                    double need = Total - pay;
                    System.out.println("Insuficient payment.");
                    System.out.println("You still need to pay: $" + need);
                }
            }
        }
    }
    }