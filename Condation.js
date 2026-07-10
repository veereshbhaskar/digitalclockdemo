let marks=[];
let i = 0;
while(i < 5){
    let mark = parseInt(`Enter marks for subjects${i + 1}:`);
    marks.push(mark);
    i++;
}
console.log("Marks entered:",marks);