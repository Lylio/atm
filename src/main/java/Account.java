import java.util.ArrayList;

public class Account {

    private String name;
    private double balance;
    private String uuid;
    private User holder;
    private ArrayList<Transaction> transactions;

    public User(String firstName, String lastName, String pin, Bank theBank) {

        // set user's name
        this.name = name;

        // get a new universally unique ID for the user
        this.uuid = theBank.getNewUserUUID();

        // create empty list of transactions
        this.transactions = new ArrayList<Transaction>();

        // add the user to the bank list
        // theBank.addUser(this);

        // print log message
        System.out.printf("New user %s, %s with ID %s created.\n", lastName, firstName, this.uuid);

    }


}
