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
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12172m0;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p793ho.C14612L;
import p793ho.InterfaceC14624N;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsNodeRooms extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAnalytics$AnalyticsNodeRooms DEFAULT_INSTANCE;
    public static final int NODE_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int ROOMS_FIELD_NUMBER = 4;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private String nodeId_ = "";
    private InterfaceC12172m0 rooms_ = AbstractC12133Z.emptyProtobufList();
    private long sequenceNumber_;
    private Timestamp timestamp_;

    static {
        LivekitAnalytics$AnalyticsNodeRooms livekitAnalytics$AnalyticsNodeRooms = new LivekitAnalytics$AnalyticsNodeRooms();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsNodeRooms;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsNodeRooms.class, livekitAnalytics$AnalyticsNodeRooms);
    }

    private LivekitAnalytics$AnalyticsNodeRooms() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRooms(Iterable<? extends LivekitAnalytics$AnalyticsRoom> iterable) {
        ensureRoomsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.rooms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRooms(LivekitAnalytics$AnalyticsRoom livekitAnalytics$AnalyticsRoom) {
        livekitAnalytics$AnalyticsRoom.getClass();
        ensureRoomsIsMutable();
        this.rooms_.add(livekitAnalytics$AnalyticsRoom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeId() {
        this.nodeId_ = getDefaultInstance().getNodeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRooms() {
        this.rooms_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSequenceNumber() {
        this.sequenceNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = null;
    }

    private void ensureRoomsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.rooms_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.rooms_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.timestamp_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.timestamp_ = timestamp;
            return;
        }
        C12167k1 c12167k1NewBuilder = Timestamp.newBuilder(this.timestamp_);
        c12167k1NewBuilder.m13865f(timestamp);
        this.timestamp_ = (Timestamp) c12167k1NewBuilder.m13862c();
    }

    public static C14612L newBuilder() {
        return (C14612L) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRooms(int i10) {
        ensureRoomsIsMutable();
        this.rooms_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeId(String str) {
        str.getClass();
        this.nodeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeIdBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.nodeId_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRooms(int i10, LivekitAnalytics$AnalyticsRoom livekitAnalytics$AnalyticsRoom) {
        livekitAnalytics$AnalyticsRoom.getClass();
        ensureRoomsIsMutable();
        this.rooms_.set(i10, livekitAnalytics$AnalyticsRoom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSequenceNumber(long j10) {
        this.sequenceNumber_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timestamp_ = timestamp;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003\t\u0004\u001b", new Object[]{"nodeId_", "sequenceNumber_", "timestamp_", "rooms_", LivekitAnalytics$AnalyticsRoom.class});
            case 3:
                return new LivekitAnalytics$AnalyticsNodeRooms();
            case 4:
                return new C14612L(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsNodeRooms.class) {
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

    public String getNodeId() {
        return this.nodeId_;
    }

    public AbstractC12171m getNodeIdBytes() {
        return AbstractC12171m.m14011m(this.nodeId_);
    }

    public LivekitAnalytics$AnalyticsRoom getRooms(int i10) {
        return (LivekitAnalytics$AnalyticsRoom) this.rooms_.get(i10);
    }

    public int getRoomsCount() {
        return this.rooms_.size();
    }

    public List<LivekitAnalytics$AnalyticsRoom> getRoomsList() {
        return this.rooms_;
    }

    public InterfaceC14624N getRoomsOrBuilder(int i10) {
        return (InterfaceC14624N) this.rooms_.get(i10);
    }

    public List<? extends InterfaceC14624N> getRoomsOrBuilderList() {
        return this.rooms_;
    }

    public long getSequenceNumber() {
        return this.sequenceNumber_;
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasTimestamp() {
        return this.timestamp_ != null;
    }

    public static C14612L newBuilder(LivekitAnalytics$AnalyticsNodeRooms livekitAnalytics$AnalyticsNodeRooms) {
        return (C14612L) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsNodeRooms);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRooms(int i10, LivekitAnalytics$AnalyticsRoom livekitAnalytics$AnalyticsRoom) {
        livekitAnalytics$AnalyticsRoom.getClass();
        ensureRoomsIsMutable();
        this.rooms_.add(i10, livekitAnalytics$AnalyticsRoom);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsNodeRooms parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsNodeRooms) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
