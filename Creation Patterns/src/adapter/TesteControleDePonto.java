package adapter;

public class TesteControleDePonto {
	public static void main(String[] args) throws InterruptedException{
		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario("Thiago Ferreira");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registraSaida(funcionario);
	}
}
