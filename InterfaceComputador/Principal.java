package InterfaceComputador;

public class Principal {

	public static void main(String[] args) {
		
		Gamer games = new Gamer();
		System.out.println("GAMESSSS");
		games.ligar();
		games.carregandoSistema();
		games.desligar();
		games.reiniciar();
		
		Home home = new Home();
		System.out.println("HOMEEEE");
		home.carregandoSistema();
		home.ligar();
		home.desligar();
		home.reiniciar();
	}
}
