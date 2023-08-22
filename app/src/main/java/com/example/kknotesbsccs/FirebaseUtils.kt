package com.example.kknotesbsccs

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

object FirebaseUtils {
    private val firestore: FirebaseFirestore = Firebase.firestore

    fun getUserInfo(
        userId: String,
        onSuccess: (username: String, email: String) -> Unit,
        onFailure: (exception: Exception) -> Unit
    ): ListenerRegistration {
        val documentReference = firestore.collection("user").document(userId)
        return documentReference.addSnapshotListener { documentSnapshot, exception ->
            if (exception != null) {
                onFailure(exception)
                return@addSnapshotListener
            }

            if (documentSnapshot != null && documentSnapshot.exists()) {
                val username = documentSnapshot.getString("username") ?: ""
                val email = documentSnapshot.getString("email") ?: ""
                onSuccess(username, email)
            } else {
                onFailure(Exception("Document doesn't exist"))
            }
        }
    }
}
