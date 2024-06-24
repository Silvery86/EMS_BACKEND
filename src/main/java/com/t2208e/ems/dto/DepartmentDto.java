package com.t2208e.ems.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private int id;
    private String depName;
    private String roomNo;
    private int numberEmployee;
    private Long chiefId;
    private Long deputy1Id;
    private Long deputy2Id;
}
