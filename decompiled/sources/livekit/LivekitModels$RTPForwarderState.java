package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14551B2;
import p793ho.C14726d3;
import p793ho.C14879z2;
import p793ho.EnumC14544A2;
import p793ho.InterfaceC14865x2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$RTPForwarderState extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$RTPForwarderState DEFAULT_INSTANCE;
    public static final int DUMMY_START_TIMESTAMP_OFFSET_FIELD_NUMBER = 5;
    public static final int EXT_FIRST_TIMESTAMP_FIELD_NUMBER = 4;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PRE_START_TIME_FIELD_NUMBER = 3;
    public static final int REFERENCE_LAYER_SPATIAL_FIELD_NUMBER = 2;
    public static final int RTP_MUNGER_FIELD_NUMBER = 6;
    public static final int SENDER_REPORT_STATE_FIELD_NUMBER = 8;
    public static final int STARTED_FIELD_NUMBER = 1;
    public static final int VP8_MUNGER_FIELD_NUMBER = 7;
    private Object codecMunger_;
    private long dummyStartTimestampOffset_;
    private long extFirstTimestamp_;
    private long preStartTime_;
    private int referenceLayerSpatial_;
    private LivekitModels$RTPMungerState rtpMunger_;
    private boolean started_;
    private int codecMungerCase_ = 0;
    private InterfaceC12172m0 senderReportState_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitModels$RTPForwarderState livekitModels$RTPForwarderState = new LivekitModels$RTPForwarderState();
        DEFAULT_INSTANCE = livekitModels$RTPForwarderState;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$RTPForwarderState.class, livekitModels$RTPForwarderState);
    }

    private LivekitModels$RTPForwarderState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSenderReportState(Iterable<? extends LivekitModels$RTCPSenderReportState> iterable) {
        ensureSenderReportStateIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.senderReportState_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSenderReportState(LivekitModels$RTCPSenderReportState livekitModels$RTCPSenderReportState) {
        livekitModels$RTCPSenderReportState.getClass();
        ensureSenderReportStateIsMutable();
        this.senderReportState_.add(livekitModels$RTCPSenderReportState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodecMunger() {
        this.codecMungerCase_ = 0;
        this.codecMunger_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDummyStartTimestampOffset() {
        this.dummyStartTimestampOffset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtFirstTimestamp() {
        this.extFirstTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreStartTime() {
        this.preStartTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferenceLayerSpatial() {
        this.referenceLayerSpatial_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtpMunger() {
        this.rtpMunger_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderReportState() {
        this.senderReportState_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStarted() {
        this.started_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVp8Munger() {
        if (this.codecMungerCase_ == 7) {
            this.codecMungerCase_ = 0;
            this.codecMunger_ = null;
        }
    }

    private void ensureSenderReportStateIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.senderReportState_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.senderReportState_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitModels$RTPForwarderState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRtpMunger(LivekitModels$RTPMungerState livekitModels$RTPMungerState) {
        livekitModels$RTPMungerState.getClass();
        LivekitModels$RTPMungerState livekitModels$RTPMungerState2 = this.rtpMunger_;
        if (livekitModels$RTPMungerState2 == null || livekitModels$RTPMungerState2 == LivekitModels$RTPMungerState.getDefaultInstance()) {
            this.rtpMunger_ = livekitModels$RTPMungerState;
            return;
        }
        C14551B2 c14551b2NewBuilder = LivekitModels$RTPMungerState.newBuilder(this.rtpMunger_);
        c14551b2NewBuilder.m13865f(livekitModels$RTPMungerState);
        this.rtpMunger_ = (LivekitModels$RTPMungerState) c14551b2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVp8Munger(LivekitModels$VP8MungerState livekitModels$VP8MungerState) {
        livekitModels$VP8MungerState.getClass();
        if (this.codecMungerCase_ != 7 || this.codecMunger_ == LivekitModels$VP8MungerState.getDefaultInstance()) {
            this.codecMunger_ = livekitModels$VP8MungerState;
        } else {
            C14726d3 c14726d3NewBuilder = LivekitModels$VP8MungerState.newBuilder((LivekitModels$VP8MungerState) this.codecMunger_);
            c14726d3NewBuilder.m13865f(livekitModels$VP8MungerState);
            this.codecMunger_ = c14726d3NewBuilder.m13862c();
        }
        this.codecMungerCase_ = 7;
    }

    public static C14879z2 newBuilder() {
        return (C14879z2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$RTPForwarderState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTPForwarderState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSenderReportState(int i10) {
        ensureSenderReportStateIsMutable();
        this.senderReportState_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDummyStartTimestampOffset(long j10) {
        this.dummyStartTimestampOffset_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtFirstTimestamp(long j10) {
        this.extFirstTimestamp_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreStartTime(long j10) {
        this.preStartTime_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferenceLayerSpatial(int i10) {
        this.referenceLayerSpatial_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtpMunger(LivekitModels$RTPMungerState livekitModels$RTPMungerState) {
        livekitModels$RTPMungerState.getClass();
        this.rtpMunger_ = livekitModels$RTPMungerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderReportState(int i10, LivekitModels$RTCPSenderReportState livekitModels$RTCPSenderReportState) {
        livekitModels$RTCPSenderReportState.getClass();
        ensureSenderReportStateIsMutable();
        this.senderReportState_.set(i10, livekitModels$RTCPSenderReportState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStarted(boolean z6) {
        this.started_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVp8Munger(LivekitModels$VP8MungerState livekitModels$VP8MungerState) {
        livekitModels$VP8MungerState.getClass();
        this.codecMunger_ = livekitModels$VP8MungerState;
        this.codecMungerCase_ = 7;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002\u0004\u0003\u0002\u0004\u0003\u0005\u0003\u0006\t\u0007<\u0000\b\u001b", new Object[]{"codecMunger_", "codecMungerCase_", "started_", "referenceLayerSpatial_", "preStartTime_", "extFirstTimestamp_", "dummyStartTimestampOffset_", "rtpMunger_", LivekitModels$VP8MungerState.class, "senderReportState_", LivekitModels$RTCPSenderReportState.class});
            case 3:
                return new LivekitModels$RTPForwarderState();
            case 4:
                return new C14879z2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$RTPForwarderState.class) {
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

    public EnumC14544A2 getCodecMungerCase() {
        int i10 = this.codecMungerCase_;
        if (i10 == 0) {
            return EnumC14544A2.f45815Z;
        }
        if (i10 != 7) {
            return null;
        }
        return EnumC14544A2.f45814Y;
    }

    public long getDummyStartTimestampOffset() {
        return this.dummyStartTimestampOffset_;
    }

    public long getExtFirstTimestamp() {
        return this.extFirstTimestamp_;
    }

    public long getPreStartTime() {
        return this.preStartTime_;
    }

    public int getReferenceLayerSpatial() {
        return this.referenceLayerSpatial_;
    }

    public LivekitModels$RTPMungerState getRtpMunger() {
        LivekitModels$RTPMungerState livekitModels$RTPMungerState = this.rtpMunger_;
        return livekitModels$RTPMungerState == null ? LivekitModels$RTPMungerState.getDefaultInstance() : livekitModels$RTPMungerState;
    }

    public LivekitModels$RTCPSenderReportState getSenderReportState(int i10) {
        return (LivekitModels$RTCPSenderReportState) this.senderReportState_.get(i10);
    }

    public int getSenderReportStateCount() {
        return this.senderReportState_.size();
    }

    public List<LivekitModels$RTCPSenderReportState> getSenderReportStateList() {
        return this.senderReportState_;
    }

    public InterfaceC14865x2 getSenderReportStateOrBuilder(int i10) {
        return (InterfaceC14865x2) this.senderReportState_.get(i10);
    }

    public List<? extends InterfaceC14865x2> getSenderReportStateOrBuilderList() {
        return this.senderReportState_;
    }

    public boolean getStarted() {
        return this.started_;
    }

    public LivekitModels$VP8MungerState getVp8Munger() {
        return this.codecMungerCase_ == 7 ? (LivekitModels$VP8MungerState) this.codecMunger_ : LivekitModels$VP8MungerState.getDefaultInstance();
    }

    public boolean hasRtpMunger() {
        return this.rtpMunger_ != null;
    }

    public boolean hasVp8Munger() {
        return this.codecMungerCase_ == 7;
    }

    public static C14879z2 newBuilder(LivekitModels$RTPForwarderState livekitModels$RTPForwarderState) {
        return (C14879z2) DEFAULT_INSTANCE.createBuilder(livekitModels$RTPForwarderState);
    }

    public static LivekitModels$RTPForwarderState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RTPForwarderState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$RTPForwarderState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSenderReportState(int i10, LivekitModels$RTCPSenderReportState livekitModels$RTCPSenderReportState) {
        livekitModels$RTCPSenderReportState.getClass();
        ensureSenderReportStateIsMutable();
        this.senderReportState_.add(i10, livekitModels$RTCPSenderReportState);
    }

    public static LivekitModels$RTPForwarderState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$RTPForwarderState parseFrom(byte[] bArr) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$RTPForwarderState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$RTPForwarderState parseFrom(InputStream inputStream) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTPForwarderState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RTPForwarderState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$RTPForwarderState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$RTPForwarderState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
