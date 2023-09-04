import java.math.BigInteger;

public class DecimalParaFracao {
	
	private static final double EPSILON = 1e-10;
	
    public String conversao(double decimal) {
    	
    	if (Math.abs(decimal - (int) decimal) < EPSILON) {
            // O número já é um inteiro, retornar como uma fração
            return String.format("%d", (int) decimal);
        }

        int precision = 10000; // Define a precisão para encontrar uma fração aproximada
        BigInteger numerator = BigInteger.valueOf((int) Math.floor(decimal * precision));
        BigInteger denominator = BigInteger.valueOf(precision);

        // Encontra o maior divisor comum (MDC) entre o numerador e o denominador
        BigInteger gcd = numerator.gcd(denominator);

        // Simplifica a fração dividindo ambos numerador e denominador pelo MDC
        numerator = numerator.divide(gcd);
        denominator = denominator.divide(gcd);

        return String.format("%d/%d", numerator, denominator);
    }

}
