package com.hotel.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Customer entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hotel.hibernate.Customer
  * @author MyEclipse Persistence Tools 
 */

public class CustomerDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(CustomerDAO.class);
		//property constants
	public static final String CNAME = "cname";
	public static final String CNICKNAME = "cnickname";
	public static final String CPASSWORD = "cpassword";
	public static final String CSEX = "csex";
	public static final String CVERIFY_ID = "cverifyId";
	public static final String CPHONE = "cphone";
	public static final String CADDRESS = "caddress";
	public static final String CEMAIL = "cemail";



    
    public void save(Customer transientInstance) {
        log.debug("saving Customer instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Customer persistentInstance) {
        log.debug("deleting Customer instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Customer findById( java.lang.Integer id) {
        log.debug("getting Customer instance with id: " + id);
        try {
            Customer instance = (Customer) getSession()
                    .get("com.hotel.hibernate.Customer", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Customer instance) {
        log.debug("finding Customer instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.hotel.hibernate.Customer")
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
      log.debug("finding Customer instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Customer as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByCname(Object cname
	) {
		return findByProperty(CNAME, cname
		);
	}
	
	public List findByCnickname(Object cnickname
	) {
		return findByProperty(CNICKNAME, cnickname
		);
	}
	
	public List findByCpassword(Object cpassword
	) {
		return findByProperty(CPASSWORD, cpassword
		);
	}
	
	public List findByCsex(Object csex
	) {
		return findByProperty(CSEX, csex
		);
	}
	
	public List findByCverifyId(Object cverifyId
	) {
		return findByProperty(CVERIFY_ID, cverifyId
		);
	}
	
	public List findByCphone(Object cphone
	) {
		return findByProperty(CPHONE, cphone
		);
	}
	
	public List findByCaddress(Object caddress
	) {
		return findByProperty(CADDRESS, caddress
		);
	}
	
	public List findByCemail(Object cemail
	) {
		return findByProperty(CEMAIL, cemail
		);
	}
	

	public List findAll() {
		log.debug("finding all Customer instances");
		try {
			String queryString = "from Customer";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Customer merge(Customer detachedInstance) {
        log.debug("merging Customer instance");
        try {
            Customer result = (Customer) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Customer instance) {
        log.debug("attaching dirty Customer instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Customer instance) {
        log.debug("attaching clean Customer instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}