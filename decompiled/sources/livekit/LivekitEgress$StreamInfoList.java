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
import p793ho.C14672V0;
import p793ho.InterfaceC14678W0;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LivekitEgress$StreamInfoList extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitEgress$StreamInfoList DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private InterfaceC12172m0 info_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitEgress$StreamInfoList livekitEgress$StreamInfoList = new LivekitEgress$StreamInfoList();
        DEFAULT_INSTANCE = livekitEgress$StreamInfoList;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$StreamInfoList.class, livekitEgress$StreamInfoList);
    }

    private LivekitEgress$StreamInfoList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInfo(Iterable<? extends LivekitEgress$StreamInfo> iterable) {
        ensureInfoIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.info_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInfo(LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureInfoIsMutable();
        this.info_.add(livekitEgress$StreamInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureInfoIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.info_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.info_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitEgress$StreamInfoList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14672V0 newBuilder() {
        return (C14672V0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$StreamInfoList parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamInfoList parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInfo(int i10) {
        ensureInfoIsMutable();
        this.info_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(int i10, LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureInfoIsMutable();
        this.info_.set(i10, livekitEgress$StreamInfo);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"info_", LivekitEgress$StreamInfo.class});
            case 3:
                return new LivekitEgress$StreamInfoList();
            case 4:
                return new C14672V0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$StreamInfoList.class) {
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

    public LivekitEgress$StreamInfo getInfo(int i10) {
        return (LivekitEgress$StreamInfo) this.info_.get(i10);
    }

    public int getInfoCount() {
        return this.info_.size();
    }

    public List<LivekitEgress$StreamInfo> getInfoList() {
        return this.info_;
    }

    public InterfaceC14678W0 getInfoOrBuilder(int i10) {
        return (InterfaceC14678W0) this.info_.get(i10);
    }

    public List<? extends InterfaceC14678W0> getInfoOrBuilderList() {
        return this.info_;
    }

    public static C14672V0 newBuilder(LivekitEgress$StreamInfoList livekitEgress$StreamInfoList) {
        return (C14672V0) DEFAULT_INSTANCE.createBuilder(livekitEgress$StreamInfoList);
    }

    public static LivekitEgress$StreamInfoList parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$StreamInfoList parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$StreamInfoList parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInfo(int i10, LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureInfoIsMutable();
        this.info_.add(i10, livekitEgress$StreamInfo);
    }

    public static LivekitEgress$StreamInfoList parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$StreamInfoList parseFrom(byte[] bArr) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$StreamInfoList parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$StreamInfoList parseFrom(InputStream inputStream) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamInfoList parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$StreamInfoList parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$StreamInfoList parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$StreamInfoList) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
