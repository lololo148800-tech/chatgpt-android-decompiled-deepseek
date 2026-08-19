package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12076B0;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p793ho.AbstractC14826r5;
import p793ho.AbstractC14833s5;
import p793ho.C14819q5;
import p793ho.InterfaceC14840t5;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$SIPInboundTrunkInfo extends AbstractC12133Z implements InterfaceC14840t5 {
    public static final int ALLOWED_ADDRESSES_FIELD_NUMBER = 5;
    public static final int ALLOWED_NUMBERS_FIELD_NUMBER = 6;
    public static final int AUTH_PASSWORD_FIELD_NUMBER = 8;
    public static final int AUTH_USERNAME_FIELD_NUMBER = 7;
    private static final LivekitSip$SIPInboundTrunkInfo DEFAULT_INSTANCE;
    public static final int HEADERS_FIELD_NUMBER = 9;
    public static final int HEADERS_TO_ATTRIBUTES_FIELD_NUMBER = 10;
    public static final int METADATA_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUMBERS_FIELD_NUMBER = 4;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SIP_TRUNK_ID_FIELD_NUMBER = 1;
    private InterfaceC12172m0 allowedAddresses_;
    private InterfaceC12172m0 allowedNumbers_;
    private String authPassword_;
    private String authUsername_;
    private C12076B0 headersToAttributes_;
    private C12076B0 headers_;
    private String metadata_;
    private String name_;
    private InterfaceC12172m0 numbers_;
    private String sipTrunkId_;

    static {
        LivekitSip$SIPInboundTrunkInfo livekitSip$SIPInboundTrunkInfo = new LivekitSip$SIPInboundTrunkInfo();
        DEFAULT_INSTANCE = livekitSip$SIPInboundTrunkInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$SIPInboundTrunkInfo.class, livekitSip$SIPInboundTrunkInfo);
    }

    private LivekitSip$SIPInboundTrunkInfo() {
        C12076B0 c12076b0 = C12076B0.f36868Z;
        this.headers_ = c12076b0;
        this.headersToAttributes_ = c12076b0;
        this.sipTrunkId_ = "";
        this.name_ = "";
        this.metadata_ = "";
        this.numbers_ = AbstractC12133Z.emptyProtobufList();
        this.allowedAddresses_ = AbstractC12133Z.emptyProtobufList();
        this.allowedNumbers_ = AbstractC12133Z.emptyProtobufList();
        this.authUsername_ = "";
        this.authPassword_ = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedAddresses(Iterable<String> iterable) {
        ensureAllowedAddressesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.allowedAddresses_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedNumbers(Iterable<String> iterable) {
        ensureAllowedNumbersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.allowedNumbers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNumbers(Iterable<String> iterable) {
        ensureNumbersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.numbers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedAddresses(String str) {
        str.getClass();
        ensureAllowedAddressesIsMutable();
        this.allowedAddresses_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedAddressesBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureAllowedAddressesIsMutable();
        this.allowedAddresses_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedNumbers(String str) {
        str.getClass();
        ensureAllowedNumbersIsMutable();
        this.allowedNumbers_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedNumbersBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureAllowedNumbersIsMutable();
        this.allowedNumbers_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNumbers(String str) {
        str.getClass();
        ensureNumbersIsMutable();
        this.numbers_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNumbersBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureNumbersIsMutable();
        this.numbers_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedAddresses() {
        this.allowedAddresses_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedNumbers() {
        this.allowedNumbers_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthPassword() {
        this.authPassword_ = getDefaultInstance().getAuthPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthUsername() {
        this.authUsername_ = getDefaultInstance().getAuthUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumbers() {
        this.numbers_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipTrunkId() {
        this.sipTrunkId_ = getDefaultInstance().getSipTrunkId();
    }

    private void ensureAllowedAddressesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.allowedAddresses_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.allowedAddresses_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureAllowedNumbersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.allowedNumbers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.allowedNumbers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureNumbersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.numbers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.numbers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitSip$SIPInboundTrunkInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableHeadersMap() {
        return internalGetMutableHeaders();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableHeadersToAttributesMap() {
        return internalGetMutableHeadersToAttributes();
    }

    private C12076B0 internalGetHeaders() {
        return this.headers_;
    }

    private C12076B0 internalGetHeadersToAttributes() {
        return this.headersToAttributes_;
    }

    private C12076B0 internalGetMutableHeaders() {
        C12076B0 c12076b0 = this.headers_;
        if (!c12076b0.f36869Y) {
            this.headers_ = c12076b0.m13719c();
        }
        return this.headers_;
    }

    private C12076B0 internalGetMutableHeadersToAttributes() {
        C12076B0 c12076b0 = this.headersToAttributes_;
        if (!c12076b0.f36869Y) {
            this.headersToAttributes_ = c12076b0.m13719c();
        }
        return this.headersToAttributes_;
    }

    public static C14819q5 newBuilder() {
        return (C14819q5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPInboundTrunkInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedAddresses(int i10, String str) {
        str.getClass();
        ensureAllowedAddressesIsMutable();
        this.allowedAddresses_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedNumbers(int i10, String str) {
        str.getClass();
        ensureAllowedNumbersIsMutable();
        this.allowedNumbers_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthPassword(String str) {
        str.getClass();
        this.authPassword_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthPasswordBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.authPassword_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthUsername(String str) {
        str.getClass();
        this.authUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthUsernameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.authUsername_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(String str) {
        str.getClass();
        this.metadata_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.metadata_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.name_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumbers(int i10, String str) {
        str.getClass();
        ensureNumbersIsMutable();
        this.numbers_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkId(String str) {
        str.getClass();
        this.sipTrunkId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sipTrunkId_ = abstractC12171m.m14012w();
    }

    public boolean containsHeaders(String str) {
        str.getClass();
        return internalGetHeaders().containsKey(str);
    }

    public boolean containsHeadersToAttributes(String str) {
        str.getClass();
        return internalGetHeadersToAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0002\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț\u0005Ț\u0006Ț\u0007Ȉ\bȈ\t2\n2", new Object[]{"sipTrunkId_", "name_", "metadata_", "numbers_", "allowedAddresses_", "allowedNumbers_", "authUsername_", "authPassword_", "headers_", AbstractC14826r5.f46296a, "headersToAttributes_", AbstractC14833s5.f46303a});
            case 3:
                return new LivekitSip$SIPInboundTrunkInfo();
            case 4:
                return new C14819q5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$SIPInboundTrunkInfo.class) {
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

    public String getAllowedAddresses(int i10) {
        return (String) this.allowedAddresses_.get(i10);
    }

    public AbstractC12171m getAllowedAddressesBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.allowedAddresses_.get(i10));
    }

    public int getAllowedAddressesCount() {
        return this.allowedAddresses_.size();
    }

    public List<String> getAllowedAddressesList() {
        return this.allowedAddresses_;
    }

    public String getAllowedNumbers(int i10) {
        return (String) this.allowedNumbers_.get(i10);
    }

    public AbstractC12171m getAllowedNumbersBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.allowedNumbers_.get(i10));
    }

    public int getAllowedNumbersCount() {
        return this.allowedNumbers_.size();
    }

    public List<String> getAllowedNumbersList() {
        return this.allowedNumbers_;
    }

    public String getAuthPassword() {
        return this.authPassword_;
    }

    public AbstractC12171m getAuthPasswordBytes() {
        return AbstractC12171m.m14011m(this.authPassword_);
    }

    public String getAuthUsername() {
        return this.authUsername_;
    }

    public AbstractC12171m getAuthUsernameBytes() {
        return AbstractC12171m.m14011m(this.authUsername_);
    }

    @Deprecated
    public Map<String, String> getHeaders() {
        return getHeadersMap();
    }

    public int getHeadersCount() {
        return internalGetHeaders().size();
    }

    public Map<String, String> getHeadersMap() {
        return DesugarCollections.unmodifiableMap(internalGetHeaders());
    }

    public String getHeadersOrDefault(String str, String str2) {
        str.getClass();
        C12076B0 c12076b0InternalGetHeaders = internalGetHeaders();
        return c12076b0InternalGetHeaders.containsKey(str) ? (String) c12076b0InternalGetHeaders.get(str) : str2;
    }

    public String getHeadersOrThrow(String str) {
        str.getClass();
        C12076B0 c12076b0InternalGetHeaders = internalGetHeaders();
        if (c12076b0InternalGetHeaders.containsKey(str)) {
            return (String) c12076b0InternalGetHeaders.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, String> getHeadersToAttributes() {
        return getHeadersToAttributesMap();
    }

    public int getHeadersToAttributesCount() {
        return internalGetHeadersToAttributes().size();
    }

    public Map<String, String> getHeadersToAttributesMap() {
        return DesugarCollections.unmodifiableMap(internalGetHeadersToAttributes());
    }

    public String getHeadersToAttributesOrDefault(String str, String str2) {
        str.getClass();
        C12076B0 c12076b0InternalGetHeadersToAttributes = internalGetHeadersToAttributes();
        return c12076b0InternalGetHeadersToAttributes.containsKey(str) ? (String) c12076b0InternalGetHeadersToAttributes.get(str) : str2;
    }

    public String getHeadersToAttributesOrThrow(String str) {
        str.getClass();
        C12076B0 c12076b0InternalGetHeadersToAttributes = internalGetHeadersToAttributes();
        if (c12076b0InternalGetHeadersToAttributes.containsKey(str)) {
            return (String) c12076b0InternalGetHeadersToAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC12171m getMetadataBytes() {
        return AbstractC12171m.m14011m(this.metadata_);
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public String getNumbers(int i10) {
        return (String) this.numbers_.get(i10);
    }

    public AbstractC12171m getNumbersBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.numbers_.get(i10));
    }

    public int getNumbersCount() {
        return this.numbers_.size();
    }

    public List<String> getNumbersList() {
        return this.numbers_;
    }

    public String getSipTrunkId() {
        return this.sipTrunkId_;
    }

    public AbstractC12171m getSipTrunkIdBytes() {
        return AbstractC12171m.m14011m(this.sipTrunkId_);
    }

    public static C14819q5 newBuilder(LivekitSip$SIPInboundTrunkInfo livekitSip$SIPInboundTrunkInfo) {
        return (C14819q5) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPInboundTrunkInfo);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(byte[] bArr) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$SIPInboundTrunkInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$SIPInboundTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
