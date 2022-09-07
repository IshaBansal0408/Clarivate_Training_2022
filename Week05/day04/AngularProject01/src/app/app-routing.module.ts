import { RestrictGuard } from './Guard/restrict.guard';
import { AuthGuard } from './Guard/auth.guard';
import { UsersComponent } from './users/users.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Provide path (name of component) and component Name for all the components created
const routes: Routes = [
  // provide a default route
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  // Normal routing
  { path: 'home', component: HomeComponent },
  {
    path: 'register',
    component: RegisterComponent,
    canDeactivate: [RestrictGuard],
  },
  { path: 'login', component: LoginComponent },
  { path: 'users', component: UsersComponent, canActivate: [AuthGuard] },
  // wildcard routing
  { path: '**', component: LoginComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
