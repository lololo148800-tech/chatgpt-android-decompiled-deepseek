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
import p793ho.C14755h4;
import p793ho.EnumC14580F3;
import p793ho.EnumC14762i4;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SimulateScenario extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$SimulateScenario DEFAULT_INSTANCE;
    public static final int DISCONNECT_SIGNAL_ON_RESUME_FIELD_NUMBER = 7;
    public static final int DISCONNECT_SIGNAL_ON_RESUME_NO_MESSAGES_FIELD_NUMBER = 8;
    public static final int LEAVE_REQUEST_FULL_RECONNECT_FIELD_NUMBER = 9;
    public static final int MIGRATION_FIELD_NUMBER = 3;
    public static final int NODE_FAILURE_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int SERVER_LEAVE_FIELD_NUMBER = 4;
    public static final int SPEAKER_UPDATE_FIELD_NUMBER = 1;
    public static final int SUBSCRIBER_BANDWIDTH_FIELD_NUMBER = 6;
    public static final int SWITCH_CANDIDATE_PROTOCOL_FIELD_NUMBER = 5;
    private int scenarioCase_ = 0;
    private Object scenario_;

    static {
        LivekitRtc$SimulateScenario livekitRtc$SimulateScenario = new LivekitRtc$SimulateScenario();
        DEFAULT_INSTANCE = livekitRtc$SimulateScenario;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SimulateScenario.class, livekitRtc$SimulateScenario);
    }

    private LivekitRtc$SimulateScenario() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisconnectSignalOnResume() {
        if (this.scenarioCase_ == 7) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisconnectSignalOnResumeNoMessages() {
        if (this.scenarioCase_ == 8) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeaveRequestFullReconnect() {
        if (this.scenarioCase_ == 9) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMigration() {
        if (this.scenarioCase_ == 3) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeFailure() {
        if (this.scenarioCase_ == 2) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScenario() {
        this.scenarioCase_ = 0;
        this.scenario_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerLeave() {
        if (this.scenarioCase_ == 4) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeakerUpdate() {
        if (this.scenarioCase_ == 1) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriberBandwidth() {
        if (this.scenarioCase_ == 6) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchCandidateProtocol() {
        if (this.scenarioCase_ == 5) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    public static LivekitRtc$SimulateScenario getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14755h4 newBuilder() {
        return (C14755h4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SimulateScenario parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SimulateScenario parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisconnectSignalOnResume(boolean z6) {
        this.scenarioCase_ = 7;
        this.scenario_ = Boolean.valueOf(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisconnectSignalOnResumeNoMessages(boolean z6) {
        this.scenarioCase_ = 8;
        this.scenario_ = Boolean.valueOf(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeaveRequestFullReconnect(boolean z6) {
        this.scenarioCase_ = 9;
        this.scenario_ = Boolean.valueOf(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMigration(boolean z6) {
        this.scenarioCase_ = 3;
        this.scenario_ = Boolean.valueOf(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeFailure(boolean z6) {
        this.scenarioCase_ = 2;
        this.scenario_ = Boolean.valueOf(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerLeave(boolean z6) {
        this.scenarioCase_ = 4;
        this.scenario_ = Boolean.valueOf(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeakerUpdate(int i10) {
        this.scenarioCase_ = 1;
        this.scenario_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriberBandwidth(long j10) {
        this.scenarioCase_ = 6;
        this.scenario_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchCandidateProtocol(EnumC14580F3 enumC14580F3) {
        this.scenario_ = Integer.valueOf(enumC14580F3.getNumber());
        this.scenarioCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchCandidateProtocolValue(int i10) {
        this.scenarioCase_ = 5;
        this.scenario_ = Integer.valueOf(i10);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u00017\u0000\u0002:\u0000\u0003:\u0000\u0004:\u0000\u0005?\u0000\u00065\u0000\u0007:\u0000\b:\u0000\t:\u0000", new Object[]{"scenario_", "scenarioCase_"});
            case 3:
                return new LivekitRtc$SimulateScenario();
            case 4:
                return new C14755h4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SimulateScenario.class) {
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

    public boolean getDisconnectSignalOnResume() {
        if (this.scenarioCase_ == 7) {
            return ((Boolean) this.scenario_).booleanValue();
        }
        return false;
    }

    public boolean getDisconnectSignalOnResumeNoMessages() {
        if (this.scenarioCase_ == 8) {
            return ((Boolean) this.scenario_).booleanValue();
        }
        return false;
    }

    public boolean getLeaveRequestFullReconnect() {
        if (this.scenarioCase_ == 9) {
            return ((Boolean) this.scenario_).booleanValue();
        }
        return false;
    }

    public boolean getMigration() {
        if (this.scenarioCase_ == 3) {
            return ((Boolean) this.scenario_).booleanValue();
        }
        return false;
    }

    public boolean getNodeFailure() {
        if (this.scenarioCase_ == 2) {
            return ((Boolean) this.scenario_).booleanValue();
        }
        return false;
    }

    public EnumC14762i4 getScenarioCase() {
        switch (this.scenarioCase_) {
            case 0:
                return EnumC14762i4.f46178v0;
            case 1:
                return EnumC14762i4.f46169Y;
            case 2:
                return EnumC14762i4.f46170Z;
            case 3:
                return EnumC14762i4.f46171o0;
            case 4:
                return EnumC14762i4.f46172p0;
            case 5:
                return EnumC14762i4.f46173q0;
            case 6:
                return EnumC14762i4.f46174r0;
            case 7:
                return EnumC14762i4.f46175s0;
            case 8:
                return EnumC14762i4.f46176t0;
            case 9:
                return EnumC14762i4.f46177u0;
            default:
                return null;
        }
    }

    public boolean getServerLeave() {
        if (this.scenarioCase_ == 4) {
            return ((Boolean) this.scenario_).booleanValue();
        }
        return false;
    }

    public int getSpeakerUpdate() {
        if (this.scenarioCase_ == 1) {
            return ((Integer) this.scenario_).intValue();
        }
        return 0;
    }

    public long getSubscriberBandwidth() {
        if (this.scenarioCase_ == 6) {
            return ((Long) this.scenario_).longValue();
        }
        return 0L;
    }

    public EnumC14580F3 getSwitchCandidateProtocol() {
        int i10 = this.scenarioCase_;
        EnumC14580F3 enumC14580F3 = EnumC14580F3.UDP;
        if (i10 != 5) {
            return enumC14580F3;
        }
        int iIntValue = ((Integer) this.scenario_).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                enumC14580F3 = iIntValue != 2 ? null : EnumC14580F3.TLS;
            } else {
                enumC14580F3 = EnumC14580F3.TCP;
            }
        }
        return enumC14580F3 == null ? EnumC14580F3.UNRECOGNIZED : enumC14580F3;
    }

    public int getSwitchCandidateProtocolValue() {
        if (this.scenarioCase_ == 5) {
            return ((Integer) this.scenario_).intValue();
        }
        return 0;
    }

    public boolean hasDisconnectSignalOnResume() {
        return this.scenarioCase_ == 7;
    }

    public boolean hasDisconnectSignalOnResumeNoMessages() {
        return this.scenarioCase_ == 8;
    }

    public boolean hasLeaveRequestFullReconnect() {
        return this.scenarioCase_ == 9;
    }

    public boolean hasMigration() {
        return this.scenarioCase_ == 3;
    }

    public boolean hasNodeFailure() {
        return this.scenarioCase_ == 2;
    }

    public boolean hasServerLeave() {
        return this.scenarioCase_ == 4;
    }

    public boolean hasSpeakerUpdate() {
        return this.scenarioCase_ == 1;
    }

    public boolean hasSubscriberBandwidth() {
        return this.scenarioCase_ == 6;
    }

    public boolean hasSwitchCandidateProtocol() {
        return this.scenarioCase_ == 5;
    }

    public static C14755h4 newBuilder(LivekitRtc$SimulateScenario livekitRtc$SimulateScenario) {
        return (C14755h4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SimulateScenario);
    }

    public static LivekitRtc$SimulateScenario parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SimulateScenario parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SimulateScenario parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$SimulateScenario parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SimulateScenario parseFrom(byte[] bArr) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SimulateScenario parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SimulateScenario parseFrom(InputStream inputStream) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SimulateScenario parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SimulateScenario parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SimulateScenario parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SimulateScenario) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
