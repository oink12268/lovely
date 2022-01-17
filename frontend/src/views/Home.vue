<template>
  <div class="home">
    <button @click="goCourt">코트</button>
    <button @click="goLogin">로그인</button>
    <button @click="goSignup">회원가입</button>
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
    }
  }
}
</script>
