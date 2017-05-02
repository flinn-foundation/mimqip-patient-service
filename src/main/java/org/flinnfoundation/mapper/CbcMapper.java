package org.flinnfoundation.mapper;

import io.swagger.model.CbcLabDto;
import org.flinnfoundation.model.lab.CompleteBloodCountLab;
import org.springframework.stereotype.Component;


@Component
public class CbcMapper extends OrikaMapper<CompleteBloodCountLab, CbcLabDto> {

    public CbcMapper() {
        super(CompleteBloodCountLab.class, CbcLabDto.class);
    }
}
