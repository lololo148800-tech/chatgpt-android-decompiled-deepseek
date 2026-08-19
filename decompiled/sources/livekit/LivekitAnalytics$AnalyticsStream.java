package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12167k1;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14665U;
import p793ho.InterfaceC14671V;
import p793ho.InterfaceC14683X;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsStream extends AbstractC12133Z implements InterfaceC14671V {
    private static final LivekitAnalytics$AnalyticsStream DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 18;
    public static final int FIRS_FIELD_NUMBER = 14;
    public static final int FRAMES_FIELD_NUMBER = 9;
    public static final int JITTER_FIELD_NUMBER = 11;
    public static final int NACKS_FIELD_NUMBER = 12;
    public static final int PACKETS_LOST_FIELD_NUMBER = 8;
    public static final int PACKETS_OUT_OF_ORDER_FIELD_NUMBER = 19;
    public static final int PADDING_BYTES_FIELD_NUMBER = 7;
    public static final int PADDING_PACKETS_FIELD_NUMBER = 6;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PLIS_FIELD_NUMBER = 13;
    public static final int PRIMARY_BYTES_FIELD_NUMBER = 3;
    public static final int PRIMARY_PACKETS_FIELD_NUMBER = 2;
    public static final int RETRANSMIT_BYTES_FIELD_NUMBER = 5;
    public static final int RETRANSMIT_PACKETS_FIELD_NUMBER = 4;
    public static final int RTT_FIELD_NUMBER = 10;
    public static final int SSRC_FIELD_NUMBER = 1;
    public static final int START_TIME_FIELD_NUMBER = 17;
    public static final int VIDEO_LAYERS_FIELD_NUMBER = 15;
    private Timestamp endTime_;
    private int firs_;
    private int frames_;
    private int jitter_;
    private int nacks_;
    private int packetsLost_;
    private int packetsOutOfOrder_;
    private long paddingBytes_;
    private int paddingPackets_;
    private int plis_;
    private long primaryBytes_;
    private int primaryPackets_;
    private long retransmitBytes_;
    private int retransmitPackets_;
    private int rtt_;
    private int ssrc_;
    private Timestamp startTime_;
    private InterfaceC12172m0 videoLayers_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream = new LivekitAnalytics$AnalyticsStream();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsStream;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsStream.class, livekitAnalytics$AnalyticsStream);
    }

    private LivekitAnalytics$AnalyticsStream() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVideoLayers(Iterable<? extends LivekitAnalytics$AnalyticsVideoLayer> iterable) {
        ensureVideoLayersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.videoLayers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideoLayers(LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer) {
        livekitAnalytics$AnalyticsVideoLayer.getClass();
        ensureVideoLayersIsMutable();
        this.videoLayers_.add(livekitAnalytics$AnalyticsVideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirs() {
        this.firs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrames() {
        this.frames_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJitter() {
        this.jitter_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNacks() {
        this.nacks_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacketsLost() {
        this.packetsLost_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacketsOutOfOrder() {
        this.packetsOutOfOrder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaddingBytes() {
        this.paddingBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaddingPackets() {
        this.paddingPackets_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlis() {
        this.plis_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryBytes() {
        this.primaryBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryPackets() {
        this.primaryPackets_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetransmitBytes() {
        this.retransmitBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetransmitPackets() {
        this.retransmitPackets_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtt() {
        this.rtt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSsrc() {
        this.ssrc_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoLayers() {
        this.videoLayers_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureVideoLayersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.videoLayers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.videoLayers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitAnalytics$AnalyticsStream getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.endTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.endTime_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.endTime_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.endTime_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.startTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.startTime_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.startTime_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.startTime_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    public static C14665U newBuilder() {
        return (C14665U) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsStream parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVideoLayers(int i10) {
        ensureVideoLayersIsMutable();
        this.videoLayers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(Timestamp timestamp) {
        timestamp.getClass();
        this.endTime_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirs(int i10) {
        this.firs_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrames(int i10) {
        this.frames_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJitter(int i10) {
        this.jitter_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNacks(int i10) {
        this.nacks_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacketsLost(int i10) {
        this.packetsLost_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacketsOutOfOrder(int i10) {
        this.packetsOutOfOrder_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaddingBytes(long j10) {
        this.paddingBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaddingPackets(int i10) {
        this.paddingPackets_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlis(int i10) {
        this.plis_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryBytes(long j10) {
        this.primaryBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryPackets(int i10) {
        this.primaryPackets_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetransmitBytes(long j10) {
        this.retransmitBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetransmitPackets(int i10) {
        this.retransmitPackets_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtt(int i10) {
        this.rtt_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSsrc(int i10) {
        this.ssrc_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(Timestamp timestamp) {
        timestamp.getClass();
        this.startTime_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoLayers(int i10, LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer) {
        livekitAnalytics$AnalyticsVideoLayer.getClass();
        ensureVideoLayersIsMutable();
        this.videoLayers_.set(i10, livekitAnalytics$AnalyticsVideoLayer);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0013\u0012\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u0003\u0004\u000b\u0005\u0003\u0006\u000b\u0007\u0003\b\u000b\t\u000b\n\u000b\u000b\u000b\f\u000b\r\u000b\u000e\u000b\u000f\u001b\u0011\t\u0012\t\u0013\u000b", new Object[]{"ssrc_", "primaryPackets_", "primaryBytes_", "retransmitPackets_", "retransmitBytes_", "paddingPackets_", "paddingBytes_", "packetsLost_", "frames_", "rtt_", "jitter_", "nacks_", "plis_", "firs_", "videoLayers_", LivekitAnalytics$AnalyticsVideoLayer.class, "startTime_", "endTime_", "packetsOutOfOrder_"});
            case 3:
                return new LivekitAnalytics$AnalyticsStream();
            case 4:
                return new C14665U(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsStream.class) {
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

    public Timestamp getEndTime() {
        Timestamp timestamp = this.endTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getFirs() {
        return this.firs_;
    }

    public int getFrames() {
        return this.frames_;
    }

    public int getJitter() {
        return this.jitter_;
    }

    public int getNacks() {
        return this.nacks_;
    }

    public int getPacketsLost() {
        return this.packetsLost_;
    }

    public int getPacketsOutOfOrder() {
        return this.packetsOutOfOrder_;
    }

    public long getPaddingBytes() {
        return this.paddingBytes_;
    }

    public int getPaddingPackets() {
        return this.paddingPackets_;
    }

    public int getPlis() {
        return this.plis_;
    }

    public long getPrimaryBytes() {
        return this.primaryBytes_;
    }

    public int getPrimaryPackets() {
        return this.primaryPackets_;
    }

    public long getRetransmitBytes() {
        return this.retransmitBytes_;
    }

    public int getRetransmitPackets() {
        return this.retransmitPackets_;
    }

    public int getRtt() {
        return this.rtt_;
    }

    public int getSsrc() {
        return this.ssrc_;
    }

    public Timestamp getStartTime() {
        Timestamp timestamp = this.startTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public LivekitAnalytics$AnalyticsVideoLayer getVideoLayers(int i10) {
        return (LivekitAnalytics$AnalyticsVideoLayer) this.videoLayers_.get(i10);
    }

    public int getVideoLayersCount() {
        return this.videoLayers_.size();
    }

    public List<LivekitAnalytics$AnalyticsVideoLayer> getVideoLayersList() {
        return this.videoLayers_;
    }

    public InterfaceC14683X getVideoLayersOrBuilder(int i10) {
        return (InterfaceC14683X) this.videoLayers_.get(i10);
    }

    public List<? extends InterfaceC14683X> getVideoLayersOrBuilderList() {
        return this.videoLayers_;
    }

    public boolean hasEndTime() {
        return this.endTime_ != null;
    }

    public boolean hasStartTime() {
        return this.startTime_ != null;
    }

    public static C14665U newBuilder(LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream) {
        return (C14665U) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsStream);
    }

    public static LivekitAnalytics$AnalyticsStream parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideoLayers(int i10, LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer) {
        livekitAnalytics$AnalyticsVideoLayer.getClass();
        ensureVideoLayersIsMutable();
        this.videoLayers_.add(i10, livekitAnalytics$AnalyticsVideoLayer);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
