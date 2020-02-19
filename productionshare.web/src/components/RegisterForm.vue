<template>
<div class="row">
  <div class="col-4 offset-4">
    <b-form @submit="onSubmit" class="text-left">

      <b-form-input
        id="input-account"
        v-model="user.userAccount"
        type="text"
        required
        placeholder="帐号"
      ></b-form-input>
      <br>

      <b-form-input
        id="input-pwd"
        v-model="user.userPwd"
        type="password"
        required
        placeholder="密码"
      ></b-form-input>
      <br>

      <b-form-input
        id="input-nick-name"
        v-model="user.userNickName"
        type="text"
        required
        placeholder="昵称"
      ></b-form-input>
      <br>

      <b-button type="submit" variant="primary">注册</b-button>
    </b-form>
    <br>
    <br>
    <router-link v-bind:to="{path:'/user/login'}">已经有帐号？</router-link>
  </div>
</div>
</template>

<script>
export default {
  name: "RegisterForm",
  data() {
    return {
      user:this.$store.getters.getUser
    }
  },
  methods: {
    onSubmit(evt) {
      evt.preventDefault()
      this.$services.login(this.user).then((response) => {
        this.$store.dispatch('login',response.data);
      }).catch((ero) => {
        alert("注册失败！")
      })
    }
  }
}
</script>

<style scoped>

</style>
