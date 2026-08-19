package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12167k1;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14620M1;
import p793ho.InterfaceC14626N1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitMetrics$EventMetric extends AbstractC12133Z implements InterfaceC14626N1 {
    private static final LivekitMetrics$EventMetric DEFAULT_INSTANCE;
    public static final int END_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int LABEL_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 8;
    public static final int NORMALIZED_END_TIMESTAMP_FIELD_NUMBER = 7;
    public static final int NORMALIZED_START_TIMESTAMP_FIELD_NUMBER = 6;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 2;
    public static final int RID_FIELD_NUMBER = 9;
    public static final int START_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int TRACK_SID_FIELD_NUMBER = 3;
    private int bitField0_;
    private long endTimestampMs_;
    private int label_;
    private String metadata_ = "";
    private Timestamp normalizedEndTimestamp_;
    private Timestamp normalizedStartTimestamp_;
    private int participantIdentity_;
    private int rid_;
    private long startTimestampMs_;
    private int trackSid_;

    static {
        LivekitMetrics$EventMetric livekitMetrics$EventMetric = new LivekitMetrics$EventMetric();
        DEFAULT_INSTANCE = livekitMetrics$EventMetric;
        AbstractC12133Z.registerDefaultInstance(LivekitMetrics$EventMetric.class, livekitMetrics$EventMetric);
    }

    private LivekitMetrics$EventMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTimestampMs() {
        this.bitField0_ &= -2;
        this.endTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNormalizedEndTimestamp() {
        this.normalizedEndTimestamp_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNormalizedStartTimestamp() {
        this.normalizedStartTimestamp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRid() {
        this.rid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimestampMs() {
        this.startTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = 0;
    }

    public static LivekitMetrics$EventMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNormalizedEndTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.normalizedEndTimestamp_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.normalizedEndTimestamp_ = timestamp;
        } else {
            C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.normalizedEndTimestamp_);
            c12167k1NewBuilder.m13865f(timestamp);
            this.normalizedEndTimestamp_ = (Timestamp) c12167k1NewBuilder.m13862c();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNormalizedStartTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.normalizedStartTimestamp_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.normalizedStartTimestamp_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.normalizedStartTimestamp_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.normalizedStartTimestamp_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    public static C14620M1 newBuilder() {
        return (C14620M1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitMetrics$EventMetric parseDelimitedFrom(InputStream inputStream) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitMetrics$EventMetric parseFrom(ByteBuffer byteBuffer) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimestampMs(long j10) {
        this.bitField0_ |= 1;
        this.endTimestampMs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(int i10) {
        this.label_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(String str) {
        str.getClass();
        this.metadata_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.metadata_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalizedEndTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.normalizedEndTimestamp_ = timestamp;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalizedStartTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.normalizedStartTimestamp_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentity(int i10) {
        this.participantIdentity_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRid(int i10) {
        this.rid_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimestampMs(long j10) {
        this.startTimestampMs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(int i10) {
        this.trackSid_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u0002\u0005ဂ\u0000\u0006\t\u0007ဉ\u0001\bȈ\t\u000b", new Object[]{"bitField0_", "label_", "participantIdentity_", "trackSid_", "startTimestampMs_", "endTimestampMs_", "normalizedStartTimestamp_", "normalizedEndTimestamp_", "metadata_", "rid_"});
            case 3:
                return new LivekitMetrics$EventMetric();
            case 4:
                return new C14620M1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitMetrics$EventMetric.class) {
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

    public long getEndTimestampMs() {
        return this.endTimestampMs_;
    }

    public int getLabel() {
        return this.label_;
    }

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC12171m getMetadataBytes() {
        return AbstractC12171m.m14011m(this.metadata_);
    }

    public Timestamp getNormalizedEndTimestamp() {
        Timestamp timestamp = this.normalizedEndTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getNormalizedStartTimestamp() {
        Timestamp timestamp = this.normalizedStartTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public int getRid() {
        return this.rid_;
    }

    public long getStartTimestampMs() {
        return this.startTimestampMs_;
    }

    public int getTrackSid() {
        return this.trackSid_;
    }

    public boolean hasEndTimestampMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNormalizedEndTimestamp() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNormalizedStartTimestamp() {
        return this.normalizedStartTimestamp_ != null;
    }

    public static C14620M1 newBuilder(LivekitMetrics$EventMetric livekitMetrics$EventMetric) {
        return (C14620M1) DEFAULT_INSTANCE.createBuilder(livekitMetrics$EventMetric);
    }

    public static LivekitMetrics$EventMetric parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitMetrics$EventMetric parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitMetrics$EventMetric parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitMetrics$EventMetric parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitMetrics$EventMetric parseFrom(byte[] bArr) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitMetrics$EventMetric parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitMetrics$EventMetric parseFrom(InputStream inputStream) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitMetrics$EventMetric parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitMetrics$EventMetric parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitMetrics$EventMetric parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitMetrics$EventMetric) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
