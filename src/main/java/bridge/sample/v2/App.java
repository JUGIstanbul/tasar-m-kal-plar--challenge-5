package bridge.sample.v2;

public class App {
    public static void main(String[] args) {
        var student1 = new Student();
        var student2 = new Student();
        var repository = new StudentRepository(new InMemoryPersister<>());
        repository.save(student1);
        repository.save(student2);
        var foundStudent = repository.findById(1);
        repository.delete(student2);
    }
}
