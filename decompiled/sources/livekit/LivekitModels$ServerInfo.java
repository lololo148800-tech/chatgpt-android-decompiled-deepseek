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
import p793ho.C14621M2;
import p793ho.EnumC14627N2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$ServerInfo extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AGENT_PROTOCOL_FIELD_NUMBER = 7;
    public static final int DEBUG_INFO_FIELD_NUMBER = 6;
    private static final LivekitModels$ServerInfo DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 1;
    public static final int NODE_ID_FIELD_NUMBER = 5;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 3;
    public static final int REGION_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int agentProtocol_;
    private int edition_;
    private int protocol_;
    private String version_ = "";
    private String region_ = "";
    private String nodeId_ = "";
    private String debugInfo_ = "";

    static {
        LivekitModels$ServerInfo livekitModels$ServerInfo = new LivekitModels$ServerInfo();
        DEFAULT_INSTANCE = livekitModels$ServerInfo;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$ServerInfo.class, livekitModels$ServerInfo);
    }

    private LivekitModels$ServerInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentProtocol() {
        this.agentProtocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugInfo() {
        this.debugInfo_ = getDefaultInstance().getDebugInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeId() {
        this.nodeId_ = getDefaultInstance().getNodeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static LivekitModels$ServerInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14621M2 newBuilder() {
        return (C14621M2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ServerInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ServerInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentProtocol(int i10) {
        this.agentProtocol_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugInfo(String str) {
        str.getClass();
        this.debugInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugInfoBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.debugInfo_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(EnumC14627N2 enumC14627N2) {
        this.edition_ = enumC14627N2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionValue(int i10) {
        this.edition_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeId(String str) {
        str.getClass();
        this.nodeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.nodeId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(int i10) {
        this.protocol_ = i10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"edition_", "version_", "protocol_", "region_", "nodeId_", "debugInfo_", "agentProtocol_"});
            case 3:
                return new LivekitModels$ServerInfo();
            case 4:
                return new C14621M2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$ServerInfo.class) {
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

    public int getAgentProtocol() {
        return this.agentProtocol_;
    }

    public String getDebugInfo() {
        return this.debugInfo_;
    }

    public AbstractC12171m getDebugInfoBytes() {
        return AbstractC12171m.m14011m(this.debugInfo_);
    }

    public EnumC14627N2 getEdition() {
        EnumC14627N2 enumC14627N2;
        int i10 = this.edition_;
        if (i10 != 0) {
            enumC14627N2 = i10 != 1 ? null : EnumC14627N2.Cloud;
        } else {
            enumC14627N2 = EnumC14627N2.Standard;
        }
        return enumC14627N2 == null ? EnumC14627N2.UNRECOGNIZED : enumC14627N2;
    }

    public int getEditionValue() {
        return this.edition_;
    }

    public String getNodeId() {
        return this.nodeId_;
    }

    public AbstractC12171m getNodeIdBytes() {
        return AbstractC12171m.m14011m(this.nodeId_);
    }

    public int getProtocol() {
        return this.protocol_;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC12171m getRegionBytes() {
        return AbstractC12171m.m14011m(this.region_);
    }

    public String getVersion() {
        return this.version_;
    }

    public AbstractC12171m getVersionBytes() {
        return AbstractC12171m.m14011m(this.version_);
    }

    public static C14621M2 newBuilder(LivekitModels$ServerInfo livekitModels$ServerInfo) {
        return (C14621M2) DEFAULT_INSTANCE.createBuilder(livekitModels$ServerInfo);
    }

    public static LivekitModels$ServerInfo parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ServerInfo parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$ServerInfo parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$ServerInfo parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$ServerInfo parseFrom(byte[] bArr) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ServerInfo parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$ServerInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ServerInfo parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ServerInfo parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$ServerInfo parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$ServerInfo) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
