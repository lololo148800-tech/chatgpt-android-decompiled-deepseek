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
import p793ho.C14707a5;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$ListSIPDispatchRuleRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$ListSIPDispatchRuleRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER;

    static {
        LivekitSip$ListSIPDispatchRuleRequest livekitSip$ListSIPDispatchRuleRequest = new LivekitSip$ListSIPDispatchRuleRequest();
        DEFAULT_INSTANCE = livekitSip$ListSIPDispatchRuleRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$ListSIPDispatchRuleRequest.class, livekitSip$ListSIPDispatchRuleRequest);
    }

    private LivekitSip$ListSIPDispatchRuleRequest() {
    }

    public static LivekitSip$ListSIPDispatchRuleRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14707a5 newBuilder() {
        return (C14707a5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return new LivekitSip$ListSIPDispatchRuleRequest();
            case 4:
                return new C14707a5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$ListSIPDispatchRuleRequest.class) {
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

    public static C14707a5 newBuilder(LivekitSip$ListSIPDispatchRuleRequest livekitSip$ListSIPDispatchRuleRequest) {
        return (C14707a5) DEFAULT_INSTANCE.createBuilder(livekitSip$ListSIPDispatchRuleRequest);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(byte[] bArr) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(InputStream inputStream) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$ListSIPDispatchRuleRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$ListSIPDispatchRuleRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
