package com.payeshgaran.customer.customer.controller.data;

import com.payeshgaran.customer.customer.dto.data.RealPersonDto;
import com.payeshgaran.customer.customer.service.RealPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/real-person-controller")
public class RealPersonController {


    private final RealPersonService realPersonService;

    @Autowired
    public RealPersonController(RealPersonService realPersonService) {
        this.realPersonService = realPersonService;
    }

    @PostMapping("/")
    public void newRealPerson(@RequestBody RealPersonDto realPersonDto) {
        realPersonService.save(realPersonService.convertDtoToEntity(realPersonDto));
    }
}
