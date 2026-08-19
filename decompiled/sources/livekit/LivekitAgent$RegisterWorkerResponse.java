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
import p793ho.C14785m;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$RegisterWorkerResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgent$RegisterWorkerResponse DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SERVER_INFO_FIELD_NUMBER = 3;
    public static final int WORKER_ID_FIELD_NUMBER = 1;
    private LivekitModels$ServerInfo serverInfo_;
    private String workerId_ = "";

    static {
        LivekitAgent$RegisterWorkerResponse livekitAgent$RegisterWorkerResponse = new LivekitAgent$RegisterWorkerResponse();
        DEFAULT_INSTANCE = livekitAgent$RegisterWorkerResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$RegisterWorkerResponse.class, livekitAgent$RegisterWorkerResponse);
    }

    private LivekitAgent$RegisterWorkerResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerInfo() {
        this.serverInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkerId() {
        this.workerId_ = getDefaultInstance().getWorkerId();
    }

    public static LivekitAgent$RegisterWorkerResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerInfo(LivekitModels$ServerInfo livekitModels$ServerInfo) {
        livekitModels$ServerInfo.getClass();
        LivekitModels$ServerInfo livekitModels$ServerInfo2 = this.serverInfo_;
        if (livekitModels$ServerInfo2 == null || livekitModels$ServerInfo2 == LivekitModels$ServerInfo.getDefaultInstance()) {
            this.serverInfo_ = livekitModels$ServerInfo;
            return;
        }
        C14621M2 c14621m2NewBuilder = LivekitModels$ServerInfo.newBuilder(this.serverInfo_);
        c14621m2NewBuilder.m13865f(livekitModels$ServerInfo);
        this.serverInfo_ = (LivekitModels$ServerInfo) c14621m2NewBuilder.m13862c();
    }

    public static C14785m newBuilder() {
        return (C14785m) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$RegisterWorkerResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerInfo(LivekitModels$ServerInfo livekitModels$ServerInfo) {
        livekitModels$ServerInfo.getClass();
        this.serverInfo_ = livekitModels$ServerInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkerId(String str) {
        str.getClass();
        this.workerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkerIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.workerId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003\t", new Object[]{"workerId_", "serverInfo_"});
            case 3:
                return new LivekitAgent$RegisterWorkerResponse();
            case 4:
                return new C14785m(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$RegisterWorkerResponse.class) {
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

    public LivekitModels$ServerInfo getServerInfo() {
        LivekitModels$ServerInfo livekitModels$ServerInfo = this.serverInfo_;
        return livekitModels$ServerInfo == null ? LivekitModels$ServerInfo.getDefaultInstance() : livekitModels$ServerInfo;
    }

    public String getWorkerId() {
        return this.workerId_;
    }

    public AbstractC12171m getWorkerIdBytes() {
        return AbstractC12171m.m14011m(this.workerId_);
    }

    public boolean hasServerInfo() {
        return this.serverInfo_ != null;
    }

    public static C14785m newBuilder(LivekitAgent$RegisterWorkerResponse livekitAgent$RegisterWorkerResponse) {
        return (C14785m) DEFAULT_INSTANCE.createBuilder(livekitAgent$RegisterWorkerResponse);
    }

    public static LivekitAgent$RegisterWorkerResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(byte[] bArr) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(InputStream inputStream) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
