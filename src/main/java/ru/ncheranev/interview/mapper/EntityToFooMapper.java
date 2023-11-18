package ru.ncheranev.interview.mapper;

import org.springframework.stereotype.Component;
import ru.ncheranev.interview.controller.dto.FooDto;
import ru.ncheranev.interview.jpa.model.Foo;

@Component
public class EntityToFooMapper implements Mapper<Foo, FooDto> {
    @Override
    public FooDto map(Foo entity) {
        return new FooDto()
                .setId(entity.getId())
                .setName(entity.getName());
    }
}
