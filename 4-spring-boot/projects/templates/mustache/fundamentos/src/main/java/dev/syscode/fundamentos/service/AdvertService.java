package dev.syscode.fundamentos.service;

import dev.syscode.fundamentos.bean.Advert;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdvertService {

    public List<Advert> findAll() {
        List<Advert> adverts = new ArrayList<>();
        adverts.add(new Advert("Sergio Ochoa", "Curso de java", "Contenido del curso"));
        adverts.add(new Advert("Rocio Paredes", "Curso de Administración", "Contenido del curso"));
        return adverts;
    }
}
