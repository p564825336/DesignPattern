package learn.design.pattern.decorator.xiaocai;

public class Finery extends Person {
	protected Person component;
	
	//打扮
	public void Decorate(Person component){
		this.component = component;
	}

	public void Show() {
		if(component != null){
			component.Show();
		}
	}
}
