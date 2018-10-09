package factoryMethod;

public class EmissorEmail implements Emissor {
	public void envia(String message) {
		System.out.println("Enviando por Email a mensagem:");
		System.out.println(message);
	}
}
