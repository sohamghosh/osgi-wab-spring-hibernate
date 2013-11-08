package org.motechproject.spike.wab;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StockService {

    @Autowired
    private SessionFactory sessionFactory;

    public Stock findStock(String name) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Stock.class)
                .add(Restrictions.eq("stockName", name).ignoreCase());
        List resultSet = criteria.list();

        if (resultSet != null && resultSet.size() > 0) {
            return (Stock) resultSet.get(0);
        }
        return null;
    }
}
