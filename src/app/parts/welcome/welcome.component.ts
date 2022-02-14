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
import {OwnerService} from '../../owners/owner.service';
import {Owner} from '../../owners/owner';
import {PetService} from '../../pets/pet.service';
import {Pet} from '../../pets/pet';
import {VisitService} from '../../visits/visit.service';
import {Visit} from '../../visits/visit';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  errorMessage: string;
  searchTerm: string;
  owners: Owner[];
  pets: Pet[];
  visits: Visit[];
  searchedList: string[];
  allList: string[];

  constructor(private ownerService: OwnerService, private petService: PetService, private visitService: VisitService) {
  }

  ngOnInit() {
    this.ownerService.getOwners().subscribe(
      owners => this.owners = owners,
      error => this.errorMessage = error as any);
    this.petService.getPets().subscribe(
      pets => this.pets = pets,
      error => this.errorMessage = error as any);
    this.visitService.getVisits().subscribe(
      visits => this.visits = visits,
      error => this.errorMessage = error as any);
  }

  search(){
    this.loadlist();
    setTimeout(() => {
      this.searchWords()
    }, 10)

    
  }

  searchWords(){
    this.searchedList = [];
    for (let word of this.allList){
      if(word.includes(this.searchTerm))
      {
        this.searchedList.push(word);
      }
    }
    console.log(this.searchedList);
  }

  loadlist(){
    this.allList = [];
    for (let owner of this.owners) {
      this.allList.push(owner.lastName);
    }
    for (let pet of this.pets) {
      this.allList.push(pet.name);
    }
    for (let visit of this.visits) {
      this.allList.push(visit.description);
    }

    
  }

}
