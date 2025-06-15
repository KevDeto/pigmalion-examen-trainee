package pigmalion.soluciones;

public class Main {
	public static void main(String[] args) {
		Recursos_infinitos recursos_infinitos = new Recursos_infinitos();
		Recursos_limitados recursos_limitados = new Recursos_limitados();
		int[] nums1 = {1,4,3,9};
		int[] nums2 = {1,2,4,4};
		
		System.out.println(recursos_infinitos.sumaDeDosElementosEsIgualANumero(nums1, 0));
		System.out.println(recursos_infinitos.sumaDeDosElementosEsIgualANumero(nums2, 8));
		
		System.out.println(recursos_limitados.sumaDeDosElementosEsIgualANumero(nums1, 0));
		System.out.println(recursos_limitados.sumaDeDosElementosEsIgualANumero(nums2, 8));
	}
}
