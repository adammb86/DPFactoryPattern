
public class BangunDatarFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BangunDatarFactory bangundatarfactory = new BangunDatarFactory();

		BangunDatar persegi=bangundatarfactory.getBangunDatar("Persegi");
		//otomatis menciptakan objek persegi
		
		persegi.gambarBangun();
	}

}
