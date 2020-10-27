package bridge.sample.v2;

public interface Repository<T, ID> {

    T save(T entity);

    T delete(T entity);

    T findById(ID id);
}
