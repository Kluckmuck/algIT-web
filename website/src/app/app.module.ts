import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap'; //Bootstrap
import { NgsRevealModule } from 'ng-scrollreveal'; //Scroll reveal
import { ScrollToModule } from '@nicky-lenaers/ngx-scroll-to'; //Smooth scroll to



@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    NgbModule.forRoot(),
    NgsRevealModule.forRoot(),
    ScrollToModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
