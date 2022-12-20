package com.payeshgaran.customer.customer.dao;

import com.payeshgaran.customer.customer.entity.data.RealPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealPersonDao extends JpaRepository<RealPerson,Long> {
}
