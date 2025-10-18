import axios from "axios";
<<<<<<< HEAD

const axiosFetch = async ({ url, method, data = null }) => {
  try {
    const token = sessionStorage.getItem("token") ?? "";
    const response = await axios.request({
      url: `http://localhost:9090/${url}`,
      method,
      data,
=======
const axiosFetch = async ({ url, method, data = null }) => {
  //api to fetch data from postman mock server
  try {
    // axios.get("dsa", {});
    console.log("error");
    // const token = JSON.parse(sessionStorage.getItem("user") ?? "{}").token;
    const token = sessionStorage.getItem("token") ?? "{}";
    console.log(token);
    const response = await axios.request({
      url: "http://localhost:9090/" + url,
      method,
      data: data,
>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
      headers: {
        Authorization: token ? `Bearer ${token}` : "",
      },
    });
<<<<<<< HEAD

    return response.data; // ✅ only return actual data
  } catch (err) {
    console.error("API Error:", err.message);
    return []; // ✅ fallback empty array so .map() never breaks
=======
    return response;
  } catch (err) {
    return err;
>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
  }
};

export default axiosFetch;
