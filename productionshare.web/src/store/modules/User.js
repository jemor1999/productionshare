// 可以模块划分

const state = {
  userId:'1',
  userAccount:'2',
  userPwd:'3',
  userNickName:'5',
  userSignature:'',
  userSex:'',
  userHeadImageLocation:''
}

// getters
const getters = {
  getUser:(state) => {
    return state.user
  }
}

// actions
const actions = {

}

// mutations
const mutations = {

}

export default {
  state,
  getters,
  actions,
  mutations
}
