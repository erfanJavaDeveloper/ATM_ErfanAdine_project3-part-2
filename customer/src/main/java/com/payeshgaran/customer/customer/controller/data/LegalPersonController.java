package com.payeshgaran.customer.customer.controller.data;

import com.payeshgaran.customer.customer.dto.data.LegalPersonDto;
import com.payeshgaran.customer.customer.entity.valueObject.ResponseTemplateLegalPerson;
import com.payeshgaran.customer.customer.service.LegalPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/legal-person-controller")
public class LegalPersonController {

    private final LegalPersonService legalPersonService;

    @Autowired
    public LegalPersonController(LegalPersonService legalPersonService) {
        this.legalPersonService = legalPersonService;
    }


    //
    @PostMapping("/")
    public void newLegalPerson(@RequestBody LegalPersonDto legalPersonDto) {
        legalPersonService.save(legalPersonService.convertDtoToEntity(legalPersonDto));
    }

    @GetMapping("/findAllAccountByLegalPersonId/{legalPersonId}")
    public ResponseTemplateLegalPerson findAllAccountByLegalPersonId(@PathVariable Long legalPersonId) {
       return legalPersonService.findAllAccountByLegalPersonId(legalPersonId);
    }



}
