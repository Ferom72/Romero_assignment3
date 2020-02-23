
public class SavingsAccount {
  static private double annualInterestRate;
  private double savingBalance;
  
  public SavingsAccount() {
	  this.savingBalance=0;
  }
    
  public SavingsAccount(double savingBalance) {
	  this.savingBalance=savingBalance;
  }
  
  public double getSavingBalance() {
	  return this.savingBalance;
  }
  
  public double [] getMonthsSavingBalance(int total_months) {
	  double[] monthlyI_month=new double[total_months];
	  double monthlyl;
	  for(int i=0;i<total_months;i++) {
		  monthlyl=(double)(this.savingBalance*annualInterestRate/12);
		  this.savingBalance+=monthlyl;
		  monthlyI_month[i]=this.savingBalance;
	  }
	  return monthlyI_month;
  }
  
  public static void modifyInterestRate(double newInterestRate){
	  annualInterestRate=newInterestRate;
  }
  
  public void calculateMonthlyInterest() {
	  double monthlyl;
	  monthlyl=(double)(this.savingBalance*annualInterestRate/12);
	  this.savingBalance+=monthlyl;
  }
}
