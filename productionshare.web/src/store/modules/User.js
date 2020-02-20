// 可以模块划分

const state = {
  userId:'',
  userAccount:'',
  userPwd:'',
  userNickName:'',
  userSignature:'',
  userSex:'',
  userHeadImageLocation:''
}

// getters
const getters = {
  'getUser':(state) => {
    return state
  }
}

// actions
const actions = {
  'login':(context,user)=> {
    context.commit('login',user)
  }
}

// mutations
const mutations = {
  'login':(state,user) => {
    state.userId=user.userId
    state.userAccount= user.userAccount
    state.userPwd= user.userPwd
    state.userNickName= user.userNickName,
    state.userSignature= user.userSignature
    state.userSex= user.userSex
    state.userHeadImageLocation= user.userHeadImageLocation
  }
}

export default {
  state,
  getters,
  actions,
  mutations
}
