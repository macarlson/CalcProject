public class Calc {
	
	double Payments(double TotalIncome){
		
		double HPay = TotalIncome*.18;
		
		return HPay;
	}
	
	double Debt(double TotalIncome, double MonthlyDebt){
		
		double Payment = (TotalIncome*.36) - MonthlyDebt;
		
		return Payment;
	}
	
	double MaxPayment(double HPay, double Payment){
		
		if (HPay - Payment < 0){
			return HPay;
		}
		else{
			return Payment;
		}
			
	}
	
	double MortgageAmount(double allowed, double DPayment, double rate, double year){
		double months = year*12;
		double MonthlyRate = rate/12;
		double Present = (allowed)*(1-(1/(Math.pow(MonthlyRate, months))/MonthlyRate)+DPayment);
		
		return Present;
	}
	
}