import MainLayout from "layouts/MainLayout";
import Index from "pages/Index";
import Error404 from "pages/Error404";
import FormPage from "pages/FormPage";
import LoginForm from "components/LoginForm";
import RegisterForm from "components/RegisterForm";
import UserInfoPage from "pages/UserInfoPage";
import EmptyLayout from "layouts/EmptyLayout";

const routes = [
  {
    path: '/',
    component: MainLayout,
    children: [
      { path: '', component: Index }
    ]
  },
  {
    path: '/user/login',
    component: EmptyLayout,
    children:[
      {
        path: '',
        component: FormPage,
        children:[
          {
            path: '',
            component: LoginForm
          }
        ]
      }
    ]
  },
  {
    path: '/user/register',
    component: EmptyLayout,
    children:[
      {
        path: '',
        component: FormPage,
        children:[
          {
            path: '',
            component: RegisterForm
          }
        ]
      }
    ]
  },
  {
    path: '/user',
    component: EmptyLayout,
    children:[
      {
        path: ':userId',
        component: UserInfoPage,
        props: true
      }
    ]
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
