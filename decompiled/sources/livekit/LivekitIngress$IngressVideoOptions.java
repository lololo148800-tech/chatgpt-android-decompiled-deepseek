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
import p793ho.C14850v1;
import p793ho.C14864x1;
import p793ho.EnumC14686X2;
import p793ho.EnumC14857w1;
import p793ho.EnumC14871y1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitIngress$IngressVideoOptions extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitIngress$IngressVideoOptions DEFAULT_INSTANCE;
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
        LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions = new LivekitIngress$IngressVideoOptions();
        DEFAULT_INSTANCE = livekitIngress$IngressVideoOptions;
        AbstractC12133Z.registerDefaultInstance(LivekitIngress$IngressVideoOptions.class, livekitIngress$IngressVideoOptions);
    }

    private LivekitIngress$IngressVideoOptions() {
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

    public static LivekitIngress$IngressVideoOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(LivekitIngress$IngressVideoEncodingOptions livekitIngress$IngressVideoEncodingOptions) {
        livekitIngress$IngressVideoEncodingOptions.getClass();
        if (this.encodingOptionsCase_ != 4 || this.encodingOptions_ == LivekitIngress$IngressVideoEncodingOptions.getDefaultInstance()) {
            this.encodingOptions_ = livekitIngress$IngressVideoEncodingOptions;
        } else {
            C14850v1 c14850v1NewBuilder = LivekitIngress$IngressVideoEncodingOptions.newBuilder((LivekitIngress$IngressVideoEncodingOptions) this.encodingOptions_);
            c14850v1NewBuilder.m13865f(livekitIngress$IngressVideoEncodingOptions);
            this.encodingOptions_ = c14850v1NewBuilder.m13862c();
        }
        this.encodingOptionsCase_ = 4;
    }

    public static C14864x1 newBuilder() {
        return (C14864x1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressVideoOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setOptions(LivekitIngress$IngressVideoEncodingOptions livekitIngress$IngressVideoEncodingOptions) {
        livekitIngress$IngressVideoEncodingOptions.getClass();
        this.encodingOptions_ = livekitIngress$IngressVideoEncodingOptions;
        this.encodingOptionsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(EnumC14857w1 enumC14857w1) {
        this.encodingOptions_ = Integer.valueOf(enumC14857w1.getNumber());
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
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003?\u0000\u0004<\u0000", new Object[]{"encodingOptions_", "encodingOptionsCase_", "name_", "source_", LivekitIngress$IngressVideoEncodingOptions.class});
            case 3:
                return new LivekitIngress$IngressVideoOptions();
            case 4:
                return new C14864x1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitIngress$IngressVideoOptions.class) {
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

    public EnumC14871y1 getEncodingOptionsCase() {
        int i10 = this.encodingOptionsCase_;
        if (i10 == 0) {
            return EnumC14871y1.f46354o0;
        }
        if (i10 == 3) {
            return EnumC14871y1.f46352Y;
        }
        if (i10 != 4) {
            return null;
        }
        return EnumC14871y1.f46353Z;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC12171m getNameBytes() {
        return AbstractC12171m.m14011m(this.name_);
    }

    public LivekitIngress$IngressVideoEncodingOptions getOptions() {
        return this.encodingOptionsCase_ == 4 ? (LivekitIngress$IngressVideoEncodingOptions) this.encodingOptions_ : LivekitIngress$IngressVideoEncodingOptions.getDefaultInstance();
    }

    public EnumC14857w1 getPreset() {
        EnumC14857w1 enumC14857w1;
        if (this.encodingOptionsCase_ != 3) {
            return EnumC14857w1.H264_720P_30FPS_3_LAYERS;
        }
        switch (((Integer) this.encodingOptions_).intValue()) {
            case 0:
                enumC14857w1 = EnumC14857w1.H264_720P_30FPS_3_LAYERS;
                break;
            case 1:
                enumC14857w1 = EnumC14857w1.H264_1080P_30FPS_3_LAYERS;
                break;
            case 2:
                enumC14857w1 = EnumC14857w1.H264_540P_25FPS_2_LAYERS;
                break;
            case 3:
                enumC14857w1 = EnumC14857w1.H264_720P_30FPS_1_LAYER;
                break;
            case 4:
                enumC14857w1 = EnumC14857w1.H264_1080P_30FPS_1_LAYER;
                break;
            case 5:
                enumC14857w1 = EnumC14857w1.H264_720P_30FPS_3_LAYERS_HIGH_MOTION;
                break;
            case 6:
                enumC14857w1 = EnumC14857w1.H264_1080P_30FPS_3_LAYERS_HIGH_MOTION;
                break;
            case 7:
                enumC14857w1 = EnumC14857w1.H264_540P_25FPS_2_LAYERS_HIGH_MOTION;
                break;
            case 8:
                enumC14857w1 = EnumC14857w1.H264_720P_30FPS_1_LAYER_HIGH_MOTION;
                break;
            case 9:
                enumC14857w1 = EnumC14857w1.H264_1080P_30FPS_1_LAYER_HIGH_MOTION;
                break;
            default:
                enumC14857w1 = null;
                break;
        }
        return enumC14857w1 == null ? EnumC14857w1.UNRECOGNIZED : enumC14857w1;
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

    public static C14864x1 newBuilder(LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions) {
        return (C14864x1) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressVideoOptions);
    }

    public static LivekitIngress$IngressVideoOptions parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitIngress$IngressVideoOptions) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
