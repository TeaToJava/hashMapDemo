package hashmapdemo;

/**
 * Map interface that provides basic map operations
 * @author 
 *
 * @param <K>
 * @param <V>
 */
public interface Map<K, V> {
	V put(K key, V value);
	V get(K key);
	boolean containsKey(K key);
	boolean containsValue(V value);
	V remove(K key);
	void clear();
	boolean isEmpty();
	int size();
}