package com.modules.service.impl;

import com.modules.mapper.TbContentCategoryMapper;
import com.modules.service.TbContentCategoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
