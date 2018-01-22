package com.copasso.cocobill.api;


import com.copasso.cocobill.bean.MonthDetailBean;
import com.copasso.cocobill.bean.UserBean;
import com.copasso.cocobill.common.HttpConfig;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by zhouas666 on 2018/1/19.
 */

public interface APIService {

    /**
     * 用户登陆
     *
     * @param username
     * @param password
     * @return
     */
    @GET(HttpConfig.USER_LOGIN)
    Observable<UserBean> login(@Query("username") String username, @Query("password") String password);

    /**
     * 用户注册
     *
     * @param username
     * @param password
     * @param mail
     * @return
     */
    @GET(HttpConfig.USER_SIGN)
    Observable<UserBean> signup(@Query("username") String username, @Query("password") String password
            , @Query("mail") String mail);

    /**
     * 每月账单详情
     * @param id
     * @param year
     * @param month
     * @return
     */
    @GET(HttpConfig.BILL_MONTH_DETIAL)
    Observable<MonthDetailBean> getMonthDetial(@Path("id") String id, @Path("year") String year
            , @Path("month") String month);
}