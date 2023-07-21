package org0.spring.entity;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org0.spring.dto.AjaxDto;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="ajax_tb_01")
public class AjaxEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ajax_member_id")
    private Long id;

    @Column(name="member_name")
    private String name;
    @Column(name="member_email")
    private String email;

    @CreationTimestamp
    @Column(insertable = true)
    private LocalDateTime createTime; // create_time

    
    //DTO를 ENETITY로 바꾸는 법
    public static AjaxEntity toAjaxEntity(AjaxDto ajaxDto) {

        AjaxEntity ajaxEntity = new AjaxEntity();
        ajaxEntity.setName(ajaxDto.getName());
        ajaxEntity.setEmail(ajaxDto.getEmail());
        return ajaxEntity;
    }
}
