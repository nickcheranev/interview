package ru.ncheranev.interview.controller.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FooDto {
    private Long id;
    private String name;
}
