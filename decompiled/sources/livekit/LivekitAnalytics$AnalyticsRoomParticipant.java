package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12167k1;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14630O;
import p793ho.EnumC14816q2;
import p793ho.InterfaceC14636P;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsRoomParticipant extends AbstractC12133Z implements InterfaceC14636P {
    private static final LivekitAnalytics$AnalyticsRoomParticipant DEFAULT_INSTANCE;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int JOINED_AT_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 4;
    private Timestamp joinedAt_;
    private int state_;
    private String id_ = "";
    private String identity_ = "";
    private String name_ = "";

    static {
        LivekitAnalytics$AnalyticsRoomParticipant livekitAnalytics$AnalyticsRoomParticipant = new LivekitAnalytics$AnalyticsRoomParticipant();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsRoomParticipant;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsRoomParticipant.class, livekitAnalytics$AnalyticsRoomParticipant);
    }

    private LivekitAnalytics$AnalyticsRoomParticipant() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinedAt() {
        this.joinedAt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJoinedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.joinedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.joinedAt_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.joinedAt_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.joinedAt_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    public static C14630O newBuilder() {
        return (C14630O) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setIdentity(String str) {
        str.getClass();
        this.identity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentityBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.identity_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.joinedAt_ = timestamp;
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
    public void setState(EnumC14816q2 enumC14816q2) {
        this.state_ = enumC14816q2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i10) {
        this.state_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\t", new Object[]{"id_", "identity_", "name_", "state_", "joinedAt_"});
            case 3:
                return new LivekitAnalytics$AnalyticsRoomParticipant();
            case 4:
                return new C14630O(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsRoomParticipant.class) {
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

    public String getId() {
        return this.id_;
    }

    public AbstractC12171m getIdBytes() {
        return AbstractC12171m.m14011m(this.id_);
    }

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC12171m getIdentityBytes() {
        return AbstractC12171m.m14011m(this.identity_);
    }

    public Timestamp getJoinedAt() {
        Timestamp timestamp = this.joinedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public EnumC14816q2 getState() {
        EnumC14816q2 enumC14816q2M16054a = EnumC14816q2.m16054a(this.state_);
        return enumC14816q2M16054a == null ? EnumC14816q2.UNRECOGNIZED : enumC14816q2M16054a;
    }

    public int getStateValue() {
        return this.state_;
    }

    public boolean hasJoinedAt() {
        return this.joinedAt_ != null;
    }

    public static C14630O newBuilder(LivekitAnalytics$AnalyticsRoomParticipant livekitAnalytics$AnalyticsRoomParticipant) {
        return (C14630O) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsRoomParticipant);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsRoomParticipant parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsRoomParticipant) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
