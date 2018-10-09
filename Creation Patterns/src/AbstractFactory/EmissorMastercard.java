package AbstractFactory;

public class EmissorMastercard implements Emissor{
	public void envia(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para a mastercard");
		System.out.println(mensagem);
	}
}
