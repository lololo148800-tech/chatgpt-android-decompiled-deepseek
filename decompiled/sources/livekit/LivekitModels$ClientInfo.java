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
import p793ho.C14704a2;
import p793ho.EnumC14711b2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$ClientInfo extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ADDRESS_FIELD_NUMBER = 9;
    public static final int BROWSER_FIELD_NUMBER = 7;
    public static final int BROWSER_VERSION_FIELD_NUMBER = 8;
    private static final LivekitModels$ClientInfo DEFAULT_INSTANCE;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 6;
    public static final int NETWORK_FIELD_NUMBER = 10;
    public static final int OS_FIELD_NUMBER = 4;
    public static final int OS_VERSION_FIELD_NUMBER = 5;
    public static final int OTHER_SDKS_FIELD_NUMBER = 11;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 3;
    public static final int SDK_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int protocol_;
    private int sdk_;
    private String version_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String deviceModel_ = "";
    private String browser_ = "";
    private String browserVersion_ = "";
    private String address_ = "";
    private String network_ = "";
    private String otherSdks_ = "";

    static {
        LivekitModels$ClientInfo livekitModels$ClientInfo = new LivekitModels$ClientInfo();
        DEFAULT_INSTANCE = livekitModels$ClientInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$ClientInfo.class, livekitModels$ClientInfo);
    }

    private LivekitModels$ClientInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrowser() {
        this.browser_ = getDefaultInstance().getBrowser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrowserVersion() {
        this.browserVersion_ = getDefaultInstance().getBrowserVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetwork() {
        this.network_ = getDefaultInstance().getNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherSdks() {
        this.otherSdks_ = getDefaultInstance().getOtherSdks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdk() {
        this.sdk_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static LivekitModels$ClientInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14704a2 newBuilder() {
        return (C14704a2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ClientInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ClientInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        str.getClass();
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.address_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowser(String str) {
        str.getClass();
        this.browser_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.browser_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserVersion(String str) {
        str.getClass();
        this.browserVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserVersionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.browserVersion_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(String str) {
        str.getClass();
        this.deviceModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModelBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.deviceModel_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetwork(String str) {
        str.getClass();
        this.network_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.network_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.os_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.osVersion_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherSdks(String str) {
        str.getClass();
        this.otherSdks_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherSdksBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.otherSdks_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(int i10) {
        this.protocol_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdk(EnumC14711b2 enumC14711b2) {
        this.sdk_ = enumC14711b2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkValue(int i10) {
        this.sdk_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.version_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ", new Object[]{"sdk_", "version_", "protocol_", "os_", "osVersion_", "deviceModel_", "browser_", "browserVersion_", "address_", "network_", "otherSdks_"});
            case 3:
                return new LivekitModels$ClientInfo();
            case 4:
                return new C14704a2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$ClientInfo.class) {
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

    public String getAddress() {
        return this.address_;
    }

    public AbstractC12171m getAddressBytes() {
        return AbstractC12171m.m14011m(this.address_);
    }

    public String getBrowser() {
        return this.browser_;
    }

    public AbstractC12171m getBrowserBytes() {
        return AbstractC12171m.m14011m(this.browser_);
    }

    public String getBrowserVersion() {
        return this.browserVersion_;
    }

    public AbstractC12171m getBrowserVersionBytes() {
        return AbstractC12171m.m14011m(this.browserVersion_);
    }

    public String getDeviceModel() {
        return this.deviceModel_;
    }

    public AbstractC12171m getDeviceModelBytes() {
        return AbstractC12171m.m14011m(this.deviceModel_);
    }

    public String getNetwork() {
        return this.network_;
    }

    public AbstractC12171m getNetworkBytes() {
        return AbstractC12171m.m14011m(this.network_);
    }

    public String getOs() {
        return this.os_;
    }

    public AbstractC12171m getOsBytes() {
        return AbstractC12171m.m14011m(this.os_);
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public AbstractC12171m getOsVersionBytes() {
        return AbstractC12171m.m14011m(this.osVersion_);
    }

    public String getOtherSdks() {
        return this.otherSdks_;
    }

    public AbstractC12171m getOtherSdksBytes() {
        return AbstractC12171m.m14011m(this.otherSdks_);
    }

    public int getProtocol() {
        return this.protocol_;
    }

    public EnumC14711b2 getSdk() {
        EnumC14711b2 enumC14711b2;
        switch (this.sdk_) {
            case 0:
                enumC14711b2 = EnumC14711b2.UNKNOWN;
                break;
            case 1:
                enumC14711b2 = EnumC14711b2.JS;
                break;
            case 2:
                enumC14711b2 = EnumC14711b2.SWIFT;
                break;
            case 3:
                enumC14711b2 = EnumC14711b2.ANDROID;
                break;
            case 4:
                enumC14711b2 = EnumC14711b2.FLUTTER;
                break;
            case 5:
                enumC14711b2 = EnumC14711b2.GO;
                break;
            case 6:
                enumC14711b2 = EnumC14711b2.UNITY;
                break;
            case 7:
                enumC14711b2 = EnumC14711b2.REACT_NATIVE;
                break;
            case 8:
                enumC14711b2 = EnumC14711b2.RUST;
                break;
            case 9:
                enumC14711b2 = EnumC14711b2.PYTHON;
                break;
            case 10:
                enumC14711b2 = EnumC14711b2.CPP;
                break;
            case 11:
                enumC14711b2 = EnumC14711b2.UNITY_WEB;
                break;
            case 12:
                enumC14711b2 = EnumC14711b2.NODE;
                break;
            default:
                enumC14711b2 = null;
                break;
        }
        return enumC14711b2 == null ? EnumC14711b2.UNRECOGNIZED : enumC14711b2;
    }

    public int getSdkValue() {
        return this.sdk_;
    }

    public String getVersion() {
        return this.version_;
    }

    public AbstractC12171m getVersionBytes() {
        return AbstractC12171m.m14011m(this.version_);
    }

    public static C14704a2 newBuilder(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        return (C14704a2) DEFAULT_INSTANCE.createBuilder(livekitModels$ClientInfo);
    }

    public static LivekitModels$ClientInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ClientInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$ClientInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$ClientInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$ClientInfo parseFrom(byte[] bArr) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ClientInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$ClientInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ClientInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ClientInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$ClientInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$ClientInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
