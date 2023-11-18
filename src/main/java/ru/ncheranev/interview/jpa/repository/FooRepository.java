package ru.ncheranev.interview.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ncheranev.interview.jpa.model.Foo;

public interface FooRepository extends JpaRepository<Foo, Long> {
}
