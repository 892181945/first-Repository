package com.ck.response;

import lombok.Data;

@Data
public class CommodResponse<T> {

    /**
     * 状态码
     */
    private long code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 数据封装
     */
    private T data;

    protected CommodResponse() {
    }

    public CommodResponse(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommodResponse<T> success(T data) {
        return new CommodResponse<T>(200, "成功", data);
    }

    /**
     * 成功返回结果
     *
     * @param data    获取的数据
     * @param message 提示信息
     */
    public static <T> CommodResponse<T> success(T data, String message) {
        return new CommodResponse<T>(200,"成功", data);
    }

    /**
     * 失败返回结果
     *
     *
     */
    public static <T> CommodResponse<T> failed() {
        return new CommodResponse<T>(500, "失败", null);
    }

    public static <T> CommodResponse<T> failed(String message) {
        return new CommodResponse<T>(500, message, null);
    }
}
