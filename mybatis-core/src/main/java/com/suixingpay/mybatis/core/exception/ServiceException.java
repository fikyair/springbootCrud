/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: john.lee
 * @date: 2017/3/31  20:15
 * @copyright: ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.mybatis.core.exception;

import com.suixingpay.mybatis.core.enums.ExceptionEnum;

/**
 * 业务异常
 *
 * @author: john.lee
 * @date: 2017/3/31 20:15
 * @version: V1.0
 * @review: john.lee/2017/3/31 20:15
 */
public class ServiceException  extends AbstractException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 构造器
     */
    public ServiceException() {
        super(ExceptionEnum.SERVICE_EXCEPTION);
    }

    /**
     * 构造器
     * @param exceptionEnum
     */
    public ServiceException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum);
    }
    
    public ServiceException(String message) {
        super(ExceptionEnum.SERVICE_EXCEPTION.getCode(), message);
    }
}
