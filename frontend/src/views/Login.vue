<template>
  <div>
    <h1>
      로그인
    </h1>

    <input type="text" placeholder="username" v-model="user">
    <input type="password" placeholder="password" v-model="password">
    <button @click="login">로그인</button>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'login',
  data () {
    return {
      user: '',
      password: ''
    }
  },
  methods: {
    async login () {
      try {
        const result = await axios.get('/api/login', {
          auth: {
            username: this.user,
            password: this.password
          }
        })
        if (result.status === 200) {
          console.log('KSH::Login Success')
          // this.loginSuccess = true
        }
      } catch (err) {
        console.log('KSH::login Error', err)
        // this.loginError = true
        // throw new Error(err)
      }
    }
    // login () {
    //   console.log('KSH::Login try', this.user, this.password)
    // }
  }
}

</script>
