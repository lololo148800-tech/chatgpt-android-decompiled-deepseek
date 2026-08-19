package replay;

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
import p1011sp.C19703c;

/* JADX INFO: loaded from: classes2.dex */
public final class CloudReplay$ListReplaysRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final CloudReplay$ListReplaysRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER;

    static {
        CloudReplay$ListReplaysRequest cloudReplay$ListReplaysRequest = new CloudReplay$ListReplaysRequest();
        DEFAULT_INSTANCE = cloudReplay$ListReplaysRequest;
        AbstractC12133Z.registerDefaultInstance(CloudReplay$ListReplaysRequest.class, cloudReplay$ListReplaysRequest);
    }

    private CloudReplay$ListReplaysRequest() {
    }

    public static CloudReplay$ListReplaysRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C19703c newBuilder() {
        return (C19703c) DEFAULT_INSTANCE.createBuilder();
    }

    public static CloudReplay$ListReplaysRequest parseDelimitedFrom(InputStream inputStream) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(ByteBuffer byteBuffer) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return new CloudReplay$ListReplaysRequest();
            case 4:
                return new C19703c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (CloudReplay$ListReplaysRequest.class) {
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

    public static C19703c newBuilder(CloudReplay$ListReplaysRequest cloudReplay$ListReplaysRequest) {
        return (C19703c) DEFAULT_INSTANCE.createBuilder(cloudReplay$ListReplaysRequest);
    }

    public static CloudReplay$ListReplaysRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(byte[] bArr) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(InputStream inputStream) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static CloudReplay$ListReplaysRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (CloudReplay$ListReplaysRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
