package pl.sda.hibernate.demo;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;

import java.util.List;

public class MainSelectList {
    public static void main(String[] args) {
        try(Session session = HibarnateUtil.INSTANCE.getSessionFactory().openSession()){
            TypedQuery<Student> zapytanie = session.createQuery("from Student", Student.class);
            List<Student> listaWszystkichStudentow = zapytanie.getResultList();

            for(Student student : listaWszystkichStudentow){
                System.out.println(student);
            }
        }catch(Exception ioe){
            System.err.println("Blad bazy: " + ioe);
        }

    }
}
