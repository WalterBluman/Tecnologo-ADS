package capitulo04topico14;

public class TestePorta {
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.cor = "Bege";
		porta.dimensaoX = 2;
		porta.dimensaoY = 1.2;
		porta.dimensaoZ = 0.04;
		
		porta.estaAberta();
		
		porta.imprime();
		
		porta.abrePorta();
		porta.pintaPorta("Branca");
		porta.aumentaDimensoes(0.20);
		
		System.out.println("--- Alterações ---");
		porta.imprime();
	}
}
