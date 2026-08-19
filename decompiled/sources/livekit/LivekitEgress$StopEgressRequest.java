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
import p793ho.C14654S0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$StopEgressRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitEgress$StopEgressRequest DEFAULT_INSTANCE;
    public static final int EGRESS_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private String egressId_ = "";

    static {
        LivekitEgress$StopEgressRequest livekitEgress$StopEgressRequest = new LivekitEgress$StopEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$StopEgressRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$StopEgressRequest.class, livekitEgress$StopEgressRequest);
    }

    private LivekitEgress$StopEgressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    public static LivekitEgress$StopEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14654S0 newBuilder() {
        return (C14654S0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$StopEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressId(String str) {
        str.getClass();
        this.egressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.egressId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"egressId_"});
            case 3:
                return new LivekitEgress$StopEgressRequest();
            case 4:
                return new C14654S0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$StopEgressRequest.class) {
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

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC12171m getEgressIdBytes() {
        return AbstractC12171m.m14011m(this.egressId_);
    }

    public static C14654S0 newBuilder(LivekitEgress$StopEgressRequest livekitEgress$StopEgressRequest) {
        return (C14654S0) DEFAULT_INSTANCE.createBuilder(livekitEgress$StopEgressRequest);
    }

    public static LivekitEgress$StopEgressRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$StopEgressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
