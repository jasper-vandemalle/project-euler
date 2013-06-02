package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.ProblemTester;
import be.vandemalle.jasper.project.euler.utils.MathUtils;

/**
 * Solution to Project Euler problem 8.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=8">http://projecteuler.net/problem=8</a>
 */
public class Problem008 extends ProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "40824";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		StringBuilder thousandDigitNumberSb = new StringBuilder(1000);

		thousandDigitNumberSb.append("73167176531330624919225119674426574742355349194934");
		thousandDigitNumberSb.append("96983520312774506326239578318016984801869478851843");
		thousandDigitNumberSb.append("85861560789112949495459501737958331952853208805511");
		thousandDigitNumberSb.append("12540698747158523863050715693290963295227443043557");
		thousandDigitNumberSb.append("66896648950445244523161731856403098711121722383113");
		thousandDigitNumberSb.append("62229893423380308135336276614282806444486645238749");
		thousandDigitNumberSb.append("30358907296290491560440772390713810515859307960866");
		thousandDigitNumberSb.append("70172427121883998797908792274921901699720888093776");
		thousandDigitNumberSb.append("65727333001053367881220235421809751254540594752243");
		thousandDigitNumberSb.append("52584907711670556013604839586446706324415722155397");
		thousandDigitNumberSb.append("53697817977846174064955149290862569321978468622482");
		thousandDigitNumberSb.append("83972241375657056057490261407972968652414535100474");
		thousandDigitNumberSb.append("82166370484403199890008895243450658541227588666881");
		thousandDigitNumberSb.append("16427171479924442928230863465674813919123162824586");
		thousandDigitNumberSb.append("17866458359124566529476545682848912883142607690042");
		thousandDigitNumberSb.append("24219022671055626321111109370544217506941658960408");
		thousandDigitNumberSb.append("07198403850962455444362981230987879927244284909188");
		thousandDigitNumberSb.append("84580156166097919133875499200524063689912560717606");
		thousandDigitNumberSb.append("05886116467109405077541002256983155200055935729725");
		thousandDigitNumberSb.append("71636269561882670428252483600823257530420752963450");

		String thousandDigitNumber = thousandDigitNumberSb.toString();
		int max = 0;
		for (int i = 0; i < thousandDigitNumber.length() - 4; i++) {
			// algorithm could be optimized to store subresults and reuse them
			int product = 1;
			product *= MathUtils.getIntValueOnIndex(thousandDigitNumber, i);
			product *= MathUtils.getIntValueOnIndex(thousandDigitNumber, i + 1);
			product *= MathUtils.getIntValueOnIndex(thousandDigitNumber, i + 2);
			product *= MathUtils.getIntValueOnIndex(thousandDigitNumber, i + 3);
			product *= MathUtils.getIntValueOnIndex(thousandDigitNumber, i + 4);
			max = Math.max(max, product);
		}

		return Integer.toString(max);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}