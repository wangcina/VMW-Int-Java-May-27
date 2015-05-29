package generics;

import java.util.Iterator;

public class MyList<E> implements Iterable<E> {
	@SuppressWarnings("unchecked")
	private E [] data = (E[])(new Object[10]);
	private int count = 0;
	
	public void add(E e) {
		data[count++] = e;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("MyList [");
		for (int i = 0; i < count; i++) {
			sb.append(data[i]).append(", ");
		}
		sb.setLength(sb.length() - 2);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>(){
			private int progress = 0;
			
			@Override
			public boolean hasNext() {
				return progress < count;
			}

			@Override
			public E next() {
				return data[progress++];
			}
			
		};
	}
	
}
