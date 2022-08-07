package day05;

public interface DefaultMethodInterface {
	void fun1();
	default void fun2() {
		System.out.println("Hello from interface!");
	}

}
