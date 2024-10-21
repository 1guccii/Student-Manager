package com.j4kerstudio.studentmanager.data.model

import kotlinx.coroutines.flow.Flow



class OfflineItemsRepository(private val itemDao: StudentDao) : ItemsRepository {
    override fun getAllItemsStream(): Flow<List<Student>> = itemDao.getAllItems()

    override fun getItemStream(id: Int): Flow<Student?> = itemDao.getItem(id)

    override suspend fun insertItem(item: Student) = itemDao.insert(item)

    override suspend fun deleteItem(item: Student) = itemDao.delete(item)

    override suspend fun updateItem(item: Student) = itemDao.update(item)
}