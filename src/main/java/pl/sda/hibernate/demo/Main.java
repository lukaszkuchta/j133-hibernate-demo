package pl.sda.hibernate.demo;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibarnateUtil.INSTANCE.getSessionFactory().openSession();
        session.close();
    }
}
