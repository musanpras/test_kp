import 'package:flutter/material.dart';
import 'package:get/get.dart';
// import 'package:infinite_scroll_pagination/infinite_scroll_pagination.dart';
import 'package:kredit_plus_test/components/card_horizontal.dart';
import 'package:kredit_plus_test/provider/product_provider.dart';

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  final ProductController controller = Get.put(ProductController());

  final scrollController = ScrollController();

  @override
  void initState(){

    super.initState();
    initData();
    scrollController.addListener(() {
      if(scrollController.position.maxScrollExtent == scrollController.offset){
        initData();

      }
    });
  }

  Future<void> initData() async{
    var limit = 4;
    await controller.getProductData(limit);
  }

  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      body: SafeArea(child: ListView(
        // shrinkWrap: true,
        children: [
          SizedBox(
            width: MediaQuery.of(context).size.width,
            height: MediaQuery.of(context).size.height,
            child: ListView.builder(
                controller: scrollController,
                physics: const BouncingScrollPhysics(),
                padding: const EdgeInsets.all(30),
                itemCount: controller.product.length,
                itemBuilder: (ctx, i) {
                  return CardHorizontal(product: controller.product[i]);

                },
              ),
            ),]
          ),)
    );
  }

}