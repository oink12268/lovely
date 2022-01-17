<template>
  <div>
    <h1>
      로그인
    </h1>

    <input type="text" placeholder="email" v-model="email">
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
      email: '',
      password: ''
    }
  },
  methods: {
    async login () {
      if (!this.email || !this.password) {
        alert('Email or Password is Empty')
        return false
      } else {
        axios.post('/api/user/login', { email: this.email, pw: this.password }
        ).then(response => {
          if (response.status === 200) {
            // alert('Authorization: ' + response.headers['authorization'])
            // localStorage.setItem('authorization', response.headers['authorization'])
            this.$router.push('/')
          }
        }).catch((exception) => {
          alert('ERROR!!!! : ' + exception)
        })
      }
    }
  }
}

</script>
