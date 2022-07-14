import 'package:flutter/material.dart';
import 'package:kredit_plus_test/models/product.dart';

class CardHorizontal extends StatelessWidget {
   CardHorizontal({required this.product, Key? key}) : super(key: key);

  ProductModel? product;

  @override
  Widget build(BuildContext context) {
    return Card(
      shape: RoundedRectangleBorder(
        borderRadius: BorderRadius.circular(10),
        //set border radius more than 50% of height and width to make circle
      ),
      margin: EdgeInsets.only(bottom: 20),
      child: Container(
height: 140,
        width: 320,
        decoration: BoxDecoration(
            color: Colors.blue,
          borderRadius: BorderRadius.circular(10)
        ),
        child: Row(
          children: [
            Expanded(
              flex: 2,
              child: Container(
                width: 136,
                height: 140,
                decoration:  BoxDecoration(
                  color: Color(0xffC4C4C4),
                  image: DecorationImage(image:NetworkImage(product?.image ?? 'assets/assets/alucard.jpg'),
                  fit: BoxFit.fill,
                ),
                  borderRadius: BorderRadius.only(topLeft: Radius.circular(10), bottomLeft: Radius.circular(10))
                ),
                child: Padding(
                  padding: const EdgeInsets.symmetric(vertical: 10, horizontal: 8),
                  child:  Text("\$ ${product?.price.toString()}", style: TextStyle(backgroundColor: Colors.white,)),
                ),
              ),
            ),
            Expanded(
              flex: 3,
              child: Container(
                width: 320,
                height: 150,
                decoration: BoxDecoration(
                    color: Colors.white,
                    borderRadius: BorderRadius.only(topRight: Radius.circular(10), bottomRight: Radius.circular(10))

                ),
                padding: EdgeInsets.symmetric(horizontal: 14, vertical: 10),
                child: Column(
                  children: [
                     Text(product?.title ?? "",maxLines: 2,
                       overflow: TextOverflow.ellipsis, style: TextStyle(fontSize: 12, fontWeight: FontWeight.w700),),
                    const SizedBox(height: 20,),
                     Text(product?.description ?? "",
                      style: TextStyle(fontSize: 10, fontWeight: FontWeight.w400),
                      maxLines: 4,
                    overflow: TextOverflow.ellipsis,),
                    Align(
                        alignment: Alignment.centerRight,
                        child:  Text(" ★ ${product?.rating?.rate.toString()}",style: TextStyle(fontSize: 12, fontWeight: FontWeight.w700),)),
                  ],
                ),
              ),
            )
          ],
        ),
      ),
    );
  }
}
