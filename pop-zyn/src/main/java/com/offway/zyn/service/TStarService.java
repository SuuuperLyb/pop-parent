package com.offway.zyn.service;

import com.offway.common.entity.R;
import com.offway.common.entity.TStarStyle;

import java.util.List;

public interface TStarService {

    R getHotStyle();
    R listAll(int startPage,int pageSize);
}
