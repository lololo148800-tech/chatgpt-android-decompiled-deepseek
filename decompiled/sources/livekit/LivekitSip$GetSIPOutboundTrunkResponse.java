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
import p793ho.C14700Z4;
import p793ho.C14847u5;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$GetSIPOutboundTrunkResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$GetSIPOutboundTrunkResponse DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TRUNK_FIELD_NUMBER = 1;
    private LivekitSip$SIPOutboundTrunkInfo trunk_;

    static {
        LivekitSip$GetSIPOutboundTrunkResponse livekitSip$GetSIPOutboundTrunkResponse = new LivekitSip$GetSIPOutboundTrunkResponse();
        DEFAULT_INSTANCE = livekitSip$GetSIPOutboundTrunkResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$GetSIPOutboundTrunkResponse.class, livekitSip$GetSIPOutboundTrunkResponse);
    }

    private LivekitSip$GetSIPOutboundTrunkResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrunk() {
        this.trunk_ = null;
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrunk(LivekitSip$SIPOutboundTrunkInfo livekitSip$SIPOutboundTrunkInfo) {
        livekitSip$SIPOutboundTrunkInfo.getClass();
        LivekitSip$SIPOutboundTrunkInfo livekitSip$SIPOutboundTrunkInfo2 = this.trunk_;
        if (livekitSip$SIPOutboundTrunkInfo2 == null || livekitSip$SIPOutboundTrunkInfo2 == LivekitSip$SIPOutboundTrunkInfo.getDefaultInstance()) {
            this.trunk_ = livekitSip$SIPOutboundTrunkInfo;
            return;
        }
        C14847u5 c14847u5NewBuilder = LivekitSip$SIPOutboundTrunkInfo.newBuilder(this.trunk_);
        c14847u5NewBuilder.m13865f(livekitSip$SIPOutboundTrunkInfo);
        this.trunk_ = (LivekitSip$SIPOutboundTrunkInfo) c14847u5NewBuilder.m13862c();
    }

    public static C14700Z4 newBuilder() {
        return (C14700Z4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrunk(LivekitSip$SIPOutboundTrunkInfo livekitSip$SIPOutboundTrunkInfo) {
        livekitSip$SIPOutboundTrunkInfo.getClass();
        this.trunk_ = livekitSip$SIPOutboundTrunkInfo;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"trunk_"});
            case 3:
                return new LivekitSip$GetSIPOutboundTrunkResponse();
            case 4:
                return new C14700Z4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$GetSIPOutboundTrunkResponse.class) {
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

    public LivekitSip$SIPOutboundTrunkInfo getTrunk() {
        LivekitSip$SIPOutboundTrunkInfo livekitSip$SIPOutboundTrunkInfo = this.trunk_;
        return livekitSip$SIPOutboundTrunkInfo == null ? LivekitSip$SIPOutboundTrunkInfo.getDefaultInstance() : livekitSip$SIPOutboundTrunkInfo;
    }

    public boolean hasTrunk() {
        return this.trunk_ != null;
    }

    public static C14700Z4 newBuilder(LivekitSip$GetSIPOutboundTrunkResponse livekitSip$GetSIPOutboundTrunkResponse) {
        return (C14700Z4) DEFAULT_INSTANCE.createBuilder(livekitSip$GetSIPOutboundTrunkResponse);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(byte[] bArr) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(InputStream inputStream) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$GetSIPOutboundTrunkResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$GetSIPOutboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
