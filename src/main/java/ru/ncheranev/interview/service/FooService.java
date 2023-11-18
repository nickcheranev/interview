package ru.ncheranev.interview.service;

import ru.ncheranev.interview.controller.dto.FooDto;

import java.util.Optional;

public interface FooService {
    FooDto save(FooDto fooDto);

    Optional<FooDto> findById(Long id);
}
