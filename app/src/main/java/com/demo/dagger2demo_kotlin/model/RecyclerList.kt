package com.demo.dagger2demo_kotlin.model


data class RecyclerList(val data: List<RecyclerData>,
                        val page: Int,
                        val per_page: Int,
                        val support: Owner,
                        val total: Int,
                        val total_pages: Int)



data class RecyclerData(val avatar: String,
                        val email: String,
                        val first_name: String,
                        val id: Int,
                        val last_name: String)

data class Owner1(val avatar_url: String?)

data class Owner( val text: String,
                  val url: String)
