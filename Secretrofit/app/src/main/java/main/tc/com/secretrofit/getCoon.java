package main.tc.com.secretrofit;

/**
 * Created by tckj03 on 2017/3/17.
 */

public class getCoon
{
    private volatile static girlAPI getMeiziBeans = null;

    public static girlAPI getInstance() {

        return getCoderfunAPI(getMeiziBeans);
    }

    private static girlAPI getCoderfunAPI( girlAPI coderfunAPI) {

        coderfunAPI = new CoonRetrofit().createService(girlAPI.class);

        return coderfunAPI;
    }

}
