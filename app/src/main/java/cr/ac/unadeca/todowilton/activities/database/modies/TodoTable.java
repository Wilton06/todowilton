package cr.ac.unadeca.todowilton.activities.database.modies;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import cr.ac.unadeca.todowilton.activities.database.TodoDatabase;

/**
 * Created by WiltonTuckerHart on 2/3/2018.
 */

@Table(database = TodoDatabase.class)

public class TodoTable extends BaseModel {

    @PrimaryKey(autoincrement = true)

    public long id;

    @Column
    public String nombre;

    @Column
    public String actividad;

    @Column
    public int estado;
}
