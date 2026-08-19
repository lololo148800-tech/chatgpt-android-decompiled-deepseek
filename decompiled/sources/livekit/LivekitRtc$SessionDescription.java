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
import p793ho.C14713b4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SessionDescription extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$SessionDescription DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SDP_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String type_ = "";
    private String sdp_ = "";

    static {
        LivekitRtc$SessionDescription livekitRtc$SessionDescription = new LivekitRtc$SessionDescription();
        DEFAULT_INSTANCE = livekitRtc$SessionDescription;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SessionDescription.class, livekitRtc$SessionDescription);
    }

    private LivekitRtc$SessionDescription() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdp() {
        this.sdp_ = getDefaultInstance().getSdp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static LivekitRtc$SessionDescription getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14713b4 newBuilder() {
        return (C14713b4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SessionDescription parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SessionDescription parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdp(String str) {
        str.getClass();
        this.sdp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdpBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sdp_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.type_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"type_", "sdp_"});
            case 3:
                return new LivekitRtc$SessionDescription();
            case 4:
                return new C14713b4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SessionDescription.class) {
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

    public String getSdp() {
        return this.sdp_;
    }

    public AbstractC12171m getSdpBytes() {
        return AbstractC12171m.m14011m(this.sdp_);
    }

    public String getType() {
        return this.type_;
    }

    public AbstractC12171m getTypeBytes() {
        return AbstractC12171m.m14011m(this.type_);
    }

    public static C14713b4 newBuilder(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        return (C14713b4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SessionDescription);
    }

    public static LivekitRtc$SessionDescription parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SessionDescription parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SessionDescription parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$SessionDescription parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SessionDescription parseFrom(byte[] bArr) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SessionDescription parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SessionDescription parseFrom(InputStream inputStream) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SessionDescription parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SessionDescription parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SessionDescription parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SessionDescription) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
