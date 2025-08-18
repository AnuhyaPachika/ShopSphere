import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
export interface Product { id:number; name:string; description:string; price:number; stock:number; }
@Injectable({ providedIn: 'root' })
export class ProductService {
  private readonly base='/api';
  constructor(private http: HttpClient) {}
  list(): Observable<Product[]> { return this.http.get<Product[]>(`${this.base}/products`); }
}
