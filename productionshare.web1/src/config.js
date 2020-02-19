export default {
  baseUrl: process.env.NODE_ENV == 'development' ? "http://127.0.0.1:8080/":"../",
  index:  process.env.NODE_ENV == 'development' ? "/index.html" : "../manager/index"
}
