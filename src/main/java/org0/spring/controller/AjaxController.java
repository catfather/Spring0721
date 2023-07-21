package org0.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org0.spring.dto.AjaxDto;
import org0.spring.service.AjaxMemberService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ajax")
@RequiredArgsConstructor
public class AjaxController {

    private final AjaxMemberService ajaxMemberService;

    @GetMapping({"","/index"})
    public String index(){

        return"ajax/ajaxTest";
    }

    @GetMapping({"","/ajaxJoin"})
    public String ajaxJoin(){

        return"ajax/join";
    }


    @GetMapping({"","/emailCheck"})
    public @ResponseBody String emailCheck(@RequestParam("email") String email){
        String rs = ajaxMemberService.emailCheck(email);
        return rs;
    }

    @GetMapping({"","/memberInsert"})
    public @ResponseBody String memberInsert(@RequestParam("email") String email,
                                             @RequestParam("name") String name){
        String rs = ajaxMemberService.memberInsert(email, name);
        return rs;
    }



    @GetMapping({"","/ajaxTest"})
    public String ajaxTest(){

        return"ajax/ajaxTest";
    }

//    @GetMapping("/ajax1")
//    public @ResponseBody String ajax1(){
//        return "ajax1 반환 값";
//    }
//
//    @GetMapping("/ajax2")
//    public @ResponseBody List<String> ajax2(){
//        List<String> str = new ArrayList<String>();
//        str.add("test1");
//        str.add("test2");
//        str.add("test3");
//        str.add("test4");
//        return str;
//    }

    @PostMapping("/ajax2")
    public @ResponseBody String ajax2(){

        return "ajax 2 return";
    }

    @GetMapping("/ajax3")
    public @ResponseBody String ajax3(@RequestParam("name") String name,
                                      @RequestParam("email") String email){
        String rs = "이름 : "+name+" : 이메일 :"+email;
        return rs;
    }

    @PostMapping("/ajax4")
    public @ResponseBody String ajax4(@RequestParam("name") String name,
                                      @RequestParam("email") String email){
        String rs = "이름 : "+name+" : 이메일 :"+email;
        return rs;
    }



    // 상품 등록 조회
    @PostMapping("/ajax5")
    public @ResponseBody AjaxDto ajax5(@ModelAttribute AjaxDto ajaxDto){

        return ajaxDto;
    }

    @PostMapping("/ajax7")
    public @ResponseBody List<AjaxDto> ajax7(@ModelAttribute AjaxDto ajaxDto){
        List<AjaxDto> ajaxDtoList = new ArrayList<AjaxDto>();
        ajaxDtoList.add(AjaxDto.builder().name("name").email("email").build());
        ajaxDtoList.add(AjaxDto.builder().name("name1").email("email1").build());
        ajaxDtoList.add(AjaxDto.builder().name("name2").email("email2").build());
        ajaxDtoList.add(AjaxDto.builder().name("name3").email("email3").build());
        ajaxDtoList.add(AjaxDto.builder().name("name4").email("email4").build());
        return ajaxDtoList;
    }


    @PostMapping("/ajax8")
    public @ResponseBody AjaxDto ajax8(
                         @RequestBody AjaxDto ajaxDto) {
        System.out.println(ajaxDto);
        return ajaxDto;
    }

    @PostMapping("/ajax9")
    public ResponseEntity ajax9(
            @RequestBody AjaxDto ajaxDto) {
        // return타입 + hTTP상태

        return new ResponseEntity<>(ajaxDto, HttpStatus.OK);
    }
}
