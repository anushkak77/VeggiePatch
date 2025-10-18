import React, { useEffect, useState } from "react";
import { ProductCard } from "../ShopComponent/ProductCard";
import axiosFetch from "../../Helper/Axios";

export const ListProduct = () => {
<<<<<<< HEAD
  const [data, setData] = useState([]); // initialize as empty array

  const fetchData = async () => {
  const data = await axiosFetch({
    url: "product/",
    method: "GET",
  });

  console.log("Fetched products:", data);
  setData(Array.isArray(data) ? data : []); // ✅ Always safe
};

  useEffect(() => {
    fetchData();
  }, []);

  return (
    <section id="products" className="section product">
      <div className="container">
        <p className="section-subtitle">-- VeggiePatch Products --</p>
        <h2 className="h2 section-title">All Organic Products</h2>

        <ul className="grid-list">
          {Array.isArray(data) && data.length > 0 ? (
            data.map((item) => (
              <ProductCard
                key={item.productid}
                id={item.productid}
                name={item.productName}
                description={item.description}
                price={item.price}
                img={item.img}
              />
            ))
          ) : (
            <p>No products available.</p>
          )}
        </ul>
      </div>
    </section>
=======
  const[token,setToken]=useState(sessionStorage.getItem("token"));
  
  const[data,setData]=useState([]);
  const fatchData = async () => {
  
    const response = await axiosFetch({
      "url":"product/",
      "method":"GET",
    });
    
    // const
    console.log(response.data);
    setData(response.data);
  };


  
  useEffect(() => {
    fatchData();
  }, []);

  
  return (
    <>
      <section id="products" className="section product">
        <div className="container">
          <p className="section-subtitle"> -- Organic Products --</p>
          <h2 className="h2 section-title">All Organic Products</h2>
          <ul className="filter-list">
            <li>
              <button className="filter-btn active">
                <img
                  src="./images/filter-1.png"
                  width={20}
                  alt=""
                  className="default"
                />
                <img
                  src="./images/filter-1-active.png"
                  width={20}
                  alt=""
                  className="color"
                />
                <p className="filter-text">Fresh Vegetables</p>
              </button>
            </li>
            <li>
              <button className="filter-btn">
                <img
                  src="./images/filter-2.png"
                  width={20}
                  alt=""
                  className="default"
                />
                <img
                  src="./images/filter-2-active.png"
                  width={20}
                  alt=""
                  className="color"
                />
                <p className="filter-text">Fish &amp; Meat</p>
              </button>
            </li>
            <li>
              <button className="filter-btn">
                <img
                  src="./images/filter-3.png"
                  width={20}
                  alt=""
                  className="default"
                />
                <img
                  src="./images/filter-3-active.png"
                  width={20}
                  alt=""
                  className="color"
                />
                <p className="filter-text">Healthy Fruit</p>
              </button>
            </li>
            <li>
              <button className="filter-btn">
                <img
                  src="./images/filter-1.png"
                  width={20}
                  alt=""
                  className="default"
                />
                <img
                  src="./images/filter-1-active.png"
                  width={20}
                  alt=""
                  className="color"
                />
                <p className="filter-text">Dairy Products</p>
              </button>
            </li>
          </ul>
          <ul className="grid-list">
            {data.map((item) => 

               <ProductCard key={item.productid} id={item.productid} name={item.productName} description={item.description} price={item.price} img={item.img} />
            
            
        
            )}
          </ul>
        </div>
      </section>
    </>
>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
  );
};
