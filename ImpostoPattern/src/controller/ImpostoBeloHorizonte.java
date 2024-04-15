package controller;

import model.CidadeBeloHorizonte;

public class ImpostoBeloHorizonte implements ICalculoImpostoStrategy{

	@Override
	public void calcularImposto() {
		CidadeBeloHorizonte cid = new CidadeBeloHorizonte();
		
		cid.setAreaTotal(280.50f);
		cid.setNumQuartos(3);
		
		float imposto = (cid.getAreaTotal() * 7) + (cid.getNumQuartos() * 4);
		System.out.println("Vai pagar " + imposto + " de imposto");
		
	}

}
