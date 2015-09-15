package com.hotel.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for RoomDetail entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hotel.hibernate.RoomDetail
  * @author MyEclipse Persistence Tools 
 */

public class RoomDetailDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(RoomDetailDAO.class);
		//property constants
	public static final String TYPE = "type";
	public static final String PRICE = "price";
	public static final String IS_EMPTY = "isEmpty";



    
    public void save(RoomDetail transientInstance) {
        log.debug("saving RoomDetail instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(RoomDetail persistentInstance) {
        log.debug("deleting RoomDetail instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public RoomDetail findById( java.lang.Integer id) {
        log.debug("getting RoomDetail instance with id: " + id);
        try {
            RoomDetail instance = (RoomDetail) getSession()
                    .get("com.hotel.hibernate.RoomDetail", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(RoomDetail instance) {
        log.debug("finding RoomDetail instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.hotel.hibernate.RoomDetail")
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
      log.debug("finding RoomDetail instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from RoomDetail as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByType(Object type
	) {
		return findByProperty(TYPE, type
		);
	}
	
	public List findByPrice(Object price
	) {
		return findByProperty(PRICE, price
		);
	}
	
	public List findByIsEmpty(Object isEmpty
	) {
		return findByProperty(IS_EMPTY, isEmpty
		);
	}
	

	public List findAll() {
		log.debug("finding all RoomDetail instances");
		try {
			String queryString = "from RoomDetail";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public RoomDetail merge(RoomDetail detachedInstance) {
        log.debug("merging RoomDetail instance");
        try {
            RoomDetail result = (RoomDetail) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(RoomDetail instance) {
        log.debug("attaching dirty RoomDetail instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(RoomDetail instance) {
        log.debug("attaching clean RoomDetail instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}