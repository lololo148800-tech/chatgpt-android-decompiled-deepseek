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
import p793ho.C14697Z1;
import p793ho.C14740f3;
import p793ho.C14760i2;
import p793ho.EnumC14691Y1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitModels$ClientConfiguration extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitModels$ClientConfiguration DEFAULT_INSTANCE;
    public static final int DISABLED_CODECS_FIELD_NUMBER = 4;
    public static final int FORCE_RELAY_FIELD_NUMBER = 5;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int RESUME_CONNECTION_FIELD_NUMBER = 3;
    public static final int SCREEN_FIELD_NUMBER = 2;
    public static final int VIDEO_FIELD_NUMBER = 1;
    private LivekitModels$DisabledCodecs disabledCodecs_;
    private int forceRelay_;
    private int resumeConnection_;
    private LivekitModels$VideoConfiguration screen_;
    private LivekitModels$VideoConfiguration video_;

    static {
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration = new LivekitModels$ClientConfiguration();
        DEFAULT_INSTANCE = livekitModels$ClientConfiguration;
        AbstractC12133Z.registerDefaultInstance(LivekitModels$ClientConfiguration.class, livekitModels$ClientConfiguration);
    }

    private LivekitModels$ClientConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabledCodecs() {
        this.disabledCodecs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceRelay() {
        this.forceRelay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeConnection() {
        this.resumeConnection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreen() {
        this.screen_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideo() {
        this.video_ = null;
    }

    public static LivekitModels$ClientConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisabledCodecs(LivekitModels$DisabledCodecs livekitModels$DisabledCodecs) {
        livekitModels$DisabledCodecs.getClass();
        LivekitModels$DisabledCodecs livekitModels$DisabledCodecs2 = this.disabledCodecs_;
        if (livekitModels$DisabledCodecs2 == null || livekitModels$DisabledCodecs2 == LivekitModels$DisabledCodecs.getDefaultInstance()) {
            this.disabledCodecs_ = livekitModels$DisabledCodecs;
            return;
        }
        C14760i2 c14760i2NewBuilder = LivekitModels$DisabledCodecs.newBuilder(this.disabledCodecs_);
        c14760i2NewBuilder.m13865f(livekitModels$DisabledCodecs);
        this.disabledCodecs_ = (LivekitModels$DisabledCodecs) c14760i2NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScreen(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        livekitModels$VideoConfiguration.getClass();
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration2 = this.screen_;
        if (livekitModels$VideoConfiguration2 == null || livekitModels$VideoConfiguration2 == LivekitModels$VideoConfiguration.getDefaultInstance()) {
            this.screen_ = livekitModels$VideoConfiguration;
            return;
        }
        C14740f3 c14740f3NewBuilder = LivekitModels$VideoConfiguration.newBuilder(this.screen_);
        c14740f3NewBuilder.m13865f(livekitModels$VideoConfiguration);
        this.screen_ = (LivekitModels$VideoConfiguration) c14740f3NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideo(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        livekitModels$VideoConfiguration.getClass();
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration2 = this.video_;
        if (livekitModels$VideoConfiguration2 == null || livekitModels$VideoConfiguration2 == LivekitModels$VideoConfiguration.getDefaultInstance()) {
            this.video_ = livekitModels$VideoConfiguration;
            return;
        }
        C14740f3 c14740f3NewBuilder = LivekitModels$VideoConfiguration.newBuilder(this.video_);
        c14740f3NewBuilder.m13865f(livekitModels$VideoConfiguration);
        this.video_ = (LivekitModels$VideoConfiguration) c14740f3NewBuilder.m13862c();
    }

    public static C14697Z1 newBuilder() {
        return (C14697Z1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ClientConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ClientConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledCodecs(LivekitModels$DisabledCodecs livekitModels$DisabledCodecs) {
        livekitModels$DisabledCodecs.getClass();
        this.disabledCodecs_ = livekitModels$DisabledCodecs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceRelay(EnumC14691Y1 enumC14691Y1) {
        this.forceRelay_ = enumC14691Y1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceRelayValue(int i10) {
        this.forceRelay_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeConnection(EnumC14691Y1 enumC14691Y1) {
        this.resumeConnection_ = enumC14691Y1.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeConnectionValue(int i10) {
        this.resumeConnection_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreen(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        livekitModels$VideoConfiguration.getClass();
        this.screen_ = livekitModels$VideoConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideo(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        livekitModels$VideoConfiguration.getClass();
        this.video_ = livekitModels$VideoConfiguration;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f\u0004\t\u0005\f", new Object[]{"video_", "screen_", "resumeConnection_", "disabledCodecs_", "forceRelay_"});
            case 3:
                return new LivekitModels$ClientConfiguration();
            case 4:
                return new C14697Z1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitModels$ClientConfiguration.class) {
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

    public LivekitModels$DisabledCodecs getDisabledCodecs() {
        LivekitModels$DisabledCodecs livekitModels$DisabledCodecs = this.disabledCodecs_;
        return livekitModels$DisabledCodecs == null ? LivekitModels$DisabledCodecs.getDefaultInstance() : livekitModels$DisabledCodecs;
    }

    public EnumC14691Y1 getForceRelay() {
        EnumC14691Y1 enumC14691Y1M16046a = EnumC14691Y1.m16046a(this.forceRelay_);
        return enumC14691Y1M16046a == null ? EnumC14691Y1.UNRECOGNIZED : enumC14691Y1M16046a;
    }

    public int getForceRelayValue() {
        return this.forceRelay_;
    }

    public EnumC14691Y1 getResumeConnection() {
        EnumC14691Y1 enumC14691Y1M16046a = EnumC14691Y1.m16046a(this.resumeConnection_);
        return enumC14691Y1M16046a == null ? EnumC14691Y1.UNRECOGNIZED : enumC14691Y1M16046a;
    }

    public int getResumeConnectionValue() {
        return this.resumeConnection_;
    }

    public LivekitModels$VideoConfiguration getScreen() {
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration = this.screen_;
        return livekitModels$VideoConfiguration == null ? LivekitModels$VideoConfiguration.getDefaultInstance() : livekitModels$VideoConfiguration;
    }

    public LivekitModels$VideoConfiguration getVideo() {
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration = this.video_;
        return livekitModels$VideoConfiguration == null ? LivekitModels$VideoConfiguration.getDefaultInstance() : livekitModels$VideoConfiguration;
    }

    public boolean hasDisabledCodecs() {
        return this.disabledCodecs_ != null;
    }

    public boolean hasScreen() {
        return this.screen_ != null;
    }

    public boolean hasVideo() {
        return this.video_ != null;
    }

    public static C14697Z1 newBuilder(LivekitModels$ClientConfiguration livekitModels$ClientConfiguration) {
        return (C14697Z1) DEFAULT_INSTANCE.createBuilder(livekitModels$ClientConfiguration);
    }

    public static LivekitModels$ClientConfiguration parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ClientConfiguration parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitModels$ClientConfiguration parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitModels$ClientConfiguration parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitModels$ClientConfiguration parseFrom(byte[] bArr) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ClientConfiguration parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitModels$ClientConfiguration parseFrom(InputStream inputStream) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ClientConfiguration parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitModels$ClientConfiguration parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitModels$ClientConfiguration parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitModels$ClientConfiguration) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
