package com.payeshgaran.customer.customer.service;

import com.payeshgaran.customer.customer.dao.RealPersonDao;
import com.payeshgaran.customer.customer.dto.data.RealPersonDto;
import com.payeshgaran.customer.customer.entity.data.RealPerson;
import com.payeshgaran.customer.customer.entity.valueObject.AccountM;
import com.payeshgaran.customer.customer.entity.valueObject.ResponseTemplateRealPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;

@Service
@Transactional
public class RealPersonService {

    private final RealPersonDao realPersonDao;

    private final RestTemplate restTemplate;

    @Autowired
    public RealPersonService(RealPersonDao realPersonDao ,RestTemplate restTemplate) {
        this.realPersonDao = realPersonDao;
        this.restTemplate = restTemplate;
    }

//امکان تعریف شخص جدید: حقیقی  todo
    public void save(RealPerson realPerson){
        realPersonDao.save(realPerson);
    }

//    public void


    public ResponseTemplateRealPerson findAllAccountByLegalPersonId(Long legalPersonId) {
        ResponseTemplateRealPerson rp = new ResponseTemplateRealPerson();
        RealPerson realPerson = realPersonDao.findById(legalPersonId).orElseThrow(RuntimeException::new);

        AccountM accountMicro
                = restTemplate.getForObject("http://ACCOUNT-SERVICE/account/" + realPerson.getAccountId(), AccountM.class);

        rp.setRealPerson(realPerson);
        rp.setAccountM(accountMicro);

        return rp;

    }

    public RealPerson convertDtoToEntity(RealPersonDto realPersonDto) {
        RealPerson realPerson = new RealPerson();
        realPerson.setBalance(realPersonDto.getBalance());
        realPerson.setPin(realPersonDto.getPin());
        realPerson.setAccountNumber(realPersonDto.getAccountNumber());
        realPerson.setFirstName(realPersonDto.getFirstName());
        realPerson.setLastName(realPersonDto.getLastName());
        return realPerson;
    }


}
