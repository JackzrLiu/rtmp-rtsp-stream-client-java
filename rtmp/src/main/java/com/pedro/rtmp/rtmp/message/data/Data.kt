package com.pedro.rtmp.rtmp.message.data

import com.pedro.rtmp.rtmp.chunk.ChunkStreamId
import com.pedro.rtmp.rtmp.chunk.ChunkType
import com.pedro.rtmp.rtmp.message.BasicHeader
import com.pedro.rtmp.rtmp.message.RtmpMessage
import java.io.InputStream

/**
 * Created by pedro on 21/04/21.
 */
abstract class Data: RtmpMessage(BasicHeader(ChunkType.TYPE_0, ChunkStreamId.OVER_CONNECTION)) {

  override fun readBody(input: InputStream) {
    TODO("Not yet implemented")
  }

  override fun storeBody(): ByteArray {
    TODO("Not yet implemented")
  }

  override fun getSize(): Int {
    TODO("Not yet implemented")
  }
}