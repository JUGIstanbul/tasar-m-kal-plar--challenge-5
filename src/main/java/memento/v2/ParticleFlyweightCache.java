package memento.v2;

import java.util.HashMap;
import java.util.Map;

public class ParticleFlyweightCache {

    private static Map<String, ParticleFlyweight> cache = new HashMap<>();

    public static ParticleFlyweight get(Color color, Size size, Shape shape) {
        var key = color+"-"+size+"-"+shape;
        return cache.computeIfAbsent(key, k->new ParticleFlyweight(color, size, shape));
    }

    public static int size() {
        return cache.size();
    }
}
