
fun main() {
    val post1 =  Post(1,
        5,
        1,
        12,
        1,
        "1",
        1,
        1,
        1,
        2,
        1,
        5,
        1,
        2,
        "1",
        1,
        true,
        true,
        true,
        1,
        true,
        true,
        1,
        1
    )
    val post2 =  Post(2,
        5654,
        15345,
        1245,
        1754324,
        "1456787654",
        451,
        145,
        154,
        2325,
        4531,
        644,
        143,
        2443,
        "1342",
        1,
        true,
        false,
        false,
        1,
        false,
        true,
        1,
        1
    )
    val post3 =  Post(3,
        543243,
        1323,
        1234,
        12344634,
        "34534656",
        4,
        3,
        4,
        68,
        3425,
        90,
        45,
        78,
        "4745745",
        6,
        true,
        false,
        true,
        1,
        false,
        true,
        2,
        3
    )

        println(WallService.add(post1))
        println(WallService.add(post2))
        println(WallService.add(post3))
        println(WallService.update(WallService.posts.component1()))
}