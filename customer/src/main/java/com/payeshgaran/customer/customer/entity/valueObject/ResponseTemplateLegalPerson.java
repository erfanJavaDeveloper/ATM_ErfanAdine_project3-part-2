package com.payeshgaran.customer.customer.entity.valueObject;

import com.payeshgaran.customer.customer.entity.data.LegalPerson;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateLegalPerson {
    private AccountM accountM;
    private LegalPerson legalPerson;
}
