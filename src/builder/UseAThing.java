package builder;

public class UseAThing {

	public static void main(String[] args) {
		Thing t;
//		Thing.ThingBuilder tb = new Thing.ThingBuilder();
//		tb.name("Fred");
//		tb.address("123 Acacia Gardens");
//		t = tb.build();
		
		t = Thing.builder().name("Fred").address("Over the rainbow").c(9).build();
	}

}
