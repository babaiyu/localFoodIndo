package com.example.localfoodindo

object dataFood {
    private var data = arrayOf(
        arrayOf(
            "Rendang",
            "Rendang is an Indonesian spicy red meat dish originating from the Minangkabau people of Indonesia. It has spread across Indonesia to the cuisines of neighbouring Southeast Asian countries",
            "https://cdn2.tstatic.net/tribunnews/foto/bank/images/rendang-daging.jpg",
            "23.000"
        ),
        arrayOf(
            "Soto",
            "Soto is a traditional Indonesian soup mainly composed of broth, meat, and vegetables. Many traditional soups are called soto, whereas foreign and Western influenced soups are called sop. Soto is sometimes considered Indonesia's national dish, as it is served from Sumatra to Papua, in a wide range of variations.",
            "https://citarasaindonesia.co.id/uploads/media/recipe/0001/03/thumb_2869_recipe_detail.jpeg",
            "13.000"
        ),
        arrayOf(
            "Gudeg",
            "Gudeg is a traditional Javanese cuisine from Yogyakarta and Central Java, Indonesia. Gudeg is made from young unripe jack fruit stewed for several hours with palm sugar, and coconut milk.",
            "https://akcdn.detik.net.id/community/media/visual/2018/05/07/4d726331-5dd1-415a-ba04-26add776620a.jpeg",
            "10.000"
        ),
        arrayOf(
            "Satay",
            "Satay, or sate in Indonesian spelling, is a Southeast Asian dish of seasoned, skewered and grilled meat, served with a sauce. It is a dish from Indonesia, and popular in Malaysia, Singapore, Thailand, and Brunei.",
            "https://cdn2.tstatic.net/tribunnews/foto/bank/images/sate-kambing_20180821_201041.jpg",
            "35.000"
        ),
        arrayOf(
            "Ketoprak",
            "Ketoprak is a vegetarian dish from Jakarta, Indonesia, consists of tofu, vegetables and rice cake, rice vermicelli served in peanut sauce.",
            "https://www.masakapahariini.com/wp-content/uploads/2018/08/ketoprak-MAHI-6-1200x720.jpg",
            "10.000"
        ),
        arrayOf(
            "Gado-Gado",
            "Gado-gado, also known as Lotek, is an Indonesian salad of slightly boiled, blanched or steamed vegetables and hard-boiled eggs, boiled potato, fried tofu and tempeh, and lontong, served with a peanut sauce dressing. In 2018, gado-gado is promoted as one of 5 national dishes of Indonesia.",
            "https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2016/05/gado-gado-salad.jpg",
            "10.000"
        ),
        arrayOf(
            "Bakso",
            "Bakso or baso is an Indonesian meatball, or a meat paste made from beef surimi. Its texture is similar to the Chinese beef ball, fish ball, or pork ball. The word bakso may refer to a single meatball or the complete dish of meatball soup.",
            "https://akcdn.detik.net.id/community/media/visual/2018/08/27/774b2584-2da7-429e-b3aa-8a4a4561b974.jpeg",
            "20.000"
        ),
        arrayOf(
            "Tongseng",
            "Tongseng is a Southeast Asian goat meat, mutton or beef stew dish in curry-like soup with vegetables and kecap manis. Tongseng is commonly found in Indonesian region of Central Java; from Surakarta to Yogyakarta. However, it is believed that dish was originated from Klego district in Boyolali, Central Java.",
            "https://i0.wp.com/resepkoki.id/wp-content/uploads/2017/02/Resep-Tongseng-kambing.jpg",
            "17.500"
        ),
        arrayOf(
            "Opor Ayam",
            "Opor Ayam is a Indonesian dish consisting of chicken cooked in coconut milk from Central Java. Spice mixture include galangal, lemongrass, cinnamon, tamarind juice, palm sugar, coriander, cumin, candlenut, garlic, shallot, and pepper",
            "https://cdn2.tstatic.net/kaltim/foto/bank/images/opor-ayam-lezat.jpg",
            "9.000"
        ),
        arrayOf(
            "Tempe",
            "Tempe or tempe is a traditional Indonesian soy product, that is made from fermented soybeans. It is made by a natural culturing and controlled fermentation process that binds soybeans into a cake form.",
            "https://upload.wikimedia.org/wikipedia/commons/2/21/Indonesian_fried_tempeh.JPG",
            "3.000"
        )
    )
    val listData: ArrayList<Food>
        get() {
            val list = ArrayList<Food>()
            for (item in data) {
                val food = Food()
                food.name = item[0]
                food.description = item[1]
                food.image = item[2]
                food.price = item[3]
                list.add(food)
            }
            return list
        }
}