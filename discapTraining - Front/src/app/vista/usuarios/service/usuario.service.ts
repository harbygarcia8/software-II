import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, Observable } from 'rxjs';
import { Usuario, Respuesta } from 'src/app/models/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private urlEndPoint:string="http://localhost:8070/api/discap-login/usuario/";

  constructor(private http:HttpClient) { } 

  // obtener el listado de Usuarios
  getAllUsuario(){
    return this.http.get<Respuesta>(this.urlEndPoint + 'getInformation');
  }

  // crear un nuevo Usuario
  createUsuario(usuario: Usuario): Observable<any>{
    return this.http.post(this.urlEndPoint + 'create', usuario).pipe(map(
      (response: any) => response.usuario));
  }

  // obtener o cargar un Usuario por id
  getUsuarioById(id: number): Observable<any>{
    return this.http.get<Respuesta>(this.urlEndPoint + "/" + id);
     
  }

  // // actualizar un Usuario
  updateUsuario(usuario: Usuario): Observable<any>{
    return this.http.put(`${this.urlEndPoint}/update/${usuario.id}`, usuario).pipe(
      map( (response: any) => response.usuario));
  }

  // // eliminar un Usuario
  deleteUsuario(id: number): Observable<any>{
    return this.http.delete(this.urlEndPoint+"delete/"+id);
  }



}
