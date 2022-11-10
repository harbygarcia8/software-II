import { Component, OnInit } from '@angular/core';
import { Usuario, Respuesta } from 'src/app/models/usuario';
import { UsuarioService } from './service/usuario.service';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})
export class UsuariosComponent implements OnInit {

  titulo:string = "Lista de usuarios";

  public usuarios:Usuario[] = [];

  constructor(private usuarioService:UsuarioService ) { }  

  ngOnInit(): void {
    this.getAllUsuarioService();
  }

  public getAllUsuarioService() {
    this.usuarioService.getAllUsuario().subscribe(
      (res:any) => {
        this.usuarios=res;
      }
    );
  }

  deleteUsuario(usuario:Usuario): void {    
    this.usuarioService.deleteUsuario(usuario.id).subscribe(
      res => this.usuarioService.getAllUsuario().subscribe(
          Response => this.usuarios = Response.objeto_respuesta
        )
    );
  }
  // para ver los objetos en consola
  objectKeys (objeto: any) {
    const keys = Object.keys(objeto); 
    console.log(keys);
    return keys;
 }
}
