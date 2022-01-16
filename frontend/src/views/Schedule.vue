<template>
  <div class="schedule">
    <h1>일정 조회</h1>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Schedule',
  created () {
    this.getData()
  },
  methods: {
    getData () {
      console.log('happyChristmas')
      axios.get('/api/app/v1/schedules').then((res) => {
        console.log('KSH::', res.data)
      })
    }
  }
}
</script>
