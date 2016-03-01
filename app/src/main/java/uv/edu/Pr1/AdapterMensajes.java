package uv.edu.Pr1;

import android.app.Service;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import uv.edu.tarea3.R;

/**
 * Created by jpict on 01/03/2016.
 */
class Mensaje{
    private String usuario;
    private String mensaje;
    //HACER: Contructor
    //HACER: setters & getters
}

public class AdapterMensajes extends BaseAdapter {

    static class ViewHolder {
        TextView usuario;
        TextView mensaje;
    }

    private ArrayList<Mensaje> mensajes;
    private Context context;

    public AdapterMensajes( Context c ){
        context = c;
        //HACER : Leer el fichero de mensajes e ir rellenando el ArrayList<Mensaje>   //mentira usuario|mensaje no es JSON, PDF está mal
        //        Hacer la conversión de lo que se lee (JSON) a objeto Mensaje
        //        para ello se puede usar Gson
    }

    @Override
    public int getCount(){
        return mensajes.size();
    }

    //Este método sirve para añadir mensajes cuando pulse sobre actualizar
    public void add(Mensaje m){
        //HACER: Añadir el mensaje al ArrayList<Mensaje>

        //Esto sirve para indicer a la vista que el modelo ha canbiado
        notifyDataSetChanged();
    }

    @Override
    public Object getItem(int position){
        return mensajes.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Usamos el patrón del ViewHolder para almacenar las vistas de cada elemento de la lista
        // para mostrarlos más rápido al desplazar la lista

        View v = convertView;
        ViewHolder holder = null;

        if (v == null) {
            // Si es null la creamos a partir del layout
            LayoutInflater li = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
            //v = li.inflate(R.layout.list_msg_view, null);
            //holder = new ViewHolder();
            //holder.usuario = (TextView) v.findViewById(R.id.msg_view_usuaraio);
            //holder.mensaje = (TextView) v.findViewById(R.id.msg_view_mensaje);
        } else {
            // Si no es null la reutilizamos para actualizarla
            v = convertView;
            holder = (ViewHolder) v.getTag();
        }
        // HACER: Asignar a los elementos del holder los datos que están en
        // la posición de ArrayList<Mensaje>
        return v;

    }
}
