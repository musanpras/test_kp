import 'package:flutter/material.dart';
import 'package:kredit_plus_test/components/cart_vertical.dart';
import 'package:kredit_plus_test/views/homepage.dart';

import 'components/card_horizontal.dart';
import 'package:get/get.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return GetMaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.yellow,
      ),
      home: HomePage(),
      debugShowCheckedModeBanner: false,
    );
  }
}




