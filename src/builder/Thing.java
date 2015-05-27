package builder;

public class Thing {
	private String name;
	private String address;
	private int c;
	
	private Thing() {}

	private static void invariant(String name, String address, int c) {
		if (name == null || c < 10) throw new IllegalArgumentException();
	}
	
	public static ThingBuilder builder() {
		return new ThingBuilder();
	}
	
	public static class ThingBuilder{
		private String name;
		private String address;
		private int c;
		
		private ThingBuilder() {}
		
		public ThingBuilder name(String name) {
			this.name = name;
			return this;
		}

		public ThingBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public ThingBuilder c(int c) {
			this.c = c;
			return this;
		}
		
		public Thing build() {
			invariant(name, address, c);
			Thing t = new Thing();
			t.name = name;
			t.address = address;
			t.c = c;
			return t;
		}
	}
}
