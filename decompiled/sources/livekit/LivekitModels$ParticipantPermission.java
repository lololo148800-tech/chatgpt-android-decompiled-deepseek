package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12141c;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.C12142c0;
import com.google.protobuf.C12166k0;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import com.google.protobuf.InterfaceC12160i0;
import com.google.protobuf.InterfaceC12163j0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p451Sb.C7102a;
import p793ho.C14830s2;
import p793ho.EnumC14686X2;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$ParticipantPermission extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int AGENT_FIELD_NUMBER = 11;
    public static final int CAN_PUBLISH_DATA_FIELD_NUMBER = 3;
    public static final int CAN_PUBLISH_FIELD_NUMBER = 2;
    public static final int CAN_PUBLISH_SOURCES_FIELD_NUMBER = 9;
    public static final int CAN_SUBSCRIBE_FIELD_NUMBER = 1;
    public static final int CAN_SUBSCRIBE_METRICS_FIELD_NUMBER = 12;
    public static final int CAN_UPDATE_METADATA_FIELD_NUMBER = 10;
    private static final LivekitModels$ParticipantPermission DEFAULT_INSTANCE;
    public static final int HIDDEN_FIELD_NUMBER = 7;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int RECORDER_FIELD_NUMBER = 8;
    private static final InterfaceC12163j0 canPublishSources_converter_ = new C7102a(28);
    private boolean agent_;
    private boolean canPublishData_;
    private int canPublishSourcesMemoizedSerializedSize;
    private InterfaceC12160i0 canPublishSources_ = AbstractC12133Z.emptyIntList();
    private boolean canPublish_;
    private boolean canSubscribeMetrics_;
    private boolean canSubscribe_;
    private boolean canUpdateMetadata_;
    private boolean hidden_;
    private boolean recorder_;

    static {
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission = new LivekitModels$ParticipantPermission();
        DEFAULT_INSTANCE = livekitModels$ParticipantPermission;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$ParticipantPermission.class, livekitModels$ParticipantPermission);
    }

    private LivekitModels$ParticipantPermission() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCanPublishSources(Iterable<? extends EnumC14686X2> iterable) {
        ensureCanPublishSourcesIsMutable();
        for (EnumC14686X2 enumC14686X2 : iterable) {
            ((C12142c0) this.canPublishSources_).m13938j(enumC14686X2.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCanPublishSourcesValue(Iterable<Integer> iterable) {
        ensureCanPublishSourcesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            ((C12142c0) this.canPublishSources_).m13938j(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCanPublishSources(EnumC14686X2 enumC14686X2) {
        enumC14686X2.getClass();
        ensureCanPublishSourcesIsMutable();
        ((C12142c0) this.canPublishSources_).m13938j(enumC14686X2.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCanPublishSourcesValue(int i10) {
        ensureCanPublishSourcesIsMutable();
        ((C12142c0) this.canPublishSources_).m13938j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgent() {
        this.agent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPublish() {
        this.canPublish_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPublishData() {
        this.canPublishData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPublishSources() {
        this.canPublishSources_ = AbstractC12133Z.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanSubscribe() {
        this.canSubscribe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanSubscribeMetrics() {
        this.canSubscribeMetrics_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanUpdateMetadata() {
        this.canUpdateMetadata_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidden() {
        this.hidden_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecorder() {
        this.recorder_ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureCanPublishSourcesIsMutable() {
        InterfaceC12160i0 interfaceC12160i0 = this.canPublishSources_;
        if (((AbstractC12141c) interfaceC12160i0).f37021Y) {
            return;
        }
        this.canPublishSources_ = AbstractC12133Z.mutableCopy(interfaceC12160i0);
    }

    public static LivekitModels$ParticipantPermission getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14830s2 newBuilder() {
        return (C14830s2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ParticipantPermission parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantPermission parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgent(boolean z6) {
        this.agent_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPublish(boolean z6) {
        this.canPublish_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPublishData(boolean z6) {
        this.canPublishData_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPublishSources(int i10, EnumC14686X2 enumC14686X2) {
        enumC14686X2.getClass();
        ensureCanPublishSourcesIsMutable();
        ((C12142c0) this.canPublishSources_).m13941q(i10, enumC14686X2.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPublishSourcesValue(int i10, int i11) {
        ensureCanPublishSourcesIsMutable();
        ((C12142c0) this.canPublishSources_).m13941q(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanSubscribe(boolean z6) {
        this.canSubscribe_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanSubscribeMetrics(boolean z6) {
        this.canSubscribeMetrics_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanUpdateMetadata(boolean z6) {
        this.canUpdateMetadata_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidden(boolean z6) {
        this.hidden_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecorder(boolean z6) {
        this.recorder_ = z6;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\f\t\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0007\u0007\b\u0007\t,\n\u0007\u000b\u0007\f\u0007", new Object[]{"canSubscribe_", "canPublish_", "canPublishData_", "hidden_", "recorder_", "canPublishSources_", "canUpdateMetadata_", "agent_", "canSubscribeMetrics_"});
            case 3:
                return new LivekitModels$ParticipantPermission();
            case 4:
                return new C14830s2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$ParticipantPermission.class) {
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

    @Deprecated
    public boolean getAgent() {
        return this.agent_;
    }

    public boolean getCanPublish() {
        return this.canPublish_;
    }

    public boolean getCanPublishData() {
        return this.canPublishData_;
    }

    public EnumC14686X2 getCanPublishSources(int i10) {
        EnumC14686X2 enumC14686X2M16045a = EnumC14686X2.m16045a(((C12142c0) this.canPublishSources_).m13940p(i10));
        return enumC14686X2M16045a == null ? EnumC14686X2.UNRECOGNIZED : enumC14686X2M16045a;
    }

    public int getCanPublishSourcesCount() {
        return this.canPublishSources_.size();
    }

    public List<EnumC14686X2> getCanPublishSourcesList() {
        return new C12166k0(this.canPublishSources_, canPublishSources_converter_);
    }

    public int getCanPublishSourcesValue(int i10) {
        return ((C12142c0) this.canPublishSources_).m13940p(i10);
    }

    public List<Integer> getCanPublishSourcesValueList() {
        return this.canPublishSources_;
    }

    public boolean getCanSubscribe() {
        return this.canSubscribe_;
    }

    public boolean getCanSubscribeMetrics() {
        return this.canSubscribeMetrics_;
    }

    public boolean getCanUpdateMetadata() {
        return this.canUpdateMetadata_;
    }

    public boolean getHidden() {
        return this.hidden_;
    }

    @Deprecated
    public boolean getRecorder() {
        return this.recorder_;
    }

    public static C14830s2 newBuilder(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        return (C14830s2) DEFAULT_INSTANCE.createBuilder(livekitModels$ParticipantPermission);
    }

    public static LivekitModels$ParticipantPermission parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ParticipantPermission parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$ParticipantPermission parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$ParticipantPermission parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$ParticipantPermission parseFrom(byte[] bArr) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ParticipantPermission parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$ParticipantPermission parseFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantPermission parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ParticipantPermission parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$ParticipantPermission parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$ParticipantPermission) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
