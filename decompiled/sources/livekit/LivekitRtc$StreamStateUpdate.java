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
import p793ho.C14811p4;
import p793ho.InterfaceC14804o4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$StreamStateUpdate extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$StreamStateUpdate DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int STREAM_STATES_FIELD_NUMBER = 1;
    private InterfaceC12172m0 streamStates_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$StreamStateUpdate livekitRtc$StreamStateUpdate = new LivekitRtc$StreamStateUpdate();
        DEFAULT_INSTANCE = livekitRtc$StreamStateUpdate;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$StreamStateUpdate.class, livekitRtc$StreamStateUpdate);
    }

    private LivekitRtc$StreamStateUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStreamStates(Iterable<? extends LivekitRtc$StreamStateInfo> iterable) {
        ensureStreamStatesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.streamStates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamStates(LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo) {
        livekitRtc$StreamStateInfo.getClass();
        ensureStreamStatesIsMutable();
        this.streamStates_.add(livekitRtc$StreamStateInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamStates() {
        this.streamStates_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureStreamStatesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.streamStates_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.streamStates_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$StreamStateUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14811p4 newBuilder() {
        return (C14811p4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$StreamStateUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStreamStates(int i10) {
        ensureStreamStatesIsMutable();
        this.streamStates_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamStates(int i10, LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo) {
        livekitRtc$StreamStateInfo.getClass();
        ensureStreamStatesIsMutable();
        this.streamStates_.set(i10, livekitRtc$StreamStateInfo);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"streamStates_", LivekitRtc$StreamStateInfo.class});
            case 3:
                return new LivekitRtc$StreamStateUpdate();
            case 4:
                return new C14811p4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$StreamStateUpdate.class) {
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

    public LivekitRtc$StreamStateInfo getStreamStates(int i10) {
        return (LivekitRtc$StreamStateInfo) this.streamStates_.get(i10);
    }

    public int getStreamStatesCount() {
        return this.streamStates_.size();
    }

    public List<LivekitRtc$StreamStateInfo> getStreamStatesList() {
        return this.streamStates_;
    }

    public InterfaceC14804o4 getStreamStatesOrBuilder(int i10) {
        return (InterfaceC14804o4) this.streamStates_.get(i10);
    }

    public List<? extends InterfaceC14804o4> getStreamStatesOrBuilderList() {
        return this.streamStates_;
    }

    public static C14811p4 newBuilder(LivekitRtc$StreamStateUpdate livekitRtc$StreamStateUpdate) {
        return (C14811p4) DEFAULT_INSTANCE.createBuilder(livekitRtc$StreamStateUpdate);
    }

    public static LivekitRtc$StreamStateUpdate parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamStates(int i10, LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo) {
        livekitRtc$StreamStateInfo.getClass();
        ensureStreamStatesIsMutable();
        this.streamStates_.add(i10, livekitRtc$StreamStateInfo);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$StreamStateUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
