<template>
  <div class="schedule">
    <h1>코트 조회</h1>
    <court-list :datas="datas"></court-list>
  </div>
</template>

<script>
import axios from 'axios'
import CourtList from './CourtList.vue'

export default {
  name: 'Court',
  components: {
    CourtList
  },
  data () {
    return {
      datas: []
    }
  },
  created () {
    this.getData()
  },
  methods: {
    getData () {
      axios.get('/api/app/v1/courts').then((res) => {
        console.log('KSH::Court', res.data)
        this.datas = res.data
      })
    }
  }
}
</script>
