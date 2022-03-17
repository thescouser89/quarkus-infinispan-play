package org.lakaz.cache;

import io.quarkus.infinispan.client.Remote;
import org.infinispan.client.hotrod.RemoteCache;
import org.lakaz.proto.Author;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public class Infinispan {
    @Inject @Remote("distributedCache")
    RemoteCache<String, Author> cache;


    public void writeAuthor() {
        Author author = new Author(new Date().toString(), "johnny" + new Date());
        cache.put(new Date().toString(), author);
    }

    public List<Author> getAuthors() {
        return new ArrayList<>(cache.values());
    }
}
