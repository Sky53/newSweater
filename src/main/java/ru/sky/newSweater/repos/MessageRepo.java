package ru.sky.newSweater.repos;

import org.springframework.data.repository.CrudRepository;
import ru.sky.newSweater.domain.Message;

public interface MessageRepo extends CrudRepository<Message,Long> {
    Iterable<Message> findByTag(String filter);
}
