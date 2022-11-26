package pl.sda.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class MainInsert {
    public static void main(String[] args) {
        try(Session session = HibarnateUtil.INSTANCE.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();

            Student student = new Student();
            student.setImie("Pawel");
            student.setDataUrodzenia(LocalDate.of(1990, 1, 3));
            student.setKierunekNauczania("Informatyka");
            student.setIndeks("123123");

            Student strudent2 = Student.builder()
                    .dataUrodzenia(LocalDate.of(1990, 1, 3))
                    .kierunekNauczania("Informatyka")
                    .indeks("123123")
                    .imie("Pawel")
                    .build();


            session.persist(student);

            transaction.commit();
        }catch(Exception ioe){

        }

    }
}
