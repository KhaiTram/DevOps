import { ComponentFixture, TestBed } from '@angular/core/testing';
import { VetVisitComponent } from './vet-visit.component';
import {Visit} from '../../visits/visit';
import {Vet} from '../vet';
import {ActivatedRoute, Router} from '@angular/router';
import {VetService} from '../vet.service';

describe('VetVisitComponent', () => {
  let component: VetVisitComponent;
  let fixture: ComponentFixture<VetVisitComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
     
      declarations: [ VetVisitComponent ],
        providers: [
          {provide: VetService},
          {provide: Router},
          {provide: ActivatedRoute}
        ]
    
      
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VetVisitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

/*   it('should fake create', () => {
    expect(component).toBeTruthy();
  }); */

/*   it('should create', () => {
    expect(component).toBeTruthy();
  }); */
});
