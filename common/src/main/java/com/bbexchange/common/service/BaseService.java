package com.bbexchange.common.service;

import com.bbexchange.common.constance.enums.BaseEnum;
import com.bbexchange.common.constance.enums.UserErrorEnum;
import com.bbexchange.common.exception.BusinessException;

public class BaseService {
    public void success()
    {
    }
    public void error(BaseEnum baseEnum)
    {
        throw new BusinessException(baseEnum);

    }
}
