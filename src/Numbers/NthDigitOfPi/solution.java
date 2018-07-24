import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class solution{
  private final static double PIAPX = 16 * Math.atan(1.0 / 5.0) - 4 * Math.atan(1.0 / 239.0);

  public String getNDigitPi(int N) {
    BigDecimal bd = new BigDecimal(Double.toString(PIAPX));
    bd = bd.setScale(N, RoundingMode.HALF_UP);
    return bd.toString();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N;
    N = Integer.parseInt(br.readLine());
    solution sl = new solution();
    System.out.println(sl.getNDigitPi(N));
  }
}

