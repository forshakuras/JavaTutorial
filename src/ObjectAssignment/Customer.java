package ObjectAssignment;

// This would have basic customer information like name address age etc etc etc
public class Customer {
     private String customerName;
     private String customerAddress;
     private int customerAge;

     public Customer(String customerName, String customerAddress, int customerAge) {
     this.customerName=customerName;
     this.customerAddress=customerAddress;
     this.customerAge=customerAge;

     }
     public String getInformation(){
          return customerName+" is located at "+customerAddress+"is aged "+customerAge;
     }

}