package javapractice;

public class EmployeeWageBuilderUC6{
	public static final  int IS_PART_TIME=1;
	public static final  int IS_FULL_TIME=2;
	
	private final String  company;
	private final int empRateperHour;
	private final int NoofWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmployeeWageBuilderUC6(String company,int empRateperHour,int NoofWorkingDays
    		,int maxHoursPerMonth) {
		this.company=company;
		this.empRateperHour=empRateperHour;
		this.NoofWorkingDays=NoofWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	
    public  void CalculateEmpWage() {
	     
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
	      totalEmpWage=totalEmpHrs*empRateperHour;
	}
    @Override
    public String toString() {
    	return "Total employee wage for company: "+ company+" is "+totalEmpWage;
    }
    public static void main(String[] args) {
    	EmployeeWageBuilderUC6 dMart=new EmployeeWageBuilderUC6("Dmart", 30, 21, 110);
    	EmployeeWageBuilderUC6 reliance=new EmployeeWageBuilderUC6("Reliance", 25, 22, 120);
    	dMart.CalculateEmpWage();
    	reliance.CalculateEmpWage();
System.out.println(dMart);
System.out.println(reliance);
    }
}
