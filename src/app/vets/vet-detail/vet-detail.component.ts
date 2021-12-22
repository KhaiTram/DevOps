/*
 *
 *  * Copyright 2016-2017 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

/**
 * @author Vitaliy Fedoriv
 */

import {Component, OnInit} from '@angular/core';
import {VetService} from '../vet.service';
import {ActivatedRoute, Router} from '@angular/router';
import {Vet} from '../vet';


@Component({
  selector: 'app-vet-detail',
  templateUrl: './vet-detail.component.html',
  styleUrls: ['./vet-detail.component.css']
})
export class VetDetailComponent implements OnInit {
  errorMessage: string;
  vet: Vet;
  deleteSuccess = false;

  constructor(private route: ActivatedRoute, private router: Router, private vetService: VetService) {
    this.vet = {} as Vet;
  }

  ngOnInit() {
    const vetId = this.route.snapshot.params.id;
    this.vetService.getVetById(vetId).subscribe(
      vet => this.vet = vet,
      error => this.errorMessage = error as any);
  }

  gotovetsList() {
    this.router.navigate(['/vets']);
  }

  editvet() {
    this.router.navigate(['/vets', this.vet.id, 'edit']);
  }

  addPet(vet: Vet) {
    this.router.navigate(['/vets', vet.id, 'pets', 'add']);
  }


  deleteVet(vet: Vet) {
    this.vetService.deleteVet(vet.id.toString()).subscribe(
      response => {
        this.deleteSuccess = true;
        this.vet = {} as Vet;
      },
      error => this.errorMessage = error as any);
  }


}
