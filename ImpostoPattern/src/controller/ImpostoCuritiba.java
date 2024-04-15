package controller;

import model.CidadeCuritiba;

public class ImpostoCuritiba implements ICalculoImpostoStrategy{
	
	@Override
	public void calcularImposto() {
		CidadeCuritiba cid = new CidadeCuritiba();
		
		cid.setAreaTotal(156.53f);
		cid.setIdadeImovel(50);
		
		float imposto = cid.getAreaTotal() * 5;
		if (cid.getIdadeImovel() > 50) {
			imposto += cid.getIdadeImovel() * 3;
		} else if (cid.getIdadeImovel() < 20) {
			imposto += cid.getIdadeImovel() * 2;
		} else {
			imposto += cid.getIdadeImovel() * 2.5f;
		}
		
		System.out.println("Vai pagar: " + imposto + " de imposto");
		
	}

}
