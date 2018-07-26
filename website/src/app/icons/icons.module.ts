import { NgModule } from '@angular/core';
import { IconArrowDown, IconMail, IconPhone, IconLinkedin, IconMessageCircle, IconAperture } from 'angular-feather';
//Feather icons module. Import icons above !
//https://www.npmjs.com/package/angular-feather
//Add imported icon to array
const icons = [
  IconArrowDown,
  IconMail,
  IconPhone,
  IconLinkedin,
  IconMessageCircle,
  IconAperture
];


@NgModule({
  exports: icons
})
export class IconsModule { }
