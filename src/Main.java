import com.company.classwork.Account;
import com.company.classwork.Dog;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> Doggers = new ArrayList<String>();
        Dog pup1 = new Dog("Spike", "Beagle", 12, "brown");
        Dog pup2 = new Dog("Elvis", "Terrier", 7, "tan");
        Dog pup3 = new Dog("Zo", "Yorie", 5, "silver/brown");
        Doggers.add(pup1.toString());
        Doggers.add(pup2.toString());
        Doggers.add(pup3.toString());
        for(String p:Doggers){
            System.out.println(p);
        }

//        Account Kyancy = new Account();
//        Account KGibbs = new Account();
//
//        Kyancy.setCustomerName("Kevin Yancy");
//        Kyancy.setBalance(10);
//        Kyancy.Deposit(100.0);
//        System.out.println(Kyancy.getBalance());
//
//        KGibbs.setCustomerName("Kenn Gibbs");
//        KGibbs.setBalance(1000);
//        KGibbs.Withdraw(100.0);
//        System.out.println(KGibbs.getBalance());
    }
}
