package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14579F2;
import p793ho.C14706a4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$RoomUpdate extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$RoomUpdate DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 1;
    private LivekitModels$Room room_;

    static {
        LivekitRtc$RoomUpdate livekitRtc$RoomUpdate = new LivekitRtc$RoomUpdate();
        DEFAULT_INSTANCE = livekitRtc$RoomUpdate;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$RoomUpdate.class, livekitRtc$RoomUpdate);
    }

    private LivekitRtc$RoomUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    public static LivekitRtc$RoomUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        LivekitModels$Room livekitModels$Room2 = this.room_;
        if (livekitModels$Room2 == null || livekitModels$Room2 == LivekitModels$Room.getDefaultInstance()) {
            this.room_ = livekitModels$Room;
            return;
        }
        C14579F2 c14579f2NewBuilder = LivekitModels$Room.newBuilder(this.room_);
        c14579f2NewBuilder.m13865f(livekitModels$Room);
        this.room_ = (LivekitModels$Room) c14579f2NewBuilder.m13862c();
    }

    public static C14706a4 newBuilder() {
        return (C14706a4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$RoomUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RoomUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"room_"});
            case 3:
                return new LivekitRtc$RoomUpdate();
            case 4:
                return new C14706a4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$RoomUpdate.class) {
                        try {
                            c12123u = PARSER;
                            if (c12123u == null) {
                                c12123u = new C12123U();
                                PARSER = c12123u;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c12123u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        return livekitModels$Room == null ? LivekitModels$Room.getDefaultInstance() : livekitModels$Room;
    }

    public boolean hasRoom() {
        return this.room_ != null;
    }

    public static C14706a4 newBuilder(LivekitRtc$RoomUpdate livekitRtc$RoomUpdate) {
        return (C14706a4) DEFAULT_INSTANCE.createBuilder(livekitRtc$RoomUpdate);
    }

    public static LivekitRtc$RoomUpdate parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$RoomUpdate parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$RoomUpdate parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$RoomUpdate parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$RoomUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$RoomUpdate parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$RoomUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RoomUpdate parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$RoomUpdate parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$RoomUpdate parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$RoomUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
