package pigmalion.soluciones;

public class Recursos_infinitos {
	/*
	 * Solucion por fuerza bruta
	 * Complejidad: O(n^2)
	 * 
	 * */
	public boolean sumaDeDosElementosEsIgualANumero(int[] nums, int requiredSum) {
		if(nums == null || nums.length < 2) {
			return false;
		}
		for(int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(i != j) {
					int suma = nums[i] + nums[j];
					if(suma == requiredSum) {
						return true;
					}
				}
			}
		}
		return false;
	}
}