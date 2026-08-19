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
import p793ho.C14778l;
import p793ho.C14830s2;
import p793ho.EnumC14764j;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$RegisterWorkerRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AGENT_NAME_FIELD_NUMBER = 8;
    public static final int ALLOWED_PERMISSIONS_FIELD_NUMBER = 7;
    private static final LivekitAgent$RegisterWorkerRequest DEFAULT_INSTANCE;
    public static final int NAMESPACE_FIELD_NUMBER = 6;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PING_INTERVAL_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 3;
    private LivekitModels$ParticipantPermission allowedPermissions_;
    private int bitField0_;
    private int pingInterval_;
    private int type_;
    private String agentName_ = "";
    private String version_ = "";
    private String namespace_ = "";

    static {
        LivekitAgent$RegisterWorkerRequest livekitAgent$RegisterWorkerRequest = new LivekitAgent$RegisterWorkerRequest();
        DEFAULT_INSTANCE = livekitAgent$RegisterWorkerRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$RegisterWorkerRequest.class, livekitAgent$RegisterWorkerRequest);
    }

    private LivekitAgent$RegisterWorkerRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentName() {
        this.agentName_ = getDefaultInstance().getAgentName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedPermissions() {
        this.allowedPermissions_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNamespace() {
        this.bitField0_ &= -2;
        this.namespace_ = getDefaultInstance().getNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPingInterval() {
        this.pingInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static LivekitAgent$RegisterWorkerRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAllowedPermissions(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        livekitModels$ParticipantPermission.getClass();
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission2 = this.allowedPermissions_;
        if (livekitModels$ParticipantPermission2 == null || livekitModels$ParticipantPermission2 == LivekitModels$ParticipantPermission.getDefaultInstance()) {
            this.allowedPermissions_ = livekitModels$ParticipantPermission;
            return;
        }
        C14830s2 c14830s2NewBuilder = LivekitModels$ParticipantPermission.newBuilder(this.allowedPermissions_);
        c14830s2NewBuilder.m13865f(livekitModels$ParticipantPermission);
        this.allowedPermissions_ = (LivekitModels$ParticipantPermission) c14830s2NewBuilder.m13862c();
    }

    public static C14778l newBuilder() {
        return (C14778l) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$RegisterWorkerRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentName(String str) {
        str.getClass();
        this.agentName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.agentName_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedPermissions(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        livekitModels$ParticipantPermission.getClass();
        this.allowedPermissions_ = livekitModels$ParticipantPermission;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.namespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamespaceBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.namespace_ = abstractC12171m.m14012w();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPingInterval(int i10) {
        this.pingInterval_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC14764j enumC14764j) {
        this.type_ = enumC14764j.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\f\u0003Ȉ\u0005\u000b\u0006ለ\u0000\u0007\t\bȈ", new Object[]{"bitField0_", "type_", "version_", "pingInterval_", "namespace_", "allowedPermissions_", "agentName_"});
            case 3:
                return new LivekitAgent$RegisterWorkerRequest();
            case 4:
                return new C14778l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$RegisterWorkerRequest.class) {
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

    public String getAgentName() {
        return this.agentName_;
    }

    public AbstractC12171m getAgentNameBytes() {
        return AbstractC12171m.m14011m(this.agentName_);
    }

    public LivekitModels$ParticipantPermission getAllowedPermissions() {
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission = this.allowedPermissions_;
        return livekitModels$ParticipantPermission == null ? LivekitModels$ParticipantPermission.getDefaultInstance() : livekitModels$ParticipantPermission;
    }

    public String getNamespace() {
        return this.namespace_;
    }

    public AbstractC12171m getNamespaceBytes() {
        return AbstractC12171m.m14011m(this.namespace_);
    }

    public int getPingInterval() {
        return this.pingInterval_;
    }

    public EnumC14764j getType() {
        EnumC14764j enumC14764jM16051a = EnumC14764j.m16051a(this.type_);
        return enumC14764jM16051a == null ? EnumC14764j.UNRECOGNIZED : enumC14764jM16051a;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public String getVersion() {
        return this.version_;
    }

    public AbstractC12171m getVersionBytes() {
        return AbstractC12171m.m14011m(this.version_);
    }

    public boolean hasAllowedPermissions() {
        return this.allowedPermissions_ != null;
    }

    public boolean hasNamespace() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C14778l newBuilder(LivekitAgent$RegisterWorkerRequest livekitAgent$RegisterWorkerRequest) {
        return (C14778l) DEFAULT_INSTANCE.createBuilder(livekitAgent$RegisterWorkerRequest);
    }

    public static LivekitAgent$RegisterWorkerRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(byte[] bArr) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(InputStream inputStream) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
