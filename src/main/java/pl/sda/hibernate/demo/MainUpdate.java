package pl.sda.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class MainUpdate {
    public static void main(String[] args) {
        try(Session session = HibarnateUtil.INSTANCE.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();

//            Student student = new Student();
//            student.setImie("Pawel");
//            student.setDataUrodzenia(LocalDate.of(1990, 1, 3));
//            student.setKierunekNauczania("Informatyka");
//            student.setIndeks("123123");

            Student strudent2 = Student.builder()
                    .dataUrodzenia(LocalDate.of(1995, 1, 3))
                    .kierunekNauczania("Filozofia")
                    .indeks("321321")
                    .imie("Gawel")
                    .id(2L)
                    .build();


            session.merge(strudent2);

            transaction.commit();
        }catch(Exception ioe){

        }

    }
}
