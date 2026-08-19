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
import p793ho.C14640P3;
import p793ho.C14687X3;
import p793ho.EnumC14634O3;
import p793ho.EnumC14767j2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$LeaveRequest extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int CAN_RECONNECT_FIELD_NUMBER = 1;
    private static final LivekitRtc$LeaveRequest DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int REGIONS_FIELD_NUMBER = 4;
    private int action_;
    private boolean canReconnect_;
    private int reason_;
    private LivekitRtc$RegionSettings regions_;

    static {
        LivekitRtc$LeaveRequest livekitRtc$LeaveRequest = new LivekitRtc$LeaveRequest();
        DEFAULT_INSTANCE = livekitRtc$LeaveRequest;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$LeaveRequest.class, livekitRtc$LeaveRequest);
    }

    private LivekitRtc$LeaveRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanReconnect() {
        this.canReconnect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegions() {
        this.regions_ = null;
    }

    public static LivekitRtc$LeaveRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegions(LivekitRtc$RegionSettings livekitRtc$RegionSettings) {
        livekitRtc$RegionSettings.getClass();
        LivekitRtc$RegionSettings livekitRtc$RegionSettings2 = this.regions_;
        if (livekitRtc$RegionSettings2 == null || livekitRtc$RegionSettings2 == LivekitRtc$RegionSettings.getDefaultInstance()) {
            this.regions_ = livekitRtc$RegionSettings;
            return;
        }
        C14687X3 c14687x3NewBuilder = LivekitRtc$RegionSettings.newBuilder(this.regions_);
        c14687x3NewBuilder.m13865f(livekitRtc$RegionSettings);
        this.regions_ = (LivekitRtc$RegionSettings) c14687x3NewBuilder.m13862c();
    }

    public static C14640P3 newBuilder() {
        return (C14640P3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$LeaveRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$LeaveRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(EnumC14634O3 enumC14634O3) {
        this.action_ = enumC14634O3.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i10) {
        this.action_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanReconnect(boolean z6) {
        this.canReconnect_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(EnumC14767j2 enumC14767j2) {
        this.reason_ = enumC14767j2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i10) {
        this.reason_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegions(LivekitRtc$RegionSettings livekitRtc$RegionSettings) {
        livekitRtc$RegionSettings.getClass();
        this.regions_ = livekitRtc$RegionSettings;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003\f\u0004\t", new Object[]{"canReconnect_", "reason_", "action_", "regions_"});
            case 3:
                return new LivekitRtc$LeaveRequest();
            case 4:
                return new C14640P3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$LeaveRequest.class) {
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

    public EnumC14634O3 getAction() {
        EnumC14634O3 enumC14634O3;
        int i10 = this.action_;
        if (i10 == 0) {
            enumC14634O3 = EnumC14634O3.DISCONNECT;
        } else if (i10 != 1) {
            enumC14634O3 = i10 != 2 ? null : EnumC14634O3.RECONNECT;
        } else {
            enumC14634O3 = EnumC14634O3.RESUME;
        }
        return enumC14634O3 == null ? EnumC14634O3.UNRECOGNIZED : enumC14634O3;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getCanReconnect() {
        return this.canReconnect_;
    }

    public EnumC14767j2 getReason() {
        EnumC14767j2 enumC14767j2M16052a = EnumC14767j2.m16052a(this.reason_);
        return enumC14767j2M16052a == null ? EnumC14767j2.UNRECOGNIZED : enumC14767j2M16052a;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public LivekitRtc$RegionSettings getRegions() {
        LivekitRtc$RegionSettings livekitRtc$RegionSettings = this.regions_;
        return livekitRtc$RegionSettings == null ? LivekitRtc$RegionSettings.getDefaultInstance() : livekitRtc$RegionSettings;
    }

    public boolean hasRegions() {
        return this.regions_ != null;
    }

    public static C14640P3 newBuilder(LivekitRtc$LeaveRequest livekitRtc$LeaveRequest) {
        return (C14640P3) DEFAULT_INSTANCE.createBuilder(livekitRtc$LeaveRequest);
    }

    public static LivekitRtc$LeaveRequest parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$LeaveRequest parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$LeaveRequest parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$LeaveRequest parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$LeaveRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$LeaveRequest parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$LeaveRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$LeaveRequest parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$LeaveRequest parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$LeaveRequest parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$LeaveRequest) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
