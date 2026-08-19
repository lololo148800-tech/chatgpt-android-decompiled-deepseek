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
import p793ho.C14584G1;
import p793ho.C14596I1;
import p793ho.EnumC14590H1;
import p793ho.EnumC14602J1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitInternal$Node extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitInternal$Node DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IP_FIELD_NUMBER = 2;
    public static final int NUM_CPUS_FIELD_NUMBER = 3;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 7;
    public static final int STATE_FIELD_NUMBER = 6;
    public static final int STATS_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 5;
    private int numCpus_;
    private int state_;
    private LivekitInternal$NodeStats stats_;
    private int type_;
    private String id_ = "";
    private String ip_ = "";
    private String region_ = "";

    static {
        LivekitInternal$Node livekitInternal$Node = new LivekitInternal$Node();
        DEFAULT_INSTANCE = livekitInternal$Node;
        AbstractC12133Z.registerDefaultInstance(LivekitInternal$Node.class, livekitInternal$Node);
    }

    private LivekitInternal$Node() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIp() {
        this.ip_ = getDefaultInstance().getIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumCpus() {
        this.numCpus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStats() {
        this.stats_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static LivekitInternal$Node getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStats(LivekitInternal$NodeStats livekitInternal$NodeStats) {
        livekitInternal$NodeStats.getClass();
        LivekitInternal$NodeStats livekitInternal$NodeStats2 = this.stats_;
        if (livekitInternal$NodeStats2 == null || livekitInternal$NodeStats2 == LivekitInternal$NodeStats.getDefaultInstance()) {
            this.stats_ = livekitInternal$NodeStats;
            return;
        }
        C14596I1 c14596i1NewBuilder = LivekitInternal$NodeStats.newBuilder(this.stats_);
        c14596i1NewBuilder.m13865f(livekitInternal$NodeStats);
        this.stats_ = (LivekitInternal$NodeStats) c14596i1NewBuilder.m13862c();
    }

    public static C14584G1 newBuilder() {
        return (C14584G1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$Node parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$Node) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$Node parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setIp(String str) {
        str.getClass();
        this.ip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.ip_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumCpus(int i10) {
        this.numCpus_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegion(String str) {
        str.getClass();
        this.region_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.region_ = abstractC12171m.m14012w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(EnumC14590H1 enumC14590H1) {
        this.state_ = enumC14590H1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i10) {
        this.state_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStats(LivekitInternal$NodeStats livekitInternal$NodeStats) {
        livekitInternal$NodeStats.getClass();
        this.stats_ = livekitInternal$NodeStats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC14602J1 enumC14602J1) {
        this.type_ = enumC14602J1.getNumber();
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\t\u0005\f\u0006\f\u0007Ȉ", new Object[]{"id_", "ip_", "numCpus_", "stats_", "type_", "state_", "region_"});
            case 3:
                return new LivekitInternal$Node();
            case 4:
                return new C14584G1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitInternal$Node.class) {
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

    public String getIp() {
        return this.ip_;
    }

    public AbstractC12171m getIpBytes() {
        return AbstractC12171m.m14011m(this.ip_);
    }

    public int getNumCpus() {
        return this.numCpus_;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC12171m getRegionBytes() {
        return AbstractC12171m.m14011m(this.region_);
    }

    public EnumC14590H1 getState() {
        EnumC14590H1 enumC14590H1;
        int i10 = this.state_;
        if (i10 == 0) {
            enumC14590H1 = EnumC14590H1.STARTING_UP;
        } else if (i10 != 1) {
            enumC14590H1 = i10 != 2 ? null : EnumC14590H1.SHUTTING_DOWN;
        } else {
            enumC14590H1 = EnumC14590H1.SERVING;
        }
        return enumC14590H1 == null ? EnumC14590H1.UNRECOGNIZED : enumC14590H1;
    }

    public int getStateValue() {
        return this.state_;
    }

    public LivekitInternal$NodeStats getStats() {
        LivekitInternal$NodeStats livekitInternal$NodeStats = this.stats_;
        return livekitInternal$NodeStats == null ? LivekitInternal$NodeStats.getDefaultInstance() : livekitInternal$NodeStats;
    }

    public EnumC14602J1 getType() {
        EnumC14602J1 enumC14602J1;
        int i10 = this.type_;
        if (i10 == 0) {
            enumC14602J1 = EnumC14602J1.SERVER;
        } else if (i10 == 1) {
            enumC14602J1 = EnumC14602J1.CONTROLLER;
        } else if (i10 == 2) {
            enumC14602J1 = EnumC14602J1.MEDIA;
        } else if (i10 == 4) {
            enumC14602J1 = EnumC14602J1.TURN;
        } else if (i10 != 5) {
            enumC14602J1 = i10 != 6 ? null : EnumC14602J1.DIRECTOR;
        } else {
            enumC14602J1 = EnumC14602J1.SWEEPER;
        }
        return enumC14602J1 == null ? EnumC14602J1.UNRECOGNIZED : enumC14602J1;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasStats() {
        return this.stats_ != null;
    }

    public static C14584G1 newBuilder(LivekitInternal$Node livekitInternal$Node) {
        return (C14584G1) DEFAULT_INSTANCE.createBuilder(livekitInternal$Node);
    }

    public static LivekitInternal$Node parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$Node) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$Node parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitInternal$Node parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitInternal$Node parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitInternal$Node parseFrom(byte[] bArr) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$Node parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitInternal$Node parseFrom(InputStream inputStream) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$Node parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitInternal$Node parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitInternal$Node parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitInternal$Node) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
