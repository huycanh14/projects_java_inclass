package com.questionone;

public class ExpressionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square muoi_mu_hai = new Square(new Numeral(10)); // 10^2
        Multiplication hai_nhan_ba = new Multiplication(new Numeral(2), new Numeral(3)); // 2 * 3

        Square answer = new Square(new Addition(new Subtraction(muoi_mu_hai, new Numeral(1)), hai_nhan_ba)); // ((((10^2)-1)+(2*3))^2)

        System.out.println(answer.toString());
        System.out.println(answer.evaluate());

        Division division1 = new Division(new Numeral(6), new Numeral(3));

        /**
         * try division
         */
        try {
            System.out.println(division1.toString());
            System.out.println(division1.evaluate());
        } catch (ArithmeticException ex) {
            System.out.println("Loi chia cho 0!");
        }


        Division division2 = new Division(new Numeral(3), new Numeral(0));

        /**
         * try division exception
         */
        try {
            System.out.println(division2.toString());
            System.out.println(division2.evaluate());
        } catch (ArithmeticException ex) {
            System.out.println("Loi chia cho 0!");
        }
	}

}
