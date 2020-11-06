/*
 * @Copyright: free for non-commercial usage
 * @Author: ahy231
 * @Date: 2020-11-04 16:43:28
 * @LastEditor: ahy231
 * @LastEditTime: 2020-11-06 17:13:22
 */
new Vue({
    el: '#div1',
    data: {
        number: 0
    },
    methods: {
        drawLot: function () {
            this.number = Math.random() * 90 + 10;
        }
    }
})