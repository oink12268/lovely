<template>
  <div>
    <h1>
      회원가입
    </h1>

    <input type="text" v-model="email">
    <input type="password" v-model="password">
    <button @click="signup">등록</button>
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
    signup () {
      if (!this.email || !this.password) {
        alert('모든 정보를 입력해주세요.')
      } else {
        axios.post('/api/app/v1/users/signup',
          { email: this.email, pw: this.password }
        ).then((res) => {
          console.log('KSH::res:', res)
          alert('Sign Up Success')
        })
      }
    }
    // login () {
    //   console.log('KSH::Login try', this.user, this.password)
    // }
  }
}

</script>
