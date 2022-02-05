package com.thunder.learn;

import com.thunder.learn.entity.BaseBVO;
import com.thunder.learn.entity.BaseVO;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class BaseService {

    @Autowired
    private Mapper mapper;

    public <T extends BaseBVO, S extends BaseVO> T voToBvo(S vo, Class<T> bvoClass) {
        return mapper.map(vo, bvoClass);
    }

    public <T extends BaseBVO, S extends BaseVO> List<T> listVoToBvo(List<S> vos, Class<T> bvoClass) {
        return vos.stream().map(el -> mapper.map(el, bvoClass)).collect(Collectors.toList());
    }

    public <T extends BaseVO, S extends BaseBVO> T bvoToVo(S bvo, Class<? extends BaseVO> voClass) {

        if (bvo != null) {
            return (T) mapper.map(bvo, voClass);
        } else {
            return null;
        }
    }
}
