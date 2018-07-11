import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { IconsModule } from './icons/icons.module';

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
    ScrollToModule.forRoot(),
    IconsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }
