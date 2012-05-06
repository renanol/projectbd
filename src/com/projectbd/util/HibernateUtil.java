package com.projectbd.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author renanaoliveira
 */
public class HibernateUtil {

    private static HibernateUtil util;
    private static EntityManagerFactory emf;

    private HibernateUtil() {
        emf = Persistence.createEntityManagerFactory("projectBDPU");
    }

    public static HibernateUtil getInstance() {
        if (util == null) {
            util = new HibernateUtil();
        }
        return util;
    }

    public EntityManagerFactory getFactory() {
        return emf;
    }
}
