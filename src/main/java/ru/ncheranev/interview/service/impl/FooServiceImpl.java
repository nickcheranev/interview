package ru.ncheranev.interview.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ncheranev.interview.controller.dto.FooDto;
import ru.ncheranev.interview.jpa.repository.FooRepository;
import ru.ncheranev.interview.mapper.EntityToFooMapper;
import ru.ncheranev.interview.mapper.FooToEntityMapper;
import ru.ncheranev.interview.service.FooService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class FooServiceImpl implements FooService {
    private final FooRepository fooRepository;
    private final FooToEntityMapper fooToEntityMapper;
    private final EntityToFooMapper entityToFooMapper;

    @Override
    public FooDto save(FooDto fooDto) {
        return entityToFooMapper.map(fooRepository.save(fooToEntityMapper.map(fooDto)));
    }

    @Override
    public Optional<FooDto> findById(Long id) {
        return Optional.ofNullable(entityToFooMapper.map(fooRepository.findById(id).orElseThrow()));
    }
}
