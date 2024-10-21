package com.j4kerstudio.studentmanager.data.model

import kotlinx.coroutines.flow.Flow


interface ItemsRepository {
    /**
     * Retrieve all the items from the the given data source.
     */
    fun getAllItemsStream(): Flow<List<Student>>

    /**
     * Retrieve an item from the given data source that matches with the [id].
     */
    fun getItemStream(id: Int): Flow<Student?>

    /**
     * Insert item in the data source
     */
    suspend fun insertItem(item: Student)

    /**
     * Delete item from the data source
     */
    suspend fun deleteItem(item: Student)

    /**
     * Update item in the data source
     */
    suspend fun updateItem(item: Student)
}