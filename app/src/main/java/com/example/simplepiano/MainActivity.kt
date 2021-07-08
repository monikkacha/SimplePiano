package com.builders.simplepiano

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.builders.simplepiano.constants.NoteConstants
import com.builders.simplepiano.utils.SoundPoolUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        setOnClick()
        setScrollView()
    }

    private fun setScrollView() {
        fast_rewind_LL.setOnClickListener {
            horizontal_scrollview.scrollTo(horizontal_scrollview.scrollX - 800 , horizontal_scrollview.scrollX)
        }
        skip_previous_ll.setOnClickListener {
            horizontal_scrollview.scrollTo(horizontal_scrollview.scrollX - 300 , horizontal_scrollview.scrollX)
        }
        fast_forward_LL.setOnClickListener {
            horizontal_scrollview.scrollTo(horizontal_scrollview.scrollX + 800 , horizontal_scrollview.scrollX)
        }
        skip_next_ll.setOnClickListener {
            horizontal_scrollview.scrollTo(horizontal_scrollview.scrollX + 300 , horizontal_scrollview.scrollX)
        }
    }

    private fun setOnClick() {

        c3.setOnClickListener { SoundPoolUtils.play(NoteConstants.c3) }
        d3.setOnClickListener { SoundPoolUtils.play(NoteConstants.d3) }
        e3.setOnClickListener { SoundPoolUtils.play(NoteConstants.e3) }
        f3.setOnClickListener { SoundPoolUtils.play(NoteConstants.f3) }
        g3.setOnClickListener { SoundPoolUtils.play(NoteConstants.g3) }
        a3.setOnClickListener { SoundPoolUtils.play(NoteConstants.a3) }
        b3.setOnClickListener { SoundPoolUtils.play(NoteConstants.b3) }

        c4.setOnClickListener { SoundPoolUtils.play(NoteConstants.c4) }
        d4.setOnClickListener { SoundPoolUtils.play(NoteConstants.d4) }
        e4.setOnClickListener { SoundPoolUtils.play(NoteConstants.e4) }
        f4.setOnClickListener { SoundPoolUtils.play(NoteConstants.f4) }
        g4.setOnClickListener { SoundPoolUtils.play(NoteConstants.g4) }
        a4.setOnClickListener { SoundPoolUtils.play(NoteConstants.a4) }
        b4.setOnClickListener { SoundPoolUtils.play(NoteConstants.b4) }

        c5.setOnClickListener { SoundPoolUtils.play(NoteConstants.c5) }
        d5.setOnClickListener { SoundPoolUtils.play(NoteConstants.d5) }
        e5.setOnClickListener { SoundPoolUtils.play(NoteConstants.e5) }
        f5.setOnClickListener { SoundPoolUtils.play(NoteConstants.f5) }
        g5.setOnClickListener { SoundPoolUtils.play(NoteConstants.g5) }
        a5.setOnClickListener { SoundPoolUtils.play(NoteConstants.a5) }
        b5.setOnClickListener { SoundPoolUtils.play(NoteConstants.b5) }

        c6.setOnClickListener { SoundPoolUtils.play(NoteConstants.c6) }
        d6.setOnClickListener { SoundPoolUtils.play(NoteConstants.d6) }
        e6.setOnClickListener { SoundPoolUtils.play(NoteConstants.e6) }
        f6.setOnClickListener { SoundPoolUtils.play(NoteConstants.f6) }
        g6.setOnClickListener { SoundPoolUtils.play(NoteConstants.g6) }
        a6.setOnClickListener { SoundPoolUtils.play(NoteConstants.a6) }
        b6.setOnClickListener { SoundPoolUtils.play(NoteConstants.b6) }

        c7.setOnClickListener { SoundPoolUtils.play(NoteConstants.c7) }
        d7.setOnClickListener { SoundPoolUtils.play(NoteConstants.d7) }
        e7.setOnClickListener { SoundPoolUtils.play(NoteConstants.e7) }
        f7.setOnClickListener { SoundPoolUtils.play(NoteConstants.f7) }
        g7.setOnClickListener { SoundPoolUtils.play(NoteConstants.g7) }
        a7.setOnClickListener { SoundPoolUtils.play(NoteConstants.a7) }
        b7.setOnClickListener { SoundPoolUtils.play(NoteConstants.b7) }

        c3_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.c3_black) }
        d3_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.d3_black) }
        f3_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.f3_black) }
        g3_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.g3_black) }
        a3_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.a3_black) }

        c4_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.c4_black) }
        d4_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.d4_black) }
        f4_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.f4_black) }
        g4_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.g4_black) }
        a4_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.a4_black) }

        c5_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.c5_black) }
        d5_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.d5_black) }
        f5_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.f5_black) }
        g5_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.g5_black) }
        a5_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.a5_black) }

        c6_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.c6_black) }
        d6_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.d6_black) }
        f6_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.f6_black) }
        g6_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.g6_black) }
        a6_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.a6_black) }

        c7_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.c7_black) }
        d7_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.d7_black) }
        f7_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.f7_black) }
        g7_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.g7_black) }
        a7_black.setOnClickListener { SoundPoolUtils.play(NoteConstants.a7_black) }
    }
}