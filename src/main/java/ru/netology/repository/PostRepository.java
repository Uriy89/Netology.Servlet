package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Post;

import java.util.Collection;
import java.util.Optional;

@Repository
// Stub
public interface PostRepository {

    Collection<Post> all();

    Optional<Post> getById(long id);

    Post save(Post post);

    void removeById(long id);

}