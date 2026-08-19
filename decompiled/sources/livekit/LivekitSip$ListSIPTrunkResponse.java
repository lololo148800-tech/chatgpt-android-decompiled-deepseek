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
import p793ho.C14756h5;
import p793ho.InterfaceC14561C5;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LivekitSip$ListSIPTrunkResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$ListSIPTrunkResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private InterfaceC12172m0 items_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitSip$ListSIPTrunkResponse livekitSip$ListSIPTrunkResponse = new LivekitSip$ListSIPTrunkResponse();
        DEFAULT_INSTANCE = livekitSip$ListSIPTrunkResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$ListSIPTrunkResponse.class, livekitSip$ListSIPTrunkResponse);
    }

    private LivekitSip$ListSIPTrunkResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends LivekitSip$SIPTrunkInfo> iterable) {
        ensureItemsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(LivekitSip$SIPTrunkInfo livekitSip$SIPTrunkInfo) {
        livekitSip$SIPTrunkInfo.getClass();
        ensureItemsIsMutable();
        this.items_.add(livekitSip$SIPTrunkInfo);
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

    public static LivekitSip$ListSIPTrunkResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14756h5 newBuilder() {
        return (C14756h5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$ListSIPTrunkResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setItems(int i10, LivekitSip$SIPTrunkInfo livekitSip$SIPTrunkInfo) {
        livekitSip$SIPTrunkInfo.getClass();
        ensureItemsIsMutable();
        this.items_.set(i10, livekitSip$SIPTrunkInfo);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", LivekitSip$SIPTrunkInfo.class});
            case 3:
                return new LivekitSip$ListSIPTrunkResponse();
            case 4:
                return new C14756h5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$ListSIPTrunkResponse.class) {
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

    public LivekitSip$SIPTrunkInfo getItems(int i10) {
        return (LivekitSip$SIPTrunkInfo) this.items_.get(i10);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<LivekitSip$SIPTrunkInfo> getItemsList() {
        return this.items_;
    }

    public InterfaceC14561C5 getItemsOrBuilder(int i10) {
        return (InterfaceC14561C5) this.items_.get(i10);
    }

    public List<? extends InterfaceC14561C5> getItemsOrBuilderList() {
        return this.items_;
    }

    public static C14756h5 newBuilder(LivekitSip$ListSIPTrunkResponse livekitSip$ListSIPTrunkResponse) {
        return (C14756h5) DEFAULT_INSTANCE.createBuilder(livekitSip$ListSIPTrunkResponse);
    }

    public static LivekitSip$ListSIPTrunkResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i10, LivekitSip$SIPTrunkInfo livekitSip$SIPTrunkInfo) {
        livekitSip$SIPTrunkInfo.getClass();
        ensureItemsIsMutable();
        this.items_.add(i10, livekitSip$SIPTrunkInfo);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(byte[] bArr) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(InputStream inputStream) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$ListSIPTrunkResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$ListSIPTrunkResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
