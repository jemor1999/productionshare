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

        <b-button type="submit" variant="primary">登录</b-button>
      </b-form>
      <br>
      <br>
      <router-link v-bind:to="{path:'/user/register'}">还没有注册？</router-link>
    </div>
  </div>

</template>

<script>
export default {
  name: 'LoginForm',
  data() {
    return {
      user:this.$store.getters.getUser
    }
  },
  methods: {
    onSubmit(evt) {
      evt.preventDefault()

    }
  }
}
</script>

<style scoped>

</style>
