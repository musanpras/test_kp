package com.dicoding.mylearningapps

object ProLangData {
    private val proLangNames = arrayOf(
        "Python",
        "C#",
        "C++",
        "Javascript",
        "PHP",
        "Swift",
        "Java",
        "Go",
        "SQL",
        "Ruby",
    )

    private val proLangLevels = arrayOf(
        "Beginner",
        "Beginner dan Intermediate",
        "Expert",
        "Beginner",
        "Intermediate",
        "Beginner",
        "Intermediate",
        "Beginner",
        "Intermediate",
        "Expert",
    )

    private val proLangImages = intArrayOf(R.drawable.python,
        R.drawable.c_sharp,
        R.drawable.cpp,
        R.drawable.javascript,
        R.drawable.php,
        R.drawable.swift,
        R.drawable.java,
        R.drawable.golang,
        R.drawable.sql,
        R.drawable.ruby)

    private val proLangDescs = arrayOf(
        "Python adalah bahasa pemrograman tingkat tinggi yang bisa digunakan untuk berbagai tujuan. Bahasa ini bisa digunakan untuk berbagai task, mulai dari analisis dan visualisasi data hingga pengembangan website, prototype, dan otomatisasi.",
        "C# adalah salah satu bahasa pemrograman terbaik karena performanya cepat dan lebih stabil. Bahasa coding ini juga lebih mudah daripada pendahulunya, C dan C++, karena memiliki sintaksis yang simpel dan hierarki class yang tersusun dengan baik.",
        "C++ adalah versi yang lebih tinggi dari C dan menjadi salah satu bahasa pemrograman terpopuler dalam computer science. Selain itu, C++ memiliki fungsi yang serbaguna sehingga menjadi salah satu yang terbaik untuk dipelajari.",
        "Selain HTML dan CSS, JavaScript menjadi bahasa pemrograman terbaik untuk dipelajari apabila Anda tertarik dengan front-end web. 97,8% dari semua website menggunakan JavaScript untuk skrip sisi kliennya, sehingga bahasa ini menjadi yang paling populer untuk tujuan pengembangan tersebut.",
        "PHP adalah salah satu bahasa back-end pertama yang penting untuk dipelajari menurut sejumlah web developer. Selain itu, PHP digunakan oleh 78,1% dari semua website karena merupakan bahasa utama untuk WordPress.",
        "Swift adalah salah satu bahasa pemrograman yang paling baru di industri ini. Saat pertama kali diluncurkan, Swift menjadi alternatif untuk Objective-C, yang merupakan bahasa utama produk Apple. Developer beralih ke Swift karena menawarkan fitur-fitur modern, seperti pemrograman konkuren (concurrent) dan pengelolaan memori otomatis. Swift juga lebih mudah ditulis dan lebih cepat daripada Objective-C.",
        "Java adalah bahasa pemrograman dengan hak milik yang dipegang oleh Oracle. Java merupakan bahasa programming tingkat tinggi yang serbaguna, memungkinkan coder untuk membuat semua jenis aplikasi dengan mudah.",
        "Go atau Golang dibuat untuk mengembangkan API, aplikasi desktop berbasis GUI, dan aplikasi web. Meskipun tergolong masih baru, Go menjadi salah satu bahasa pemrograman yang berkembang paling cepat.",
        "Structured Query Language (SQL) adalah bahasa pemrograman yang paling cocok dipelajari kalau Anda tertarik dengan data science dan komputasi statistik. SQL merupakan bahasa khusus domain, memungkinkan programmer membuat kueri, memanipulasi, dan menganalisis data yang disimpan dalam database relasional.",
        "Ruby adalah bahasa pemrograman open-source populer lainnya. Bahasa ini biasanya digunakan untuk pengembangan aplikasi web, tapi programmer juga bisa menggunakannya untuk analisis data dan pembuatan prototype.",
    )

    val listProlang: ArrayList<ProLang>
        get(){
            val list = arrayListOf<ProLang>()
            for(index in proLangNames.indices){
                val prolang = ProLang()
                prolang.name = proLangNames[index]
                prolang.image = proLangImages[index]
                prolang.level = proLangLevels[index]
                prolang.desc = proLangDescs[index]
                list.add(prolang)
            }
            return list
        }
}





