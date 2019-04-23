public abstract class CarroPrototype implements Cloneable{
	protected double valorCompra;

	public abstract String exibirInfo();

	public CarroPrototype clone() throws CloneNotSupportedException
	{
		return (CarroPrototype)super.clone();
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
}
