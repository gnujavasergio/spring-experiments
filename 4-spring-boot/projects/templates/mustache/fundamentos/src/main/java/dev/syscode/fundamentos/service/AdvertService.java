package dev.syscode.fundamentos.service;

import dev.syscode.fundamentos.bean.Advert;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class AdvertService {
    private List<Advert> adverts = new ArrayList<>();
    private AtomicInteger id = new AtomicInteger();

    public AdvertService() {
        adverts.add(new Advert(id.getAndIncrement(), "Sergio Ochoa", "Curso de java", "Contenido del curso"));
        adverts.add(new Advert(id.getAndIncrement(), "Rocio Paredes", "Curso de Administración", "Contenido del curso"));
    }

    public void save(String name, String subject, String comment) {
        Advert advert = new Advert();
        advert.setId(id.getAndIncrement());
        advert.setName(name);
        advert.setSubject(subject);
        advert.setComment(comment);
        adverts.add(advert);
    }

    public void save(Advert advert) {
        advert.setId(id.getAndIncrement());
        adverts.add(advert);
    }

    public void update(Advert advert) {
        adverts.set((int) advert.getId(), advert);
    }

    public Advert findById(long id) {
        return adverts.get((int) id);
    }

    public List<Advert> findAll() {
        return adverts;
    }
}
