package student.enterprise.project.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import student.enterprise.project.dto.ChangeDTO;
import student.enterprise.project.entity.ChangeEntity;
import student.enterprise.project.entity.RepeatableChangeEntity;
import student.enterprise.project.entity.SingleChangeEntity;
import student.enterprise.project.service.ChangeService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ChangeServiceImpl implements ChangeService {

    private final ModelMapper mapper;

    public ChangeServiceImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<ChangeDTO> toDto(ChangeEntity entity) {
        if (Objects.isNull(entity)) {
            return Collections.emptyList();
        }
        if (entity instanceof SingleChangeEntity) {
            return Collections.singletonList(mapper.map(entity, ChangeDTO.class));
        } else if (entity instanceof RepeatableChangeEntity) {
            List<ChangeDTO> changeDTOList = new ArrayList<>();
            //TODO implement change entity converter
            return changeDTOList;
        }
        return Collections.emptyList();
    }

    public ChangeDTO get(Long id) {
        //работа с базой
        //parse в DTO
        return changeDTO;
    }

    public void save(ChangeDTO changeDTO) {
        //parse из DTO
        if (changeDTO instanceof RepeatableChangeEntity)
        //добавление в базу
    }

    public void update(ChangeDTO changeDTO) {
        //найти по id
        //изменить поля на новые
    }

    public boolean delete(Long id) {
        //найти в базе
        //удалить
        return true;
    }
}
