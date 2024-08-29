package controller;

import br.edu.fateczl.quick.*;

public class ControllerOrdenaQuick {
	public ControllerOrdenaQuick() {
		super();
	}
	
	public int[] OrdenacaoQuickSort (int[]vet, int inicio, int fim) {
		OrdenaQuick qksort = new OrdenaQuick();
		return qksort.QuickSort(vet, 0, vet.length - 1);		
	}
}
