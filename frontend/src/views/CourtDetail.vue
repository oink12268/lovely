<template>
  <div>
    <table>
      <tr>
        <th>코트명</th>
        <td>
          <input type="text" v-model="courtInfo.name">
        </td>
      </tr>
      <tr>
        <th>전화번호</th>
        <td>
          <input type="text" v-model="courtInfo.phone">
        </td>
      </tr>
    </table>
    <button @click="goBack">{{buttonName}}</button>
    <button @click="onSave">저장</button>
  </div>
</template>

<script>

import axios from 'axios'

export default {
  name: 'CourtDetail',
  components: {
  },
  props: {
    idx: {
      type: Number,
      default: 0
    }
  },
  data () {
    return {
      courtInfo: {
        // courtName: '',
        // phone: ''
      }
    }
  },
  computed: {
    buttonName () { return this.idx > 0 ? '목록' : '취소' }
  },
  created () {
    if (this.idx > 0) this.getData()
  },
  methods: {
    getData () {
      axios.get(`/api/app/v1/courts/${this.idx}`).then((res) => {
        console.log('KSH::Court', res.data)
        this.courtInfo = res.data
      })
    },
    onSave () {
      axios.post('/api/app/v1/courts', this.courtInfo).then((res) => {
        if (res) {
          alert('saved')
        }
      })
    },
    goBack () {
      this.$emit('go-list')
    }
  }
}
</script>

<style scoped>

</style>
