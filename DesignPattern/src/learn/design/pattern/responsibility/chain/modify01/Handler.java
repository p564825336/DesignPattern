package learn.design.pattern.responsibility.chain.modify01;

public abstract class Handler {
	protected Handler successor;
	
	public void SetSuccessor(Handler successor){
		this.successor = successor;
	}

	public abstract void HandleRequest(int request);
	
}
