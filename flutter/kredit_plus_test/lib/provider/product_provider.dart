
import 'package:get/get.dart';
import 'package:kredit_plus_test/models/product.dart';
import 'package:kredit_plus_test/services/product_service.dart';

class ProductController extends GetxController {
  ///state awal sebelum variable diisi data dari api
  List<ProductModel> product = RxList<ProductModel>([]);
  int page = 1;

  ///fungsi memanggil service get data product dari api dan inisialisasi ke variable product yang berupa list
  Future<void> getProductData(int limit) async {
    try {
      List data = await ProductService.fetchDataProduct(limit, page);
      product =  [...product, ...data];
      page++;
    } catch (e) {
      print(e);
    }
  }

}
