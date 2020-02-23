
public class SavingsAccountTest {
 
	public SavingsAccountTest() {
	}
    public static void main(String[] args) {
    	SavingsAccount saver1,saver2;
    	saver1= new SavingsAccount (2000.0);
    	saver2= new SavingsAccount (3000.0);
    	int total=0;
    	SavingsAccount.modifyInterestRate(0.04);
    	int total_month=12;
		double[] balance_month=saver1.getMonthsSavingBalance(total_month);
		System.out.println("*********************************************************************\n");
		for(int i=0;i<total_month;i++) {
			System.out.println("\nMonth"+(i+1)+":\nSave One Balance= "+balance_month[i]+" with rate of 0.04");
		}
        System.out.println("*********************************************************************\n");
        balance_month=saver2.getMonthsSavingBalance(12);
        for(int i=0;i<total_month;i++){
         System.out.println("\n Month"+(i+1)+":\nSave Two Balance= "+balance_month[i]+" with rate of 0.04");
        }
        System.out.println("*********************************************************************\n");
        SavingsAccount.modifyInterestRate(0.05);
		balance_month=saver1.getMonthsSavingBalance(12);
		for(int i=0;i<total_month;i++){
		System.out.println("\n Month"+(i+1)+":\nSave Two Balance= "+balance_month[i]+" with rate of 0.05");
		}
		System.out.println("*********************************************************************\n");
		balance_month=saver2.getMonthsSavingBalance(12);
		for(int i=0;i<total_month;i++) {
			System.out.println("\n Month"+(i+1)+":\nSave Two Balance= "+balance_month[i]+" with rate of 0.05");
		}
		System.out.println("*********************************************************************\n");
		}
    }
