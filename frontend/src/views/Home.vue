<template>
  <div class="home">
    <button @click="goCourt">코트</button>
    <button @click="goLogin">로그인</button>
    <button @click="goSignup">회원가입</button>
    <button @click="storetest">스토어 테스트</button>
  </div>
</template>

<script>

export default {
  name: 'Home',
  methods: {
    goCourt () {
      this.$router.push('/Court')
    },
    goLogin () {
      this.$router.push('/Login')
    },
    goSignup () {
      this.$router.push('/Signup')
    },
    storetest () {
      console.log('storetest')
      this.$store.commit('loginToken', 'hihello')
      console.log(this.$store.state.token)
    }
  }
}
</script>
