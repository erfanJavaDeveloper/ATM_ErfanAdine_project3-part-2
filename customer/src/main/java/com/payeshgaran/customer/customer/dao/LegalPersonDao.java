package com.payeshgaran.customer.customer.dao;

import com.payeshgaran.customer.customer.entity.data.LegalPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalPersonDao extends JpaRepository<LegalPerson,Long> {

}
