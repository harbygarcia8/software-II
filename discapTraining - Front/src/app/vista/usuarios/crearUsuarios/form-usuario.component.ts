import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Usuario, Respuesta } from 'src/app/models/usuario';
import { UsuarioService } from '../service/usuario.service';

@Component({
  selector: 'app-form-usuario',
  templateUrl: './form-usuario.component.html',
  styleUrls: ['./form-usuario.component.css']
})
export class FormUsuarioComponent implements OnInit {

  // usuario nuevo
  usuario: Usuario = new Usuario();
  titulo:string = "Registar Usuario";


  constructor(private usuarioService:UsuarioService, private router:Router, private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.mostrarUsuario();
  }

  mostrarUsuario(): void {
    this.activatedRoute.params.subscribe(
      e=>{
        let id = e['id'];
        if(id){
          this.usuarioService.getUsuarioById(id).subscribe(
            (res:Respuesta)=>{
              this.usuario = res.objeto_respuesta[0];
            }
          );
        }
      }
    );
    
  }

  updateUsuario(){
    this.usuarioService.updateUsuario(this.usuario).subscribe(
      res => { 
        this.router.navigate(['/usuarios']);
      }
    );
  }

   createUsuario(): void {
    console.log(this.usuario);
    this.usuarioService.createUsuario(this.usuario).subscribe(
      res => { 
        this.router.navigate(['/usuarios']);
      }
    );
  }


  
}
