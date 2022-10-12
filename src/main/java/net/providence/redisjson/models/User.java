package net.providence.redisjson.models;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

import java.util.HashSet;
import java.util.Set;

@RedisHash
public class User {

    @Reference
    @JsonIdentityReference(alwaysAsId = true)
    private Set<Role> roles = new HashSet<>();
    @Reference
    @JsonIdentityReference(alwaysAsId = true)
    private Set<Book> books = new HashSet<>();

    public void addRole(Role role){
        roles.add(role);
    }

    public void addBook(Book book){
        books.add(book);
    }

}
