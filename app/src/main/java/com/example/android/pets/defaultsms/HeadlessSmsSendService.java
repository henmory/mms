package com.example.android.pets.defaultsms;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


/***
 *
 * Created on：2018/7/13
 *
 * Created by：henmory
 *
 * Description:
 *
 *
 **/
public class HeadlessSmsSendService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
