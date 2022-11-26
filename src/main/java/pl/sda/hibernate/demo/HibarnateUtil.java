package pl.sda.hibernate.demo;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibarnateUtil {
    public final static HibarnateUtil INSTANCE = new HibarnateUtil();
    private final SessionFactory sessionFactory;

    public HibarnateUtil() {
        this.sessionFactory = loadConfigFile();
    }

    public SessionFactory loadConfigFile(){
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();

        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

        return metadata.getSessionFactoryBuilder().build();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
