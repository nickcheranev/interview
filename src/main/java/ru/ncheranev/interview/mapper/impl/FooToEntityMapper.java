package ru.ncheranev.interview.mapper.impl;

import org.springframework.stereotype.Component;
import ru.ncheranev.interview.controller.dto.FooDto;
import ru.ncheranev.interview.jpa.model.Foo;
import ru.ncheranev.interview.mapper.Mapper;

@Component
public class FooToEntityMapper implements Mapper<FooDto, Foo> {
    @Override
    public Foo map(FooDto dto) {
        return new Foo()
                .setId(dto.getId())
                .setName(dto.getName());
    }
}
