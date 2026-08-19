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
import p793ho.C14556C0;
import p793ho.InterfaceC14772k0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$ListEgressResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitEgress$ListEgressResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private InterfaceC12172m0 items_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitEgress$ListEgressResponse livekitEgress$ListEgressResponse = new LivekitEgress$ListEgressResponse();
        DEFAULT_INSTANCE = livekitEgress$ListEgressResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$ListEgressResponse.class, livekitEgress$ListEgressResponse);
    }

    private LivekitEgress$ListEgressResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends LivekitEgress$EgressInfo> iterable) {
        ensureItemsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        ensureItemsIsMutable();
        this.items_.add(livekitEgress$EgressInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.items_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.items_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitEgress$ListEgressResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14556C0 newBuilder() {
        return (C14556C0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$ListEgressResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i10) {
        ensureItemsIsMutable();
        this.items_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i10, LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        ensureItemsIsMutable();
        this.items_.set(i10, livekitEgress$EgressInfo);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", LivekitEgress$EgressInfo.class});
            case 3:
                return new LivekitEgress$ListEgressResponse();
            case 4:
                return new C14556C0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$ListEgressResponse.class) {
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

    public LivekitEgress$EgressInfo getItems(int i10) {
        return (LivekitEgress$EgressInfo) this.items_.get(i10);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<LivekitEgress$EgressInfo> getItemsList() {
        return this.items_;
    }

    public InterfaceC14772k0 getItemsOrBuilder(int i10) {
        return (InterfaceC14772k0) this.items_.get(i10);
    }

    public List<? extends InterfaceC14772k0> getItemsOrBuilderList() {
        return this.items_;
    }

    public static C14556C0 newBuilder(LivekitEgress$ListEgressResponse livekitEgress$ListEgressResponse) {
        return (C14556C0) DEFAULT_INSTANCE.createBuilder(livekitEgress$ListEgressResponse);
    }

    public static LivekitEgress$ListEgressResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i10, LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        ensureItemsIsMutable();
        this.items_.add(i10, livekitEgress$EgressInfo);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(byte[] bArr) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(InputStream inputStream) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$ListEgressResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$ListEgressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
