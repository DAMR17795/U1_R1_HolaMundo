package www.iesmurgi.u1_r1_holamundo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LIFECICLE" , "onCreate Daniel")
    }

    @Override
    override  fun onDestroy() {
        super.onDestroy()
        Log.i("LIFECICLE", "onDestroy Daniel")
    }

    @Override
    override  fun  onPause() {
        // TODO Auto-generated method stub
        super.onPause()
        Log.i("LIFECICLE", "onPause Daniel")
    }

    @Override
    override  fun  onPostResume() {
        // TODO Auto-generated method stub
        super.onPostResume()
        Log.i("LIFECICLE", "onPostResume Daniel")
    }

    @Override
    override fun onRestart() {
        // TODO Auto-generated method stub
        super.onRestart()
        Log.i("LIFECICLE", "onRestart Daniel")
    }

    @Override
    override fun onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.i("LIFECICLE", "onResume Daniel");
    }

    @Override
    override fun onStart() {
        // TODO Auto-generated method stub
        super.onStart()
        Log.i("LIFECICLE", "onStart Daniel")
    }

    @Override
    override fun onStop() {
        // TODO Auto-generated method stub
        super.onStop()
        Log.i("LIFECICLE", "onStop Daniel")
    }

}