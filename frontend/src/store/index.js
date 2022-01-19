import { createStore } from 'vuex'

export default createStore({
  state: {
    token: ''
  },
  mutations: {
    loginToken: function (state, payload) {
      state.token = payload
    }
  },
  actions: {
  },
  modules: {
  }
})
