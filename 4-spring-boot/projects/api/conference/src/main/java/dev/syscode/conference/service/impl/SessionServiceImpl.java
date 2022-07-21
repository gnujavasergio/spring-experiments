package dev.syscode.conference.service.impl;

import dev.syscode.conference.bean.Session;
import dev.syscode.conference.repository.SessionRepository;
import dev.syscode.conference.service.SessionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public List<Session> findAll() {
        return sessionRepository.findAll();
    }

    @Override
    public Session getSession(long id) {
        return sessionRepository.getById(id);
    }

    @Override
    public Session save(Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    @Override
    public Session update(long id, Session session) {
        Session oldSession = sessionRepository.getById(id);
        // Tercer Parametro es la propiedad que no queremos copiar
        BeanUtils.copyProperties(session, oldSession, "id");
        return sessionRepository.saveAndFlush(oldSession);
    }

    @Override
    public void delete(long id) {
        sessionRepository.deleteById(id);
    }
}
