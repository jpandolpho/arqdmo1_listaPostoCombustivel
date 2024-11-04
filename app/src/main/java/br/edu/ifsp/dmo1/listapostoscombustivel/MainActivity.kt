package br.edu.ifsp.dmo1.listapostoscombustivel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifsp.dmo1.listapostoscombustivel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataSource: List<GasStation>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadDataSource()
    }

    private fun loadDataSource() {
        dataSource = ArrayList<GasStation>().apply {
            add(GasStation("Rede 7", "Carmo", 5.59, 3.79))
            add(GasStation("Balão da 36", "São Geraldo", 5.99, 3.99))
            add(GasStation("Faveral", "Carmo", 5.49, 3.59))
            add(GasStation("Pau Seco", "Rodovia", 6.29, 4.19))
            add(GasStation("Posto da 16", "Santana", 5.67, 3.67))
            add(GasStation("Posto do Fu", "Jaboticabal", 5.59, 3.69))
            add(GasStation("Quitandinha", "Quitandinha", 5.99, 3.99))
            add(GasStation("Piramide", "Vila Ferroviária", 4.99, 2.99))
            add(GasStation("Monaco", "Expressa", 5.01, 3.01))
            add(GasStation("Pantanal(Shell)", "Fonte", 5.99, 4.19))
        }
    }
}