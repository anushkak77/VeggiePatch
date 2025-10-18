import React, { useEffect, useState } from "react";
import { ProductCard } from "../ShopComponent/ProductCard";
import axiosFetch from "../../Helper/Axios";

export const ListProduct = () => {
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
  );
};
