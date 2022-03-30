package Day17_제네릭;

public class Util {
	
	// 메소드
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		}
	
	public static<K, V> boolean Compare(Pair<K,V> p1 , Pair<K,V> p2) {
		
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p2.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
