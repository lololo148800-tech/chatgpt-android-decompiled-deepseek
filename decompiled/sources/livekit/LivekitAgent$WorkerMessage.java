package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14708b;
import p793ho.C14771k;
import p793ho.C14778l;
import p793ho.C14806p;
import p793ho.C14813q;
import p793ho.C14820r;
import p793ho.C14827s;
import p793ho.C14841u;
import p793ho.EnumC14834t;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$WorkerMessage extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AVAILABILITY_FIELD_NUMBER = 2;
    private static final LivekitAgent$WorkerMessage DEFAULT_INSTANCE;
    public static final int MIGRATE_JOB_FIELD_NUMBER = 7;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PING_FIELD_NUMBER = 5;
    public static final int REGISTER_FIELD_NUMBER = 1;
    public static final int SIMULATE_JOB_FIELD_NUMBER = 6;
    public static final int UPDATE_JOB_FIELD_NUMBER = 4;
    public static final int UPDATE_WORKER_FIELD_NUMBER = 3;
    private int messageCase_ = 0;
    private Object message_;

    static {
        LivekitAgent$WorkerMessage livekitAgent$WorkerMessage = new LivekitAgent$WorkerMessage();
        DEFAULT_INSTANCE = livekitAgent$WorkerMessage;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$WorkerMessage.class, livekitAgent$WorkerMessage);
    }

    private LivekitAgent$WorkerMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailability() {
        if (this.messageCase_ == 2) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.messageCase_ = 0;
        this.message_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMigrateJob() {
        if (this.messageCase_ == 7) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPing() {
        if (this.messageCase_ == 5) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegister() {
        if (this.messageCase_ == 1) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimulateJob() {
        if (this.messageCase_ == 6) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateJob() {
        if (this.messageCase_ == 4) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateWorker() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public static LivekitAgent$WorkerMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailability(LivekitAgent$AvailabilityResponse livekitAgent$AvailabilityResponse) {
        livekitAgent$AvailabilityResponse.getClass();
        if (this.messageCase_ != 2 || this.message_ == LivekitAgent$AvailabilityResponse.getDefaultInstance()) {
            this.message_ = livekitAgent$AvailabilityResponse;
        } else {
            C14708b c14708bNewBuilder = LivekitAgent$AvailabilityResponse.newBuilder((LivekitAgent$AvailabilityResponse) this.message_);
            c14708bNewBuilder.m13865f(livekitAgent$AvailabilityResponse);
            this.message_ = c14708bNewBuilder.m13862c();
        }
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMigrateJob(LivekitAgent$MigrateJobRequest livekitAgent$MigrateJobRequest) {
        livekitAgent$MigrateJobRequest.getClass();
        if (this.messageCase_ != 7 || this.message_ == LivekitAgent$MigrateJobRequest.getDefaultInstance()) {
            this.message_ = livekitAgent$MigrateJobRequest;
        } else {
            C14771k c14771kNewBuilder = LivekitAgent$MigrateJobRequest.newBuilder((LivekitAgent$MigrateJobRequest) this.message_);
            c14771kNewBuilder.m13865f(livekitAgent$MigrateJobRequest);
            this.message_ = c14771kNewBuilder.m13862c();
        }
        this.messageCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePing(LivekitAgent$WorkerPing livekitAgent$WorkerPing) {
        livekitAgent$WorkerPing.getClass();
        if (this.messageCase_ != 5 || this.message_ == LivekitAgent$WorkerPing.getDefaultInstance()) {
            this.message_ = livekitAgent$WorkerPing;
        } else {
            C14841u c14841uNewBuilder = LivekitAgent$WorkerPing.newBuilder((LivekitAgent$WorkerPing) this.message_);
            c14841uNewBuilder.m13865f(livekitAgent$WorkerPing);
            this.message_ = c14841uNewBuilder.m13862c();
        }
        this.messageCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegister(LivekitAgent$RegisterWorkerRequest livekitAgent$RegisterWorkerRequest) {
        livekitAgent$RegisterWorkerRequest.getClass();
        if (this.messageCase_ != 1 || this.message_ == LivekitAgent$RegisterWorkerRequest.getDefaultInstance()) {
            this.message_ = livekitAgent$RegisterWorkerRequest;
        } else {
            C14778l c14778lNewBuilder = LivekitAgent$RegisterWorkerRequest.newBuilder((LivekitAgent$RegisterWorkerRequest) this.message_);
            c14778lNewBuilder.m13865f(livekitAgent$RegisterWorkerRequest);
            this.message_ = c14778lNewBuilder.m13862c();
        }
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSimulateJob(LivekitAgent$SimulateJobRequest livekitAgent$SimulateJobRequest) {
        livekitAgent$SimulateJobRequest.getClass();
        if (this.messageCase_ != 6 || this.message_ == LivekitAgent$SimulateJobRequest.getDefaultInstance()) {
            this.message_ = livekitAgent$SimulateJobRequest;
        } else {
            C14806p c14806pNewBuilder = LivekitAgent$SimulateJobRequest.newBuilder((LivekitAgent$SimulateJobRequest) this.message_);
            c14806pNewBuilder.m13865f(livekitAgent$SimulateJobRequest);
            this.message_ = c14806pNewBuilder.m13862c();
        }
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateJob(LivekitAgent$UpdateJobStatus livekitAgent$UpdateJobStatus) {
        livekitAgent$UpdateJobStatus.getClass();
        if (this.messageCase_ != 4 || this.message_ == LivekitAgent$UpdateJobStatus.getDefaultInstance()) {
            this.message_ = livekitAgent$UpdateJobStatus;
        } else {
            C14813q c14813qNewBuilder = LivekitAgent$UpdateJobStatus.newBuilder((LivekitAgent$UpdateJobStatus) this.message_);
            c14813qNewBuilder.m13865f(livekitAgent$UpdateJobStatus);
            this.message_ = c14813qNewBuilder.m13862c();
        }
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateWorker(LivekitAgent$UpdateWorkerStatus livekitAgent$UpdateWorkerStatus) {
        livekitAgent$UpdateWorkerStatus.getClass();
        if (this.messageCase_ != 3 || this.message_ == LivekitAgent$UpdateWorkerStatus.getDefaultInstance()) {
            this.message_ = livekitAgent$UpdateWorkerStatus;
        } else {
            C14820r c14820rNewBuilder = LivekitAgent$UpdateWorkerStatus.newBuilder((LivekitAgent$UpdateWorkerStatus) this.message_);
            c14820rNewBuilder.m13865f(livekitAgent$UpdateWorkerStatus);
            this.message_ = c14820rNewBuilder.m13862c();
        }
        this.messageCase_ = 3;
    }

    public static C14827s newBuilder() {
        return (C14827s) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$WorkerMessage parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$WorkerMessage parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailability(LivekitAgent$AvailabilityResponse livekitAgent$AvailabilityResponse) {
        livekitAgent$AvailabilityResponse.getClass();
        this.message_ = livekitAgent$AvailabilityResponse;
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMigrateJob(LivekitAgent$MigrateJobRequest livekitAgent$MigrateJobRequest) {
        livekitAgent$MigrateJobRequest.getClass();
        this.message_ = livekitAgent$MigrateJobRequest;
        this.messageCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPing(LivekitAgent$WorkerPing livekitAgent$WorkerPing) {
        livekitAgent$WorkerPing.getClass();
        this.message_ = livekitAgent$WorkerPing;
        this.messageCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegister(LivekitAgent$RegisterWorkerRequest livekitAgent$RegisterWorkerRequest) {
        livekitAgent$RegisterWorkerRequest.getClass();
        this.message_ = livekitAgent$RegisterWorkerRequest;
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimulateJob(LivekitAgent$SimulateJobRequest livekitAgent$SimulateJobRequest) {
        livekitAgent$SimulateJobRequest.getClass();
        this.message_ = livekitAgent$SimulateJobRequest;
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateJob(LivekitAgent$UpdateJobStatus livekitAgent$UpdateJobStatus) {
        livekitAgent$UpdateJobStatus.getClass();
        this.message_ = livekitAgent$UpdateJobStatus;
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateWorker(LivekitAgent$UpdateWorkerStatus livekitAgent$UpdateWorkerStatus) {
        livekitAgent$UpdateWorkerStatus.getClass();
        this.message_ = livekitAgent$UpdateWorkerStatus;
        this.messageCase_ = 3;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"message_", "messageCase_", LivekitAgent$RegisterWorkerRequest.class, LivekitAgent$AvailabilityResponse.class, LivekitAgent$UpdateWorkerStatus.class, LivekitAgent$UpdateJobStatus.class, LivekitAgent$WorkerPing.class, LivekitAgent$SimulateJobRequest.class, LivekitAgent$MigrateJobRequest.class});
            case 3:
                return new LivekitAgent$WorkerMessage();
            case 4:
                return new C14827s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$WorkerMessage.class) {
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

    public LivekitAgent$AvailabilityResponse getAvailability() {
        return this.messageCase_ == 2 ? (LivekitAgent$AvailabilityResponse) this.message_ : LivekitAgent$AvailabilityResponse.getDefaultInstance();
    }

    public EnumC14834t getMessageCase() {
        switch (this.messageCase_) {
            case 0:
                return EnumC14834t.f46311t0;
            case 1:
                return EnumC14834t.f46304Y;
            case 2:
                return EnumC14834t.f46305Z;
            case 3:
                return EnumC14834t.f46306o0;
            case 4:
                return EnumC14834t.f46307p0;
            case 5:
                return EnumC14834t.f46308q0;
            case 6:
                return EnumC14834t.f46309r0;
            case 7:
                return EnumC14834t.f46310s0;
            default:
                return null;
        }
    }

    public LivekitAgent$MigrateJobRequest getMigrateJob() {
        return this.messageCase_ == 7 ? (LivekitAgent$MigrateJobRequest) this.message_ : LivekitAgent$MigrateJobRequest.getDefaultInstance();
    }

    public LivekitAgent$WorkerPing getPing() {
        return this.messageCase_ == 5 ? (LivekitAgent$WorkerPing) this.message_ : LivekitAgent$WorkerPing.getDefaultInstance();
    }

    public LivekitAgent$RegisterWorkerRequest getRegister() {
        return this.messageCase_ == 1 ? (LivekitAgent$RegisterWorkerRequest) this.message_ : LivekitAgent$RegisterWorkerRequest.getDefaultInstance();
    }

    public LivekitAgent$SimulateJobRequest getSimulateJob() {
        return this.messageCase_ == 6 ? (LivekitAgent$SimulateJobRequest) this.message_ : LivekitAgent$SimulateJobRequest.getDefaultInstance();
    }

    public LivekitAgent$UpdateJobStatus getUpdateJob() {
        return this.messageCase_ == 4 ? (LivekitAgent$UpdateJobStatus) this.message_ : LivekitAgent$UpdateJobStatus.getDefaultInstance();
    }

    public LivekitAgent$UpdateWorkerStatus getUpdateWorker() {
        return this.messageCase_ == 3 ? (LivekitAgent$UpdateWorkerStatus) this.message_ : LivekitAgent$UpdateWorkerStatus.getDefaultInstance();
    }

    public boolean hasAvailability() {
        return this.messageCase_ == 2;
    }

    public boolean hasMigrateJob() {
        return this.messageCase_ == 7;
    }

    public boolean hasPing() {
        return this.messageCase_ == 5;
    }

    public boolean hasRegister() {
        return this.messageCase_ == 1;
    }

    public boolean hasSimulateJob() {
        return this.messageCase_ == 6;
    }

    public boolean hasUpdateJob() {
        return this.messageCase_ == 4;
    }

    public boolean hasUpdateWorker() {
        return this.messageCase_ == 3;
    }

    public static C14827s newBuilder(LivekitAgent$WorkerMessage livekitAgent$WorkerMessage) {
        return (C14827s) DEFAULT_INSTANCE.createBuilder(livekitAgent$WorkerMessage);
    }

    public static LivekitAgent$WorkerMessage parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$WorkerMessage parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$WorkerMessage parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$WorkerMessage parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$WorkerMessage parseFrom(byte[] bArr) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$WorkerMessage parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$WorkerMessage parseFrom(InputStream inputStream) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$WorkerMessage parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$WorkerMessage parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$WorkerMessage parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$WorkerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
