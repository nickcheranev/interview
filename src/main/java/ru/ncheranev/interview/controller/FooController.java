package ru.ncheranev.interview.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ncheranev.interview.controller.dto.FooDto;
import ru.ncheranev.interview.service.FooService;

import java.util.Optional;

@RestController
@RequestMapping("/foo")
@RequiredArgsConstructor
public class FooController {
    private final FooService fooService;

    @GetMapping("/{id}")
    public ResponseEntity<FooDto> getFoo(@PathVariable("id") Long id) {
        return ResponseEntity.of(fooService.findById(id));
    }
    @PostMapping()
    public ResponseEntity<FooDto> create(@RequestBody FooDto fooDto) {
        return ResponseEntity.of(Optional.ofNullable(fooService.save(fooDto)));
    }
}
