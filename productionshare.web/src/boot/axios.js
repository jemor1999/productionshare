import Vue from 'vue'
import axios from 'axios'
import config from '../config'


axios.defaults.baseURL = config.baseUrl
axios.defaults.headers['XPS-Version'] = '1.0.0'


Vue.prototype.$axios = {
  headers() {
    return {'Authorization': window.sessionStorage.getItem("authorization")}
  },
  baseUrl: config.baseUrl,
  baseUrl2: config.baseUrl.substring(0, config.baseUrl.length - 1),

  //之后写照着这个抄
  saveTypeEvent(request = {}) {
    return axios.post(config.baseUrl + "/uplus/type/event/add", request).then(
      (response) => Promise.resolve(response)
    ).catch(
      (error) => Promise.reject(error)
    )
  },
  login(request = {}) {
    return axios.post(config.baseUrl + "/user/login", request).then(
      (response) => Promise.resolve(response)
    ).catch(
      (error) => Promise.reject(error)
    )
  },
  register(request = {}) {
    return axios.post(config.baseUrl + "/user/register", request).then(
      (response) => Promise.resolve(response)
    ).catch(
      (error) => Promise.reject(error)
    )
  },
  // allProductionsOfThisUser(request = {}) {
  //   return axios.post(config.baseUrl + "/user/allProductions", request).then(
  //     (response) => Promise.resolve(response)
  //   ).catch(
  //     (error) => Promise.reject(error)
  //   )
  // },
  // allProductionsOfOtherUser(request = {}) {
  //   return axios.post(config.baseUrl + "/user/"+request.userId, request).then(
  //     (response) => Promise.resolve(response)
  //   ).catch(
  //     (error) => Promise.reject(error)
  //   )
  // },
  allProductions(request = {}) {
    return axios.post(config.baseUrl + "/user/"+request.userId, request).then(
      (response) => Promise.resolve(response)
    ).catch(
      (error) => Promise.reject(error)
    )
  }
}
