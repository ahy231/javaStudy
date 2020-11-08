/*
 * @Copyright: free for non-commercial usage
 * @Author: ahy231
 * @Date: 2020-11-04 16:43:28
 * @LastEditor: ahy231
 * @LastEditTime: 2020-11-08 09:31:11
 */

//首字母大写
Vue.filter('capitalize', function (val) {
    if (!val) return '';
    val = val.toString();
    return val.charAt(0).toUpperCase() + val.substring(1);
})

Vue.filter('capitalizeLastLetter', function (val) {
    if (!val) return '';
    val = val.toString();
    return val.substring(0, val.length - 1) + val.charAt(val.length - 1).toUpperCase();
})

new Vue({
    el: "#div1",
    data: {
        data: ''
    }
})