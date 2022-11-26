package pl.sda.hibernate.demo;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;

import java.util.List;

public class MainSelectById {
    public static void main(String[] args) {
        try(Session session = HibarnateUtil.INSTANCE.getSessionFactory().openSession()){
            Student student = session.get(Student.class, 2L);

            System.out.println("Znaalezlismy studenta: " + student);
        }catch(Exception ioe){
            System.err.println("Blad bazy: " + ioe);
        }

    }
}
