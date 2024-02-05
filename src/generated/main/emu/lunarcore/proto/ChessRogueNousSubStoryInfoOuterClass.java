// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ChessRogueNousSubStoryInfoOuterClass {
  /**
   * Protobuf type {@code ChessRogueNousSubStoryInfo}
   */
  public static final class ChessRogueNousSubStoryInfo extends ProtoMessage<ChessRogueNousSubStoryInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 sub_story_id = 4;</code>
     */
    private int subStoryId;

    private ChessRogueNousSubStoryInfo() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueNousSubStoryInfo}
     */
    public static ChessRogueNousSubStoryInfo newInstance() {
      return new ChessRogueNousSubStoryInfo();
    }

    /**
     * <code>optional uint32 sub_story_id = 4;</code>
     * @return whether the subStoryId field is set
     */
    public boolean hasSubStoryId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 sub_story_id = 4;</code>
     * @return this
     */
    public ChessRogueNousSubStoryInfo clearSubStoryId() {
      bitField0_ &= ~0x00000001;
      subStoryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 sub_story_id = 4;</code>
     * @return the subStoryId
     */
    public int getSubStoryId() {
      return subStoryId;
    }

    /**
     * <code>optional uint32 sub_story_id = 4;</code>
     * @param value the subStoryId to set
     * @return this
     */
    public ChessRogueNousSubStoryInfo setSubStoryId(final int value) {
      bitField0_ |= 0x00000001;
      subStoryId = value;
      return this;
    }

    @Override
    public ChessRogueNousSubStoryInfo copyFrom(final ChessRogueNousSubStoryInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        subStoryId = other.subStoryId;
      }
      return this;
    }

    @Override
    public ChessRogueNousSubStoryInfo mergeFrom(final ChessRogueNousSubStoryInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSubStoryId()) {
        setSubStoryId(other.subStoryId);
      }
      return this;
    }

    @Override
    public ChessRogueNousSubStoryInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      subStoryId = 0;
      return this;
    }

    @Override
    public ChessRogueNousSubStoryInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueNousSubStoryInfo)) {
        return false;
      }
      ChessRogueNousSubStoryInfo other = (ChessRogueNousSubStoryInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasSubStoryId() || subStoryId == other.subStoryId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(subStoryId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(subStoryId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueNousSubStoryInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // subStoryId
            subStoryId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.subStoryId, subStoryId);
      }
      output.endObject();
    }

    @Override
    public ChessRogueNousSubStoryInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 929098384:
          case 1899516868: {
            if (input.isAtField(FieldNames.subStoryId)) {
              if (!input.trySkipNullValue()) {
                subStoryId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ChessRogueNousSubStoryInfo clone() {
      return new ChessRogueNousSubStoryInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueNousSubStoryInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueNousSubStoryInfo(), data).checkInitialized();
    }

    public static ChessRogueNousSubStoryInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousSubStoryInfo(), input).checkInitialized();
    }

    public static ChessRogueNousSubStoryInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousSubStoryInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueNousSubStoryInfo messages
     */
    public static MessageFactory<ChessRogueNousSubStoryInfo> getFactory() {
      return ChessRogueNousSubStoryInfoFactory.INSTANCE;
    }

    private enum ChessRogueNousSubStoryInfoFactory implements MessageFactory<ChessRogueNousSubStoryInfo> {
      INSTANCE;

      @Override
      public ChessRogueNousSubStoryInfo create() {
        return ChessRogueNousSubStoryInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName subStoryId = FieldName.forField("subStoryId", "sub_story_id");
    }
  }
}