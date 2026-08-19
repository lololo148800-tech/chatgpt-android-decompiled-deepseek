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
import p793ho.C14722d;
import p793ho.C14729e;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$JobAssignment extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgent$JobAssignment DEFAULT_INSTANCE;
    public static final int JOB_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private LivekitAgent$Job job_;
    private String url_ = "";
    private String token_ = "";

    static {
        LivekitAgent$JobAssignment livekitAgent$JobAssignment = new LivekitAgent$JobAssignment();
        DEFAULT_INSTANCE = livekitAgent$JobAssignment;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$JobAssignment.class, livekitAgent$JobAssignment);
    }

    private LivekitAgent$JobAssignment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJob() {
        this.job_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    public static LivekitAgent$JobAssignment getDefaultInstance() {
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

    public static C14729e newBuilder() {
        return (C14729e) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$JobAssignment parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$JobAssignment parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setToken(String str) {
        str.getClass();
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.token_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.url_ = abstractC12171m.m14012w();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002ለ\u0000\u0003Ȉ", new Object[]{"bitField0_", "job_", "url_", "token_"});
            case 3:
                return new LivekitAgent$JobAssignment();
            case 4:
                return new C14729e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$JobAssignment.class) {
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

    public String getToken() {
        return this.token_;
    }

    public AbstractC12171m getTokenBytes() {
        return AbstractC12171m.m14011m(this.token_);
    }

    public String getUrl() {
        return this.url_;
    }

    public AbstractC12171m getUrlBytes() {
        return AbstractC12171m.m14011m(this.url_);
    }

    public boolean hasJob() {
        return this.job_ != null;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C14729e newBuilder(LivekitAgent$JobAssignment livekitAgent$JobAssignment) {
        return (C14729e) DEFAULT_INSTANCE.createBuilder(livekitAgent$JobAssignment);
    }

    public static LivekitAgent$JobAssignment parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$JobAssignment parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$JobAssignment parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$JobAssignment parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$JobAssignment parseFrom(byte[] bArr) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$JobAssignment parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$JobAssignment parseFrom(InputStream inputStream) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$JobAssignment parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$JobAssignment parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$JobAssignment parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$JobAssignment) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
