package com.megasoby.catalogservice.service;

import com.megasoby.catalogservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
