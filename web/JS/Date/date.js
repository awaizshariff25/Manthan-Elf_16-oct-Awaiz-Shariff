var date=new Date();
console.log("Today's date ",date);
// var date1=new Date(0);
// console.log("Date in milliseconds constructor ",date1);
// var date2=new Date("October 30");
// console.log("Date string constructor ");
// var date3=new Date(1990,4,12)
// console.log("Date years month constructor "+date3);
console.log("==========================");
var year=date.getFullYear()
console.log("Year "+year);
var minutes=date.getMinutes()
console.log("Minutes "+minutes);
var month=date.getMonth()
console.log("month "+month);
var day=date.getDay()
console.log("day "+day);
var todaysdate=date.getDate()
console.log("tadays date "+todaysdate);

var months=["Jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"]
var thisMonth=months[month];
var days=["sun","mon","tue","wed","thur","fri","sat"]
var thisDay=days[day]
console.log("==============================");
console.log("Month=",thisMonth);
console.log("Day=",thisDay);
