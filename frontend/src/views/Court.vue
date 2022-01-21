<template>
  <div class="schedule">
    <div v-if="!isDetail">
      <h1>코트 조회</h1>
      <court-list :datas="datas" @selected-item="goDetail"></court-list>
      <button @click="register">신규 코트</button>
    </div>
    <div v-else>
      <court-detail :idx="idx" @go-list="isDetail=false"></court-detail>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import CourtList from './CourtList.vue'
import CourtDetail from './CourtDetail'

export default {
  name: 'Court',
  components: {
    CourtList,
    CourtDetail
  },
  data () {
    return {
      idx: 0,
      datas: [],
      isDetail: false
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
    },
    goDetail (idx) {
      this.idx = idx
      this.isDetail = true
    },
    register () {
      this.idx = 0
      this.isDetail = true
    }
  }
}
</script>
