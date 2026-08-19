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
import p793ho.C14688X4;
import p793ho.C14819q5;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$GetSIPInboundTrunkResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$GetSIPInboundTrunkResponse DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TRUNK_FIELD_NUMBER = 1;
    private LivekitSip$SIPInboundTrunkInfo trunk_;

    static {
        LivekitSip$GetSIPInboundTrunkResponse livekitSip$GetSIPInboundTrunkResponse = new LivekitSip$GetSIPInboundTrunkResponse();
        DEFAULT_INSTANCE = livekitSip$GetSIPInboundTrunkResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$GetSIPInboundTrunkResponse.class, livekitSip$GetSIPInboundTrunkResponse);
    }

    private LivekitSip$GetSIPInboundTrunkResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrunk() {
        this.trunk_ = null;
    }

    public static LivekitSip$GetSIPInboundTrunkResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrunk(LivekitSip$SIPInboundTrunkInfo livekitSip$SIPInboundTrunkInfo) {
        livekitSip$SIPInboundTrunkInfo.getClass();
        LivekitSip$SIPInboundTrunkInfo livekitSip$SIPInboundTrunkInfo2 = this.trunk_;
        if (livekitSip$SIPInboundTrunkInfo2 == null || livekitSip$SIPInboundTrunkInfo2 == LivekitSip$SIPInboundTrunkInfo.getDefaultInstance()) {
            this.trunk_ = livekitSip$SIPInboundTrunkInfo;
            return;
        }
        C14819q5 c14819q5NewBuilder = LivekitSip$SIPInboundTrunkInfo.newBuilder(this.trunk_);
        c14819q5NewBuilder.m13865f(livekitSip$SIPInboundTrunkInfo);
        this.trunk_ = (LivekitSip$SIPInboundTrunkInfo) c14819q5NewBuilder.m13862c();
    }

    public static C14688X4 newBuilder() {
        return (C14688X4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrunk(LivekitSip$SIPInboundTrunkInfo livekitSip$SIPInboundTrunkInfo) {
        livekitSip$SIPInboundTrunkInfo.getClass();
        this.trunk_ = livekitSip$SIPInboundTrunkInfo;
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
                return new LivekitSip$GetSIPInboundTrunkResponse();
            case 4:
                return new C14688X4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$GetSIPInboundTrunkResponse.class) {
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

    public LivekitSip$SIPInboundTrunkInfo getTrunk() {
        LivekitSip$SIPInboundTrunkInfo livekitSip$SIPInboundTrunkInfo = this.trunk_;
        return livekitSip$SIPInboundTrunkInfo == null ? LivekitSip$SIPInboundTrunkInfo.getDefaultInstance() : livekitSip$SIPInboundTrunkInfo;
    }

    public boolean hasTrunk() {
        return this.trunk_ != null;
    }

    public static C14688X4 newBuilder(LivekitSip$GetSIPInboundTrunkResponse livekitSip$GetSIPInboundTrunkResponse) {
        return (C14688X4) DEFAULT_INSTANCE.createBuilder(livekitSip$GetSIPInboundTrunkResponse);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(byte[] bArr) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(InputStream inputStream) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$GetSIPInboundTrunkResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$GetSIPInboundTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
