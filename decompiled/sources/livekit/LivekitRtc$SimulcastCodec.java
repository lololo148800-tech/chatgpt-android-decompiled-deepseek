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
import p793ho.C14769j4;
import p793ho.InterfaceC14776k4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SimulcastCodec extends AbstractC12133Z implements InterfaceC14776k4 {
    public static final int CID_FIELD_NUMBER = 2;
    public static final int CODEC_FIELD_NUMBER = 1;
    private static final LivekitRtc$SimulcastCodec DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER;
    private String codec_ = "";
    private String cid_ = "";

    static {
        LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec = new LivekitRtc$SimulcastCodec();
        DEFAULT_INSTANCE = livekitRtc$SimulcastCodec;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SimulcastCodec.class, livekitRtc$SimulcastCodec);
    }

    private LivekitRtc$SimulcastCodec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = getDefaultInstance().getCid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodec() {
        this.codec_ = getDefaultInstance().getCodec();
    }

    public static LivekitRtc$SimulcastCodec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14769j4 newBuilder() {
        return (C14769j4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SimulcastCodec parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(String str) {
        str.getClass();
        this.cid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.cid_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodec(String str) {
        str.getClass();
        this.codec_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodecBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.codec_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"codec_", "cid_"});
            case 3:
                return new LivekitRtc$SimulcastCodec();
            case 4:
                return new C14769j4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SimulcastCodec.class) {
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

    public String getCid() {
        return this.cid_;
    }

    public AbstractC12171m getCidBytes() {
        return AbstractC12171m.m14011m(this.cid_);
    }

    public String getCodec() {
        return this.codec_;
    }

    public AbstractC12171m getCodecBytes() {
        return AbstractC12171m.m14011m(this.codec_);
    }

    public static C14769j4 newBuilder(LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec) {
        return (C14769j4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SimulcastCodec);
    }

    public static LivekitRtc$SimulcastCodec parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(byte[] bArr) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(InputStream inputStream) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SimulcastCodec) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
