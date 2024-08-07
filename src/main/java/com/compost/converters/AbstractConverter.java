package com.compost.converters;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractConverter<E, D> {

    public abstract E fromDTO(D dto);
    public abstract D fromEntity(E entity);

    public List<E> fromDTO(List<D> dto){
        return dto.stream()
                .map(this::fromDTO)
                .collect(Collectors.toList());
    }

    public List<D> fromEntity(List<E> entities){
        return entities.stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }
}
