package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p548Wd.p549VF.zakks;
import p793ho.C14582G;
import p793ho.EnumC14572E2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsClientMeta extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CLIENT_ADDR_FIELD_NUMBER = 3;
    public static final int CLIENT_CONNECT_TIME_FIELD_NUMBER = 4;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 5;
    public static final int COUNTRY_FIELD_NUMBER = 8;
    private static final LivekitAnalytics$AnalyticsClientMeta DEFAULT_INSTANCE;
    public static final int GEO_HASH_FIELD_NUMBER = 7;
    public static final int ISP_ASN_FIELD_NUMBER = 9;
    public static final int NODE_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int RECONNECT_REASON_FIELD_NUMBER = 6;
    public static final int REGION_FIELD_NUMBER = 1;
    private int bitField0_;
    private int clientConnectTime_;
    private int ispAsn_;
    private int reconnectReason_;
    private String region_ = "";
    private String node_ = "";
    private String clientAddr_ = "";
    private String connectionType_ = "";
    private String geoHash_ = "";
    private String country_ = "";

    static {
        LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta = new LivekitAnalytics$AnalyticsClientMeta();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsClientMeta;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsClientMeta.class, livekitAnalytics$AnalyticsClientMeta);
    }

    private LivekitAnalytics$AnalyticsClientMeta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientAddr() {
        this.clientAddr_ = getDefaultInstance().getClientAddr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientConnectTime() {
        this.clientConnectTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.connectionType_ = getDefaultInstance().getConnectionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.bitField0_ &= -3;
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeoHash() {
        this.bitField0_ &= -2;
        this.geoHash_ = getDefaultInstance().getGeoHash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIspAsn() {
        this.bitField0_ &= -5;
        this.ispAsn_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNode() {
        this.node_ = getDefaultInstance().getNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnectReason() {
        this.reconnectReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    public static LivekitAnalytics$AnalyticsClientMeta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14582G newBuilder() {
        return (C14582G) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientAddr(String str) {
        str.getClass();
        this.clientAddr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientAddrBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.clientAddr_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientConnectTime(int i10) {
        this.clientConnectTime_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(String str) {
        str.getClass();
        this.connectionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.connectionType_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.country_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.country_ = abstractC12171m.m14012w();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeoHash(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.geoHash_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeoHashBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.geoHash_ = abstractC12171m.m14012w();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIspAsn(int i10) {
        this.bitField0_ |= 4;
        this.ispAsn_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNode(String str) {
        str.getClass();
        this.node_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.node_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectReason(EnumC14572E2 enumC14572E2) {
        this.reconnectReason_ = enumC14572E2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectReasonValue(int i10) {
        this.reconnectReason_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegion(String str) {
        str.getClass();
        this.region_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.region_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005Ȉ\u0006\f\u0007ለ\u0000\bለ\u0001\tဋ\u0002", new Object[]{"bitField0_", "region_", "node_", "clientAddr_", "clientConnectTime_", "connectionType_", "reconnectReason_", zakks.imxOShCEfJ, "country_", "ispAsn_"});
            case 3:
                return new LivekitAnalytics$AnalyticsClientMeta();
            case 4:
                return new C14582G(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsClientMeta.class) {
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

    public String getClientAddr() {
        return this.clientAddr_;
    }

    public AbstractC12171m getClientAddrBytes() {
        return AbstractC12171m.m14011m(this.clientAddr_);
    }

    public int getClientConnectTime() {
        return this.clientConnectTime_;
    }

    public String getConnectionType() {
        return this.connectionType_;
    }

    public AbstractC12171m getConnectionTypeBytes() {
        return AbstractC12171m.m14011m(this.connectionType_);
    }

    public String getCountry() {
        return this.country_;
    }

    public AbstractC12171m getCountryBytes() {
        return AbstractC12171m.m14011m(this.country_);
    }

    public String getGeoHash() {
        return this.geoHash_;
    }

    public AbstractC12171m getGeoHashBytes() {
        return AbstractC12171m.m14011m(this.geoHash_);
    }

    public int getIspAsn() {
        return this.ispAsn_;
    }

    public String getNode() {
        return this.node_;
    }

    public AbstractC12171m getNodeBytes() {
        return AbstractC12171m.m14011m(this.node_);
    }

    public EnumC14572E2 getReconnectReason() {
        EnumC14572E2 enumC14572E2M16042a = EnumC14572E2.m16042a(this.reconnectReason_);
        return enumC14572E2M16042a == null ? EnumC14572E2.UNRECOGNIZED : enumC14572E2M16042a;
    }

    public int getReconnectReasonValue() {
        return this.reconnectReason_;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC12171m getRegionBytes() {
        return AbstractC12171m.m14011m(this.region_);
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasGeoHash() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIspAsn() {
        return (this.bitField0_ & 4) != 0;
    }

    public static C14582G newBuilder(LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta) {
        return (C14582G) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsClientMeta);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
