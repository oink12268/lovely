<template>
  <div class="home">
    <button @click="goCourt">코트</button>
    <button v-if="!this.$store.getters.isLogin" @click="login">로그인</button>
    <button v-if="!this.$store.getters.isLogin" @click="signUp">회원가입</button>
    <button v-if="this.$store.getters.isLogin" @click="logOut">로그아웃</button>
  </div>
</template>

<script>

export default {
  name: 'Home',
  data () {
    return {
    }
  },
  created () {
  },
  methods: {
    goCourt () {
      this.$router.push('/Court')
    },
    login () {
      this.$router.push('/Login')
    },
    signUp () {
      this.$router.push('/Signup')
    },
    logOut () {
      // localStorage.removeItem('token')
      this.$store.commit('logoutToken')
      this.$router.push('/')
    }
  }
}
</script>
