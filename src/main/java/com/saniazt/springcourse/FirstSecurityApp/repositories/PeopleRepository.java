package com.saniazt.springcourse.FirstSecurityApp.repositories;

import com.saniazt.springcourse.FirstSecurityApp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.transform.sax.SAXResult;
import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person,Integer> {
    Optional<Person> findByUsername(String username);
}