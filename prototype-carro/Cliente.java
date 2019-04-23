import java.util.Scanner;
import java.util.ArrayList; 

public class Cliente {
	public static void main(String[] args) throws CloneNotSupportedException {
		PalioPrototype prototipoPalio = new PalioPrototype();
		GolPrototype prototipoGol = new GolPrototype();
		FiestaPrototype prototipoFiesta = new FiestaPrototype();
		HB20prototype prototipoHB20 = new HB20prototype();
		OnixPrototype prototipoOnix = new OnixPrototype();
	
		String carro = "";
		int preco = 0;
		
		
		ArrayList<CarroPrototype> ListaDeCarros = new ArrayList();
		
		while(!carro.equals("s")) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o modelo ou s para sair: ");
		carro = entrada.nextLine();
		if(!carro.equals("s")) {
			Scanner entrada1 = new Scanner(System.in);
			System.out.println("Digite o preço de compra: ");
			preco = entrada1.nextInt();
		}		
		
			switch(carro) {
				
				case "Gol":
					CarroPrototype gol = prototipoGol.clone();
					gol.setValorCompra(preco);
					ListaDeCarros.add(gol);
					break;
				case "Palio":
					CarroPrototype palio = prototipoPalio.clone();
					palio.setValorCompra(preco);
					ListaDeCarros.add(palio);
					break;
				case "Fiesta":
					CarroPrototype fiesta = prototipoFiesta.clone();
					fiesta.setValorCompra(preco);
					ListaDeCarros.add(fiesta);
					break;
				case "HB20":
					CarroPrototype HB20 = prototipoHB20.clone();
					HB20.setValorCompra(preco);
					ListaDeCarros.add(HB20);
					break;
				case "Onix":
					CarroPrototype Onix = prototipoOnix.clone();
					Onix.setValorCompra(preco);
					ListaDeCarros.add(Onix);
					break;
			}
		}
		
		int n = ListaDeCarros.size();
		for(int i=0;i<n;i++) {
			System.out.println(ListaDeCarros.get(i).exibirInfo());
		}
		
	System.out.println("O programa encerrou!");
	}

}
