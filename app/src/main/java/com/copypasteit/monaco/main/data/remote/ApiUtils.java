package com.copypasteit.monaco.main.data.remote;

public class ApiUtils {
    private ApiUtils() {}
    public static final String BASE_URL = "https://apps.bncodeing.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
