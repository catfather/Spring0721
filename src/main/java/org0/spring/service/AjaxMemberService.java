package org0.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org0.spring.entity.AjaxEntity;
import org0.spring.repository.AjaxRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AjaxMemberService {

    private final AjaxRepository ajaxRepository;
    public String emailCheck(String email) {
        
        //이메일 확인 -> 조회한 이메일이 있는 레코드를 조회
       Optional<AjaxEntity> ajaxEntity
               = ajaxRepository.findByEmail(email);

       if(!ajaxEntity.isPresent()){
           return "0";
       }else{
           return "1";
       }
    }

    public String memberInsert(String email, String name) {

        Optional<AjaxEntity> ajaxEntity = ajaxRepository.

        return rs;
    }
}
