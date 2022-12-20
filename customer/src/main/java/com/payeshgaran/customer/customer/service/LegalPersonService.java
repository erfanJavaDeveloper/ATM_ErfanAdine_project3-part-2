package com.payeshgaran.customer.customer.service;

import com.payeshgaran.customer.customer.dao.LegalPersonDao;
import com.payeshgaran.customer.customer.dto.data.LegalPersonDto;
import com.payeshgaran.customer.customer.entity.data.LegalPerson;
import com.payeshgaran.customer.customer.entity.valueObject.AccountM;
import com.payeshgaran.customer.customer.entity.valueObject.ResponseTemplateLegalPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;

@Service
@Transactional
public class LegalPersonService {
    private final LegalPersonDao legalPersonDao;
    private final RestTemplate restTemplate;

    @Autowired
    public LegalPersonService(LegalPersonDao legalPersonDao, RestTemplate restTemplate) {
        this.legalPersonDao = legalPersonDao;
        this.restTemplate = restTemplate;
    }

    // 	امکان تعریف شخص جدید: حقوقی  todo
    public void save(LegalPerson legalPerson) {
        legalPersonDao.save(legalPerson);
    }


    public ResponseTemplateLegalPerson findAllAccountByLegalPersonId(Long legalPersonId) {
        ResponseTemplateLegalPerson lp = new ResponseTemplateLegalPerson();
        LegalPerson legalPerson = legalPersonDao.findById(legalPersonId).orElseThrow(RuntimeException::new);

        AccountM accountMicro = restTemplate.getForObject("http://ACCOUNT-SERVICE/account/" + legalPerson.getAccountId(), AccountM.class);

        lp.setLegalPerson(legalPerson);
        lp.setAccountM(accountMicro);

        return lp;

    }


    public LegalPerson convertDtoToEntity(LegalPersonDto legalPersonDto) {
        LegalPerson legalPerson = new LegalPerson();
        legalPerson.setBalance(legalPersonDto.getBalance());
        legalPerson.setPin(legalPersonDto.getPin());
        legalPerson.setAccountNumber(legalPersonDto.getAccountNumber());
        return legalPerson;
    }


}
