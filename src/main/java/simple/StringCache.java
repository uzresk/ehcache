package simple;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class StringCache {

	private static final String CACHE_NAME = "simple";

	public static void main(String[] args) {

		new StringCache().run();
	}

	private void run() {

		CacheManager manager = CacheManager.getInstance();
		Cache cache = manager.getCache(CACHE_NAME);

		try {
			push(cache, "uzr", "esk");

			System.out.println(get(cache, "uzr"));
		} finally {
			manager.shutdown();
		}
	}

	private void push(Cache cache, String key, String value) {
		cache.put(new Element(key, value));
	}

	private String get(Cache cache, String key) {
		return (String) cache.get(key).getObjectValue();
	}
}
