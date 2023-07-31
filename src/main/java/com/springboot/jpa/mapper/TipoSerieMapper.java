package com.springboot.jpa.mapper;

import org.mapstruct.Mapper;
import java.time.LocalDateTime;

@Mapper(componentModel = "spring", imports = LocalDateTime.class)
public interface TipoSerieMapper {

}
