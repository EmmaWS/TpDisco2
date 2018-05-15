package ar.edu.unlam.pb2;

public class Disco {

	private Double radioExterior;
	private Double radioInterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;
	
	
	public Disco(Double radioExterior, Double radioInterior, Double perimetroInterior, Double perimetroExterior, Double superficie){
		
		this.radioExterior = radioExterior;
		this.radioInterior = radioInterior;
		this.perimetroInterior = perimetroInterior;
		this.perimetroExterior = perimetroExterior;
		this.superficie = superficie;
		
	}
	
	public Disco(Double radioExterior, Double radioInterior){
		
		this.radioExterior = 10.0 ;
		this.radioInterior = 1.0;
		
	}

	//CALCULAR SUPERFICIE
	public Double calcularSuperficie(Double dato01, Double dato02){
		
		dato01 = Math.pow(this.getRadioExterior(), 2);
		dato02 = Math.pow(this.getRadioInterior(), 2);
		this.superficie = (dato01*Math.PI)-(dato02*Math.PI);
		return this.superficie;
	}
	
	//CALCUALAR PERIMETRO INTERIOR
	public Double calcularPerimetroInterno(){
		perimetroInterior = this.radioInterior*(Math.pow(Math.PI, 2));
		this.perimetroInterior = perimetroInterior*(Math.PI);
		return this.perimetroInterior;
	}
	
	//CALCUALAR PERIMETRO EXTERIOR
	public Double getPerimetroExterno() {
		perimetroExterior = this.radioExterior*(Math.pow(Math.PI, 2));
		this.perimetroExterior = perimetroExterior*(Math.PI);
		return this.perimetroExterior;
	}
	
	
	
	//Getters and Setters
	
	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}
	
	
	
	
}
