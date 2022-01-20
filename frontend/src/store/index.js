import { createStore } from 'vuex'
import createPersistedState from 'vuex-persistedstate'

export default createStore({
  state: {
    token: ''
  },
  mutations: {
    loginToken: function (state, payload) {
      state.token = payload
    },
    logoutToken: function (state) {
      state.token = ''
    }
  },
  actions: {
  },
  modules: {
  },
  getters: {
    isLogin (state) {
      return state.token !== ''
    }
  },
  plugins: [createPersistedState()]
})
