package com.example.appclinica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EspecialidadAdapter(private val lista: List<Especialidad>) : RecyclerView.Adapter<EspecialidadAdapter.EspecialidadViewHolder>() {

    inner class EspecialidadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgIcono: ImageView = itemView.findViewById(R.id.imgIcono)
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombreEspecialidad)
        val tvMedico: TextView = itemView.findViewById(R.id.tvMedico)
        val tvHorario: TextView = itemView.findViewById(R.id.tvHorario)

        val btnVerDetalles: Button = itemView.findViewById(R.id.btnVerDetalles)
        val layoutDetalles: LinearLayout = itemView.findViewById(R.id.layoutDetalles)
        val tvDescripcion: TextView = itemView.findViewById(R.id.tvDescripcion)
        val tvUniversidad: TextView = itemView.findViewById(R.id.tvUniversidad)
        val tvExperiencia: TextView = itemView.findViewById(R.id.tvExperiencia)
        val tvCorreo: TextView = itemView.findViewById(R.id.tvCorreo)
        val tvTelefono: TextView = itemView.findViewById(R.id.tvTelefono)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EspecialidadViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_especialidad, parent, false)
        return EspecialidadViewHolder(view)
    }

    override fun onBindViewHolder(holder: EspecialidadViewHolder, position: Int) {
        val especialidad = lista[position]

        holder.imgIcono.setImageResource(especialidad.iconoResId)
        holder.tvNombre.text = especialidad.nombre
        holder.tvMedico.text = "Médico: ${especialidad.medico}"
        holder.tvHorario.text = "Horario: ${especialidad.horario}"

        holder.tvDescripcion.text = especialidad.descripcion
        holder.tvUniversidad.text = especialidad.universidad
        holder.tvExperiencia.text = "Años de experiencia: ${especialidad.experiencia}"
        holder.tvCorreo.text = "Correo: ${especialidad.correo}"
        holder.tvTelefono.text = "Teléfono: ${especialidad.telefono}"

        holder.layoutDetalles.visibility = View.GONE

        holder.btnVerDetalles.setOnClickListener {
            if (holder.layoutDetalles.visibility == View.GONE) {
                holder.layoutDetalles.visibility = View.VISIBLE
                holder.btnVerDetalles.text = "Ver menos detalles"
            } else {
                holder.layoutDetalles.visibility = View.GONE
                holder.btnVerDetalles.text = "Ver más detalles"
            }
        }
    }

    override fun getItemCount() = lista.size
}