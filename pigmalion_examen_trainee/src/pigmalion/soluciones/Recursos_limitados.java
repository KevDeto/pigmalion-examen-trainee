package pigmalion.soluciones;

import java.util.HashSet;
import java.util.Set;

public class Recursos_limitados {
	/*
	 * Solucion utilizando HashSet para consultas en O(1)
	 * Complejidad: O(n)
	 * 
	 * */
	public boolean sumaDeDosElementosEsIgualANumero(int[] nums, int requiredSum) {
		if(nums == null || nums.length < 2) {
			return false;
		}
		Set<Integer> numsSinRepetidas = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			int restaRequiredSum = requiredSum - nums[i];
			if(numsSinRepetidas.contains(restaRequiredSum)) {
				return true;
			}
			numsSinRepetidas.add(nums[i]);
		}
		return false;
	}
}
