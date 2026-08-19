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
import p793ho.C14853v4;
import p793ho.InterfaceC14546A4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SubscriptionPermission extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ALL_PARTICIPANTS_FIELD_NUMBER = 1;
    private static final LivekitRtc$SubscriptionPermission DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TRACK_PERMISSIONS_FIELD_NUMBER = 2;
    private boolean allParticipants_;
    private InterfaceC12172m0 trackPermissions_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$SubscriptionPermission livekitRtc$SubscriptionPermission = new LivekitRtc$SubscriptionPermission();
        DEFAULT_INSTANCE = livekitRtc$SubscriptionPermission;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SubscriptionPermission.class, livekitRtc$SubscriptionPermission);
    }

    private LivekitRtc$SubscriptionPermission() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackPermissions(Iterable<? extends LivekitRtc$TrackPermission> iterable) {
        ensureTrackPermissionsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.trackPermissions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackPermissions(LivekitRtc$TrackPermission livekitRtc$TrackPermission) {
        livekitRtc$TrackPermission.getClass();
        ensureTrackPermissionsIsMutable();
        this.trackPermissions_.add(livekitRtc$TrackPermission);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllParticipants() {
        this.allParticipants_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackPermissions() {
        this.trackPermissions_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureTrackPermissionsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.trackPermissions_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.trackPermissions_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$SubscriptionPermission getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14853v4 newBuilder() {
        return (C14853v4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscriptionPermission parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrackPermissions(int i10) {
        ensureTrackPermissionsIsMutable();
        this.trackPermissions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllParticipants(boolean z6) {
        this.allParticipants_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackPermissions(int i10, LivekitRtc$TrackPermission livekitRtc$TrackPermission) {
        livekitRtc$TrackPermission.getClass();
        ensureTrackPermissionsIsMutable();
        this.trackPermissions_.set(i10, livekitRtc$TrackPermission);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002\u001b", new Object[]{"allParticipants_", "trackPermissions_", LivekitRtc$TrackPermission.class});
            case 3:
                return new LivekitRtc$SubscriptionPermission();
            case 4:
                return new C14853v4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SubscriptionPermission.class) {
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

    public boolean getAllParticipants() {
        return this.allParticipants_;
    }

    public LivekitRtc$TrackPermission getTrackPermissions(int i10) {
        return (LivekitRtc$TrackPermission) this.trackPermissions_.get(i10);
    }

    public int getTrackPermissionsCount() {
        return this.trackPermissions_.size();
    }

    public List<LivekitRtc$TrackPermission> getTrackPermissionsList() {
        return this.trackPermissions_;
    }

    public InterfaceC14546A4 getTrackPermissionsOrBuilder(int i10) {
        return (InterfaceC14546A4) this.trackPermissions_.get(i10);
    }

    public List<? extends InterfaceC14546A4> getTrackPermissionsOrBuilderList() {
        return this.trackPermissions_;
    }

    public static C14853v4 newBuilder(LivekitRtc$SubscriptionPermission livekitRtc$SubscriptionPermission) {
        return (C14853v4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscriptionPermission);
    }

    public static LivekitRtc$SubscriptionPermission parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackPermissions(int i10, LivekitRtc$TrackPermission livekitRtc$TrackPermission) {
        livekitRtc$TrackPermission.getClass();
        ensureTrackPermissionsIsMutable();
        this.trackPermissions_.add(i10, livekitRtc$TrackPermission);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SubscriptionPermission parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SubscriptionPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
