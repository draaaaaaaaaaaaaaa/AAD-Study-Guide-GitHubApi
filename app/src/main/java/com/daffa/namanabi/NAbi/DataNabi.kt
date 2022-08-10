package com.daffa.namanabi.NAbi

import com.daffa.namanabi.Data.Nabi

object DataNabi {
    private val  namaNabi = arrayOf("Nabi Adam As",
        "Nabi Idris As",
        "Nabi Nuh As",
        "Nabi Hud As",
        "Nabi Shaleh As",
        "Nabi Ibramim As",
        "Nabi Luth As",
        "Nabi Ishaq As",
        "Nabi Yakub As",
        "Nabi Ayyub As",
        "Nabi Suaib As",
        "Nabi Musa As",
        "Nabi Harun As",
        "Nabi daud As",
        "Nabi Sulaiman As",
        "Nabi Ilyas As",
        "Nabi Yunus As",
        "Nabi Zakaria As",
        "Nabi yahya As",
        "Nabi Isa As",
        "Nabi Muhamad As"
    )

val listNabi : ArrayList<Nabi>
get() {
    val list = arrayListOf<Nabi>()
    for (position in namaNabi.indices){
       list.add(
           Nabi(
               name = namaNabi[position]
           )
       )
    }
    return  list
}

}