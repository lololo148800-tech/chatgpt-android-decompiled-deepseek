package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14838t3;
import p793ho.C14845u3;
import p793ho.C14852v3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRoom$RoomConfiguration extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AGENT_FIELD_NUMBER = 6;
    private static final LivekitRoom$RoomConfiguration DEFAULT_INSTANCE;
    public static final int DEPARTURE_TIMEOUT_FIELD_NUMBER = 3;
    public static final int EGRESS_FIELD_NUMBER = 5;
    public static final int EMPTY_TIMEOUT_FIELD_NUMBER = 2;
    public static final int MAX_PARTICIPANTS_FIELD_NUMBER = 4;
    public static final int MAX_PLAYOUT_DELAY_FIELD_NUMBER = 8;
    public static final int MIN_PLAYOUT_DELAY_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SYNC_STREAMS_FIELD_NUMBER = 9;
    private LivekitRoom$RoomAgent agent_;
    private int departureTimeout_;
    private LivekitRoom$RoomEgress egress_;
    private int emptyTimeout_;
    private int maxParticipants_;
    private int maxPlayoutDelay_;
    private int minPlayoutDelay_;
    private String name_ = "";
    private boolean syncStreams_;

    static {
        LivekitRoom$RoomConfiguration livekitRoom$RoomConfiguration = new LivekitRoom$RoomConfiguration();
        DEFAULT_INSTANCE = livekitRoom$RoomConfiguration;
        AbstractC12133Z.registerDefaultInstance(LivekitRoom$RoomConfiguration.class, livekitRoom$RoomConfiguration);
    }

    private LivekitRoom$RoomConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgent() {
        this.agent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDepartureTimeout() {
        this.departureTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgress() {
        this.egress_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmptyTimeout() {
        this.emptyTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxParticipants() {
        this.maxParticipants_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxPlayoutDelay() {
        this.maxPlayoutDelay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinPlayoutDelay() {
        this.minPlayoutDelay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncStreams() {
        this.syncStreams_ = false;
    }

    public static LivekitRoom$RoomConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAgent(LivekitRoom$RoomAgent livekitRoom$RoomAgent) {
        livekitRoom$RoomAgent.getClass();
        LivekitRoom$RoomAgent livekitRoom$RoomAgent2 = this.agent_;
        if (livekitRoom$RoomAgent2 == null || livekitRoom$RoomAgent2 == LivekitRoom$RoomAgent.getDefaultInstance()) {
            this.agent_ = livekitRoom$RoomAgent;
            return;
        }
        C14838t3 c14838t3NewBuilder = LivekitRoom$RoomAgent.newBuilder(this.agent_);
        c14838t3NewBuilder.m13865f(livekitRoom$RoomAgent);
        this.agent_ = (LivekitRoom$RoomAgent) c14838t3NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEgress(LivekitRoom$RoomEgress livekitRoom$RoomEgress) {
        livekitRoom$RoomEgress.getClass();
        LivekitRoom$RoomEgress livekitRoom$RoomEgress2 = this.egress_;
        if (livekitRoom$RoomEgress2 == null || livekitRoom$RoomEgress2 == LivekitRoom$RoomEgress.getDefaultInstance()) {
            this.egress_ = livekitRoom$RoomEgress;
            return;
        }
        C14852v3 c14852v3NewBuilder = LivekitRoom$RoomEgress.newBuilder(this.egress_);
        c14852v3NewBuilder.m13865f(livekitRoom$RoomEgress);
        this.egress_ = (LivekitRoom$RoomEgress) c14852v3NewBuilder.m13862c();
    }

    public static C14845u3 newBuilder() {
        return (C14845u3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$RoomConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgent(LivekitRoom$RoomAgent livekitRoom$RoomAgent) {
        livekitRoom$RoomAgent.getClass();
        this.agent_ = livekitRoom$RoomAgent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDepartureTimeout(int i10) {
        this.departureTimeout_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgress(LivekitRoom$RoomEgress livekitRoom$RoomEgress) {
        livekitRoom$RoomEgress.getClass();
        this.egress_ = livekitRoom$RoomEgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmptyTimeout(int i10) {
        this.emptyTimeout_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxParticipants(int i10) {
        this.maxParticipants_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxPlayoutDelay(int i10) {
        this.maxPlayoutDelay_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinPlayoutDelay(int i10) {
        this.minPlayoutDelay_ = i10;
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
    public void setSyncStreams(boolean z6) {
        this.syncStreams_ = z6;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005\t\u0006\t\u0007\u000b\b\u000b\t\u0007", new Object[]{"name_", "emptyTimeout_", "departureTimeout_", "maxParticipants_", "egress_", "agent_", "minPlayoutDelay_", "maxPlayoutDelay_", "syncStreams_"});
            case 3:
                return new LivekitRoom$RoomConfiguration();
            case 4:
                return new C14845u3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRoom$RoomConfiguration.class) {
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

    public LivekitRoom$RoomAgent getAgent() {
        LivekitRoom$RoomAgent livekitRoom$RoomAgent = this.agent_;
        return livekitRoom$RoomAgent == null ? LivekitRoom$RoomAgent.getDefaultInstance() : livekitRoom$RoomAgent;
    }

    public int getDepartureTimeout() {
        return this.departureTimeout_;
    }

    public LivekitRoom$RoomEgress getEgress() {
        LivekitRoom$RoomEgress livekitRoom$RoomEgress = this.egress_;
        return livekitRoom$RoomEgress == null ? LivekitRoom$RoomEgress.getDefaultInstance() : livekitRoom$RoomEgress;
    }

    public int getEmptyTimeout() {
        return this.emptyTimeout_;
    }

    public int getMaxParticipants() {
        return this.maxParticipants_;
    }

    public int getMaxPlayoutDelay() {
        return this.maxPlayoutDelay_;
    }

    public int getMinPlayoutDelay() {
        return this.minPlayoutDelay_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public boolean getSyncStreams() {
        return this.syncStreams_;
    }

    public boolean hasAgent() {
        return this.agent_ != null;
    }

    public boolean hasEgress() {
        return this.egress_ != null;
    }

    public static C14845u3 newBuilder(LivekitRoom$RoomConfiguration livekitRoom$RoomConfiguration) {
        return (C14845u3) DEFAULT_INSTANCE.createBuilder(livekitRoom$RoomConfiguration);
    }

    public static LivekitRoom$RoomConfiguration parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(byte[] bArr) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(InputStream inputStream) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRoom$RoomConfiguration parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRoom$RoomConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
