package org.ticket.com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
{
  "name": "string",
  "description": "string",
  "price": "number",
  "category": "string",
  "image": "string"
}

 */
@Getter
@Setter
@NoArgsConstructor
public class ProductCreateDto {

    private String name;

    private String description;

    private double price;

    private String category;

    private String image;

}
