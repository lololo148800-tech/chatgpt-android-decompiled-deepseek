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
import p793ho.C14838t3;
import p793ho.InterfaceC14576F;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$RoomAgent extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRoom$RoomAgent DEFAULT_INSTANCE;
    public static final int DISPATCHES_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private InterfaceC12172m0 dispatches_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRoom$RoomAgent livekitRoom$RoomAgent = new LivekitRoom$RoomAgent();
        DEFAULT_INSTANCE = livekitRoom$RoomAgent;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$RoomAgent.class, livekitRoom$RoomAgent);
    }

    private LivekitRoom$RoomAgent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDispatches(Iterable<? extends LivekitAgentDispatch$RoomAgentDispatch> iterable) {
        ensureDispatchesIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.dispatches_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDispatches(LivekitAgentDispatch$RoomAgentDispatch livekitAgentDispatch$RoomAgentDispatch) {
        livekitAgentDispatch$RoomAgentDispatch.getClass();
        ensureDispatchesIsMutable();
        this.dispatches_.add(livekitAgentDispatch$RoomAgentDispatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatches() {
        this.dispatches_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureDispatchesIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.dispatches_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.dispatches_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRoom$RoomAgent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14838t3 newBuilder() {
        return (C14838t3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$RoomAgent parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomAgent parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDispatches(int i10) {
        ensureDispatchesIsMutable();
        this.dispatches_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatches(int i10, LivekitAgentDispatch$RoomAgentDispatch livekitAgentDispatch$RoomAgentDispatch) {
        livekitAgentDispatch$RoomAgentDispatch.getClass();
        ensureDispatchesIsMutable();
        this.dispatches_.set(i10, livekitAgentDispatch$RoomAgentDispatch);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"dispatches_", LivekitAgentDispatch$RoomAgentDispatch.class});
            case 3:
                return new LivekitRoom$RoomAgent();
            case 4:
                return new C14838t3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$RoomAgent.class) {
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

    public LivekitAgentDispatch$RoomAgentDispatch getDispatches(int i10) {
        return (LivekitAgentDispatch$RoomAgentDispatch) this.dispatches_.get(i10);
    }

    public int getDispatchesCount() {
        return this.dispatches_.size();
    }

    public List<LivekitAgentDispatch$RoomAgentDispatch> getDispatchesList() {
        return this.dispatches_;
    }

    public InterfaceC14576F getDispatchesOrBuilder(int i10) {
        return (InterfaceC14576F) this.dispatches_.get(i10);
    }

    public List<? extends InterfaceC14576F> getDispatchesOrBuilderList() {
        return this.dispatches_;
    }

    public static C14838t3 newBuilder(LivekitRoom$RoomAgent livekitRoom$RoomAgent) {
        return (C14838t3) DEFAULT_INSTANCE.createBuilder(livekitRoom$RoomAgent);
    }

    public static LivekitRoom$RoomAgent parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$RoomAgent parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$RoomAgent parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDispatches(int i10, LivekitAgentDispatch$RoomAgentDispatch livekitAgentDispatch$RoomAgentDispatch) {
        livekitAgentDispatch$RoomAgentDispatch.getClass();
        ensureDispatchesIsMutable();
        this.dispatches_.add(i10, livekitAgentDispatch$RoomAgentDispatch);
    }

    public static LivekitRoom$RoomAgent parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$RoomAgent parseFrom(byte[] bArr) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$RoomAgent parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$RoomAgent parseFrom(InputStream inputStream) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomAgent parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$RoomAgent parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$RoomAgent parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$RoomAgent) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
