package ru.ncheranev.interview.mapper.impl;

import org.springframework.stereotype.Component;
import ru.ncheranev.interview.controller.dto.FooDto;
import ru.ncheranev.interview.jpa.model.Foo;
import ru.ncheranev.interview.mapper.Mapper;

@Component
public class EntityToFooMapper implements Mapper<Foo, FooDto> {
    @Override
    public FooDto map(Foo entity) {
        return new FooDto()
                .setId(entity.getId())
                .setName(entity.getName());
    }
}
