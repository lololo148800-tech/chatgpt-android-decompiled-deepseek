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
import p793ho.C14541A;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgentDispatch$CreateAgentDispatchRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AGENT_NAME_FIELD_NUMBER = 1;
    private static final LivekitAgentDispatch$CreateAgentDispatchRequest DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 2;
    private String agentName_ = "";
    private String room_ = "";
    private String metadata_ = "";

    static {
        LivekitAgentDispatch$CreateAgentDispatchRequest livekitAgentDispatch$CreateAgentDispatchRequest = new LivekitAgentDispatch$CreateAgentDispatchRequest();
        DEFAULT_INSTANCE = livekitAgentDispatch$CreateAgentDispatchRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitAgentDispatch$CreateAgentDispatchRequest.class, livekitAgentDispatch$CreateAgentDispatchRequest);
    }

    private LivekitAgentDispatch$CreateAgentDispatchRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentName() {
        this.agentName_ = getDefaultInstance().getAgentName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14541A newBuilder() {
        return (C14541A) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.room_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"agentName_", "room_", "metadata_"});
            case 3:
                return new LivekitAgentDispatch$CreateAgentDispatchRequest();
            case 4:
                return new C14541A(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgentDispatch$CreateAgentDispatchRequest.class) {
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

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC12171m getMetadataBytes() {
        return AbstractC12171m.m14011m(this.metadata_);
    }

    public String getRoom() {
        return this.room_;
    }

    public AbstractC12171m getRoomBytes() {
        return AbstractC12171m.m14011m(this.room_);
    }

    public static C14541A newBuilder(LivekitAgentDispatch$CreateAgentDispatchRequest livekitAgentDispatch$CreateAgentDispatchRequest) {
        return (C14541A) DEFAULT_INSTANCE.createBuilder(livekitAgentDispatch$CreateAgentDispatchRequest);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(byte[] bArr) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgentDispatch$CreateAgentDispatchRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgentDispatch$CreateAgentDispatchRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
