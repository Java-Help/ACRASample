package ru.javahelp.myapplication;

import android.app.Application;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

@ReportsCrashes(mailTo = "reports@yourdomain.com",
                mode = ReportingInteractionMode.TOAST,
                resToastText = R.string.crash_message)
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ACRA.init(this);
    }

}
