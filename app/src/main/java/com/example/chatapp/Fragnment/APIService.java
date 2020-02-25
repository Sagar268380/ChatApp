package com.example.chatapp.Fragnment;


import com.example.chatapp.Notification.MyResponse;
import com.example.chatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAd_LnLwg:APA91bFOEYdHKXD2WZAMKrBC4Ma2_yXoGijxlJU7_xM6vVRERrsBtXGIgQ9xti1pAWuqqb210rN4Mxu60AkHgC0x-JJpF8KAjfJG_kkIH0Fai7B7wbzWZGIvlvv7VytZ6YcJN3OKKeQc"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}