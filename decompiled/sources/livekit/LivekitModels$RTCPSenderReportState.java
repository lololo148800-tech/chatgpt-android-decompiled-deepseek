package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14858w2;
import p793ho.InterfaceC14865x2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$RTCPSenderReportState extends AbstractC12133Z implements InterfaceC14865x2 {
    public static final int AT_ADJUSTED_FIELD_NUMBER = 5;
    public static final int AT_FIELD_NUMBER = 4;
    private static final LivekitModels$RTCPSenderReportState DEFAULT_INSTANCE;
    public static final int NTP_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int OCTETS_FIELD_NUMBER = 7;
    public static final int PACKETS_FIELD_NUMBER = 6;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int RTP_TIMESTAMP_EXT_FIELD_NUMBER = 2;
    public static final int RTP_TIMESTAMP_FIELD_NUMBER = 1;
    private long atAdjusted_;
    private long at_;
    private long ntpTimestamp_;
    private long octets_;
    private int packets_;
    private long rtpTimestampExt_;
    private int rtpTimestamp_;

    static {
        LivekitModels$RTCPSenderReportState livekitModels$RTCPSenderReportState = new LivekitModels$RTCPSenderReportState();
        DEFAULT_INSTANCE = livekitModels$RTCPSenderReportState;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$RTCPSenderReportState.class, livekitModels$RTCPSenderReportState);
    }

    private LivekitModels$RTCPSenderReportState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAt() {
        this.at_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAtAdjusted() {
        this.atAdjusted_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNtpTimestamp() {
        this.ntpTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOctets() {
        this.octets_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackets() {
        this.packets_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtpTimestamp() {
        this.rtpTimestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtpTimestampExt() {
        this.rtpTimestampExt_ = 0L;
    }

    public static LivekitModels$RTCPSenderReportState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14858w2 newBuilder() {
        return (C14858w2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$RTCPSenderReportState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAt(long j10) {
        this.at_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAtAdjusted(long j10) {
        this.atAdjusted_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNtpTimestamp(long j10) {
        this.ntpTimestamp_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOctets(long j10) {
        this.octets_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackets(int i10) {
        this.packets_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtpTimestamp(int i10) {
        this.rtpTimestamp_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtpTimestampExt(long j10) {
        this.rtpTimestampExt_ = j10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\u0003\u0003\u0003\u0004\u0002\u0005\u0002\u0006\u000b\u0007\u0003", new Object[]{"rtpTimestamp_", "rtpTimestampExt_", "ntpTimestamp_", "at_", "atAdjusted_", "packets_", "octets_"});
            case 3:
                return new LivekitModels$RTCPSenderReportState();
            case 4:
                return new C14858w2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$RTCPSenderReportState.class) {
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

    public long getAt() {
        return this.at_;
    }

    public long getAtAdjusted() {
        return this.atAdjusted_;
    }

    public long getNtpTimestamp() {
        return this.ntpTimestamp_;
    }

    public long getOctets() {
        return this.octets_;
    }

    public int getPackets() {
        return this.packets_;
    }

    public int getRtpTimestamp() {
        return this.rtpTimestamp_;
    }

    public long getRtpTimestampExt() {
        return this.rtpTimestampExt_;
    }

    public static C14858w2 newBuilder(LivekitModels$RTCPSenderReportState livekitModels$RTCPSenderReportState) {
        return (C14858w2) DEFAULT_INSTANCE.createBuilder(livekitModels$RTCPSenderReportState);
    }

    public static LivekitModels$RTCPSenderReportState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(byte[] bArr) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(InputStream inputStream) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$RTCPSenderReportState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$RTCPSenderReportState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
