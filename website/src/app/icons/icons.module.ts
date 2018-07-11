import { NgModule } from '@angular/core';
import { IconArrowDown } from 'angular-feather';

//Feather icons module. Import icons here!

const icons = [
  IconArrowDown
];


@NgModule({
  exports: icons
})
export class IconsModule { }
