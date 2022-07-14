import 'dart:convert';

import 'package:http/http.dart' as http;
import 'package:kredit_plus_test/models/product.dart';
import 'package:kredit_plus_test/utils/constants.dart';

class ProductService {

  ///fungsi untuk mengambil data dari api
  static Future<List<ProductModel>> fetchDataProduct(int limit, int page) async {
    String apiUrl = productAPI;

    var response = await http.get(Uri.parse(apiUrl+"?_limit=$limit&_page=$page"));

    if (response.statusCode == 200) {
      final jsonObject = jsonDecode(response.body);
      List<dynamic> allProduct = jsonObject;
      List<ProductModel> allDataProduct = [];
      for (var data in allProduct) {
        allDataProduct.add(ProductModel.fromJson(data));
      }
      return allDataProduct;
    } else {
      throw Exception("Gagal Mengambil Data Product!");
    }
  }
}


