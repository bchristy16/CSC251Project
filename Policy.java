public class Policy
{
   private int policyNumber;
   private int age;
   
   private double height;  //in inches
   private double weight;  //in pounds
   
   private String providerName;
   private String firstName;
   private String lastName;
   private String smokingStatus; //smoker or non-smoker
   
   public Policy()   // Initialize with default values
   {
      policyNumber = -1;
      age = -1;
      
      height = -1;
      weight = -1;
      
      providerName = "unknown";
      firstName = "unknown";
      lastName = "unknown";
      smokingStatus = "unknown";
   }
   
   // Initialize with given values
   public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      this.policyNumber = policyNumber;
      this.age = age;
      
      this.height = height;
      this.weight = weight;
      
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.smokingStatus = smokingStatus;
      
   }
   
   public void setPolicyNumber(int policyNumber)   // Set policy number
   {
      this.policyNumber = policyNumber;
   }
   
   public int getPolicyNumber()  // Get policy number
   {
      return policyNumber;
   }
   
   public void setAge(int age)   // Set age
   {   
      this.age = age;
   }
   
   public int getAge()  // Get age
   {
      return age;
   }
   public void setHeight(double height)   // Set height
   {
      this.height = height;
   }
   public double getHeight()  // Get height
   {
      return height;
   }
   public void setWeight(double weight)   // Set weight
   {
      this.weight = weight;
   }
   
   public double getWeight()  // Get weight
   {
      return weight;
   }
   
   public void setProviderName(String providerName) // Set provider name
   {
      this.providerName = providerName;
   }
   
   public String getProviderName()  // Get provider name
   {
      return providerName;
   }
   
   public void setFirstName(String firstName)   // Set first name
   {
      this.firstName = firstName;
   }
   
   public String getFirstName()  // Get first name
   {
      return firstName;
   }
   
   public void setLastName(String lastName)   // Set last name
   {
      this.lastName = lastName;
   }
   
   public String getLastName()  // Get last name
   {
      return lastName;
   }
   
   public void setSmokingStatus(String smokingStatus)   // Set smoking status
   {
      this.smokingStatus = smokingStatus;
   }
   
   public String getSmokingStatus()  // Get smoking status
   {
      return smokingStatus;
   }
   
   public double getBMI()  // Calculates the policy holder's BMI
   {
      return (weight*703) / (height*height);
   }
   
   public double getPrice()   // Calculates the policy holder's fees
   {
      double baseFee = 600;
      
      if(age > 50)
      {
         baseFee = baseFee + 75;
      }
      if(smokingStatus == "smoker")
      {
         baseFee = baseFee + 100;
      }
      if(getBMI() > 35)
      {
         baseFee = baseFee + ((getBMI() - 35) * 20);
      }
      
      return baseFee;
   }
}