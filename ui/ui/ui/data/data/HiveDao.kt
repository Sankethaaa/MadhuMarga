package com.example.madhumarga.data

interface HiveDao {
    fun getAll(): List<Hive>
    fun insert(hive: Hive)
}
