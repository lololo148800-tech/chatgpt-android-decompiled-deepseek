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
import p793ho.C14557C1;
import p793ho.InterfaceC14822r1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$ListIngressResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitIngress$ListIngressResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private InterfaceC12172m0 items_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitIngress$ListIngressResponse livekitIngress$ListIngressResponse = new LivekitIngress$ListIngressResponse();
        DEFAULT_INSTANCE = livekitIngress$ListIngressResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$ListIngressResponse.class, livekitIngress$ListIngressResponse);
    }

    private LivekitIngress$ListIngressResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends LivekitIngress$IngressInfo> iterable) {
        ensureItemsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        ensureItemsIsMutable();
        this.items_.add(livekitIngress$IngressInfo);
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

    public static LivekitIngress$ListIngressResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14557C1 newBuilder() {
        return (C14557C1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$ListIngressResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setItems(int i10, LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        ensureItemsIsMutable();
        this.items_.set(i10, livekitIngress$IngressInfo);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", LivekitIngress$IngressInfo.class});
            case 3:
                return new LivekitIngress$ListIngressResponse();
            case 4:
                return new C14557C1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$ListIngressResponse.class) {
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

    public LivekitIngress$IngressInfo getItems(int i10) {
        return (LivekitIngress$IngressInfo) this.items_.get(i10);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<LivekitIngress$IngressInfo> getItemsList() {
        return this.items_;
    }

    public InterfaceC14822r1 getItemsOrBuilder(int i10) {
        return (InterfaceC14822r1) this.items_.get(i10);
    }

    public List<? extends InterfaceC14822r1> getItemsOrBuilderList() {
        return this.items_;
    }

    public static C14557C1 newBuilder(LivekitIngress$ListIngressResponse livekitIngress$ListIngressResponse) {
        return (C14557C1) DEFAULT_INSTANCE.createBuilder(livekitIngress$ListIngressResponse);
    }

    public static LivekitIngress$ListIngressResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i10, LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        ensureItemsIsMutable();
        this.items_.add(i10, livekitIngress$IngressInfo);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(byte[] bArr) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(InputStream inputStream) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$ListIngressResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
