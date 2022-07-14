package ObjectAssignment;

public class ObjectAssignmentMain {
    public static void main(String[] args){
        Bank bank = new Bank();
        // you want to eventually output soemthing like bank at address has x number of
        // accounts and each of those accounts belong to some customer's name who's y years old and lives at some address
        // sample would look like:
        /*
        The TD bank near the canadian tire has 5 accounts with account numbers
        1: this belongs to customer nina who lives at 29 singer ct and is 28 and has 100$
        2: this belongs to customer allen who lives at 800 seneca st and is 28 and has 100$
        3: this belongs to erica who lives at 148 sweet water and is 56 and has 100$
        4: this belongs to andrew who lives at 148 sweet water and is 58 and has 100$
        5: this belongs to joy who lives at 29 singer ct and is 32 and has 100$
         */

        Customer nina = new Customer("nina","yoyoyo",6);
        System.out.println(nina.getInformation());
    }
}
