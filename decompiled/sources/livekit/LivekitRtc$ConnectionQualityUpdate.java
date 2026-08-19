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
import p793ho.C14598I3;
import p793ho.InterfaceC14592H3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$ConnectionQualityUpdate extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$ConnectionQualityUpdate DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int UPDATES_FIELD_NUMBER = 1;
    private InterfaceC12172m0 updates_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$ConnectionQualityUpdate livekitRtc$ConnectionQualityUpdate = new LivekitRtc$ConnectionQualityUpdate();
        DEFAULT_INSTANCE = livekitRtc$ConnectionQualityUpdate;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$ConnectionQualityUpdate.class, livekitRtc$ConnectionQualityUpdate);
    }

    private LivekitRtc$ConnectionQualityUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUpdates(Iterable<? extends LivekitRtc$ConnectionQualityInfo> iterable) {
        ensureUpdatesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.updates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpdates(LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo) {
        livekitRtc$ConnectionQualityInfo.getClass();
        ensureUpdatesIsMutable();
        this.updates_.add(livekitRtc$ConnectionQualityInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdates() {
        this.updates_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureUpdatesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.updates_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.updates_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$ConnectionQualityUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14598I3 newBuilder() {
        return (C14598I3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$ConnectionQualityUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUpdates(int i10) {
        ensureUpdatesIsMutable();
        this.updates_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdates(int i10, LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo) {
        livekitRtc$ConnectionQualityInfo.getClass();
        ensureUpdatesIsMutable();
        this.updates_.set(i10, livekitRtc$ConnectionQualityInfo);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"updates_", LivekitRtc$ConnectionQualityInfo.class});
            case 3:
                return new LivekitRtc$ConnectionQualityUpdate();
            case 4:
                return new C14598I3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$ConnectionQualityUpdate.class) {
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

    public LivekitRtc$ConnectionQualityInfo getUpdates(int i10) {
        return (LivekitRtc$ConnectionQualityInfo) this.updates_.get(i10);
    }

    public int getUpdatesCount() {
        return this.updates_.size();
    }

    public List<LivekitRtc$ConnectionQualityInfo> getUpdatesList() {
        return this.updates_;
    }

    public InterfaceC14592H3 getUpdatesOrBuilder(int i10) {
        return (InterfaceC14592H3) this.updates_.get(i10);
    }

    public List<? extends InterfaceC14592H3> getUpdatesOrBuilderList() {
        return this.updates_;
    }

    public static C14598I3 newBuilder(LivekitRtc$ConnectionQualityUpdate livekitRtc$ConnectionQualityUpdate) {
        return (C14598I3) DEFAULT_INSTANCE.createBuilder(livekitRtc$ConnectionQualityUpdate);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpdates(int i10, LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo) {
        livekitRtc$ConnectionQualityInfo.getClass();
        ensureUpdatesIsMutable();
        this.updates_.add(i10, livekitRtc$ConnectionQualityInfo);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
