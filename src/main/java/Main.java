import config.FactoryConfiguration;
import embed.FullName;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

//        FullName fullName = new FullName("Dasun","Nirmal");

        Student student = new Student();
        student.setId(3);
        student.setName("Dasun");
        student.setAddress("Ragama");

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
//        need to use a transaction otherwise the data will not be saved
        Transaction transaction = session.beginTransaction();

//        these methods are diplicated from java

//        session.update(student);
//        session.save(student);
//        session.delete(student);

//        to load all the data we can use get or load
        Student student1 = session.get(Student.class, 2);
        System.out.println(student1);

//        Other methods we can use
//        session.persist(student);
//        session.remove(student);
        transaction.commit();
        session.close();
    }
}
