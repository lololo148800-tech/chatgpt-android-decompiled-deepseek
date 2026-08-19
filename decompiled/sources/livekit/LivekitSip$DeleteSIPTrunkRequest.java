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
import p793ho.C14676V4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$DeleteSIPTrunkRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$DeleteSIPTrunkRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SIP_TRUNK_ID_FIELD_NUMBER = 1;
    private String sipTrunkId_ = "";

    static {
        LivekitSip$DeleteSIPTrunkRequest livekitSip$DeleteSIPTrunkRequest = new LivekitSip$DeleteSIPTrunkRequest();
        DEFAULT_INSTANCE = livekitSip$DeleteSIPTrunkRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$DeleteSIPTrunkRequest.class, livekitSip$DeleteSIPTrunkRequest);
    }

    private LivekitSip$DeleteSIPTrunkRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipTrunkId() {
        this.sipTrunkId_ = getDefaultInstance().getSipTrunkId();
    }

    public static LivekitSip$DeleteSIPTrunkRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14676V4 newBuilder() {
        return (C14676V4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return new LivekitSip$DeleteSIPTrunkRequest();
            case 4:
                return new C14676V4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$DeleteSIPTrunkRequest.class) {
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

    public static C14676V4 newBuilder(LivekitSip$DeleteSIPTrunkRequest livekitSip$DeleteSIPTrunkRequest) {
        return (C14676V4) DEFAULT_INSTANCE.createBuilder(livekitSip$DeleteSIPTrunkRequest);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(byte[] bArr) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(InputStream inputStream) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
