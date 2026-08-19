package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14789m3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$ListParticipantsRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRoom$ListParticipantsRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 1;
    private String room_ = "";

    static {
        LivekitRoom$ListParticipantsRequest livekitRoom$ListParticipantsRequest = new LivekitRoom$ListParticipantsRequest();
        DEFAULT_INSTANCE = livekitRoom$ListParticipantsRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$ListParticipantsRequest.class, livekitRoom$ListParticipantsRequest);
    }

    private LivekitRoom$ListParticipantsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    public static LivekitRoom$ListParticipantsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14789m3 newBuilder() {
        return (C14789m3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$ListParticipantsRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.room_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"room_"});
            case 3:
                return new LivekitRoom$ListParticipantsRequest();
            case 4:
                return new C14789m3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$ListParticipantsRequest.class) {
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

    public String getRoom() {
        return this.room_;
    }

    public AbstractC12171m getRoomBytes() {
        return AbstractC12171m.m14011m(this.room_);
    }

    public static C14789m3 newBuilder(LivekitRoom$ListParticipantsRequest livekitRoom$ListParticipantsRequest) {
        return (C14789m3) DEFAULT_INSTANCE.createBuilder(livekitRoom$ListParticipantsRequest);
    }

    public static LivekitRoom$ListParticipantsRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$ListParticipantsRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
