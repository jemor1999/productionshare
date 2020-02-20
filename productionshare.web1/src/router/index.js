import Vue from 'vue'
import VueRouter from 'vue-router'

import FormPage from "../page/FormPage";
import LoginForm from "../components/LoginForm";
import RegisterForm from "../components/RegisterForm";
import UserInfoPage from "../page/UserInfoPage";

Vue.use(VueRouter)

export default new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/user/login',
      component: FormPage,
      children:[
        {
          path: '',
          component: LoginForm
        }
      ]
    },
    {
      path: '/user/register',
      component: FormPage,
      children:[
        {
          path: '',
          component: RegisterForm
        }
      ]
    },
    {
      path: '/user/info',
      component: UserInfoPage
    }
  ]
})
