export class Usuario {  
    id: number = 0;
    correo: String = '';
    password: String = '';
    nombres: String = '';
    apellidos: String = '';
    documento: number = 0;
    tipo_documento: String = '';
    discapacidad: String = ''
}

export interface Respuesta{
    codigo: String;
    descripcion: String;
    estado: String;
    objeto_respuesta:Usuario[];
}