package DefiningClassesLab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String imput = scanner.nextLine();

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        BiFunction<BankAccount, String, String> depositFunction = (b, s) ->{
            int amount = Integer.parseInt(s);
            b.deposit(amount);
            return "Deposit "+amount+" to ID";
        };

        BiFunction<BankAccount, String, String> getInterestFunction = (b, s) ->{
            int years = Integer.parseInt(s);
            double interest = b.getInterest(years);
            return String.format("%.2f", interest);
        };

        while (!imput.equals("End")){
            String [] data = imput.split("\\s+");

            String command = data[0];

            if(!command.equals("Create")){
                BankAccount bankAccount = new BankAccount();
                bankAccounts.put(bankAccount.getId(), bankAccount);
                System.out.println("Account ID" + bankAccount.getId()+ " created");
            }else if(command.equals("Deposit")){
                String output = executeOnBankAccount(data, bankAccounts, depositFunction );
                System.out.println(output);
            }else if (command.equals("GetInterest")) {
                String output = executeOnBankAccount(data, bankAccounts, getInterestFunction );
                System.out.println(output);
            }else if (command.equals("SetInterest")) {
                double interestRate = Double.parseDouble(data[1]);
                BankAccount.setInterestRate(interestRate);

            }


            imput = scanner.nextLine();
        }
    }

    private static String executeOnBankAccount(String [] data, Map<Integer, BankAccount> bankAccounts,
                                               BiFunction<BankAccount, String, String> function) {

        int id = Integer.parseInt(data[1]);

        BankAccount bankAccount = bankAccounts.get(id);

        if(bankAccount == null){
            return "Account does not exist";
        }

        return function.apply(bankAccount, data[2]) + id;
    }
}
