package com.pankajkcodes.lifecycleobserver

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class Observer : DefaultLifecycleObserver {



    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d("MAIN","Observer: onCreate")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("MAIN","Observer: onResume")

    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("MAIN","Observer: onPause")
    }



    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d("MAIN","Observer: onDestroy")
    }
}
