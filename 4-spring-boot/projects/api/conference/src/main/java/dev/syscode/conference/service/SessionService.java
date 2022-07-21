package dev.syscode.conference.service;

import dev.syscode.conference.bean.Session;

import java.util.List;

public interface SessionService {

    List<Session> findAll();

    Session getSession(long id);

    Session save(Session session);

    Session update(long id, Session session);

    void delete(long id);
}
