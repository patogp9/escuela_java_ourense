function operarArrays(arrX,arrY,opera){
    var arrRes = new Array(arrX.length);
    if(arrX.length==arrY.length){
        for(var i = 0; i<arrX.length;i++){
            arrRes[i]= opera(arrX[i],arrY[i]);
        }
    }
    return arrRes;
}