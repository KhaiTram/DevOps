import {Component, OnInit} from '@angular/core';
import {Visit} from '../../visits/visit';
import {Vet} from '../vet';
import {ActivatedRoute,Router} from '@angular/router';
import {VetService} from '../vet.service';
import { VisitService } from 'app/visits/visit.service';

@Component({
  selector: 'app-vet-visit',
  templateUrl: './vet-visit.component.html',
  styleUrls: ['./vet-visit.component.css']
})
export class VetVisitComponent implements OnInit {
  errorMessage: string;
  visits: Visit[];
  

  constructor(private route: ActivatedRoute, private router: Router, private vetService: VetService) { 

  }

  ngOnInit() {
    const vetId = this.route.snapshot.params.id;
    this.vetService.getVisitByVetId(vetId).subscribe(
      visits => this.visits = visits,
      error => this.errorMessage =error as any
      );
    console.log(this.visits);
  }

}
