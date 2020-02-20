<template>
  <div class="q-pa-lg">
    <q-form
      @submit="onSubmit"
      class="q-gutter-md"
    >
      <q-input
        filled
        v-model="user.userAccount"
        label="帐号"
        lazy-rules
        :rules="[ val => val && val.length > 0 || '请输入帐号']"
      />

      <q-input
        filled
        type="password"
        v-model="user.userPwd"
        label="密码"
        lazy-rules
        :rules="[
          val => val !== null && val !== '' || '请输入密码'
        ]"
      />

      <q-input
        filled
        type="password"
        v-model="user.userNickName"
        label="昵称"
        lazy-rules
        :rules="[
          val => val !== null && val !== '' || '请输入昵称'
        ]"
      />

      <div>
        <q-btn label="注册" type="submit" color="primary" class="q-mr-lg"/>
        <router-link v-bind:to="{path:'/user/login'}">已经有帐号？</router-link>
      </div>
    </q-form>

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
      this.$services.register(this.user).then((response) => {
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
