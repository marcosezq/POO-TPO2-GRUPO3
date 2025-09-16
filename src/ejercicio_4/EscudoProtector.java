package ejercicio_4;

// Enum Escudo Protector
public enum EscudoProtector {
	ESCUDO_1(50),
	ESCUDO_2(20), 
	ESCUDO_3(30), 
	ESCUDO_4(40);
	
	private final int porcentajeDefensa;
	
	EscudoProtector(int porcentajeDefensa){
		this.porcentajeDefensa = porcentajeDefensa;
	}
	
	public int getPorcentajeDefensa() {
		return porcentajeDefensa;
	}
}
