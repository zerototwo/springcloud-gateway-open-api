package com.lpp.util;


import com.lpp.exception.BusinessException;



import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;


/**
 * 业务参数校验
 */
//public class ValidateUtils {
//    private final static Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();
//
//    public static <T> void validate(T object) {
//        //执行验证
//        Set<ConstraintViolation<T>> constraintViolations = VALIDATOR.validate(object);
//        //如果有验证信息，则取出包装成异常返回
//        ConstraintViolation<T> constraintViolation = getFirst(constraintViolations, null);
//        if (constraintViolation != null) {
//            throw new BusinessException(ApiExceptionEnum.INVALID_PARAM,
//                    CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, constraintViolation.getPropertyPath().toString()),
//                    constraintViolation.getMessage());
//
//        }
//    }
//
//}


