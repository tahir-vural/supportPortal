package com.server.service;

import com.server.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {

    Server ping(String ipAddress) throws IOException;
    Server create(Server server);
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);

}
