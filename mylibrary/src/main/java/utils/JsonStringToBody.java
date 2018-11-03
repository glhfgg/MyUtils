package utils;

import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by FX on 2017/12/28.
 */

public class JsonStringToBody {
    /**
     * 对象封装Body
     *
     * @param o
     * @return
     */
    public static RequestBody jsonObjectToBody(Object o) {
        Gson gson = new Gson();

        return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), gson.toJson(o));
    }

    /**
     * json字符串封装Body
     *
     * @param json
     * @return
     */
    public static RequestBody jsonStringToBody(String json) {
        return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
    }
}
