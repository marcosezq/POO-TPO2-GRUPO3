package ejercicio_6;

public class Circulo extends figura{
	private int radio;

	public Circulo(int radio) {
		this.radio = radio;
	}
	
	@Override
	public void calculararea() {
	 double area = 	Math.PI*radio*radio;
	 System.out.println("Area del circulo:"+area);
	}
	@Override
	public void mostrarDescripcion(){
		System.out.println("Soy un circulo");
	}
}
