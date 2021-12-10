 /*
 *  Name:            Mehmet Serif Guzel
 *  Student Number:  040971127
 *  Class Name:      SpriteFacade
 */

package cst8218.guze0002.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tgk
 */
@Stateless
public class SpriteFacade extends AbstractFacade<Sprite> {
    @PersistenceContext(unitName = "SpriteMehmet-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SpriteFacade() {
        super(Sprite.class);
    }
    
}
