package controller;

import model.CidadeSaoPaulo;

public class ImpostoSaoPaulo implements ICalculoImpostoStrategy{
	
	@Override
	public void calcularImposto() {
		CidadeSaoPaulo cid = new CidadeSaoPaulo();
		
		cid.setAreaTotal(156.53f);
		cid.setNumeroComodos(4);
		
		float imposto = (cid.getAreaTotal() * 10) + (cid.getNumeroComodos() * 2);
		System.out.println("Vai pagar: " + imposto + " de imposto");
		
	}

}
