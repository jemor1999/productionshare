<template>
  <div>
    <div>
      <q-img
        src="https://tse2-mm.cn.bing.net/th/id/OIP.DKQEggKIFBYRzM5tmL1DawHaEK?w=292&h=164&c=7&o=5&pid=1.7"
        :ratio="2"
        class="info-back"
        placeholder-src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJYAAACWBAMAAADOL2zRAAAAG1BMVEXMzMyWlpaqqqq3t7fFxcW+vr6xsbGjo6OcnJyLKnDGAAAACXBIWXMAAA7EAAAOxAGVKw4bAAABAElEQVRoge3SMW+DMBiE4YsxJqMJtHOTITPeOsLQnaodGImEUMZEkZhRUqn92f0MaTubtfeMh/QGHANEREREREREREREtIJJ0xbH299kp8l8FaGtLdTQ19HjofxZlJ0m1+eBKZcikd9PWtXC5DoDotRO04B9YOvFIXmXLy2jEbiqE6Df7DTleA5socLqvEFVxtJyrpZFWz/pHM2CVte0lS8g2eDe6prOyqPglhzROL+Xye4tmT4WvRcQ2/m81p+/rdguOi8Hc5L/8Qk4vhZzy08DduGt9eVQyP2qoTM1zi0/uf4hvBWf5c77e69Gf798y08L7j0RERERERERERH9P99ZpSVRivB/rgAAAABJRU5ErkJggg=="
      />
    </div>

    <div class="row">
      <div class="col-4 offset-4">
        <div class="head-image-position">
          <div class="text-center">
            <q-avatar class="head-image" size="100px" font-size="100px" icon="img:https://tse2-mm.cn.bing.net/th/id/OIP.DKQEggKIFBYRzM5tmL1DawHaEK?w=292&h=164&c=7&o=5&pid=1.7" />
          </div>

          <div class="text-h5 text-center">
            用户昵称{{user.userNickName}}
            <q-badge align="bottom">用户性别{{user.userSex}}</q-badge>
          </div>
          <div class="text-left text-weight-light">
            用户个性签名：{{user.userSignature}}
          </div>
        </div>
      </div>
    </div>

    <div class="text-center q-my-md">
      <span class="text-h6">用户作品</span>
      <q-separator color="grey-7" inset spaced class="separator-width"/>
    </div>

    <div class="row q-px-md">
      <div class="col-2" v-for="production in productions">
        <ProductionCard v-bind:production="production"/>
      </div>
    </div>
  </div>
</template>

<script>
import ProductionCard from "../components/ProductionCard";

export default {
  name: "UserInfoPage",
  components: {ProductionCard},
  props:["userId"],
  data(){
    return{
      user:{},
      productions:[1,2,3,4,5,6,7,8,9]
    }
  },
  beforeCreate() {
    this.user = this.$store.getters.getUser;
  },
  created() {
    if (this.user.userAccount == '' || this.user.userAccount == null){
      this.user.userId = this.userId
    }
    this.$axios.allProductions(this.user).then((response)=>{
      this.productions = response.data;
    }).catch((ero)=>{
      alert("数据查询失败")
    })
  }
}
</script>

<style scoped>
  .info-back{
    height: 250px
  }
  .head-image{
    border: 1px #ccc solid;
  }
  .head-image-position{
    margin: -50px 0px 20px;
  }
  .separator-width{
    width: 70%;
    margin: 8px auto;
  }
</style>
