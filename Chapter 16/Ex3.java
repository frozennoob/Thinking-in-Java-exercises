import java.util.*;

public class Ex3 {
	public static void start(){
		setm(2,2, 2, 1, 3);
		printm();
	}
	static void setm(int d1, int d2,int d3, int start, int end){
		Random rand = new Random(47);
		m = new double[d1][d2][d3];
		for (int i = 0; i < d1; i++)
			for(int j = 0; j < d2; j++)
				for(int k = 0; k < d3; k++)
					m[i][j][k] = rand.nextDouble() + rand.nextInt(end-start) + start;
	}
	static void printm(){
		System.out.println(Arrays.deepToString(m));
	}
	static double[][][] m;
}
