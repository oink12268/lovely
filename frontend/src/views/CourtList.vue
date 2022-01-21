<template>
  <div>
    <table>
      <colgroup>
        <col width="30%">
        <col width="30%">
        <col width="40%">
      </colgroup>
      <thead>
        <tr>
          <th>번호</th>
          <th>코트명</th>
          <th>전화번호</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(data, no) in datas" :key="no">
          <td>{{ no+1 }}</td>
          <td @click="onSelectedItem(data)">{{ data.name }}</td>
          <td>{{ data.phone }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>

export default {
  name: 'CourtList',
  components: {
  },
  props: {
    datas: {
      type: Array,
      default: () => {
        return []
      }
    }

  },
  data () {
    return {
    }
  },
  created () {
  },
  methods: {
    onSelectedItem (data) {
      this.$emit('selected-item', data.idx)
    }
  }
}
</script>

<style scoped>

</style>
