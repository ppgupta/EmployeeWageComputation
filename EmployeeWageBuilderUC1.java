package javapractice;

public class EmployeeWageBuilderUC6{
	public static final  int IS_PART_TIME=1;
	public static final  int IS_FULL_TIME=2;
    public static int CalculateEmpWage(String company,int empRateperHour,int NoofWorkingDays
    		,int maxHoursPerMonth) {
	     
	     int empHrs=0;
	     int totalEmpHrs=0;
	     int totalWorkingDays=0;
	     while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays < NoofWorkingDays) {
	    	 totalWorkingDays++;
	 	int empCheck=(int )Math.floor(Math.random()*10)%3;
	   switch(empCheck) {
	   case  IS_PART_TIME:
		   empHrs=4;
		   break;
	   case  IS_FULL_TIME:
		   empHrs=8;
		   break;
	   default:
		   empHrs=0;
		   
	   }
	   
	   totalEmpHrs+=empHrs;
		System.out.println("Day: "+totalWorkingDays+ " Employee hours is "+ empHrs);
   }
	     int totalEmpWage=totalEmpHrs*empRateperHour;
		System.out.println("Total Employee wage for Company "+company+" is: "+ totalEmpWage);
 return totalEmpWage;
	}
    public static void main(String[] args) {
    	CalculateEmpWage("Myntra",30,22,100);
    	CalculateEmpWage("Flipkart",30,22,120);

    }
}
