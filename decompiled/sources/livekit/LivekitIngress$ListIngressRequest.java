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
import p582Xk.HXHG.TfazcFv;
import p793ho.C14550B1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$ListIngressRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitIngress$ListIngressRequest DEFAULT_INSTANCE;
    public static final int INGRESS_ID_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    private String ingressId_;
    private String roomName_;

    static {
        LivekitIngress$ListIngressRequest livekitIngress$ListIngressRequest = new LivekitIngress$ListIngressRequest();
        DEFAULT_INSTANCE = livekitIngress$ListIngressRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$ListIngressRequest.class, livekitIngress$ListIngressRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngressId() {
        this.ingressId_ = getDefaultInstance().getIngressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    public static LivekitIngress$ListIngressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14550B1 newBuilder() {
        return (C14550B1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$ListIngressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$ListIngressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressId(String str) {
        str.getClass();
        this.ingressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.ingressId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomName(String str) {
        str.getClass();
        this.roomName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.roomName_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"roomName_", "ingressId_"});
            case 3:
                return new LivekitIngress$ListIngressRequest();
            case 4:
                return new C14550B1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$ListIngressRequest.class) {
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

    public String getIngressId() {
        return this.ingressId_;
    }

    public AbstractC12171m getIngressIdBytes() {
        return AbstractC12171m.m14011m(this.ingressId_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC12171m getRoomNameBytes() {
        return AbstractC12171m.m14011m(this.roomName_);
    }

    public static C14550B1 newBuilder(LivekitIngress$ListIngressRequest livekitIngress$ListIngressRequest) {
        return (C14550B1) DEFAULT_INSTANCE.createBuilder(livekitIngress$ListIngressRequest);
    }

    public static LivekitIngress$ListIngressRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$ListIngressRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    private LivekitIngress$ListIngressRequest() {
        String str = TfazcFv.EYRpjvBJiHVD;
        this.roomName_ = str;
        this.ingressId_ = str;
    }

    public static LivekitIngress$ListIngressRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitIngress$ListIngressRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$ListIngressRequest parseFrom(byte[] bArr) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$ListIngressRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$ListIngressRequest parseFrom(InputStream inputStream) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$ListIngressRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$ListIngressRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$ListIngressRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$ListIngressRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
