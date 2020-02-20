import Vue from 'vue'
import Vuex from 'vuex'

import user from "src/store/modules/User";

Vue.use(Vuex)

/*
 * If not building with SSR mode, you can
 * directly export the Store instantiation;
 *
 * The function below can be async too; either use
 * async/await or return a Promise which resolves
 * with the Store instance.
 */

export default function (/* { ssrContext } */) {
  const Store = new Vuex.Store({
    modules: {
      user
    },
    state,
    mutations,
    getters,
    actions,

    // enable strict mode (adds overhead!)
    // for dev mode only
    strict: process.env.DEV
  })

  return Store
}

//放共享状态（也可以是说是数据）通过state操作其中属性
const state = {

}

//写方法，类似与事件，用来修改state无法异步，有回调,使用commit调用其中方法
const mutations = {

}

//调用事件（mutation）的，可以异步，使用disptch调用其中方法
const actions = {

}

//用来直接访问state 中的数据
//Getter 会暴露为 store.getters 对象，你可以以属性的形式访问这些值
const getters = {

}
