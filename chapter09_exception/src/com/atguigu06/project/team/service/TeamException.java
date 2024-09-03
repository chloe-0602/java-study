package com.atguigu06.project.team.service;

/**
 * ClassName: TeamException
 * Package: com.atguigu06.project.team.service
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/3 22:01
 * @Version 1.0
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -33875129948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }

    public TeamException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeamException(Throwable cause) {
        super(cause);
    }

    public TeamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
