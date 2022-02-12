import {Component, OnInit} from '@angular/core';
import {Visit} from '../../visits/visit';
import {VisitService} from 'app/visits/visit.service';
import {Vet} from '../vet';
import {Router} from '@angular/router';
import {VetService} from '../vet.service';

@Component({
  selector: 'app-vet-visit',
  templateUrl: './vet-visit.component.html',
  styleUrls: ['./vet-visit.component.css']
})
export class VetVisitComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
