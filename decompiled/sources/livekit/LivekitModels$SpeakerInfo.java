package livekit;

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
import p793ho.C14650R2;
import p793ho.InterfaceC14656S2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$SpeakerInfo extends AbstractC12133Z implements InterfaceC14656S2 {
    public static final int ACTIVE_FIELD_NUMBER = 3;
    private static final LivekitModels$SpeakerInfo DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    private boolean active_;
    private float level_;
    private String sid_ = "";

    static {
        LivekitModels$SpeakerInfo livekitModels$SpeakerInfo = new LivekitModels$SpeakerInfo();
        DEFAULT_INSTANCE = livekitModels$SpeakerInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$SpeakerInfo.class, livekitModels$SpeakerInfo);
    }

    private LivekitModels$SpeakerInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActive() {
        this.active_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    public static LivekitModels$SpeakerInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14650R2 newBuilder() {
        return (C14650R2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$SpeakerInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SpeakerInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActive(boolean z6) {
        this.active_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(float f10) {
        this.level_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sid_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0001\u0003\u0007", new Object[]{"sid_", "level_", "active_"});
            case 3:
                return new LivekitModels$SpeakerInfo();
            case 4:
                return new C14650R2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$SpeakerInfo.class) {
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

    public boolean getActive() {
        return this.active_;
    }

    public float getLevel() {
        return this.level_;
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC12171m getSidBytes() {
        return AbstractC12171m.m14011m(this.sid_);
    }

    public static C14650R2 newBuilder(LivekitModels$SpeakerInfo livekitModels$SpeakerInfo) {
        return (C14650R2) DEFAULT_INSTANCE.createBuilder(livekitModels$SpeakerInfo);
    }

    public static LivekitModels$SpeakerInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$SpeakerInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$SpeakerInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$SpeakerInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$SpeakerInfo parseFrom(byte[] bArr) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$SpeakerInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$SpeakerInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SpeakerInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$SpeakerInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$SpeakerInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$SpeakerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
