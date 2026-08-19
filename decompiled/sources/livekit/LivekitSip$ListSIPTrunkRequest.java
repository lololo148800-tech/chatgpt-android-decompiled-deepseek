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
import p793ho.C14749g5;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LivekitSip$ListSIPTrunkRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$ListSIPTrunkRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER;

    static {
        LivekitSip$ListSIPTrunkRequest livekitSip$ListSIPTrunkRequest = new LivekitSip$ListSIPTrunkRequest();
        DEFAULT_INSTANCE = livekitSip$ListSIPTrunkRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$ListSIPTrunkRequest.class, livekitSip$ListSIPTrunkRequest);
    }

    private LivekitSip$ListSIPTrunkRequest() {
    }

    public static LivekitSip$ListSIPTrunkRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14749g5 newBuilder() {
        return (C14749g5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$ListSIPTrunkRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new LivekitSip$ListSIPTrunkRequest();
            case 4:
                return new C14749g5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$ListSIPTrunkRequest.class) {
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

    public static C14749g5 newBuilder(LivekitSip$ListSIPTrunkRequest livekitSip$ListSIPTrunkRequest) {
        return (C14749g5) DEFAULT_INSTANCE.createBuilder(livekitSip$ListSIPTrunkRequest);
    }

    public static LivekitSip$ListSIPTrunkRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(byte[] bArr) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(InputStream inputStream) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
