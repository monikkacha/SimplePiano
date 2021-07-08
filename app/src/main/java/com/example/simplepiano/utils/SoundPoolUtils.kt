package com.builders.simplepiano.utils

import android.media.AudioAttributes
import android.media.SoundPool
import com.builders.simplepiano.R
import com.builders.simplepiano.constants.AppController
import com.builders.simplepiano.constants.NoteConstants


class SoundPoolUtils {
    companion object {

        private lateinit var soundPool: SoundPool
        private lateinit var audioAttributes: AudioAttributes
        private var noteHashMap: HashMap<String, Int> = HashMap()

        fun init() {
            audioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build()

            soundPool = SoundPool.Builder()
                .setMaxStreams(3)
                .setAudioAttributes(audioAttributes)
                .build()

            setHashMap()
        }

        private fun setHashMap() {
            noteHashMap = HashMap()

            noteHashMap.put(NoteConstants.c3, soundPool.load(AppController.context, R.raw.c3, 1))
            noteHashMap.put(NoteConstants.d3, soundPool.load(AppController.context, R.raw.d3, 1))
            noteHashMap.put(NoteConstants.e3, soundPool.load(AppController.context, R.raw.e3, 1))
            noteHashMap.put(NoteConstants.f3, soundPool.load(AppController.context, R.raw.f3, 1))
            noteHashMap.put(NoteConstants.g3, soundPool.load(AppController.context, R.raw.g3, 1))
            noteHashMap.put(NoteConstants.a3, soundPool.load(AppController.context, R.raw.a3, 1))
            noteHashMap.put(NoteConstants.b3, soundPool.load(AppController.context, R.raw.b3, 1))

            noteHashMap.put(NoteConstants.c4, soundPool.load(AppController.context, R.raw.c4, 1))
            noteHashMap.put(NoteConstants.d4, soundPool.load(AppController.context, R.raw.d4, 1))
            noteHashMap.put(NoteConstants.e4, soundPool.load(AppController.context, R.raw.e4, 1))
            noteHashMap.put(NoteConstants.f4, soundPool.load(AppController.context, R.raw.f4, 1))
            noteHashMap.put(NoteConstants.g4, soundPool.load(AppController.context, R.raw.g4, 1))
            noteHashMap.put(NoteConstants.a4, soundPool.load(AppController.context, R.raw.a4, 1))
            noteHashMap.put(NoteConstants.b4, soundPool.load(AppController.context, R.raw.b4, 1))

            noteHashMap.put(NoteConstants.c5, soundPool.load(AppController.context, R.raw.c5, 1))
            noteHashMap.put(NoteConstants.d5, soundPool.load(AppController.context, R.raw.d5, 1))
            noteHashMap.put(NoteConstants.e5, soundPool.load(AppController.context, R.raw.e5, 1))
            noteHashMap.put(NoteConstants.f5, soundPool.load(AppController.context, R.raw.f5, 1))
            noteHashMap.put(NoteConstants.g5, soundPool.load(AppController.context, R.raw.g5, 1))
            noteHashMap.put(NoteConstants.a5, soundPool.load(AppController.context, R.raw.a5, 1))
            noteHashMap.put(NoteConstants.b5, soundPool.load(AppController.context, R.raw.b5, 1))

            noteHashMap.put(NoteConstants.c6, soundPool.load(AppController.context, R.raw.c6, 1))
            noteHashMap.put(NoteConstants.d6, soundPool.load(AppController.context, R.raw.d6, 1))
            noteHashMap.put(NoteConstants.e6, soundPool.load(AppController.context, R.raw.e6, 1))
            noteHashMap.put(NoteConstants.f6, soundPool.load(AppController.context, R.raw.f6, 1))
            noteHashMap.put(NoteConstants.g6, soundPool.load(AppController.context, R.raw.g6, 1))
            noteHashMap.put(NoteConstants.a6, soundPool.load(AppController.context, R.raw.a6, 1))
            noteHashMap.put(NoteConstants.b6, soundPool.load(AppController.context, R.raw.b6, 1))

            noteHashMap.put(NoteConstants.c7, soundPool.load(AppController.context, R.raw.c7, 1))
            noteHashMap.put(NoteConstants.d7, soundPool.load(AppController.context, R.raw.d7, 1))
            noteHashMap.put(NoteConstants.e7, soundPool.load(AppController.context, R.raw.e7, 1))
            noteHashMap.put(NoteConstants.f7, soundPool.load(AppController.context, R.raw.f7, 1))
            noteHashMap.put(NoteConstants.g7, soundPool.load(AppController.context, R.raw.g7, 1))
            noteHashMap.put(NoteConstants.a7, soundPool.load(AppController.context, R.raw.a7, 1))
            noteHashMap.put(NoteConstants.b7, soundPool.load(AppController.context, R.raw.b7, 1))

            noteHashMap.put(
                NoteConstants.c3_black,
                soundPool.load(AppController.context, R.raw.c3black, 1)
            )
            noteHashMap.put(
                NoteConstants.d3_black,
                soundPool.load(AppController.context, R.raw.d3black, 1)
            )
            noteHashMap.put(
                NoteConstants.f3_black,
                soundPool.load(AppController.context, R.raw.d3black, 1)
            )
            noteHashMap.put(
                NoteConstants.g3_black,
                soundPool.load(AppController.context, R.raw.g3black, 1)
            )
            noteHashMap.put(
                NoteConstants.a3_black,
                soundPool.load(AppController.context, R.raw.a3black, 1)
            )

            noteHashMap.put(
                NoteConstants.c4_black,
                soundPool.load(AppController.context, R.raw.c4black, 1)
            )
            noteHashMap.put(
                NoteConstants.d4_black,
                soundPool.load(AppController.context, R.raw.d4black, 1)
            )
            noteHashMap.put(
                NoteConstants.f4_black,
                soundPool.load(AppController.context, R.raw.d4black, 1)
            )
            noteHashMap.put(
                NoteConstants.g4_black,
                soundPool.load(AppController.context, R.raw.g4black, 1)
            )
            noteHashMap.put(
                NoteConstants.a4_black,
                soundPool.load(AppController.context, R.raw.a4black, 1)
            )

            noteHashMap.put(
                NoteConstants.c5_black,
                soundPool.load(AppController.context, R.raw.c5black, 1)
            )
            noteHashMap.put(
                NoteConstants.d5_black,
                soundPool.load(AppController.context, R.raw.d5black, 1)
            )
            noteHashMap.put(
                NoteConstants.f5_black,
                soundPool.load(AppController.context, R.raw.d5black, 1)
            )
            noteHashMap.put(
                NoteConstants.g5_black,
                soundPool.load(AppController.context, R.raw.g5black, 1)
            )
            noteHashMap.put(
                NoteConstants.a5_black,
                soundPool.load(AppController.context, R.raw.a5black, 1)
            )

            noteHashMap.put(
                NoteConstants.c6_black,
                soundPool.load(AppController.context, R.raw.c6black, 1)
            )
            noteHashMap.put(
                NoteConstants.d6_black,
                soundPool.load(AppController.context, R.raw.d6black, 1)
            )
            noteHashMap.put(
                NoteConstants.f6_black,
                soundPool.load(AppController.context, R.raw.d6black, 1)
            )
            noteHashMap.put(
                NoteConstants.g6_black,
                soundPool.load(AppController.context, R.raw.g6black, 1)
            )
            noteHashMap.put(
                NoteConstants.a6_black,
                soundPool.load(AppController.context, R.raw.a6black, 1)
            )

            noteHashMap.put(
                NoteConstants.c7_black,
                soundPool.load(AppController.context, R.raw.c7black, 1)
            )
            noteHashMap.put(
                NoteConstants.d7_black,
                soundPool.load(AppController.context, R.raw.d7black, 1)
            )
            noteHashMap.put(
                NoteConstants.f7_black,
                soundPool.load(AppController.context, R.raw.d7black, 1)
            )
            noteHashMap.put(
                NoteConstants.g7_black,
                soundPool.load(AppController.context, R.raw.g7black, 1)
            )
            noteHashMap.put(
                NoteConstants.a7_black,
                soundPool.load(AppController.context, R.raw.a7black, 1)
            )

        }

        fun play(key: String) {
            var note = getNote(key)
            soundPool.play(note!!, 1F, 1F, 0, 0, 1F)
        }

        private fun getNote(key: String): Int? = noteHashMap[key]
    }
}