import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';

import { IconsModule } from './icons/icons.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap'; //Bootstrap
import { NgsRevealModule } from 'ng-scrollreveal'; //Scroll reveal
import { ScrollToModule } from '@nicky-lenaers/ngx-scroll-to';
import { NavbarComponent } from './navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
  ],
  imports: [
    BrowserModule,
    NgbModule.forRoot(),
    NgsRevealModule.forRoot(),
    ScrollToModule.forRoot(),
    FormsModule,
    IconsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }
