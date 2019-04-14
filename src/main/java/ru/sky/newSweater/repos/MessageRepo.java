package ru.sky.newSweater.repos;

import org.springframework.data.repository.CrudRepository;
import ru.sky.newSweater.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}