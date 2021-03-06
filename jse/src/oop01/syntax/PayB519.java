package oop01.syntax;

public class PayB519 {
	public static void main(String[] args) {
		String hulk = "헐크";
		int hulkSalary=200;
		String iron = "아이언";
		int ironSalary=300;
		String thor = "토르";
		int thorSalary = 500;
		
		PayA519 hulkPay = new PayA519();
		hulkPay.setTax(hulkSalary);
		PayA519 ironPay = new PayA519();
		ironPay.setTax(ironSalary);
		PayA519 thorPay = new PayA519();
		thorPay.setTax(thorSalary);
		
		System.out.println("=== "+hulk+"의 5월 급여내역 ===");
		System.out.println("급여 : "+hulkSalary);
		System.out.println("세금 : "+hulkPay.getTax());
		System.out.println("실수령액 : " +hulkPay.getIncome());
		System.out.println();
		System.out.println("=== "+iron+"의 5월 급여내역 ===");
		System.out.println("급여 : "+ironSalary);
		System.out.println("세금 : "+ironPay.getTax());
		System.out.println("실수령액 : "+ironPay.getIncome());
		System.out.println();
		System.out.println("=== "+thor+"의 5월 급여내역 ===");
		System.out.println("급여 : "+thorSalary);
		System.out.println("세금 : "+thorPay.getTax());
		System.out.println("실수령액 : "+thorPay.getIncome());
		System.out.println();
	}
}
