package Ex7;

public class ShopService {
	private static ShopService instance =new ShopService();
	public ShopService() {}
	public static ShopService getInstance() {
		return instance;
	}

}
