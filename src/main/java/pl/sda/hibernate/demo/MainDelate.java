package pl.sda.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class MainDelate {
    public static void main(String[] args) {
        try(Session session = HibarnateUtil.INSTANCE.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();

            Student student = session.get(Student.class, 2L);

            if(student != null) {
                session.remove(student);

                transaction.commit();
            }
        }catch(Exception ioe){

        }

    }
}
