import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: () => import('../views/HomeView.vue')
    },
    {
      path: '/login',
      name: 'login',
      component: () => import('../views/login/LoginView.vue')
    },
    {
      path: '/main',
      name: 'main',
      component: () => import('../views/main/MainView.vue')
    },
    {
      path: '/demo',
      name: 'demo',
      component: () => import('../views/demo/DemoListView.vue')
    },
    {
      path: '/system',
      name: 'system',
      component: () => import('../views/system/user/userList.vue')
    }
  ]
})

export default router