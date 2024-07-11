package com.aluracursos.ChallengLiteratura.Configuracion.iConfig;

public interface IConvertirDatos {

    <T> T convertirDatosJsonAJava(String json , Class<T> clase);

}
