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
import p793ho.C14820r;
import p793ho.EnumC14855w;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$UpdateWorkerStatus extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgent$UpdateWorkerStatus DEFAULT_INSTANCE;
    public static final int JOB_COUNT_FIELD_NUMBER = 4;
    public static final int LOAD_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int jobCount_;
    private float load_;
    private int status_;

    static {
        LivekitAgent$UpdateWorkerStatus livekitAgent$UpdateWorkerStatus = new LivekitAgent$UpdateWorkerStatus();
        DEFAULT_INSTANCE = livekitAgent$UpdateWorkerStatus;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$UpdateWorkerStatus.class, livekitAgent$UpdateWorkerStatus);
    }

    private LivekitAgent$UpdateWorkerStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobCount() {
        this.jobCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoad() {
        this.load_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -2;
        this.status_ = 0;
    }

    public static LivekitAgent$UpdateWorkerStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14820r newBuilder() {
        return (C14820r) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$UpdateWorkerStatus parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobCount(int i10) {
        this.jobCount_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoad(float f10) {
        this.load_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(EnumC14855w enumC14855w) {
        this.status_ = enumC14855w.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.bitField0_ |= 1;
        this.status_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003\u0001\u0004\u0004", new Object[]{"bitField0_", "status_", "load_", "jobCount_"});
            case 3:
                return new LivekitAgent$UpdateWorkerStatus();
            case 4:
                return new C14820r(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$UpdateWorkerStatus.class) {
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

    public int getJobCount() {
        return this.jobCount_;
    }

    public float getLoad() {
        return this.load_;
    }

    public EnumC14855w getStatus() {
        EnumC14855w enumC14855w;
        int i10 = this.status_;
        if (i10 != 0) {
            enumC14855w = i10 != 1 ? null : EnumC14855w.WS_FULL;
        } else {
            enumC14855w = EnumC14855w.WS_AVAILABLE;
        }
        return enumC14855w == null ? EnumC14855w.UNRECOGNIZED : enumC14855w;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C14820r newBuilder(LivekitAgent$UpdateWorkerStatus livekitAgent$UpdateWorkerStatus) {
        return (C14820r) DEFAULT_INSTANCE.createBuilder(livekitAgent$UpdateWorkerStatus);
    }

    public static LivekitAgent$UpdateWorkerStatus parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(byte[] bArr) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(InputStream inputStream) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
