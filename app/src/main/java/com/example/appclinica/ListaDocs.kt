package com.example.appclinica
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaDocsActivity : AppCompatActivity() {

    private lateinit var rvEspecialidades: RecyclerView
    private lateinit var adapter: EspecialidadAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_docs)

        rvEspecialidades = findViewById(R.id.rvEspecialidades)
        rvEspecialidades.layoutManager = LinearLayoutManager(this)


        val listaEspecialidades = arrayListOf(
            Especialidad(
                nombre = "Pediatría",
                medico = "Dra. Ana Pérez",
                horario = "Lun-Vie 8:00-15:00",
                iconoResId = R.drawable.pediatra,
                descripcion = "Especialidad dedicada al cuidado integral de la salud infantil.",
                universidad = "Universidad Nacional de Medicina",
                experiencia = 12,
                correo = "ana.perez@clinicarobles.com",
                telefono = "+51 934 567 890"
            ),
            Especialidad(
                nombre = "Cardiología",
                medico = "Dr. Juan Gómez",
                horario = "Lun-Vie 9:00-17:00",
                iconoResId = R.drawable.cardiologia,
                descripcion = "Diagnóstico y tratamiento de enfermedades cardiovasculares.",
                universidad = "Universidad de Ciencias Médicas",
                experiencia = 15,
                correo = "juan.gomez@clinicarobles.com",
                telefono = "+51 987 654 321"
            ),
            Especialidad(
                nombre = "Ginecología",
                medico = "Dra. Laura Ruiz",
                horario = "Mar-Jue 10:00-16:00",
                iconoResId = R.drawable.ginecologia,
                descripcion = "Atención integral a la salud femenina y obstetricia.",
                universidad = "Universidad Autónoma de Salud",
                experiencia = 10,
                correo = "laura.ruiz@clinicarobles.com",
                telefono = "+51 956 789 123"
            ),
            Especialidad(
                nombre = "Traumatologo",
                medico = "Dr. Carlos Fernández",
                horario = "Lun-Sáb 7:00-14:00",
                iconoResId = R.drawable.traumatologo,
                descripcion = "Atención y prevención de enfermedades de los huesos.",
                universidad = "Instituto Superior de Medicina",
                experiencia = 8,
                correo = "carlos.fernandez@clinicarobles.com",
                telefono = "+51 951 987 485"
            )
        )

        adapter = EspecialidadAdapter(listaEspecialidades)
        rvEspecialidades.adapter = adapter
    }
}
