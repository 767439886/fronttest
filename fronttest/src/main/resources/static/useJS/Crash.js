//  是否发生碰撞,百分比的比例 , 第一个参数是bullect , 第二个参数是enemy
function crash( object1 , bulletTop  , bulletWidth ,
    width , heigth ,
    object2 , planTop , planWidth  ) {
    let obj1Top = object1.top ;
    let obj1left = object1.left ;
    obj1Top = getValue( obj1Top ) * ( heigth / 100.0 ) ;
    obj1left = getValue( obj1left ) * ( width / 100.0 ) ;

    let obj2Top = object2.top ;
    let obj2left = object2.left ;
    obj2Top = getValue( obj2Top ) * ( heigth / 100.0 ) ;
    obj2left = getValue( obj2left ) * ( width / 100.0 ) ;

    //  开关
    var topOff = 0 , leftOff = 0
    //   用obj2做参照物品
    var number = window.Math.abs(obj1Top - obj2Top) ;
    if ( obj2Top < obj1Top ) {
        if ( parseInt(number) <= planTop ){
            topOff = 1 ;
        }
    } else {
        if ( parseInt(number) <= bulletTop ){
            topOff = 1 ;
        }
    }

    number = window.Math.abs( obj1left - obj2left ) ;
    if ( obj2left < obj1left ) {
        if ( parseInt(number) <= planWidth ){
            leftOff = 1 ;
        }
    } else {
        if ( parseInt(number) <= bulletWidth ){
            leftOff = 1 ;
        }
    }
    if ( ( topOff == 1 ) && ( leftOff == 1 ) ) {
        return true
    }
    return  false ;
}

//  取值(百分比)
function getValue (insertside) {
    var insertside = insertside.substring( 0 , insertside.length - 1 ) ;
    return parseFloat( insertside ) ;
}

//  取值(vh,vw)
function getValue2 (insertside) {
    var insertside = insertside.substring( 0 , insertside.length - 2 ) ;
    return parseFloat( insertside ) ;
}