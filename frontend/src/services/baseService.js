import axios from 'axios';

function get(url) {
  console.log("in get");
  return axios.get("http://localhost:5678" + url)
    .then(response => {
      console.log(response.data);
      return response.data;
    });
}

function post(url) {
  console.log("in get");
  return axios.post("http://localhost:5678/items", { url: url })
    .then(response => {
      console.log(response.data);
      return response.data;
    });
}

export default { get, post };