import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css'],
})
export class ParentComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  ProductsOnSale = [
    {
      prodID: '001',
      name: 'Denim Dress',
      color: 'blue and violet',
      price: 2000,
      discount: 'Flat 500/- OFF',
    },
    {
      prodID: '002',
      name: 'Bodycon Dress',
      color: 'black and red',
      price: 1500,
      discount: '20% OFF',
    },
    {
      prodID: '003',
      name: 'Long Kurti',
      color: 'brown and green',
      price: 1000,
      discount: 'Buy 1 Get 1 FREE',
    },
    {
      prodID: '005',
      name: 'Crop Top',
      color: 'pink and olive',
      price: 1200,
      discount: 'Flat 300/- OFF',
    },
  ];

  NewArrivals = [
    {
      prodID: '006',
      name: 'High Waist Jeans',
      color: 'blue and black',
      price: 3000,
      discount: 'Buy 2 and Get 10% OFF',
    },
    {
      prodID: '007',
      name: 'Floral Dress',
      color: 'yellow and pink',
      price: 2500,
      discount: 'No Discount',
    },
    {
      prodID: '008',
      name: 'Designer Lehanga',
      color: 'silver and gold',
      price: 4000,
      discount: '10% OFF',
    },
    {
      prodID: '009',
      name: 'Denim Jacket',
      color: 'Blue',
      price: 2000,
      discount: 'No Discount',
    },
  ];
}
