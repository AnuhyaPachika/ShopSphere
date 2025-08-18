import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Product, ProductService } from './product.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title='ShopSphere'; loading=true; error=''; products: Product[]=[];
  constructor(private svc: ProductService) {}
  ngOnInit(){ this.svc.list().subscribe({
    next: d=>{ this.products=d; this.loading=false; },
    error: _=>{ this.error='Failed to load products'; this.loading=false; }
  });}
}
