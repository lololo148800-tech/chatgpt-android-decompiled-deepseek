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
import p793ho.C14771k;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$MigrateJobRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgent$MigrateJobRequest DEFAULT_INSTANCE;
    public static final int JOB_IDS_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER;
    private InterfaceC12172m0 jobIds_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitAgent$MigrateJobRequest livekitAgent$MigrateJobRequest = new LivekitAgent$MigrateJobRequest();
        DEFAULT_INSTANCE = livekitAgent$MigrateJobRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$MigrateJobRequest.class, livekitAgent$MigrateJobRequest);
    }

    private LivekitAgent$MigrateJobRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllJobIds(Iterable<String> iterable) {
        ensureJobIdsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.jobIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJobIds(String str) {
        str.getClass();
        ensureJobIdsIsMutable();
        this.jobIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJobIdsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureJobIdsIsMutable();
        this.jobIds_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobIds() {
        this.jobIds_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureJobIdsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.jobIds_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.jobIds_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitAgent$MigrateJobRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14771k newBuilder() {
        return (C14771k) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$MigrateJobRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobIds(int i10, String str) {
        str.getClass();
        ensureJobIdsIsMutable();
        this.jobIds_.set(i10, str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"jobIds_"});
            case 3:
                return new LivekitAgent$MigrateJobRequest();
            case 4:
                return new C14771k(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$MigrateJobRequest.class) {
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

    public String getJobIds(int i10) {
        return (String) this.jobIds_.get(i10);
    }

    public AbstractC12171m getJobIdsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.jobIds_.get(i10));
    }

    public int getJobIdsCount() {
        return this.jobIds_.size();
    }

    public List<String> getJobIdsList() {
        return this.jobIds_;
    }

    public static C14771k newBuilder(LivekitAgent$MigrateJobRequest livekitAgent$MigrateJobRequest) {
        return (C14771k) DEFAULT_INSTANCE.createBuilder(livekitAgent$MigrateJobRequest);
    }

    public static LivekitAgent$MigrateJobRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(byte[] bArr) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(InputStream inputStream) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$MigrateJobRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$MigrateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
