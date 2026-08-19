package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14562D;
import p793ho.InterfaceC14869y;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgentDispatch$ListAgentDispatchResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AGENT_DISPATCHES_FIELD_NUMBER = 1;
    private static final LivekitAgentDispatch$ListAgentDispatchResponse DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER;
    private InterfaceC12172m0 agentDispatches_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitAgentDispatch$ListAgentDispatchResponse livekitAgentDispatch$ListAgentDispatchResponse = new LivekitAgentDispatch$ListAgentDispatchResponse();
        DEFAULT_INSTANCE = livekitAgentDispatch$ListAgentDispatchResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitAgentDispatch$ListAgentDispatchResponse.class, livekitAgentDispatch$ListAgentDispatchResponse);
    }

    private LivekitAgentDispatch$ListAgentDispatchResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgentDispatches(LivekitAgentDispatch$AgentDispatch livekitAgentDispatch$AgentDispatch) {
        livekitAgentDispatch$AgentDispatch.getClass();
        ensureAgentDispatchesIsMutable();
        this.agentDispatches_.add(livekitAgentDispatch$AgentDispatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAgentDispatches(Iterable<? extends LivekitAgentDispatch$AgentDispatch> iterable) {
        ensureAgentDispatchesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.agentDispatches_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentDispatches() {
        this.agentDispatches_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureAgentDispatchesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.agentDispatches_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.agentDispatches_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14562D newBuilder() {
        return (C14562D) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAgentDispatches(int i10) {
        ensureAgentDispatchesIsMutable();
        this.agentDispatches_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentDispatches(int i10, LivekitAgentDispatch$AgentDispatch livekitAgentDispatch$AgentDispatch) {
        livekitAgentDispatch$AgentDispatch.getClass();
        ensureAgentDispatchesIsMutable();
        this.agentDispatches_.set(i10, livekitAgentDispatch$AgentDispatch);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"agentDispatches_", LivekitAgentDispatch$AgentDispatch.class});
            case 3:
                return new LivekitAgentDispatch$ListAgentDispatchResponse();
            case 4:
                return new C14562D(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgentDispatch$ListAgentDispatchResponse.class) {
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

    public LivekitAgentDispatch$AgentDispatch getAgentDispatches(int i10) {
        return (LivekitAgentDispatch$AgentDispatch) this.agentDispatches_.get(i10);
    }

    public int getAgentDispatchesCount() {
        return this.agentDispatches_.size();
    }

    public List<LivekitAgentDispatch$AgentDispatch> getAgentDispatchesList() {
        return this.agentDispatches_;
    }

    public InterfaceC14869y getAgentDispatchesOrBuilder(int i10) {
        return (InterfaceC14869y) this.agentDispatches_.get(i10);
    }

    public List<? extends InterfaceC14869y> getAgentDispatchesOrBuilderList() {
        return this.agentDispatches_;
    }

    public static C14562D newBuilder(LivekitAgentDispatch$ListAgentDispatchResponse livekitAgentDispatch$ListAgentDispatchResponse) {
        return (C14562D) DEFAULT_INSTANCE.createBuilder(livekitAgentDispatch$ListAgentDispatchResponse);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAgentDispatches(int i10, LivekitAgentDispatch$AgentDispatch livekitAgentDispatch$AgentDispatch) {
        livekitAgentDispatch$AgentDispatch.getClass();
        ensureAgentDispatchesIsMutable();
        this.agentDispatches_.add(i10, livekitAgentDispatch$AgentDispatch);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(byte[] bArr) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgentDispatch$ListAgentDispatchResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgentDispatch$ListAgentDispatchResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
