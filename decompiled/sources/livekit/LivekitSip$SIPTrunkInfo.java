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
import p793ho.C14547A5;
import p793ho.EnumC14554B5;
import p793ho.EnumC14882z5;
import p793ho.InterfaceC14561C5;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LivekitSip$SIPTrunkInfo extends AbstractC12133Z implements InterfaceC14561C5 {
    private static final LivekitSip$SIPTrunkInfo DEFAULT_INSTANCE;
    public static final int INBOUND_ADDRESSES_FIELD_NUMBER = 2;
    public static final int INBOUND_NUMBERS_FIELD_NUMBER = 10;
    public static final int INBOUND_NUMBERS_REGEX_FIELD_NUMBER = 5;
    public static final int INBOUND_PASSWORD_FIELD_NUMBER = 7;
    public static final int INBOUND_USERNAME_FIELD_NUMBER = 6;
    public static final int KIND_FIELD_NUMBER = 14;
    public static final int METADATA_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 11;
    public static final int OUTBOUND_ADDRESS_FIELD_NUMBER = 3;
    public static final int OUTBOUND_NUMBER_FIELD_NUMBER = 4;
    public static final int OUTBOUND_PASSWORD_FIELD_NUMBER = 9;
    public static final int OUTBOUND_USERNAME_FIELD_NUMBER = 8;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SIP_TRUNK_ID_FIELD_NUMBER = 1;
    public static final int TRANSPORT_FIELD_NUMBER = 13;
    private int kind_;
    private int transport_;
    private String sipTrunkId_ = "";
    private InterfaceC12172m0 inboundAddresses_ = AbstractC12133Z.emptyProtobufList();
    private String outboundAddress_ = "";
    private String outboundNumber_ = "";
    private InterfaceC12172m0 inboundNumbersRegex_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 inboundNumbers_ = AbstractC12133Z.emptyProtobufList();
    private String inboundUsername_ = "";
    private String inboundPassword_ = "";
    private String outboundUsername_ = "";
    private String outboundPassword_ = "";
    private String name_ = "";
    private String metadata_ = "";

    static {
        LivekitSip$SIPTrunkInfo livekitSip$SIPTrunkInfo = new LivekitSip$SIPTrunkInfo();
        DEFAULT_INSTANCE = livekitSip$SIPTrunkInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$SIPTrunkInfo.class, livekitSip$SIPTrunkInfo);
    }

    private LivekitSip$SIPTrunkInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInboundAddresses(Iterable<String> iterable) {
        ensureInboundAddressesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.inboundAddresses_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInboundNumbers(Iterable<String> iterable) {
        ensureInboundNumbersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.inboundNumbers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInboundNumbersRegex(Iterable<String> iterable) {
        ensureInboundNumbersRegexIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.inboundNumbersRegex_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundAddresses(String str) {
        str.getClass();
        ensureInboundAddressesIsMutable();
        this.inboundAddresses_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundAddressesBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureInboundAddressesIsMutable();
        this.inboundAddresses_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundNumbers(String str) {
        str.getClass();
        ensureInboundNumbersIsMutable();
        this.inboundNumbers_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundNumbersBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureInboundNumbersIsMutable();
        this.inboundNumbers_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundNumbersRegex(String str) {
        str.getClass();
        ensureInboundNumbersRegexIsMutable();
        this.inboundNumbersRegex_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInboundNumbersRegexBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureInboundNumbersRegexIsMutable();
        this.inboundNumbersRegex_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundAddresses() {
        this.inboundAddresses_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundNumbers() {
        this.inboundNumbers_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundNumbersRegex() {
        this.inboundNumbersRegex_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundPassword() {
        this.inboundPassword_ = getDefaultInstance().getInboundPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundUsername() {
        this.inboundUsername_ = getDefaultInstance().getInboundUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
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
    public void clearOutboundAddress() {
        this.outboundAddress_ = getDefaultInstance().getOutboundAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutboundNumber() {
        this.outboundNumber_ = getDefaultInstance().getOutboundNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutboundPassword() {
        this.outboundPassword_ = getDefaultInstance().getOutboundPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutboundUsername() {
        this.outboundUsername_ = getDefaultInstance().getOutboundUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipTrunkId() {
        this.sipTrunkId_ = getDefaultInstance().getSipTrunkId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransport() {
        this.transport_ = 0;
    }

    private void ensureInboundAddressesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.inboundAddresses_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.inboundAddresses_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureInboundNumbersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.inboundNumbers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.inboundNumbers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureInboundNumbersRegexIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.inboundNumbersRegex_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.inboundNumbersRegex_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitSip$SIPTrunkInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14547A5 newBuilder() {
        return (C14547A5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPTrunkInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundAddresses(int i10, String str) {
        str.getClass();
        ensureInboundAddressesIsMutable();
        this.inboundAddresses_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundNumbers(int i10, String str) {
        str.getClass();
        ensureInboundNumbersIsMutable();
        this.inboundNumbers_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundNumbersRegex(int i10, String str) {
        str.getClass();
        ensureInboundNumbersRegexIsMutable();
        this.inboundNumbersRegex_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundPassword(String str) {
        str.getClass();
        this.inboundPassword_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundPasswordBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.inboundPassword_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundUsername(String str) {
        str.getClass();
        this.inboundUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundUsernameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.inboundUsername_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(EnumC14554B5 enumC14554B5) {
        this.kind_ = enumC14554B5.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
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
    public void setOutboundAddress(String str) {
        str.getClass();
        this.outboundAddress_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundAddressBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.outboundAddress_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundNumber(String str) {
        str.getClass();
        this.outboundNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundNumberBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.outboundNumber_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundPassword(String str) {
        str.getClass();
        this.outboundPassword_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundPasswordBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.outboundPassword_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundUsername(String str) {
        str.getClass();
        this.outboundUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutboundUsernameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.outboundUsername_ = abstractC12171m.m14012w();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransport(EnumC14882z5 enumC14882z5) {
        this.transport_ = enumC14882z5.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportValue(int i10) {
        this.transport_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0003\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004Ȉ\u0005Ț\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȚ\u000bȈ\fȈ\r\f\u000e\f", new Object[]{"sipTrunkId_", "inboundAddresses_", "outboundAddress_", "outboundNumber_", "inboundNumbersRegex_", "inboundUsername_", "inboundPassword_", "outboundUsername_", "outboundPassword_", "inboundNumbers_", "name_", "metadata_", "transport_", "kind_"});
            case 3:
                return new LivekitSip$SIPTrunkInfo();
            case 4:
                return new C14547A5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$SIPTrunkInfo.class) {
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

    public String getInboundAddresses(int i10) {
        return (String) this.inboundAddresses_.get(i10);
    }

    public AbstractC12171m getInboundAddressesBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.inboundAddresses_.get(i10));
    }

    public int getInboundAddressesCount() {
        return this.inboundAddresses_.size();
    }

    public List<String> getInboundAddressesList() {
        return this.inboundAddresses_;
    }

    public String getInboundNumbers(int i10) {
        return (String) this.inboundNumbers_.get(i10);
    }

    public AbstractC12171m getInboundNumbersBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.inboundNumbers_.get(i10));
    }

    public int getInboundNumbersCount() {
        return this.inboundNumbers_.size();
    }

    public List<String> getInboundNumbersList() {
        return this.inboundNumbers_;
    }

    @Deprecated
    public String getInboundNumbersRegex(int i10) {
        return (String) this.inboundNumbersRegex_.get(i10);
    }

    @Deprecated
    public AbstractC12171m getInboundNumbersRegexBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.inboundNumbersRegex_.get(i10));
    }

    @Deprecated
    public int getInboundNumbersRegexCount() {
        return this.inboundNumbersRegex_.size();
    }

    @Deprecated
    public List<String> getInboundNumbersRegexList() {
        return this.inboundNumbersRegex_;
    }

    public String getInboundPassword() {
        return this.inboundPassword_;
    }

    public AbstractC12171m getInboundPasswordBytes() {
        return AbstractC12171m.m14011m(this.inboundPassword_);
    }

    public String getInboundUsername() {
        return this.inboundUsername_;
    }

    public AbstractC12171m getInboundUsernameBytes() {
        return AbstractC12171m.m14011m(this.inboundUsername_);
    }

    public EnumC14554B5 getKind() {
        EnumC14554B5 enumC14554B5;
        int i10 = this.kind_;
        if (i10 == 0) {
            enumC14554B5 = EnumC14554B5.TRUNK_LEGACY;
        } else if (i10 != 1) {
            enumC14554B5 = i10 != 2 ? null : EnumC14554B5.TRUNK_OUTBOUND;
        } else {
            enumC14554B5 = EnumC14554B5.TRUNK_INBOUND;
        }
        return enumC14554B5 == null ? EnumC14554B5.UNRECOGNIZED : enumC14554B5;
    }

    public int getKindValue() {
        return this.kind_;
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

    public String getOutboundAddress() {
        return this.outboundAddress_;
    }

    public AbstractC12171m getOutboundAddressBytes() {
        return AbstractC12171m.m14011m(this.outboundAddress_);
    }

    public String getOutboundNumber() {
        return this.outboundNumber_;
    }

    public AbstractC12171m getOutboundNumberBytes() {
        return AbstractC12171m.m14011m(this.outboundNumber_);
    }

    public String getOutboundPassword() {
        return this.outboundPassword_;
    }

    public AbstractC12171m getOutboundPasswordBytes() {
        return AbstractC12171m.m14011m(this.outboundPassword_);
    }

    public String getOutboundUsername() {
        return this.outboundUsername_;
    }

    public AbstractC12171m getOutboundUsernameBytes() {
        return AbstractC12171m.m14011m(this.outboundUsername_);
    }

    public String getSipTrunkId() {
        return this.sipTrunkId_;
    }

    public AbstractC12171m getSipTrunkIdBytes() {
        return AbstractC12171m.m14011m(this.sipTrunkId_);
    }

    public EnumC14882z5 getTransport() {
        EnumC14882z5 enumC14882z5M16057a = EnumC14882z5.m16057a(this.transport_);
        return enumC14882z5M16057a == null ? EnumC14882z5.UNRECOGNIZED : enumC14882z5M16057a;
    }

    public int getTransportValue() {
        return this.transport_;
    }

    public static C14547A5 newBuilder(LivekitSip$SIPTrunkInfo livekitSip$SIPTrunkInfo) {
        return (C14547A5) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPTrunkInfo);
    }

    public static LivekitSip$SIPTrunkInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(byte[] bArr) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$SIPTrunkInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$SIPTrunkInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
