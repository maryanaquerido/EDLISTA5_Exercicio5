package view;
import controller.ControllerOrdenaQuick;
import java.util.Arrays;
public class PrincipalOrdenaQuick {
	public static void main (String[]args) {
		
		ControllerOrdenaQuick oCont = new ControllerOrdenaQuick();
		
		int[] vet1 = {74,20,74,87,81,16,25,99,44,58};
		int[] vet2 = {44,43,42,41,40,39,38};
		int[] vet3 = {31,32,33,34,99,98,97,96};
		
		vet1 = oCont.OrdenacaoQuickSort(vet1, 0, vet1.length - 1);
        vet2 = oCont.OrdenacaoQuickSort(vet2, 0, vet2.length - 1);
        vet3 = oCont.OrdenacaoQuickSort(vet3, 0, vet3.length - 1);
        
        System.out.println("VETOR 1 ORDENADO: " + Arrays.toString(vet1));
        System.out.println("VETOR 2 ORDENADO: " + Arrays.toString(vet2));
        System.out.println("VETOR 3 ORDENADO: " + Arrays.toString(vet3));
		
		
	}

}
