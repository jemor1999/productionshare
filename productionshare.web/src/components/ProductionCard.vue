<template>
  <div class="production-card">
    <q-card class="my-card">
      <q-img
        src="https://cdn.quasar.dev/img/parallax2.jpg"
        basic
      >
        <div class="absolute-bottom text-weight-medium production-card-title">
          {{production}}
        </div>
      </q-img>

      <q-card-section class="production-card-info">
        作品描述作品描述作品描述作品描述作品描述作品描述作品描述作品描述作品描述
      </q-card-section>
    </q-card>
  </div>
</template>

<script>
  export default {
    name: "ProductionCard",
    props:["production"],
    data(){
      return{

      }
    }
  }

</script>

<style scoped>
  .production-card{
    width: 200px;
    margin: 10px auto;
  }
  .production-card-title{
    font-size: 12px;
    line-height: 25px;
    padding: 5px;
  }
  .production-card-info{
    font-size: 12px;
    padding: 5px;
  }
</style>
