/**
 * @description
 * @author ����ɭ
 * @time 2018��4��7�� ����6:58:53
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
				System.out.println("�ü�ֵ"+moneyValue+"���ڲ�����ȯ����6���ֻ�");
			}
			else if(moneyValue<20000&&moneyValue>=10000){
				mobileAmount=mobileAmount-3;
				System.out.println("�ü�ֵ"+moneyValue+"���ڲ�����ȯ����3���ֻ�");
			}
		}
	}
}

public class NewYear {
	public static void main(String args[]){
		Mobileshop shop=new Mobileshop();
		shop.setMobileAmount(30);
		System.out.println("�ֻ�ר����Ŀǰ��"+shop.getMobileAmount()+"���ֻ�");
		shop.purchaseMoney1.buyMoblile();
		shop.purchaseMoney2.buyMoblile();
		System.out.println("�ֻ�ר����Ŀǰ��"+shop.getMobileAmount()+"���ֻ�");
	}

}
