package com.thunder.learn;

import com.thunder.learn.entity.BaseBVO;
import com.thunder.learn.entity.BaseVO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class BaseService {

    @Autowired
    private ModelMapper modelMapper;

    public <T extends BaseBVO, S extends BaseVO> T voToBvo(S vo, Class<T> bvoClass) {
        return modelMapper.map(vo, bvoClass);
    }

    public <T extends BaseBVO, S extends BaseVO> List<T> listVoToBvo(List<S> vos, Class<T> bvoClass) {
        return vos.stream().map(el -> modelMapper.map(el, bvoClass)).collect(Collectors.toList());
    }

    public <T extends BaseVO, S extends BaseBVO> T bvoToVo(S bvo, Class<? extends BaseVO> voClass) {

        if (bvo != null) {
            return (T) modelMapper.map(bvo, voClass);
        } else {
            return null;
        }
    }
}
