package view;

import controller.ICalculoImpostoStrategy;
import controller.ImpostoBeloHorizonte;
import controller.ImpostoCuritiba;
import controller.ImpostoPortoAlegre;
import controller.ImpostoSaoPaulo;

public class Teste {

	public static void main(String[] args) {
		ICalculoImpostoStrategy imposto = new ImpostoSaoPaulo();
		imposto.calcularImposto();
		
		imposto = new ImpostoBeloHorizonte();
		imposto.calcularImposto();
		
		imposto = new ImpostoPortoAlegre();
		imposto.calcularImposto();

		imposto = new ImpostoCuritiba();
		imposto.calcularImposto();

	}

}
