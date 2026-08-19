package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12167k1;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14618M;
import p793ho.InterfaceC14624N;
import p793ho.InterfaceC14636P;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsRoom extends AbstractC12133Z implements InterfaceC14624N {
    public static final int CREATED_AT_FIELD_NUMBER = 3;
    private static final LivekitAnalytics$AnalyticsRoom DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 4;
    public static final int PROJECT_ID_FIELD_NUMBER = 5;
    private Timestamp createdAt_;
    private String id_ = "";
    private String name_ = "";
    private String projectId_ = "";
    private InterfaceC12172m0 participants_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitAnalytics$AnalyticsRoom livekitAnalytics$AnalyticsRoom = new LivekitAnalytics$AnalyticsRoom();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsRoom;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsRoom.class, livekitAnalytics$AnalyticsRoom);
    }

    private LivekitAnalytics$AnalyticsRoom() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParticipants(Iterable<? extends LivekitAnalytics$AnalyticsRoomParticipant> iterable) {
        ensureParticipantsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.participants_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(LivekitAnalytics$AnalyticsRoomParticipant livekitAnalytics$AnalyticsRoomParticipant) {
        livekitAnalytics$AnalyticsRoomParticipant.getClass();
        ensureParticipantsIsMutable();
        this.participants_.add(livekitAnalytics$AnalyticsRoomParticipant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipants() {
        this.participants_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProjectId() {
        this.projectId_ = getDefaultInstance().getProjectId();
    }

    private void ensureParticipantsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.participants_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.participants_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitAnalytics$AnalyticsRoom getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.createdAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.createdAt_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.createdAt_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.createdAt_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    public static C14618M newBuilder() {
        return (C14618M) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsRoom parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.createdAt_ = timestamp;
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
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.name_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipants(int i10, LivekitAnalytics$AnalyticsRoomParticipant livekitAnalytics$AnalyticsRoomParticipant) {
        livekitAnalytics$AnalyticsRoomParticipant.getClass();
        ensureParticipantsIsMutable();
        this.participants_.set(i10, livekitAnalytics$AnalyticsRoomParticipant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectId(String str) {
        str.getClass();
        this.projectId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.projectId_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004\u001b\u0005Ȉ", new Object[]{"id_", "name_", "createdAt_", "participants_", LivekitAnalytics$AnalyticsRoomParticipant.class, "projectId_"});
            case 3:
                return new LivekitAnalytics$AnalyticsRoom();
            case 4:
                return new C14618M(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsRoom.class) {
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

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public LivekitAnalytics$AnalyticsRoomParticipant getParticipants(int i10) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) this.participants_.get(i10);
    }

    public int getParticipantsCount() {
        return this.participants_.size();
    }

    public List<LivekitAnalytics$AnalyticsRoomParticipant> getParticipantsList() {
        return this.participants_;
    }

    public InterfaceC14636P getParticipantsOrBuilder(int i10) {
        return (InterfaceC14636P) this.participants_.get(i10);
    }

    public List<? extends InterfaceC14636P> getParticipantsOrBuilderList() {
        return this.participants_;
    }

    public String getProjectId() {
        return this.projectId_;
    }

    public AbstractC12171m getProjectIdBytes() {
        return AbstractC12171m.m14011m(this.projectId_);
    }

    public boolean hasCreatedAt() {
        return this.createdAt_ != null;
    }

    public static C14618M newBuilder(LivekitAnalytics$AnalyticsRoom livekitAnalytics$AnalyticsRoom) {
        return (C14618M) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsRoom);
    }

    public static LivekitAnalytics$AnalyticsRoom parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(int i10, LivekitAnalytics$AnalyticsRoomParticipant livekitAnalytics$AnalyticsRoomParticipant) {
        livekitAnalytics$AnalyticsRoomParticipant.getClass();
        ensureParticipantsIsMutable();
        this.participants_.add(i10, livekitAnalytics$AnalyticsRoomParticipant);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsRoom parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoom) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
