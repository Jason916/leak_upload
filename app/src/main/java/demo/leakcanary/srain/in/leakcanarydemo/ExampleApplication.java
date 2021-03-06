package demo.leakcanary.srain.in.leakcanarydemo;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.RefWatcher;

public class ExampleApplication extends Application {

    public static RefWatcher getRefWatcher(Context context) {
        ExampleApplication application = (ExampleApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    private RefWatcher refWatcher;

    @Override public void onCreate() {
        super.onCreate();
        refWatcher = installLeakCanary();
    }

    protected RefWatcher installLeakCanary() {
        return RefWatcher.DISABLED;
    }
}

