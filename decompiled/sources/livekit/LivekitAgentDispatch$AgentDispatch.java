package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14862x;
import p793ho.C14876z;
import p793ho.InterfaceC14869y;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgentDispatch$AgentDispatch extends AbstractC12133Z implements InterfaceC14869y {
    public static final int AGENT_NAME_FIELD_NUMBER = 2;
    private static final LivekitAgentDispatch$AgentDispatch DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 4;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 5;
    private LivekitAgentDispatch$AgentDispatchState state_;
    private String id_ = "";
    private String agentName_ = "";
    private String room_ = "";
    private String metadata_ = "";

    static {
        LivekitAgentDispatch$AgentDispatch livekitAgentDispatch$AgentDispatch = new LivekitAgentDispatch$AgentDispatch();
        DEFAULT_INSTANCE = livekitAgentDispatch$AgentDispatch;
        AbstractC12133Z.registerDefaultInstance(LivekitAgentDispatch$AgentDispatch.class, livekitAgentDispatch$AgentDispatch);
    }

    private LivekitAgentDispatch$AgentDispatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentName() {
        this.agentName_ = getDefaultInstance().getAgentName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = null;
    }

    public static LivekitAgentDispatch$AgentDispatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeState(LivekitAgentDispatch$AgentDispatchState livekitAgentDispatch$AgentDispatchState) {
        livekitAgentDispatch$AgentDispatchState.getClass();
        LivekitAgentDispatch$AgentDispatchState livekitAgentDispatch$AgentDispatchState2 = this.state_;
        if (livekitAgentDispatch$AgentDispatchState2 == null || livekitAgentDispatch$AgentDispatchState2 == LivekitAgentDispatch$AgentDispatchState.getDefaultInstance()) {
            this.state_ = livekitAgentDispatch$AgentDispatchState;
            return;
        }
        C14876z c14876zNewBuilder = LivekitAgentDispatch$AgentDispatchState.newBuilder(this.state_);
        c14876zNewBuilder.m13865f(livekitAgentDispatch$AgentDispatchState);
        this.state_ = (LivekitAgentDispatch$AgentDispatchState) c14876zNewBuilder.m13862c();
    }

    public static C14862x newBuilder() {
        return (C14862x) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgentDispatch$AgentDispatch parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.id_ = abstractC12171m.m14012w();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(LivekitAgentDispatch$AgentDispatchState livekitAgentDispatch$AgentDispatchState) {
        livekitAgentDispatch$AgentDispatchState.getClass();
        this.state_ = livekitAgentDispatch$AgentDispatchState;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t", new Object[]{"id_", "agentName_", "room_", "metadata_", "state_"});
            case 3:
                return new LivekitAgentDispatch$AgentDispatch();
            case 4:
                return new C14862x(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgentDispatch$AgentDispatch.class) {
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

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
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

    public LivekitAgentDispatch$AgentDispatchState getState() {
        LivekitAgentDispatch$AgentDispatchState livekitAgentDispatch$AgentDispatchState = this.state_;
        return livekitAgentDispatch$AgentDispatchState == null ? LivekitAgentDispatch$AgentDispatchState.getDefaultInstance() : livekitAgentDispatch$AgentDispatchState;
    }

    public boolean hasState() {
        return this.state_ != null;
    }

    public static C14862x newBuilder(LivekitAgentDispatch$AgentDispatch livekitAgentDispatch$AgentDispatch) {
        return (C14862x) DEFAULT_INSTANCE.createBuilder(livekitAgentDispatch$AgentDispatch);
    }

    public static LivekitAgentDispatch$AgentDispatch parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(byte[] bArr) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgentDispatch$AgentDispatch parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatch) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
