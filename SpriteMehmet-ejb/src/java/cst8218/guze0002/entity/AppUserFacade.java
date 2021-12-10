/*
 *  Name:            Mehmet Serif Guzel
 *  Student Number:  040971127
 *  Class Name:      AppUserFacade
 */
package cst8218.guze0002.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AppUserFacade extends AbstractFacade<AppUser> {

    @PersistenceContext(unitName = "SpriteMehmet-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppUserFacade() {
        super(AppUser.class);
    }
    
}
