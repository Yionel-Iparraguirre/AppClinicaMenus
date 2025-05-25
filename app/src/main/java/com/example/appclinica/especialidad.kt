package com.example.appclinica

data class Especialidad(
    val nombre: String,
    val medico: String,
    val horario: String,
    val iconoResId: Int,

    val descripcion: String,
    val universidad: String,
    val experiencia: Int,
    val correo: String,
    val telefono: String
)