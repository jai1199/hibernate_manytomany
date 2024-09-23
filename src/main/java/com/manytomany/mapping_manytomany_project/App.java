package com.manytomany.mapping_manytomany_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " program execution started " );
        Customer c1 = new Customer();
        c1.setCid(101);
        c1.setCname("john");
        c1.setPhno(99999999);
        Customer c2 = new Customer();
        c2.setCid(102);
        c2.setCname("johny");
        c2.setPhno(8888888);
        Customer c3 = new Customer();
        c3.setCid(103);
        c3.setCname("john_shina");
        c3.setPhno(777777777);
        
        Grocery g1 = new Grocery();
        g1.setGid(1111);
        g1.setGname("biskit");
        g1.setGprice(25);
        
        Grocery g2 = new Grocery();
        g2.setGid(2222);
        g2.setGname("parleGI_biskit");
        g2.setGprice(250);
        
        Grocery g3 = new Grocery();
        g3.setGid(3333);
        g3.setGname("gudday_biskit");
        g3.setGprice(2500);
        
        c1.getGros().add(g3);
        c1.getGros().add(g2);
        c2.getGros().add(g3);
        c3.getGros().add(g1);
        c3.getGros().add(g3);
        
        g1.getCustomer().add(c3);
        g2.getCustomer().add(c2);
        g3.getCustomer().add(c3);
        g1.getCustomer().add(c1);
        
        Configuration con = new Configuration();
        con.configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Grocery.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        session.save(c1);
        session.save(c2);
        session.save(c3);
        session.save(g1);
        session.save(g2);
        session.save(g3);
        trans.commit();
        session.close();
        System.out.println(" program execution ended ");
    }
}
