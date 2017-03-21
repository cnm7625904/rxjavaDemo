package main.tc.com.secretrofit;

import java.util.List;

/**
 * Created by tckj03 on 2017/3/17.
 */

public class Gankio {

    private boolean error;

    public List<GankBean> getResults() {
        return results;
    }

    public void setResults(List<GankBean> results) {
        this.results = results;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    private List<GankBean> results;

}
