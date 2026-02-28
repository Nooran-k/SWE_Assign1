import java.util.Scanner ;
public class budget_app {
    static Scanner input = new Scanner(System.in);   
    static double income = 0 ;
    static double rent = 0 ; 
    static double food = 0 ; 
    static double transportaion = 0 ; 
    static double education = 0 ; 
    static double total_expenses = 0 ;
    static double final_balance = 0 ;




public static void  addIncome(){
    System.out.print("what is your monthly income: ");
    income = input.nextDouble();
}
public static void addExpense() { 
    while(true){
        System.out.println("\n====== Select Category: ======"); 
        System.out.println("1. Rent");
        System.out.println("2. Food");
        System.out.println("3. Transportation");
        System.out.println("4. Education");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int expense_choice = input.nextInt();
    switch (expense_choice) {
        case 1:
            System.out.print("what is your rent :");
             rent = input.nextDouble();
            break;
        case 2:
               System.out.print("what is your food budget :");
                food = input.nextDouble();   
               break;
        case 3: 
               System.out.print("what is your transportaion budget :");
               transportaion = input.nextDouble();
               break;
        case 4 :
                   
                System.out.print("what is your education fees :");
                education = input.nextDouble();
            break;
        case 5 :
            return;
        default:
                    System.out.println("Invalid choice. Try again.");
    }
    }  

    
}

public static void showBalance(){
System.out.println("\n====== Your balance ======");
System.out.print("Your income :");
System.out.println(income);
System.out.print("Your expenses :");
 total_expenses =  rent + food + transportaion + education; 
System.out.println(total_expenses);
System.out.print("final balance :");
 final_balance = income - total_expenses;
System.out.println(final_balance);
if (final_balance>0){
    System.out.println("you are in budget ");
}
else {
    System.out.println("take care you are out of budget ");

}
}

public static void showReport() {
System.out.println("\n====== Detailed Report  ======");
System.out.print("Your income :");
System.out.println(income);
System.out.println("Your detailed expenses :");
System.out.print("your rent = ");
System.out.println(rent);
System.out.print("your food expenses = ");
System.out.println(food);
System.out.print("your transtortaion fees =");
System.out.println(transportaion);
System.out.print("education fees = ");
System.out.println(education);
System.out.print("total expences :");
System.out.println(total_expenses);
System.out.print("final balance :");
System.out.println(final_balance);
System.out.println("\n==============================");
}

public static void main(String[] args) {
    
    
    int choice;
    
    while (true) {
        
   
    System.out.println("\n====== Personal Budget App ======"); 
    System.out.println("1. Add Income");
    System.out.println("2. Add Expense");
    System.out.println("3. Show Balance");
    System.out.println("4. Show Detailed Report");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");

    choice = input.nextInt();

    switch (choice) {

         case 1:
            addIncome();
            break;

        case 2:
            addExpense();
            break;

        case 3:
            showBalance();
            break;

        case 4:
            showReport();
            break;

        case 5:
            System.out.println("Thank you for using the Budget App:)");
            return;

        default:
            System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
