import 'package:flutter/material.dart';

class CardVertical extends StatelessWidget {
  const CardVertical({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Card(
      child: Container(
        width: 151,
        height: 228,
        decoration: BoxDecoration(
            color: Colors.red,
            borderRadius: BorderRadius.circular(10)
        ),
        child: Column(
          children: [
            Expanded(
              flex: 2,
              child: Container(
                width: 151,
                height: 107,
                decoration: const BoxDecoration(
                    color: Color(0xffC4C4C4),
                    borderRadius: BorderRadius.only(topLeft: Radius.circular(10), topRight: Radius.circular(10))
                ),
                child: Padding(
                  padding: const EdgeInsets.symmetric(vertical: 10, horizontal: 8),
                  child: const Text(r"$ 55.99"),
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
                    borderRadius: BorderRadius.only(bottomLeft: Radius.circular(10), bottomRight: Radius.circular(10))

                ),
                padding: EdgeInsets.symmetric(horizontal: 14, vertical: 10),
                child: Column(
                  children: [
                    const Text("Mens Casual Premium Slim Fit T-Shirts", style: TextStyle(fontSize: 12, fontWeight: FontWeight.w700),),
                    const SizedBox(height: 20,),
                    const Text(
                      "Slim-fitting style, contrast raglan long sleeve, three-button henley placket, light weight & soft fabric for breathable and ...",
                      style: TextStyle(fontSize: 10, fontWeight: FontWeight.w400),
                      maxLines: 4,
                      overflow: TextOverflow.ellipsis,),
                    Align(
                        alignment: Alignment.centerRight,
                        child: const Text(" ★ 4.1",style: TextStyle(fontSize: 12, fontWeight: FontWeight.w700),)),
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
