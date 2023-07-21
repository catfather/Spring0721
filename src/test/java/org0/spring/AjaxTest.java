package org0.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org0.spring.dto.AjaxDto;
import org0.spring.entity.AjaxEntity;
import org0.spring.repository.AjaxRepository;

@SpringBootTest
public class AjaxTest {

    @Autowired
    private AjaxRepository ajaxRepository;

    @Test
    void Insert(){
        AjaxDto ajaxDto = new AjaxDto();
        ajaxDto.setName("test1");
        ajaxDto.setEmail("email1");

       AjaxEntity ajaxEntity
        = AjaxEntity.toAjaxEntity(ajaxDto);


        ajaxRepository.save(ajaxEntity);

    }
}
