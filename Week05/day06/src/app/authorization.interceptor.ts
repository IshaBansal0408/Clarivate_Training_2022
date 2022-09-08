import { ProductsService } from './Services/products.service';
import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class AuthorizationInterceptor implements HttpInterceptor {
  constructor(private pservice: ProductsService) {}

  //1. stop current http request and modify the request
  //2. send request again to server

  intercept(request: HttpRequest<unknown>, handler: HttpHandler) {
    // 1. create modified request
    const modifiedRequest = request.clone({
      // 1.1. append some data (key and bearer token) with existing headers
      headers: request.headers.append(
        'Authorization',
        `Bearer ${this.pservice.getToken()}`
      ),
    });

    // 2. send the request back to the server
    return handler.handle(modifiedRequest);
  }
}
