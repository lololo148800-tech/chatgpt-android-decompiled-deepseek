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
import p793ho.C14796n3;
import p793ho.InterfaceC14823r2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$ListParticipantsResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRoom$ListParticipantsResponse DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 1;
    private InterfaceC12172m0 participants_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRoom$ListParticipantsResponse livekitRoom$ListParticipantsResponse = new LivekitRoom$ListParticipantsResponse();
        DEFAULT_INSTANCE = livekitRoom$ListParticipantsResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$ListParticipantsResponse.class, livekitRoom$ListParticipantsResponse);
    }

    private LivekitRoom$ListParticipantsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParticipants(Iterable<? extends LivekitModels$ParticipantInfo> iterable) {
        ensureParticipantsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.participants_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureParticipantsIsMutable();
        this.participants_.add(livekitModels$ParticipantInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipants() {
        this.participants_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureParticipantsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.participants_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.participants_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRoom$ListParticipantsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14796n3 newBuilder() {
        return (C14796n3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$ListParticipantsResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParticipants(int i10) {
        ensureParticipantsIsMutable();
        this.participants_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipants(int i10, LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureParticipantsIsMutable();
        this.participants_.set(i10, livekitModels$ParticipantInfo);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"participants_", LivekitModels$ParticipantInfo.class});
            case 3:
                return new LivekitRoom$ListParticipantsResponse();
            case 4:
                return new C14796n3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$ListParticipantsResponse.class) {
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

    public LivekitModels$ParticipantInfo getParticipants(int i10) {
        return (LivekitModels$ParticipantInfo) this.participants_.get(i10);
    }

    public int getParticipantsCount() {
        return this.participants_.size();
    }

    public List<LivekitModels$ParticipantInfo> getParticipantsList() {
        return this.participants_;
    }

    public InterfaceC14823r2 getParticipantsOrBuilder(int i10) {
        return (InterfaceC14823r2) this.participants_.get(i10);
    }

    public List<? extends InterfaceC14823r2> getParticipantsOrBuilderList() {
        return this.participants_;
    }

    public static C14796n3 newBuilder(LivekitRoom$ListParticipantsResponse livekitRoom$ListParticipantsResponse) {
        return (C14796n3) DEFAULT_INSTANCE.createBuilder(livekitRoom$ListParticipantsResponse);
    }

    public static LivekitRoom$ListParticipantsResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(int i10, LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureParticipantsIsMutable();
        this.participants_.add(i10, livekitModels$ParticipantInfo);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(byte[] bArr) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(InputStream inputStream) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$ListParticipantsResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$ListParticipantsResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
