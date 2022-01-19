import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'

axios.interceptors.request.use(
  (config) => {
    const token = localStorage.getItem('authorization')

    if (token) {
      config.headers.Authorization = token
    }

    return config
  },
  (error) => {
    return Promise.reject(error)
  }
)

createApp(App).use(store).use(router).mount('#app')
