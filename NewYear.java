/**
 * @description
 * @author 郭嘉森
 * @time 2018年4月7日 下午6:58:53
 * @school fjnu
 */
class Mobileshop{
	InnerPurchaseMoney purchaseMoney1;
	InnerPurchaseMoney purchaseMoney2;
	private int mobileAmount;
	public Mobileshop() {
		purchaseMoney1=new InnerPurchaseMoney(20000);
		purchaseMoney2=new InnerPurchaseMoney(10000);
		// TODO Auto-generated constructor stub
	}
	void setMobileAmount(int m){
		mobileAmount=m;
	}
	int getMobileAmount(){
		return mobileAmount;
	}
	class InnerPurchaseMoney{
		int moneyValue;
		public InnerPurchaseMoney(int m) {
			moneyValue=m;
			// TODO Auto-generated constructor stub
		}
		void buyMoblile(){
			if(moneyValue>=20000){
				mobileAmount=mobileAmount-6;
				System.out.println("用价值"+moneyValue+"的内部购物券买了6部手机");
			}
			else if(moneyValue<20000&&moneyValue>=10000){
				mobileAmount=mobileAmount-3;
				System.out.println("用价值"+moneyValue+"的内部购物券买了3部手机");
			}
		}
	}
}

public class NewYear {
	public static void main(String args[]){
		Mobileshop shop=new Mobileshop();
		shop.setMobileAmount(30);
		System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");
		shop.purchaseMoney1.buyMoblile();
		shop.purchaseMoney2.buyMoblile();
		System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");
	}

}
