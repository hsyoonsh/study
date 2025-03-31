package study.study.common.dto

import study.study.common.status.ResultCode

data class BaseResponse<T>(
    val resultCode: String = ResultCode.SUCCESS.name,
    var data: T? = null,
    var message: String? = ResultCode.ERROR.msg,
)