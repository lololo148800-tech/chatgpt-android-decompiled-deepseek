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
import p793ho.C14813q;
import p793ho.EnumC14750h;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$UpdateJobStatus extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgent$UpdateJobStatus DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int JOB_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int status_;
    private String jobId_ = "";
    private String error_ = "";

    static {
        LivekitAgent$UpdateJobStatus livekitAgent$UpdateJobStatus = new LivekitAgent$UpdateJobStatus();
        DEFAULT_INSTANCE = livekitAgent$UpdateJobStatus;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$UpdateJobStatus.class, livekitAgent$UpdateJobStatus);
    }

    private LivekitAgent$UpdateJobStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = getDefaultInstance().getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobId() {
        this.jobId_ = getDefaultInstance().getJobId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static LivekitAgent$UpdateJobStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14813q newBuilder() {
        return (C14813q) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$UpdateJobStatus parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(String str) {
        str.getClass();
        this.error_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.error_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobId(String str) {
        str.getClass();
        this.jobId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.jobId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(EnumC14750h enumC14750h) {
        this.status_ = enumC14750h.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"jobId_", "status_", "error_"});
            case 3:
                return new LivekitAgent$UpdateJobStatus();
            case 4:
                return new C14813q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$UpdateJobStatus.class) {
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

    public String getError() {
        return this.error_;
    }

    public AbstractC12171m getErrorBytes() {
        return AbstractC12171m.m14011m(this.error_);
    }

    public String getJobId() {
        return this.jobId_;
    }

    public AbstractC12171m getJobIdBytes() {
        return AbstractC12171m.m14011m(this.jobId_);
    }

    public EnumC14750h getStatus() {
        EnumC14750h enumC14750hM16049a = EnumC14750h.m16049a(this.status_);
        return enumC14750hM16049a == null ? EnumC14750h.UNRECOGNIZED : enumC14750hM16049a;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public static C14813q newBuilder(LivekitAgent$UpdateJobStatus livekitAgent$UpdateJobStatus) {
        return (C14813q) DEFAULT_INSTANCE.createBuilder(livekitAgent$UpdateJobStatus);
    }

    public static LivekitAgent$UpdateJobStatus parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(byte[] bArr) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(InputStream inputStream) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$UpdateJobStatus parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$UpdateJobStatus) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
