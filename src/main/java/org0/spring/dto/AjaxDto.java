package org0.spring.dto;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AjaxDto {

    private Long id;


    private String name;

    private String email;

    private LocalDateTime createTime; // create_time

}