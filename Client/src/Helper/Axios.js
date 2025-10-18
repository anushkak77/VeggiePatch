import axios from "axios";

const axiosFetch = async ({ url, method, data = null }) => {
  try {
    const token = sessionStorage.getItem("token") ?? "";
    const response = await axios.request({
      url: `http://localhost:9090/${url}`,
      method,
      data,
      headers: {
        Authorization: token ? `Bearer ${token}` : "",
      },
    });

    return response.data; // ✅ only return actual data
  } catch (err) {
    console.error("API Error:", err.message);
    return []; // ✅ fallback empty array so .map() never breaks
  }
};

export default axiosFetch;
