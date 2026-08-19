package livekit;

import androidx.work.impl.utils.p651oZ.HhJS;
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
import p793ho.C14579F2;
import p793ho.C14802o2;
import p793ho.C14806p;
import p793ho.EnumC14764j;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAgent$SimulateJobRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAgent$SimulateJobRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 3;
    public static final int ROOM_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private LivekitModels$ParticipantInfo participant_;
    private LivekitModels$Room room_;
    private int type_;

    static {
        LivekitAgent$SimulateJobRequest livekitAgent$SimulateJobRequest = new LivekitAgent$SimulateJobRequest();
        DEFAULT_INSTANCE = livekitAgent$SimulateJobRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitAgent$SimulateJobRequest.class, livekitAgent$SimulateJobRequest);
    }

    private LivekitAgent$SimulateJobRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static LivekitAgent$SimulateJobRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo2 = this.participant_;
        if (livekitModels$ParticipantInfo2 == null || livekitModels$ParticipantInfo2 == LivekitModels$ParticipantInfo.getDefaultInstance()) {
            this.participant_ = livekitModels$ParticipantInfo;
            return;
        }
        C14802o2 c14802o2NewBuilder = LivekitModels$ParticipantInfo.newBuilder(this.participant_);
        c14802o2NewBuilder.m13865f(livekitModels$ParticipantInfo);
        this.participant_ = (LivekitModels$ParticipantInfo) c14802o2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        LivekitModels$Room livekitModels$Room2 = this.room_;
        if (livekitModels$Room2 == null || livekitModels$Room2 == LivekitModels$Room.getDefaultInstance()) {
            this.room_ = livekitModels$Room;
            return;
        }
        C14579F2 c14579f2NewBuilder = LivekitModels$Room.newBuilder(this.room_);
        c14579f2NewBuilder.m13865f(livekitModels$Room);
        this.room_ = (LivekitModels$Room) c14579f2NewBuilder.m13862c();
    }

    public static C14806p newBuilder() {
        return (C14806p) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$SimulateJobRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.participant_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC14764j enumC14764j) {
        this.type_ = enumC14764j.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"type_", HhJS.wZEkduYzWuK, "participant_"});
            case 3:
                return new LivekitAgent$SimulateJobRequest();
            case 4:
                return new C14806p(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAgent$SimulateJobRequest.class) {
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

    public LivekitModels$ParticipantInfo getParticipant() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.participant_;
        return livekitModels$ParticipantInfo == null ? LivekitModels$ParticipantInfo.getDefaultInstance() : livekitModels$ParticipantInfo;
    }

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        return livekitModels$Room == null ? LivekitModels$Room.getDefaultInstance() : livekitModels$Room;
    }

    public EnumC14764j getType() {
        EnumC14764j enumC14764jM16051a = EnumC14764j.m16051a(this.type_);
        return enumC14764jM16051a == null ? EnumC14764j.UNRECOGNIZED : enumC14764jM16051a;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasParticipant() {
        return this.participant_ != null;
    }

    public boolean hasRoom() {
        return this.room_ != null;
    }

    public static C14806p newBuilder(LivekitAgent$SimulateJobRequest livekitAgent$SimulateJobRequest) {
        return (C14806p) DEFAULT_INSTANCE.createBuilder(livekitAgent$SimulateJobRequest);
    }

    public static LivekitAgent$SimulateJobRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(byte[] bArr) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(InputStream inputStream) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAgent$SimulateJobRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAgent$SimulateJobRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
