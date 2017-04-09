package com.example.model.helper;


import com.example.model.bean.ReqBean;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @version V1.0
 * @project:MyApplication
 * @author: Admin
 * @date: 2017-03-20 15:39
 * @desc 接口管理类
 */
public class ApiManager

{

    /**
     * url管理
     */
    public static class Url {
        public static final String EXAMPLE_URL = "p/p_001";
        public static final String SIIGEE_URL  = "p/p2_002";
    }

    /**
     * 请求实体参数
     * @param bean
     * @return
     */
    public static JSONObject getRequestParams(ReqBean bean) {

        Gson       gson   = new Gson();
        String     json   = gson.toJson(bean);
        JSONObject params = null;
        try {
            params = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return params;
    }


    public static JSONObject getExampleParams(String id) {
        JSONObject params = new JSONObject();
        try {
            params.put("id", id);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return params;
    }
}
