package bridge.sample.v2;

public class StudentRepository implements Repository<Student, Integer> {

    private Persister<Student> persister;

    public StudentRepository(Persister<Student> persister) {
        this.persister = persister;
    }

    @Override
    public Student save(Student entity) {
        return persister.save(entity);
    }

    @Override
    public Student delete(Student entity) {
        return persister.delete(entity);
    }

    @Override
    public Student findById(Integer id) {
        return persister.findById(id);
    }
}
