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
import p793ho.C14701a;
import p793ho.C14729e;
import p793ho.C14757i;
import p793ho.C14785m;
import p793ho.C14792n;
import p793ho.C14848v;
import p793ho.EnumC14799o;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$ServerMessage extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ASSIGNMENT_FIELD_NUMBER = 3;
    public static final int AVAILABILITY_FIELD_NUMBER = 2;
    private static final LivekitAgent$ServerMessage DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PONG_FIELD_NUMBER = 4;
    public static final int REGISTER_FIELD_NUMBER = 1;
    public static final int TERMINATION_FIELD_NUMBER = 5;
    private int messageCase_ = 0;
    private Object message_;

    static {
        LivekitAgent$ServerMessage livekitAgent$ServerMessage = new LivekitAgent$ServerMessage();
        DEFAULT_INSTANCE = livekitAgent$ServerMessage;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$ServerMessage.class, livekitAgent$ServerMessage);
    }

    private LivekitAgent$ServerMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssignment() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
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
    public void clearPong() {
        if (this.messageCase_ == 4) {
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
    public void clearTermination() {
        if (this.messageCase_ == 5) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public static LivekitAgent$ServerMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAssignment(LivekitAgent$JobAssignment livekitAgent$JobAssignment) {
        livekitAgent$JobAssignment.getClass();
        if (this.messageCase_ != 3 || this.message_ == LivekitAgent$JobAssignment.getDefaultInstance()) {
            this.message_ = livekitAgent$JobAssignment;
        } else {
            C14729e c14729eNewBuilder = LivekitAgent$JobAssignment.newBuilder((LivekitAgent$JobAssignment) this.message_);
            c14729eNewBuilder.m13865f(livekitAgent$JobAssignment);
            this.message_ = c14729eNewBuilder.m13862c();
        }
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailability(LivekitAgent$AvailabilityRequest livekitAgent$AvailabilityRequest) {
        livekitAgent$AvailabilityRequest.getClass();
        if (this.messageCase_ != 2 || this.message_ == LivekitAgent$AvailabilityRequest.getDefaultInstance()) {
            this.message_ = livekitAgent$AvailabilityRequest;
        } else {
            C14701a c14701aNewBuilder = LivekitAgent$AvailabilityRequest.newBuilder((LivekitAgent$AvailabilityRequest) this.message_);
            c14701aNewBuilder.m13865f(livekitAgent$AvailabilityRequest);
            this.message_ = c14701aNewBuilder.m13862c();
        }
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePong(LivekitAgent$WorkerPong livekitAgent$WorkerPong) {
        livekitAgent$WorkerPong.getClass();
        if (this.messageCase_ != 4 || this.message_ == LivekitAgent$WorkerPong.getDefaultInstance()) {
            this.message_ = livekitAgent$WorkerPong;
        } else {
            C14848v c14848vNewBuilder = LivekitAgent$WorkerPong.newBuilder((LivekitAgent$WorkerPong) this.message_);
            c14848vNewBuilder.m13865f(livekitAgent$WorkerPong);
            this.message_ = c14848vNewBuilder.m13862c();
        }
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegister(LivekitAgent$RegisterWorkerResponse livekitAgent$RegisterWorkerResponse) {
        livekitAgent$RegisterWorkerResponse.getClass();
        if (this.messageCase_ != 1 || this.message_ == LivekitAgent$RegisterWorkerResponse.getDefaultInstance()) {
            this.message_ = livekitAgent$RegisterWorkerResponse;
        } else {
            C14785m c14785mNewBuilder = LivekitAgent$RegisterWorkerResponse.newBuilder((LivekitAgent$RegisterWorkerResponse) this.message_);
            c14785mNewBuilder.m13865f(livekitAgent$RegisterWorkerResponse);
            this.message_ = c14785mNewBuilder.m13862c();
        }
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTermination(LivekitAgent$JobTermination livekitAgent$JobTermination) {
        livekitAgent$JobTermination.getClass();
        if (this.messageCase_ != 5 || this.message_ == LivekitAgent$JobTermination.getDefaultInstance()) {
            this.message_ = livekitAgent$JobTermination;
        } else {
            C14757i c14757iNewBuilder = LivekitAgent$JobTermination.newBuilder((LivekitAgent$JobTermination) this.message_);
            c14757iNewBuilder.m13865f(livekitAgent$JobTermination);
            this.message_ = c14757iNewBuilder.m13862c();
        }
        this.messageCase_ = 5;
    }

    public static C14792n newBuilder() {
        return (C14792n) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$ServerMessage parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$ServerMessage parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssignment(LivekitAgent$JobAssignment livekitAgent$JobAssignment) {
        livekitAgent$JobAssignment.getClass();
        this.message_ = livekitAgent$JobAssignment;
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailability(LivekitAgent$AvailabilityRequest livekitAgent$AvailabilityRequest) {
        livekitAgent$AvailabilityRequest.getClass();
        this.message_ = livekitAgent$AvailabilityRequest;
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPong(LivekitAgent$WorkerPong livekitAgent$WorkerPong) {
        livekitAgent$WorkerPong.getClass();
        this.message_ = livekitAgent$WorkerPong;
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegister(LivekitAgent$RegisterWorkerResponse livekitAgent$RegisterWorkerResponse) {
        livekitAgent$RegisterWorkerResponse.getClass();
        this.message_ = livekitAgent$RegisterWorkerResponse;
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTermination(LivekitAgent$JobTermination livekitAgent$JobTermination) {
        livekitAgent$JobTermination.getClass();
        this.message_ = livekitAgent$JobTermination;
        this.messageCase_ = 5;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"message_", "messageCase_", LivekitAgent$RegisterWorkerResponse.class, LivekitAgent$AvailabilityRequest.class, LivekitAgent$JobAssignment.class, LivekitAgent$WorkerPong.class, LivekitAgent$JobTermination.class});
            case 3:
                return new LivekitAgent$ServerMessage();
            case 4:
                return new C14792n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$ServerMessage.class) {
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

    public LivekitAgent$JobAssignment getAssignment() {
        return this.messageCase_ == 3 ? (LivekitAgent$JobAssignment) this.message_ : LivekitAgent$JobAssignment.getDefaultInstance();
    }

    public LivekitAgent$AvailabilityRequest getAvailability() {
        return this.messageCase_ == 2 ? (LivekitAgent$AvailabilityRequest) this.message_ : LivekitAgent$AvailabilityRequest.getDefaultInstance();
    }

    public EnumC14799o getMessageCase() {
        int i10 = this.messageCase_;
        if (i10 == 0) {
            return EnumC14799o.f46258r0;
        }
        if (i10 == 1) {
            return EnumC14799o.f46253Y;
        }
        if (i10 == 2) {
            return EnumC14799o.f46254Z;
        }
        if (i10 == 3) {
            return EnumC14799o.f46255o0;
        }
        if (i10 == 4) {
            return EnumC14799o.f46257q0;
        }
        if (i10 != 5) {
            return null;
        }
        return EnumC14799o.f46256p0;
    }

    public LivekitAgent$WorkerPong getPong() {
        return this.messageCase_ == 4 ? (LivekitAgent$WorkerPong) this.message_ : LivekitAgent$WorkerPong.getDefaultInstance();
    }

    public LivekitAgent$RegisterWorkerResponse getRegister() {
        return this.messageCase_ == 1 ? (LivekitAgent$RegisterWorkerResponse) this.message_ : LivekitAgent$RegisterWorkerResponse.getDefaultInstance();
    }

    public LivekitAgent$JobTermination getTermination() {
        return this.messageCase_ == 5 ? (LivekitAgent$JobTermination) this.message_ : LivekitAgent$JobTermination.getDefaultInstance();
    }

    public boolean hasAssignment() {
        return this.messageCase_ == 3;
    }

    public boolean hasAvailability() {
        return this.messageCase_ == 2;
    }

    public boolean hasPong() {
        return this.messageCase_ == 4;
    }

    public boolean hasRegister() {
        return this.messageCase_ == 1;
    }

    public boolean hasTermination() {
        return this.messageCase_ == 5;
    }

    public static C14792n newBuilder(LivekitAgent$ServerMessage livekitAgent$ServerMessage) {
        return (C14792n) DEFAULT_INSTANCE.createBuilder(livekitAgent$ServerMessage);
    }

    public static LivekitAgent$ServerMessage parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$ServerMessage parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$ServerMessage parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$ServerMessage parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$ServerMessage parseFrom(byte[] bArr) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$ServerMessage parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$ServerMessage parseFrom(InputStream inputStream) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$ServerMessage parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$ServerMessage parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$ServerMessage parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$ServerMessage) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
