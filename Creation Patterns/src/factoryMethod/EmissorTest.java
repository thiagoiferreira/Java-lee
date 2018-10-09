package factoryMethod;

public class EmissorTest{
	public static void main(String[] args) {
		EmissorCreator creator = new EmissorCreator();
		
		Emissor emissor1 = creator.create(EmissorCreator.SMS);
		emissor1.envia("Eae gay, ta tão sério porque?");
		
		Emissor emissor2 = creator.create(EmissorCreator.Email);
		emissor2.envia("Eae homosexual, ta tão sério porque?");
		
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.envia("Eae verme, ta tão sério porque?");
	}

}
