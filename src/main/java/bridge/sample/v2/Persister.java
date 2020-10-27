package bridge.sample.v2;

public abstract class Persister<T extends Entity> {

    abstract T save(T entity);

    abstract T delete(T entity);

    abstract T findById(Integer id);
}
