<template>
  <div class="form-position">
    <div class="form-size">
      <router-view/>
    </div>
  </div>
</template>

<script>
export default {
  name: "FormPage",
  data(){
    return{

    }
  },
  created() {
  }

}
</script>

<style scoped>
.form-size{
  width: 400px;
  margin: 0 auto;
}
</style>
