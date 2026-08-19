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
import p793ho.C14803o3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$ListRoomsRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRoom$ListRoomsRequest DEFAULT_INSTANCE;
    public static final int NAMES_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private InterfaceC12172m0 names_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRoom$ListRoomsRequest livekitRoom$ListRoomsRequest = new LivekitRoom$ListRoomsRequest();
        DEFAULT_INSTANCE = livekitRoom$ListRoomsRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$ListRoomsRequest.class, livekitRoom$ListRoomsRequest);
    }

    private LivekitRoom$ListRoomsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNames(Iterable<String> iterable) {
        ensureNamesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.names_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNames(String str) {
        str.getClass();
        ensureNamesIsMutable();
        this.names_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNamesBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureNamesIsMutable();
        this.names_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNames() {
        this.names_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureNamesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.names_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.names_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRoom$ListRoomsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14803o3 newBuilder() {
        return (C14803o3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$ListRoomsRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNames(int i10, String str) {
        str.getClass();
        ensureNamesIsMutable();
        this.names_.set(i10, str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"names_"});
            case 3:
                return new LivekitRoom$ListRoomsRequest();
            case 4:
                return new C14803o3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$ListRoomsRequest.class) {
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

    public String getNames(int i10) {
        return (String) this.names_.get(i10);
    }

    public AbstractC12171m getNamesBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.names_.get(i10));
    }

    public int getNamesCount() {
        return this.names_.size();
    }

    public List<String> getNamesList() {
        return this.names_;
    }

    public static C14803o3 newBuilder(LivekitRoom$ListRoomsRequest livekitRoom$ListRoomsRequest) {
        return (C14803o3) DEFAULT_INSTANCE.createBuilder(livekitRoom$ListRoomsRequest);
    }

    public static LivekitRoom$ListRoomsRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$ListRoomsRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
