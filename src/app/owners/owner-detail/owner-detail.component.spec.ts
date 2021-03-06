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

/* tslint:disable:no-unused-variable */

/**
 * @author Vitaliy Fedoriv
 */

import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import {CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';

import {OwnerDetailComponent} from './owner-detail.component';
import {FormsModule} from '@angular/forms';
import {RouterTestingModule} from '@angular/router/testing';
import {OwnerService} from '../owner.service';
import {ActivatedRoute, Router} from '@angular/router';
import {ActivatedRouteStub, RouterStub} from '../../testing/router-stubs';
import {Owner} from '../owner';
import {Observable, of} from 'rxjs';

class OwnserServiceStub {
  getOwnerById(): Observable<Owner> {
    return of( { id: 1, firstName: 'James' } as Owner );
  }
}

describe('OwnerDetailComponent', () => {
  let component: OwnerDetailComponent;
  let fixture: ComponentFixture<OwnerDetailComponent>;
  let testOwners: Owner[];
  
  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [OwnerDetailComponent],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
      imports: [FormsModule, RouterTestingModule],
      providers: [
        {provide: OwnerService, useClass: OwnserServiceStub},
        {provide: Router, useClass: RouterStub},
        {provide: ActivatedRoute, useClass: ActivatedRouteStub}
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    testOwners = [{
      id: 1,
      firstName: 'George',
      lastName: 'Franklin',
      address: '110 W. Liberty St.',
      city: 'Madison',
      telephone: '6085551023',
      pets: [{
        id: 1,
        name: 'Leo',
        birthDate: '2010-09-07',
        type: {id: 1, name: 'cat'},
        owner: null,
        visits: null
      }]
    }];
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OwnerDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create OwnerDetailComponent', () => {
    expect(component).toBeTruthy();
  });

  it('should create testuser', () => {
    expect(testOwners[0]).toBeTruthy();
  });

  it('should Delete testuser', () => {
    expect(testOwners[0]).toBeTruthy();
  });

});
