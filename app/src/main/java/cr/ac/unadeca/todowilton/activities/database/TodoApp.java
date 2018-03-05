package cr.ac.unadeca.todowilton.activities.database;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by WiltonTuckerHart on 2/3/2018.
 */

public class TodoApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
