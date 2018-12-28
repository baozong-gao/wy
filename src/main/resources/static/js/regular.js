//统一正则校验
var checkMsg = {
    PHONE : {
        regular: /^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\d{8}$/,
        msg: '请输入正确的手机号'
    },
    SPECIALPLANE : {
        regular : /^([0-9]{3,4}-)?[0-9]{7,8}$/,
        msg: '请输入正确的座机号'
    },
    IDCARD : {
        regular: /^(^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$)|(^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])((\d{4})|\d{3}[Xx])$)$/,
        msg: '请输入正确的身份证号码'
    },
    DOWN_PAYMENT : {
        regular: /^([0-4]?[0-9]{1,4}|50000)(\.[0-9]{1,2})?$/,
        msg: '金额只能是正数，且小数点后最多保留两位'
    },
    PHONEANDMOBILE : {
      regular: /(\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$/,
        msg: '请输入正确格式的电话号码'
    }
};
var check = function (val, checkType) {
    if (checkMsg[checkType].regular.test(val)) {
        return true;
    } else {
        layer.msg(checkMsg[checkType].msg);
        return false;
    }
};
//获取当前时间yyyymmdd并转换成number类型
var yyyyMMDD = function getNowFormatDate() {
    var date = new Date();
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdateS = year + month + strDate;
    var currentdateI = parseInt(currentdateS);
    return currentdateI;
};
//比较选择日期是否大于当前系统时间，如果是返回true，否则返回false
var beEqualOrGreaterThanToday = function (choseDate) {
    var choseDateAlter = parseInt(choseDate.replace(/-/g,""));
    if(choseDateAlter < yyyyMMDD()){
        layer.msg("选择日期不能小于当天");
        return false;
    }else{
        return true;
    }
};

var checkNotNull = function checkNotNull(checkMsg){
    if(checkMsg === "" || checkMsg === null || checkMsg === "undefined" || checkMsg === undefined){
        layer.msg("输入信息不能为空");
        return false;
    }
    return true;
};

var checkNotNullNoReturnMsg = function checkNotNullNoReturnMsg(checkMsg){
    if(checkMsg === "" || checkMsg === null || checkMsg === "undefined" || checkMsg === undefined){
        return true;
    }
    return false;
};
//银行卡号Luhn校验算法
//luhn校验规则：16位银行卡号（19位通用）:
//1.将未带校验位的 15（或18）位卡号从右依次编号 1 到 15（18），位于奇数位号上的数字乘以 2。
//2.将奇位乘积的个十位全部相加，再加上所有偶数位上的数字。
//3.将加法和加上校验位能被 10 整除。

//bankno为银行卡号
var luhnCheck = function luhnCheck(bankno){
    var lastNum=bankno.substr(bankno.length-1,1);//取出最后一位（与luhn进行比较）

    var first15Num=bankno.substr(0,bankno.length-1);//前15或18位
    var newArr=new Array();
    for(var i=first15Num.length-1;i>-1;i--){    //前15或18位倒序存进数组
        newArr.push(first15Num.substr(i,1));
    }
    var arrJiShu=new Array();  //奇数位*2的积 <9
    var arrJiShu2=new Array(); //奇数位*2的积 >9

    var arrOuShu=new Array();  //偶数位数组
    for(var j=0;j<newArr.length;j++){
        if((j+1)%2==1){//奇数位
            if(parseInt(newArr[j])*2<9)
                arrJiShu.push(parseInt(newArr[j])*2);
            else
                arrJiShu2.push(parseInt(newArr[j])*2);
        }
        else //偶数位
            arrOuShu.push(newArr[j]);
    }

    var jishu_child1=new Array();//奇数位*2 >9 的分割之后的数组个位数
    var jishu_child2=new Array();//奇数位*2 >9 的分割之后的数组十位数
    for(var h=0;h<arrJiShu2.length;h++){
        jishu_child1.push(parseInt(arrJiShu2[h])%10);
        jishu_child2.push(parseInt(arrJiShu2[h])/10);
    }

    var sumJiShu=0; //奇数位*2 < 9 的数组之和
    var sumOuShu=0; //偶数位数组之和
    var sumJiShuChild1=0; //奇数位*2 >9 的分割之后的数组个位数之和
    var sumJiShuChild2=0; //奇数位*2 >9 的分割之后的数组十位数之和
    var sumTotal=0;
    for(var m=0;m<arrJiShu.length;m++){
        sumJiShu=sumJiShu+parseInt(arrJiShu[m]);
    }

    for(var n=0;n<arrOuShu.length;n++){
        sumOuShu=sumOuShu+parseInt(arrOuShu[n]);
    }

    for(var p=0;p<jishu_child1.length;p++){
        sumJiShuChild1=sumJiShuChild1+parseInt(jishu_child1[p]);
        sumJiShuChild2=sumJiShuChild2+parseInt(jishu_child2[p]);
    }
    //计算总和
    sumTotal=parseInt(sumJiShu)+parseInt(sumOuShu)+parseInt(sumJiShuChild1)+parseInt(sumJiShuChild2);

    //计算luhn值
    var k= parseInt(sumTotal)%10==0?10:parseInt(sumTotal)%10;
    var luhn= 10-k;

    if(lastNum==luhn){
        console.log("验证通过");
        return true;
    }else{
        layer.msg("银行卡号必须符合luhn校验");
        return false;
    }
}