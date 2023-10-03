import java.util.Scanner;

public class Project_Benjamin_Christy
{
   public static void main(String[] args)
   {
   
      //Declare variables
      Scanner scnr = new Scanner(System.in);
      Policy userPolicy;
      int policyNumber;
      int age;
      double weight;
      double height;
      String providerName;
      String firstName;
      String lastName;
      String smokingStatus;
      
      //Prompt user for policy information
      System.out.print("Please enter the Policy Number: ");
      policyNumber = scnr.nextInt();
      scnr.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = scnr.nextInt();
      scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = scnr.nextDouble();
      scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds: ");
      weight = scnr.nextDouble();
      scnr.nextLine();
      
      //Initialize userPolicy with given info
      userPolicy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      //Display policy info
      System.out.println("/nPolicy Number: " + userPolicy.getPolicyNumber());
      System.out.println("Provider Name: " + userPolicy.getProviderName());
      System.out.println("Policyholder's First Name: " + userPolicy.getFirstName());
      System.out.println("Policyholder's Last Name: " + userPolicy.getLastName());
      System.out.println("Policyholder's age: " + userPolicy.getAge());
      System.out.println("Policyholder's Smoking Status: " + userPolicy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + userPolicy.getHeight());
      System.out.println("Policyholder's Weight: " + userPolicy.getWeight());
      System.out.println("Policyholder's BMI: " + String.format("%.2f",userPolicy.getBMI()));
      System.out.println("Policy Price: $" + String.format("%.2f",userPolicy.getPrice()));
   }
}