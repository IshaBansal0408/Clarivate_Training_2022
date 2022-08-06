package day04;

public class HashCodeClass {
	
	int value;
	HashCodeClass(int v){
		this.value = v;
	}
	@Override
	public int hashCode() {
		return 456;
	}

}
