package bridge.sample.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class JdbcPersister<T extends Entity> extends Persister<T> {

    private AtomicInteger idGenerator = new AtomicInteger(0);
    private Map<Integer, T> records = new HashMap<>();
    
    @Override
    public T save(T entity) {
        if (isNull(entity.getId())){
            entity.setId(idGenerator.incrementAndGet());
        }
        System.out.println("JdbcPersister :: saving "+entity.getClass().getSimpleName()+"{"+entity.getId()+"}");
        return records.put(entity.getId(), entity);
    }

    @Override
    public T delete(T entity) {
        System.out.println("JdbcPersister :: removing "+entity.getClass().getSimpleName()+"{"+entity.getId()+"}");
        return records.remove(entity.getId());
    }

    @Override
    public T findById(Integer id) {
        T entity = records.get(id);
        System.out.println("JdbcPersister :: finding "+entity.getClass().getSimpleName()+"{"+entity.getId()+"}");
        return entity;
    }
}
