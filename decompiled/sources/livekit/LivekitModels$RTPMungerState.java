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
import p793ho.C14551B2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$RTPMungerState extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$RTPMungerState DEFAULT_INSTANCE;
    public static final int EXT_LAST_SEQUENCE_NUMBER_FIELD_NUMBER = 1;
    public static final int EXT_LAST_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int EXT_SECOND_LAST_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    public static final int EXT_SECOND_LAST_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int LAST_MARKER_FIELD_NUMBER = 5;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SECOND_LAST_MARKER_FIELD_NUMBER = 6;
    private long extLastSequenceNumber_;
    private long extLastTimestamp_;
    private long extSecondLastSequenceNumber_;
    private long extSecondLastTimestamp_;
    private boolean lastMarker_;
    private boolean secondLastMarker_;

    static {
        LivekitModels$RTPMungerState livekitModels$RTPMungerState = new LivekitModels$RTPMungerState();
        DEFAULT_INSTANCE = livekitModels$RTPMungerState;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$RTPMungerState.class, livekitModels$RTPMungerState);
    }

    private LivekitModels$RTPMungerState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtLastSequenceNumber() {
        this.extLastSequenceNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtLastTimestamp() {
        this.extLastTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtSecondLastSequenceNumber() {
        this.extSecondLastSequenceNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtSecondLastTimestamp() {
        this.extSecondLastTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastMarker() {
        this.lastMarker_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondLastMarker() {
        this.secondLastMarker_ = false;
    }

    public static LivekitModels$RTPMungerState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14551B2 newBuilder() {
        return (C14551B2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$RTPMungerState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTPMungerState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtLastSequenceNumber(long j10) {
        this.extLastSequenceNumber_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtLastTimestamp(long j10) {
        this.extLastTimestamp_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtSecondLastSequenceNumber(long j10) {
        this.extSecondLastSequenceNumber_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtSecondLastTimestamp(long j10) {
        this.extSecondLastTimestamp_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastMarker(boolean z6) {
        this.lastMarker_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondLastMarker(boolean z6) {
        this.secondLastMarker_ = z6;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u0003\u0005\u0007\u0006\u0007", new Object[]{"extLastSequenceNumber_", "extSecondLastSequenceNumber_", "extLastTimestamp_", "extSecondLastTimestamp_", "lastMarker_", "secondLastMarker_"});
            case 3:
                return new LivekitModels$RTPMungerState();
            case 4:
                return new C14551B2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$RTPMungerState.class) {
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

    public long getExtLastSequenceNumber() {
        return this.extLastSequenceNumber_;
    }

    public long getExtLastTimestamp() {
        return this.extLastTimestamp_;
    }

    public long getExtSecondLastSequenceNumber() {
        return this.extSecondLastSequenceNumber_;
    }

    public long getExtSecondLastTimestamp() {
        return this.extSecondLastTimestamp_;
    }

    public boolean getLastMarker() {
        return this.lastMarker_;
    }

    public boolean getSecondLastMarker() {
        return this.secondLastMarker_;
    }

    public static C14551B2 newBuilder(LivekitModels$RTPMungerState livekitModels$RTPMungerState) {
        return (C14551B2) DEFAULT_INSTANCE.createBuilder(livekitModels$RTPMungerState);
    }

    public static LivekitModels$RTPMungerState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RTPMungerState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$RTPMungerState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$RTPMungerState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$RTPMungerState parseFrom(byte[] bArr) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$RTPMungerState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$RTPMungerState parseFrom(InputStream inputStream) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTPMungerState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$RTPMungerState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$RTPMungerState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$RTPMungerState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
