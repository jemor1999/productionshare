import MainLayout from "layouts/MainLayout";
import Index from "pages/Index";
import Error404 from "pages/Error404";
import FormPage from "pages/FormPage";
import LoginForm from "components/LoginForm";
import RegisterForm from "components/RegisterForm";
import UserInfoPage from "pages/UserInfoPage";

const routes = [
  // {
  //   path: '/',
  //   component: MainLayout,
  //   children: [
  //     { path: '', component: Index }
  //   ]
  // },
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


// Always leave this as last one
if (process.env.MODE !== 'ssr') {
  routes.push({
    path: '*',
    component: Error404
  })
}

export default routes
