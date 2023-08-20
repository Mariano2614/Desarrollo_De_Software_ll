package com.homework.project.shared.mapper;

import java.util.List;

public interface EntityToDto <O,E>{
    O toDto(E e);
    List<O> toDto(List<E> e);

    E toEntity(O o);
    List<E> toEntity(List<O> e);
}
