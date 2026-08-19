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
import p793ho.C14745g1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitEgress$UpdateStreamRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ADD_OUTPUT_URLS_FIELD_NUMBER = 2;
    private static final LivekitEgress$UpdateStreamRequest DEFAULT_INSTANCE;
    public static final int EGRESS_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REMOVE_OUTPUT_URLS_FIELD_NUMBER = 3;
    private String egressId_ = "";
    private InterfaceC12172m0 addOutputUrls_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 removeOutputUrls_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitEgress$UpdateStreamRequest livekitEgress$UpdateStreamRequest = new LivekitEgress$UpdateStreamRequest();
        DEFAULT_INSTANCE = livekitEgress$UpdateStreamRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitEgress$UpdateStreamRequest.class, livekitEgress$UpdateStreamRequest);
    }

    private LivekitEgress$UpdateStreamRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddOutputUrls(String str) {
        str.getClass();
        ensureAddOutputUrlsIsMutable();
        this.addOutputUrls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddOutputUrlsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureAddOutputUrlsIsMutable();
        this.addOutputUrls_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAddOutputUrls(Iterable<String> iterable) {
        ensureAddOutputUrlsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.addOutputUrls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRemoveOutputUrls(Iterable<String> iterable) {
        ensureRemoveOutputUrlsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.removeOutputUrls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRemoveOutputUrls(String str) {
        str.getClass();
        ensureRemoveOutputUrlsIsMutable();
        this.removeOutputUrls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRemoveOutputUrlsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureRemoveOutputUrlsIsMutable();
        this.removeOutputUrls_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddOutputUrls() {
        this.addOutputUrls_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveOutputUrls() {
        this.removeOutputUrls_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureAddOutputUrlsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.addOutputUrls_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.addOutputUrls_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureRemoveOutputUrlsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.removeOutputUrls_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.removeOutputUrls_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitEgress$UpdateStreamRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14745g1 newBuilder() {
        return (C14745g1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$UpdateStreamRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddOutputUrls(int i10, String str) {
        str.getClass();
        ensureAddOutputUrlsIsMutable();
        this.addOutputUrls_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressId(String str) {
        str.getClass();
        this.egressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.egressId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveOutputUrls(int i10, String str) {
        str.getClass();
        ensureRemoveOutputUrlsIsMutable();
        this.removeOutputUrls_.set(i10, str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ț", new Object[]{"egressId_", "addOutputUrls_", "removeOutputUrls_"});
            case 3:
                return new LivekitEgress$UpdateStreamRequest();
            case 4:
                return new C14745g1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitEgress$UpdateStreamRequest.class) {
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

    public String getAddOutputUrls(int i10) {
        return (String) this.addOutputUrls_.get(i10);
    }

    public AbstractC12171m getAddOutputUrlsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.addOutputUrls_.get(i10));
    }

    public int getAddOutputUrlsCount() {
        return this.addOutputUrls_.size();
    }

    public List<String> getAddOutputUrlsList() {
        return this.addOutputUrls_;
    }

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC12171m getEgressIdBytes() {
        return AbstractC12171m.m14011m(this.egressId_);
    }

    public String getRemoveOutputUrls(int i10) {
        return (String) this.removeOutputUrls_.get(i10);
    }

    public AbstractC12171m getRemoveOutputUrlsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.removeOutputUrls_.get(i10));
    }

    public int getRemoveOutputUrlsCount() {
        return this.removeOutputUrls_.size();
    }

    public List<String> getRemoveOutputUrlsList() {
        return this.removeOutputUrls_;
    }

    public static C14745g1 newBuilder(LivekitEgress$UpdateStreamRequest livekitEgress$UpdateStreamRequest) {
        return (C14745g1) DEFAULT_INSTANCE.createBuilder(livekitEgress$UpdateStreamRequest);
    }

    public static LivekitEgress$UpdateStreamRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
