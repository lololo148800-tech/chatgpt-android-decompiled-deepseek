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
import p793ho.AbstractC14798n5;
import p793ho.C14763i5;
import p793ho.C14805o5;
import p793ho.InterfaceC14812p5;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$SIPDispatchRuleInfo extends AbstractC12133Z implements InterfaceC14812p5 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 8;
    private static final LivekitSip$SIPDispatchRuleInfo DEFAULT_INSTANCE;
    public static final int HIDE_PHONE_NUMBER_FIELD_NUMBER = 4;
    public static final int INBOUND_NUMBERS_FIELD_NUMBER = 7;
    public static final int METADATA_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int RULE_FIELD_NUMBER = 2;
    public static final int SIP_DISPATCH_RULE_ID_FIELD_NUMBER = 1;
    public static final int TRUNK_IDS_FIELD_NUMBER = 3;
    private boolean hidePhoneNumber_;
    private LivekitSip$SIPDispatchRule rule_;
    private C12076B0 attributes_ = C12076B0.f36868Z;
    private String sipDispatchRuleId_ = "";
    private InterfaceC12172m0 trunkIds_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 inboundNumbers_ = AbstractC12133Z.emptyProtobufList();
    private String name_ = "";
    private String metadata_ = "";

    static {
        LivekitSip$SIPDispatchRuleInfo livekitSip$SIPDispatchRuleInfo = new LivekitSip$SIPDispatchRuleInfo();
        DEFAULT_INSTANCE = livekitSip$SIPDispatchRuleInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$SIPDispatchRuleInfo.class, livekitSip$SIPDispatchRuleInfo);
    }

    private LivekitSip$SIPDispatchRuleInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInboundNumbers(Iterable<String> iterable) {
        ensureInboundNumbersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.inboundNumbers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrunkIds(Iterable<String> iterable) {
        ensureTrunkIdsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.trunkIds_);
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
    public void addTrunkIds(String str) {
        str.getClass();
        ensureTrunkIdsIsMutable();
        this.trunkIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrunkIdsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureTrunkIdsIsMutable();
        this.trunkIds_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidePhoneNumber() {
        this.hidePhoneNumber_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboundNumbers() {
        this.inboundNumbers_ = AbstractC12133Z.emptyProtobufList();
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
    public void clearRule() {
        this.rule_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipDispatchRuleId() {
        this.sipDispatchRuleId_ = getDefaultInstance().getSipDispatchRuleId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrunkIds() {
        this.trunkIds_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureInboundNumbersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.inboundNumbers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.inboundNumbers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureTrunkIdsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.trunkIds_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.trunkIds_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitSip$SIPDispatchRuleInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableAttributesMap() {
        return internalGetMutableAttributes();
    }

    private C12076B0 internalGetAttributes() {
        return this.attributes_;
    }

    private C12076B0 internalGetMutableAttributes() {
        C12076B0 c12076b0 = this.attributes_;
        if (!c12076b0.f36869Y) {
            this.attributes_ = c12076b0.m13719c();
        }
        return this.attributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRule(LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule) {
        livekitSip$SIPDispatchRule.getClass();
        LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule2 = this.rule_;
        if (livekitSip$SIPDispatchRule2 == null || livekitSip$SIPDispatchRule2 == LivekitSip$SIPDispatchRule.getDefaultInstance()) {
            this.rule_ = livekitSip$SIPDispatchRule;
            return;
        }
        C14763i5 c14763i5NewBuilder = LivekitSip$SIPDispatchRule.newBuilder(this.rule_);
        c14763i5NewBuilder.m13865f(livekitSip$SIPDispatchRule);
        this.rule_ = (LivekitSip$SIPDispatchRule) c14763i5NewBuilder.m13862c();
    }

    public static C14805o5 newBuilder() {
        return (C14805o5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPDispatchRuleInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidePhoneNumber(boolean z6) {
        this.hidePhoneNumber_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboundNumbers(int i10, String str) {
        str.getClass();
        ensureInboundNumbersIsMutable();
        this.inboundNumbers_.set(i10, str);
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
    public void setRule(LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule) {
        livekitSip$SIPDispatchRule.getClass();
        this.rule_ = livekitSip$SIPDispatchRule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipDispatchRuleId(String str) {
        str.getClass();
        this.sipDispatchRuleId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipDispatchRuleIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.sipDispatchRuleId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrunkIds(int i10, String str) {
        str.getClass();
        ensureTrunkIdsIsMutable();
        this.trunkIds_.set(i10, str);
    }

    public boolean containsAttributes(String str) {
        str.getClass();
        return internalGetAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0001\u0002\u0000\u0001Ȉ\u0002\t\u0003Ț\u0004\u0007\u0005Ȉ\u0006Ȉ\u0007Ț\b2", new Object[]{"sipDispatchRuleId_", "rule_", "trunkIds_", "hidePhoneNumber_", "name_", "metadata_", "inboundNumbers_", "attributes_", AbstractC14798n5.f46252a});
            case 3:
                return new LivekitSip$SIPDispatchRuleInfo();
            case 4:
                return new C14805o5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$SIPDispatchRuleInfo.class) {
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

    @Deprecated
    public Map<String, String> getAttributes() {
        return getAttributesMap();
    }

    public int getAttributesCount() {
        return internalGetAttributes().size();
    }

    public Map<String, String> getAttributesMap() {
        return DesugarCollections.unmodifiableMap(internalGetAttributes());
    }

    public String getAttributesOrDefault(String str, String str2) {
        str.getClass();
        C12076B0 c12076b0InternalGetAttributes = internalGetAttributes();
        return c12076b0InternalGetAttributes.containsKey(str) ? (String) c12076b0InternalGetAttributes.get(str) : str2;
    }

    public String getAttributesOrThrow(String str) {
        str.getClass();
        C12076B0 c12076b0InternalGetAttributes = internalGetAttributes();
        if (c12076b0InternalGetAttributes.containsKey(str)) {
            return (String) c12076b0InternalGetAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean getHidePhoneNumber() {
        return this.hidePhoneNumber_;
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

    public LivekitSip$SIPDispatchRule getRule() {
        LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule = this.rule_;
        return livekitSip$SIPDispatchRule == null ? LivekitSip$SIPDispatchRule.getDefaultInstance() : livekitSip$SIPDispatchRule;
    }

    public String getSipDispatchRuleId() {
        return this.sipDispatchRuleId_;
    }

    public AbstractC12171m getSipDispatchRuleIdBytes() {
        return AbstractC12171m.m14011m(this.sipDispatchRuleId_);
    }

    public String getTrunkIds(int i10) {
        return (String) this.trunkIds_.get(i10);
    }

    public AbstractC12171m getTrunkIdsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.trunkIds_.get(i10));
    }

    public int getTrunkIdsCount() {
        return this.trunkIds_.size();
    }

    public List<String> getTrunkIdsList() {
        return this.trunkIds_;
    }

    public boolean hasRule() {
        return this.rule_ != null;
    }

    public static C14805o5 newBuilder(LivekitSip$SIPDispatchRuleInfo livekitSip$SIPDispatchRuleInfo) {
        return (C14805o5) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPDispatchRuleInfo);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(byte[] bArr) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$SIPDispatchRuleInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRuleInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
