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
import p793ho.C14682W4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$GetSIPInboundTrunkRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$GetSIPInboundTrunkRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SIP_TRUNK_ID_FIELD_NUMBER = 1;
    private String sipTrunkId_ = "";

    static {
        LivekitSip$GetSIPInboundTrunkRequest livekitSip$GetSIPInboundTrunkRequest = new LivekitSip$GetSIPInboundTrunkRequest();
        DEFAULT_INSTANCE = livekitSip$GetSIPInboundTrunkRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$GetSIPInboundTrunkRequest.class, livekitSip$GetSIPInboundTrunkRequest);
    }

    private LivekitSip$GetSIPInboundTrunkRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipTrunkId() {
        this.sipTrunkId_ = getDefaultInstance().getSipTrunkId();
    }

    public static LivekitSip$GetSIPInboundTrunkRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14682W4 newBuilder() {
        return (C14682W4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkId(String str) {
        str.getClass();
        this.sipTrunkId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sipTrunkId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"sipTrunkId_"});
            case 3:
                return new LivekitSip$GetSIPInboundTrunkRequest();
            case 4:
                return new C14682W4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$GetSIPInboundTrunkRequest.class) {
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

    public String getSipTrunkId() {
        return this.sipTrunkId_;
    }

    public AbstractC12171m getSipTrunkIdBytes() {
        return AbstractC12171m.m14011m(this.sipTrunkId_);
    }

    public static C14682W4 newBuilder(LivekitSip$GetSIPInboundTrunkRequest livekitSip$GetSIPInboundTrunkRequest) {
        return (C14682W4) DEFAULT_INSTANCE.createBuilder(livekitSip$GetSIPInboundTrunkRequest);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(byte[] bArr) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(InputStream inputStream) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$GetSIPInboundTrunkRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
