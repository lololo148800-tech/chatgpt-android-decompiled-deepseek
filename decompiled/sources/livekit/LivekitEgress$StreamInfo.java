package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14660T0;
import p793ho.EnumC14666U0;
import p793ho.InterfaceC14678W0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$StreamInfo extends AbstractC12133Z implements InterfaceC14678W0 {
    private static final LivekitEgress$StreamInfo DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int ENDED_AT_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 6;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int STARTED_AT_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 1;
    private long duration_;
    private long endedAt_;
    private long startedAt_;
    private int status_;
    private String url_ = "";
    private String error_ = "";

    static {
        LivekitEgress$StreamInfo livekitEgress$StreamInfo = new LivekitEgress$StreamInfo();
        DEFAULT_INSTANCE = livekitEgress$StreamInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$StreamInfo.class, livekitEgress$StreamInfo);
    }

    private LivekitEgress$StreamInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndedAt() {
        this.endedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = getDefaultInstance().getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static LivekitEgress$StreamInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14660T0 newBuilder() {
        return (C14660T0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$StreamInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j10) {
        this.duration_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndedAt(long j10) {
        this.endedAt_ = j10;
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
    public void setStartedAt(long j10) {
        this.startedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(EnumC14666U0 enumC14666U0) {
        this.status_ = enumC14666U0.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.status_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.url_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002\u0005\f\u0006Ȉ", new Object[]{"url_", "startedAt_", "endedAt_", "duration_", "status_", "error_"});
            case 3:
                return new LivekitEgress$StreamInfo();
            case 4:
                return new C14660T0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$StreamInfo.class) {
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

    public long getDuration() {
        return this.duration_;
    }

    public long getEndedAt() {
        return this.endedAt_;
    }

    public String getError() {
        return this.error_;
    }

    public AbstractC12171m getErrorBytes() {
        return AbstractC12171m.m14011m(this.error_);
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public EnumC14666U0 getStatus() {
        EnumC14666U0 enumC14666U0;
        int i10 = this.status_;
        if (i10 == 0) {
            enumC14666U0 = EnumC14666U0.ACTIVE;
        } else if (i10 != 1) {
            enumC14666U0 = i10 != 2 ? null : EnumC14666U0.FAILED;
        } else {
            enumC14666U0 = EnumC14666U0.FINISHED;
        }
        return enumC14666U0 == null ? EnumC14666U0.UNRECOGNIZED : enumC14666U0;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public String getUrl() {
        return this.url_;
    }

    public AbstractC12171m getUrlBytes() {
        return AbstractC12171m.m14011m(this.url_);
    }

    public static C14660T0 newBuilder(LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        return (C14660T0) DEFAULT_INSTANCE.createBuilder(livekitEgress$StreamInfo);
    }

    public static LivekitEgress$StreamInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$StreamInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$StreamInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$StreamInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$StreamInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$StreamInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$StreamInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$StreamInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$StreamInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$StreamInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
