package controller;

import model.CidadePortoAlegre;

public class ImpostoPortoAlegre implements ICalculoImpostoStrategy{
	
	@Override
	public void calcularImposto() {
		CidadePortoAlegre cid = new CidadePortoAlegre();
		
		cid.setAreaTotal(156.53f);
		cid.setAreaGaragem(40.75f);
		
		float imposto = 0;
		if (cid.getAreaGaragem() == 0) {
			imposto = cid.getAreaTotal() * 8;
		} else {
			imposto = (cid.getAreaTotal() * 7.5f) * (cid.getAreaGaragem() * 2.5f);
		}
		
		System.out.println("Vai pagar: " + imposto + " de imposto");
		
	}

}
