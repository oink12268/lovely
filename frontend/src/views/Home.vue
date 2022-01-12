<template>
  <div class="home">
    <button @click="happyChristmas">주문 관리</button>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Home',
  methods: {
    happyChristmas () {
      console.log('happyChristmas')
      axios.get('/api/admin/list').then((res) => {
        console.log('KSH::', res.data)
      })
    }
  }
}
</script>
