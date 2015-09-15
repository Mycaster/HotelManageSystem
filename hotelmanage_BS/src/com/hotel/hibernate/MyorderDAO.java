package com.hotel.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Myorder entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hotel.hibernate.Myorder
  * @author MyEclipse Persistence Tools 
 */

public class MyorderDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(MyorderDAO.class);
		//property constants
	public static final String ROOMCOUNT = "roomcount";
	public static final String STATUS = "status";



    
    public void save(Myorder transientInstance) {
        log.debug("saving Myorder instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Myorder persistentInstance) {
        log.debug("deleting Myorder instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Myorder findById( java.lang.Integer id) {
        log.debug("getting Myorder instance with id: " + id);
        try {
            Myorder instance = (Myorder) getSession()
                    .get("com.hotel.hibernate.Myorder", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Myorder instance) {
        log.debug("finding Myorder instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.hotel.hibernate.Myorder")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Myorder instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Myorder as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByRoomcount(Object roomcount
	) {
		return findByProperty(ROOMCOUNT, roomcount
		);
	}
	
	public List findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	

	public List findAll() {
		log.debug("finding all Myorder instances");
		try {
			String queryString = "from Myorder";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Myorder merge(Myorder detachedInstance) {
        log.debug("merging Myorder instance");
        try {
            Myorder result = (Myorder) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Myorder instance) {
        log.debug("attaching dirty Myorder instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Myorder instance) {
        log.debug("attaching clean Myorder instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}