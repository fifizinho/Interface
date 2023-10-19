package InterfaceComputador;

public class Gamer implements Computador {

	@Override
	public void ligar() {
		System.out.println("O Game esta ligando");

	}

	@Override
	public void desligar() {
		System.out.println("O game esta desligando");

	}

	@Override
	public void reiniciar() {
		System.out.println("O game esta reiniciando");

	}

	@Override
	public void carregandoSistema() {
		System.out.println("O game esta carregando o sistema");

	}

}
