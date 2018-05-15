package ar.edu.unlam.pb2;

import org.junit.Assert;
import org.junit.Test;

public class testDisco {

	@Test
	public void testQueVerificaSuperficie()
	{
		Disco miDisco = new Disco(10.0,1.0);
		Double Superficie;
		Superficie = miDisco.calcularSuperficie(10.0, 1.0);
		Double SuperficieDada = 311.0176727053895306;
		Assert.assertEquals(SuperficieDada, Superficie);
		
	}
	
	@Test
	public void testQueVerificaPerimetroInterior()
	{
		Disco miDisco = new Disco(10.0,1.0);
		Double PerimetroInterior;
		PerimetroInterior = miDisco.calcularPerimetroInterno();
		Double PerimetroInteriorDado = 31.006276680299816;
		Assert.assertEquals(PerimetroInteriorDado, PerimetroInterior);
	}
	
	
	@Test
	public void testQueVerificaPerimetroExterior()
	{
		Disco miDisco = new Disco(10.0,1.0);
		Double PerimetroExterior;
		PerimetroExterior = miDisco.getPerimetroExterno();
		Double PerimetroExteriorDado = 310.06276680299817;
		Assert.assertEquals(PerimetroExteriorDado, PerimetroExterior);
	}
}
