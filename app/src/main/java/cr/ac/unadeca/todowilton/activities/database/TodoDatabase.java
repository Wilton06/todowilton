package cr.ac.unadeca.todowilton.activities.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by WiltonTuckerHart on 2/3/2018.
 */

@Database(name = TodoDatabase.NAME, version = TodoDatabase.VERSION)

public class TodoDatabase {

    public static final String NAME = "todowilton";
    public static final int VERSION = 2;
}
