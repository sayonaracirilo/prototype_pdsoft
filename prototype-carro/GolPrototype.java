public class GolPrototype extends CarroPrototype {

	protected GolPrototype(GolPrototype golPrototype) {
		this.valorCompra = golPrototype.getValorCompra();
	}

	public GolPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: Gol\nMontadora: Wolkswagen\n" + "Valor: R$"
				+ getValorCompra() + "\n";
	}

	@Override
	public CarroPrototype clone() throws CloneNotSupportedException {
		return (GolPrototype)super.clone();
	}

}
