import java.util.Scanner;

interface User
{
void checkBalance();
void withdraw();
void deposite();
}

class Atm implements User
{

private int balance;
private Scanner sc;

public Atm(int initialBalance, Scanner scanner )
{
this.balance=initialBalance;
this.sc=scanner;
}

public void checkBalance()
{
System.out.println("Your balance is "+" "+ balance+"RS");
}
public void withdraw()
{
System.out.println("Enter amount to withdraw ");
int amount=sc.nextInt();

if(amount <=(balance-100))
{
balance-=amount;
System.out.println("You can only withdraw "+(balance-100)+"rs because minimum balance requrement is 100");
System.out.println("withdrawed" +amount);
}
else
{
System.out.println("insufficient balance because minimum balance requrement is 100");
}
checkBalance();
}

public void deposite()
{
System.out.println(" Enter your amount to deposite ");
int amount=sc.nextInt();
balance += amount;
System.out.println(amount +" "+"deposited ");
checkBalance();
}
}
public class ATMInterface
{
public static void main(String []arg)
{
Scanner sc=new Scanner(System.in);
int initialBalance=6000;

System.out.println("Enter your account number");
long no=sc.nextLong();

System.out.println("Enter your pin");
int pin=sc.nextInt();

System.out.println("Access Allowed");
Atm c=new Atm(initialBalance,sc);

 while (true) 
{
System.out.println("\nMenu:");
System.out.println("1 - Check Balance");
System.out.println("2 - Withdraw");
System.out.println("3 - Deposite");
System.out.println("4 - Exit");
System.out.print("Enter your choice: ");
int choice = sc.nextInt();
switch (choice) {
case 1:
c.checkBalance();
break;
case 2:
c.withdraw();
break;
case 3:
c.deposite();
break;
case 4:
 System.out.println("Exiting. Thank you!");
 return;
 default:
 System.out.println("Invalid choice.");
}
}
}
}



