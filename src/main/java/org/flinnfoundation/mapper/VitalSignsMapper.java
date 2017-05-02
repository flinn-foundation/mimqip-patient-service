package org.flinnfoundation.mapper;

import io.swagger.model.VitalSignsDto;
import org.flinnfoundation.model.vitals.VitalSigns;
import org.springframework.stereotype.Component;


@Component
public class VitalSignsMapper extends OrikaMapper<VitalSigns, VitalSignsDto> {

    protected VitalSignsMapper() {
        super(VitalSigns.class, VitalSignsDto.class);
    }
}
