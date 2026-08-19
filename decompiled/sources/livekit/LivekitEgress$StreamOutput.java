package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14684X0;
import p793ho.EnumC14696Z0;
import p793ho.InterfaceC14690Y0;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$StreamOutput extends AbstractC12133Z implements InterfaceC14690Y0 {
    private static final LivekitEgress$StreamOutput DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 1;
    public static final int URLS_FIELD_NUMBER = 2;
    private int protocol_;
    private InterfaceC12172m0 urls_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitEgress$StreamOutput livekitEgress$StreamOutput = new LivekitEgress$StreamOutput();
        DEFAULT_INSTANCE = livekitEgress$StreamOutput;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$StreamOutput.class, livekitEgress$StreamOutput);
    }

    private LivekitEgress$StreamOutput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUrls(Iterable<String> iterable) {
        ensureUrlsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.urls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrls(String str) {
        str.getClass();
        ensureUrlsIsMutable();
        this.urls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrlsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureUrlsIsMutable();
        this.urls_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrls() {
        this.urls_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureUrlsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.urls_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.urls_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitEgress$StreamOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14684X0 newBuilder() {
        return (C14684X0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$StreamOutput parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamOutput parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(EnumC14696Z0 enumC14696Z0) {
        this.protocol_ = enumC14696Z0.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolValue(int i10) {
        this.protocol_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrls(int i10, String str) {
        str.getClass();
        ensureUrlsIsMutable();
        this.urls_.set(i10, str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"protocol_", "urls_"});
            case 3:
                return new LivekitEgress$StreamOutput();
            case 4:
                return new C14684X0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$StreamOutput.class) {
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

    public EnumC14696Z0 getProtocol() {
        EnumC14696Z0 enumC14696Z0;
        int i10 = this.protocol_;
        if (i10 == 0) {
            enumC14696Z0 = EnumC14696Z0.DEFAULT_PROTOCOL;
        } else if (i10 != 1) {
            enumC14696Z0 = i10 != 2 ? null : EnumC14696Z0.SRT;
        } else {
            enumC14696Z0 = EnumC14696Z0.RTMP;
        }
        return enumC14696Z0 == null ? EnumC14696Z0.UNRECOGNIZED : enumC14696Z0;
    }

    public int getProtocolValue() {
        return this.protocol_;
    }

    public String getUrls(int i10) {
        return (String) this.urls_.get(i10);
    }

    public AbstractC12171m getUrlsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.urls_.get(i10));
    }

    public int getUrlsCount() {
        return this.urls_.size();
    }

    public List<String> getUrlsList() {
        return this.urls_;
    }

    public static C14684X0 newBuilder(LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        return (C14684X0) DEFAULT_INSTANCE.createBuilder(livekitEgress$StreamOutput);
    }

    public static LivekitEgress$StreamOutput parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$StreamOutput parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$StreamOutput parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$StreamOutput parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$StreamOutput parseFrom(byte[] bArr) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$StreamOutput parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$StreamOutput parseFrom(InputStream inputStream) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamOutput parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$StreamOutput parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$StreamOutput parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$StreamOutput) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
