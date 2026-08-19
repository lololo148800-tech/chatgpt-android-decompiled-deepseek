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
import p793ho.C14787m1;
import p793ho.C14801o1;
import p793ho.EnumC14686X2;
import p793ho.EnumC14794n1;
import p793ho.EnumC14808p1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$IngressAudioOptions extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitIngress$IngressAudioOptions DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 3;
    public static final int SOURCE_FIELD_NUMBER = 2;
    private Object encodingOptions_;
    private int source_;
    private int encodingOptionsCase_ = 0;
    private String name_ = "";

    static {
        LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions = new LivekitIngress$IngressAudioOptions();
        DEFAULT_INSTANCE = livekitIngress$IngressAudioOptions;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$IngressAudioOptions.class, livekitIngress$IngressAudioOptions);
    }

    private LivekitIngress$IngressAudioOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncodingOptions() {
        this.encodingOptionsCase_ = 0;
        this.encodingOptions_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        if (this.encodingOptionsCase_ == 4) {
            this.encodingOptionsCase_ = 0;
            this.encodingOptions_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreset() {
        if (this.encodingOptionsCase_ == 3) {
            this.encodingOptionsCase_ = 0;
            this.encodingOptions_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static LivekitIngress$IngressAudioOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(LivekitIngress$IngressAudioEncodingOptions livekitIngress$IngressAudioEncodingOptions) {
        livekitIngress$IngressAudioEncodingOptions.getClass();
        if (this.encodingOptionsCase_ != 4 || this.encodingOptions_ == LivekitIngress$IngressAudioEncodingOptions.getDefaultInstance()) {
            this.encodingOptions_ = livekitIngress$IngressAudioEncodingOptions;
        } else {
            C14787m1 c14787m1NewBuilder = LivekitIngress$IngressAudioEncodingOptions.newBuilder((LivekitIngress$IngressAudioEncodingOptions) this.encodingOptions_);
            c14787m1NewBuilder.m13865f(livekitIngress$IngressAudioEncodingOptions);
            this.encodingOptions_ = c14787m1NewBuilder.m13862c();
        }
        this.encodingOptionsCase_ = 4;
    }

    public static C14801o1 newBuilder() {
        return (C14801o1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressAudioOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setOptions(LivekitIngress$IngressAudioEncodingOptions livekitIngress$IngressAudioEncodingOptions) {
        livekitIngress$IngressAudioEncodingOptions.getClass();
        this.encodingOptions_ = livekitIngress$IngressAudioEncodingOptions;
        this.encodingOptionsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(EnumC14794n1 enumC14794n1) {
        this.encodingOptions_ = Integer.valueOf(enumC14794n1.getNumber());
        this.encodingOptionsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetValue(int i10) {
        this.encodingOptionsCase_ = 3;
        this.encodingOptions_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(EnumC14686X2 enumC14686X2) {
        this.source_ = enumC14686X2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i10) {
        this.source_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003?\u0000\u0004<\u0000", new Object[]{"encodingOptions_", "encodingOptionsCase_", "name_", "source_", LivekitIngress$IngressAudioEncodingOptions.class});
            case 3:
                return new LivekitIngress$IngressAudioOptions();
            case 4:
                return new C14801o1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$IngressAudioOptions.class) {
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

    public EnumC14808p1 getEncodingOptionsCase() {
        int i10 = this.encodingOptionsCase_;
        if (i10 == 0) {
            return EnumC14808p1.f46268o0;
        }
        if (i10 == 3) {
            return EnumC14808p1.f46266Y;
        }
        if (i10 != 4) {
            return null;
        }
        return EnumC14808p1.f46267Z;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public LivekitIngress$IngressAudioEncodingOptions getOptions() {
        return this.encodingOptionsCase_ == 4 ? (LivekitIngress$IngressAudioEncodingOptions) this.encodingOptions_ : LivekitIngress$IngressAudioEncodingOptions.getDefaultInstance();
    }

    public EnumC14794n1 getPreset() {
        int i10 = this.encodingOptionsCase_;
        EnumC14794n1 enumC14794n1 = EnumC14794n1.OPUS_STEREO_96KBPS;
        if (i10 != 3) {
            return enumC14794n1;
        }
        int iIntValue = ((Integer) this.encodingOptions_).intValue();
        if (iIntValue != 0) {
            enumC14794n1 = iIntValue != 1 ? null : EnumC14794n1.OPUS_MONO_64KBS;
        }
        return enumC14794n1 == null ? EnumC14794n1.UNRECOGNIZED : enumC14794n1;
    }

    public int getPresetValue() {
        if (this.encodingOptionsCase_ == 3) {
            return ((Integer) this.encodingOptions_).intValue();
        }
        return 0;
    }

    public EnumC14686X2 getSource() {
        EnumC14686X2 enumC14686X2M16045a = EnumC14686X2.m16045a(this.source_);
        return enumC14686X2M16045a == null ? EnumC14686X2.UNRECOGNIZED : enumC14686X2M16045a;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public boolean hasOptions() {
        return this.encodingOptionsCase_ == 4;
    }

    public boolean hasPreset() {
        return this.encodingOptionsCase_ == 3;
    }

    public static C14801o1 newBuilder(LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions) {
        return (C14801o1) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressAudioOptions);
    }

    public static LivekitIngress$IngressAudioOptions parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$IngressAudioOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
