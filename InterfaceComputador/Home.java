package InterfaceComputador;

public class Home implements Computador{

	@Override
	public void ligar() {
		System.out.println("A home esta ligando");
		
	}

	@Override
	public void desligar() {
		System.out.println("A home esta desligando");
		
	}

	@Override
	public void reiniciar() {
		System.out.println("A home esta reiniciando");
		
	}

	@Override
	public void carregandoSistema() {
		System.out.println("A home esta carregando o sistema");
		
	}
	
}
