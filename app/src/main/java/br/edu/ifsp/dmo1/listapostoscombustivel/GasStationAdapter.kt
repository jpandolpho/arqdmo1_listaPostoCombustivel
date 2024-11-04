package br.edu.ifsp.dmo1.listapostoscombustivel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class GasStationAdapter(
    context: Context,
    datasource: List<GasStation>
) : ArrayAdapter<GasStation>(context, R.layout.item_gas_station, datasource) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            itemView = inflater.inflate(R.layout.item_gas_station, null)
        }

        val gasStation = getItem(position)
        if (itemView != null && gasStation != null) {
            //duas formas diferentes de fazer a mesma coisa
            itemView.findViewById<TextView>(R.id.namegs_textview).text = gasStation.name
            val localTextView = itemView.findViewById<TextView>(R.id.addressgs_textview)
            localTextView.text = gasStation.address
        }
        return itemView!!
    }
}