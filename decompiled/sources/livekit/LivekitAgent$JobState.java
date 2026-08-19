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
import p793ho.C14743g;
import p793ho.EnumC14750h;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$JobState extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgent$JobState DEFAULT_INSTANCE;
    public static final int ENDED_AT_FIELD_NUMBER = 4;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 6;
    public static final int STARTED_AT_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int UPDATED_AT_FIELD_NUMBER = 5;
    private long endedAt_;
    private String error_ = "";
    private String participantIdentity_ = "";
    private long startedAt_;
    private int status_;
    private long updatedAt_;

    static {
        LivekitAgent$JobState livekitAgent$JobState = new LivekitAgent$JobState();
        DEFAULT_INSTANCE = livekitAgent$JobState;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$JobState.class, livekitAgent$JobState);
    }

    private LivekitAgent$JobState() {
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
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
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
    public void clearUpdatedAt() {
        this.updatedAt_ = 0L;
    }

    public static LivekitAgent$JobState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14743g newBuilder() {
        return (C14743g) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$JobState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$JobState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setParticipantIdentity(String str) {
        str.getClass();
        this.participantIdentity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentityBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.participantIdentity_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartedAt(long j10) {
        this.startedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(EnumC14750h enumC14750h) {
        this.status_ = enumC14750h.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.status_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedAt(long j10) {
        this.updatedAt_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0002\u0006Ȉ", new Object[]{"status_", "error_", "startedAt_", "endedAt_", "updatedAt_", "participantIdentity_"});
            case 3:
                return new LivekitAgent$JobState();
            case 4:
                return new C14743g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$JobState.class) {
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

    public long getEndedAt() {
        return this.endedAt_;
    }

    public String getError() {
        return this.error_;
    }

    public AbstractC12171m getErrorBytes() {
        return AbstractC12171m.m14011m(this.error_);
    }

    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public AbstractC12171m getParticipantIdentityBytes() {
        return AbstractC12171m.m14011m(this.participantIdentity_);
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public EnumC14750h getStatus() {
        EnumC14750h enumC14750hM16049a = EnumC14750h.m16049a(this.status_);
        return enumC14750hM16049a == null ? EnumC14750h.UNRECOGNIZED : enumC14750hM16049a;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public long getUpdatedAt() {
        return this.updatedAt_;
    }

    public static C14743g newBuilder(LivekitAgent$JobState livekitAgent$JobState) {
        return (C14743g) DEFAULT_INSTANCE.createBuilder(livekitAgent$JobState);
    }

    public static LivekitAgent$JobState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$JobState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$JobState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$JobState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$JobState parseFrom(byte[] bArr) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$JobState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$JobState parseFrom(InputStream inputStream) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$JobState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$JobState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$JobState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$JobState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
