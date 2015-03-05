package learn.design.pattern.proxy.xiaocai;

public class Pursuit implements GiveGift {
	private SchoolGirl mm;
	public Pursuit(SchoolGirl mm){
		this.mm = mm;
	}
	public void GiveDolls() {
		System.out.println(mm.getName() + " 送你洋娃娃");
	}

	public void GiveFlowers() {
		System.out.println(mm.getName() + " 送你鲜花");
	}

	public void GiveChocolate() {
		System.out.println(mm.getName() + " 送你巧克力");
	}
}
