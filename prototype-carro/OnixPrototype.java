public class OnixPrototype extends CarroPrototype {

	protected OnixPrototype(OnixPrototype OnixPrototype) {
		this.valorCompra =OnixPrototype.getValorCompra();
	}

	public OnixPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: Onix\n" + "Montadora: Chevrolet\n" + "Valor: R$"
				+ getValorCompra() + "\n";
	}

	@Override
	public CarroPrototype clone() throws CloneNotSupportedException {
		return (OnixPrototype)super.clone();
	}

}
