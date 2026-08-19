package replay;

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
import p1011sp.C19701a;

/* JADX INFO: loaded from: classes2.dex */
public final class CloudReplay$CloseReplayRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final CloudReplay$CloseReplayRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 1;
    private String playbackId_ = "";

    static {
        CloudReplay$CloseReplayRequest cloudReplay$CloseReplayRequest = new CloudReplay$CloseReplayRequest();
        DEFAULT_INSTANCE = cloudReplay$CloseReplayRequest;
        AbstractC12133Z.registerDefaultInstance(CloudReplay$CloseReplayRequest.class, cloudReplay$CloseReplayRequest);
    }

    private CloudReplay$CloseReplayRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaybackId() {
        this.playbackId_ = getDefaultInstance().getPlaybackId();
    }

    public static CloudReplay$CloseReplayRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C19701a newBuilder() {
        return (C19701a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CloudReplay$CloseReplayRequest parseDelimitedFrom(InputStream inputStream) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(ByteBuffer byteBuffer) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackId(String str) {
        str.getClass();
        this.playbackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.playbackId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"playbackId_"});
            case 3:
                return new CloudReplay$CloseReplayRequest();
            case 4:
                return new C19701a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (CloudReplay$CloseReplayRequest.class) {
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

    public String getPlaybackId() {
        return this.playbackId_;
    }

    public AbstractC12171m getPlaybackIdBytes() {
        return AbstractC12171m.m14011m(this.playbackId_);
    }

    public static C19701a newBuilder(CloudReplay$CloseReplayRequest cloudReplay$CloseReplayRequest) {
        return (C19701a) DEFAULT_INSTANCE.createBuilder(cloudReplay$CloseReplayRequest);
    }

    public static CloudReplay$CloseReplayRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(byte[] bArr) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(InputStream inputStream) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static CloudReplay$CloseReplayRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (CloudReplay$CloseReplayRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
