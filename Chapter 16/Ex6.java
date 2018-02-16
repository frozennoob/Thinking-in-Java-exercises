import java.util.*;

public class Ex6 {
	public static void start(){
		System.out.println(Arrays.deepToString(setm(2,2,2)));
	}
	static M2[][][] setm(int d1,int d2, int d3){
		M2[][][] m2 = new M2[d1][d2][d3];
		for (int i = 0; i < d1; i++)
			for (int j = 0; j < d2; j++)
				for (int k = 0; k < d2; k++)
					m2[i][j][k] = new M2();
		return m2;
	}
}

class M2{}