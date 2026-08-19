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
import p793ho.C14876z;
import p793ho.InterfaceC14736f;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgentDispatch$AgentDispatchState extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CREATED_AT_FIELD_NUMBER = 2;
    private static final LivekitAgentDispatch$AgentDispatchState DEFAULT_INSTANCE;
    public static final int DELETED_AT_FIELD_NUMBER = 3;
    public static final int JOBS_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private long createdAt_;
    private long deletedAt_;
    private InterfaceC12172m0 jobs_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitAgentDispatch$AgentDispatchState livekitAgentDispatch$AgentDispatchState = new LivekitAgentDispatch$AgentDispatchState();
        DEFAULT_INSTANCE = livekitAgentDispatch$AgentDispatchState;
        AbstractC12133Z.registerDefaultInstance(LivekitAgentDispatch$AgentDispatchState.class, livekitAgentDispatch$AgentDispatchState);
    }

    private LivekitAgentDispatch$AgentDispatchState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllJobs(Iterable<? extends LivekitAgent$Job> iterable) {
        ensureJobsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.jobs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJobs(LivekitAgent$Job livekitAgent$Job) {
        livekitAgent$Job.getClass();
        ensureJobsIsMutable();
        this.jobs_.add(livekitAgent$Job);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletedAt() {
        this.deletedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobs() {
        this.jobs_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureJobsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.jobs_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.jobs_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitAgentDispatch$AgentDispatchState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14876z newBuilder() {
        return (C14876z) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgentDispatch$AgentDispatchState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeJobs(int i10) {
        ensureJobsIsMutable();
        this.jobs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAt(long j10) {
        this.createdAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletedAt(long j10) {
        this.deletedAt_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobs(int i10, LivekitAgent$Job livekitAgent$Job) {
        livekitAgent$Job.getClass();
        ensureJobsIsMutable();
        this.jobs_.set(i10, livekitAgent$Job);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0003\u0002", new Object[]{"jobs_", LivekitAgent$Job.class, "createdAt_", "deletedAt_"});
            case 3:
                return new LivekitAgentDispatch$AgentDispatchState();
            case 4:
                return new C14876z(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgentDispatch$AgentDispatchState.class) {
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

    public long getCreatedAt() {
        return this.createdAt_;
    }

    public long getDeletedAt() {
        return this.deletedAt_;
    }

    public LivekitAgent$Job getJobs(int i10) {
        return (LivekitAgent$Job) this.jobs_.get(i10);
    }

    public int getJobsCount() {
        return this.jobs_.size();
    }

    public List<LivekitAgent$Job> getJobsList() {
        return this.jobs_;
    }

    public InterfaceC14736f getJobsOrBuilder(int i10) {
        return (InterfaceC14736f) this.jobs_.get(i10);
    }

    public List<? extends InterfaceC14736f> getJobsOrBuilderList() {
        return this.jobs_;
    }

    public static C14876z newBuilder(LivekitAgentDispatch$AgentDispatchState livekitAgentDispatch$AgentDispatchState) {
        return (C14876z) DEFAULT_INSTANCE.createBuilder(livekitAgentDispatch$AgentDispatchState);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJobs(int i10, LivekitAgent$Job livekitAgent$Job) {
        livekitAgent$Job.getClass();
        ensureJobsIsMutable();
        this.jobs_.add(i10, livekitAgent$Job);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(byte[] bArr) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(InputStream inputStream) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgentDispatch$AgentDispatchState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgentDispatch$AgentDispatchState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
