package com.payeshgaran.customer.customer.entity.valueObject;

import com.payeshgaran.customer.customer.entity.data.LegalPerson;
import com.payeshgaran.customer.customer.entity.data.RealPerson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateRealPerson {
    private AccountM accountM;
    private RealPerson realPerson;
}
