import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VetVisitComponent } from './vet-visit.component';

describe('VetVisitComponent', () => {
  let component: VetVisitComponent;
  let fixture: ComponentFixture<VetVisitComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VetVisitComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VetVisitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
