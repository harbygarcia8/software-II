import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsuariosComponent } from './vista/usuarios/usuarios.component';
import { FormUsuarioComponent } from './vista/usuarios/crearUsuarios/form-usuario.component';

const routes: Routes = [
    { path: '', redirectTo: '/usuarios/crear', pathMatch: 'full' },
    { path: 'usuarios', component: UsuariosComponent },
    { path: 'usuarios/crear', component: FormUsuarioComponent },
    { path: 'usuarios/editar/:id', component: FormUsuarioComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
