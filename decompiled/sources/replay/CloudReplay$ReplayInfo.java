package replay;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p1011sp.C19707g;
import p1011sp.InterfaceC19708h;

/* JADX INFO: loaded from: classes2.dex */
public final class CloudReplay$ReplayInfo extends AbstractC12133Z implements InterfaceC19708h {
    private static final CloudReplay$ReplayInfo DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REPLAY_ID_FIELD_NUMBER = 1;
    private String replayId_ = "";

    static {
        CloudReplay$ReplayInfo cloudReplay$ReplayInfo = new CloudReplay$ReplayInfo();
        DEFAULT_INSTANCE = cloudReplay$ReplayInfo;
        AbstractC12133Z.registerDefaultInstance(CloudReplay$ReplayInfo.class, cloudReplay$ReplayInfo);
    }

    private CloudReplay$ReplayInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplayId() {
        this.replayId_ = getDefaultInstance().getReplayId();
    }

    public static CloudReplay$ReplayInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C19707g newBuilder() {
        return (C19707g) DEFAULT_INSTANCE.createBuilder();
    }

    public static CloudReplay$ReplayInfo parseDelimitedFrom(InputStream inputStream) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudReplay$ReplayInfo parseFrom(ByteBuffer byteBuffer) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplayId(String str) {
        str.getClass();
        this.replayId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplayIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.replayId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"replayId_"});
            case 3:
                return new CloudReplay$ReplayInfo();
            case 4:
                return new C19707g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (CloudReplay$ReplayInfo.class) {
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

    public String getReplayId() {
        return this.replayId_;
    }

    public AbstractC12171m getReplayIdBytes() {
        return AbstractC12171m.m14011m(this.replayId_);
    }

    public static C19707g newBuilder(CloudReplay$ReplayInfo cloudReplay$ReplayInfo) {
        return (C19707g) DEFAULT_INSTANCE.createBuilder(cloudReplay$ReplayInfo);
    }

    public static CloudReplay$ReplayInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static CloudReplay$ReplayInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static CloudReplay$ReplayInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static CloudReplay$ReplayInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static CloudReplay$ReplayInfo parseFrom(byte[] bArr) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CloudReplay$ReplayInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static CloudReplay$ReplayInfo parseFrom(InputStream inputStream) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudReplay$ReplayInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static CloudReplay$ReplayInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static CloudReplay$ReplayInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (CloudReplay$ReplayInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
