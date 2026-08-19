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
import p793ho.C14701a;
import p793ho.C14722d;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$AvailabilityRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgent$AvailabilityRequest DEFAULT_INSTANCE;
    public static final int JOB_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int RESUMING_FIELD_NUMBER = 2;
    private LivekitAgent$Job job_;
    private boolean resuming_;

    static {
        LivekitAgent$AvailabilityRequest livekitAgent$AvailabilityRequest = new LivekitAgent$AvailabilityRequest();
        DEFAULT_INSTANCE = livekitAgent$AvailabilityRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$AvailabilityRequest.class, livekitAgent$AvailabilityRequest);
    }

    private LivekitAgent$AvailabilityRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJob() {
        this.job_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResuming() {
        this.resuming_ = false;
    }

    public static LivekitAgent$AvailabilityRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJob(LivekitAgent$Job livekitAgent$Job) {
        livekitAgent$Job.getClass();
        LivekitAgent$Job livekitAgent$Job2 = this.job_;
        if (livekitAgent$Job2 == null || livekitAgent$Job2 == LivekitAgent$Job.getDefaultInstance()) {
            this.job_ = livekitAgent$Job;
            return;
        }
        C14722d c14722dNewBuilder = LivekitAgent$Job.newBuilder(this.job_);
        c14722dNewBuilder.m13865f(livekitAgent$Job);
        this.job_ = (LivekitAgent$Job) c14722dNewBuilder.m13862c();
    }

    public static C14701a newBuilder() {
        return (C14701a) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$AvailabilityRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJob(LivekitAgent$Job livekitAgent$Job) {
        livekitAgent$Job.getClass();
        this.job_ = livekitAgent$Job;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResuming(boolean z6) {
        this.resuming_ = z6;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"job_", "resuming_"});
            case 3:
                return new LivekitAgent$AvailabilityRequest();
            case 4:
                return new C14701a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$AvailabilityRequest.class) {
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

    public LivekitAgent$Job getJob() {
        LivekitAgent$Job livekitAgent$Job = this.job_;
        return livekitAgent$Job == null ? LivekitAgent$Job.getDefaultInstance() : livekitAgent$Job;
    }

    public boolean getResuming() {
        return this.resuming_;
    }

    public boolean hasJob() {
        return this.job_ != null;
    }

    public static C14701a newBuilder(LivekitAgent$AvailabilityRequest livekitAgent$AvailabilityRequest) {
        return (C14701a) DEFAULT_INSTANCE.createBuilder(livekitAgent$AvailabilityRequest);
    }

    public static LivekitAgent$AvailabilityRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(byte[] bArr) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(InputStream inputStream) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$AvailabilityRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
