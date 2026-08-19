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
import p793ho.C14617L4;
import p793ho.EnumC14761i3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$UpdateTrackSettings extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$UpdateTrackSettings DEFAULT_INSTANCE;
    public static final int DISABLED_FIELD_NUMBER = 3;
    public static final int FPS_FIELD_NUMBER = 7;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 8;
    public static final int QUALITY_FIELD_NUMBER = 4;
    public static final int TRACK_SIDS_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 5;
    private boolean disabled_;
    private int fps_;
    private int height_;
    private int priority_;
    private int quality_;
    private InterfaceC12172m0 trackSids_ = AbstractC12133Z.emptyProtobufList();
    private int width_;

    static {
        LivekitRtc$UpdateTrackSettings livekitRtc$UpdateTrackSettings = new LivekitRtc$UpdateTrackSettings();
        DEFAULT_INSTANCE = livekitRtc$UpdateTrackSettings;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$UpdateTrackSettings.class, livekitRtc$UpdateTrackSettings);
    }

    private LivekitRtc$UpdateTrackSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackSids(Iterable<String> iterable) {
        ensureTrackSidsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.trackSids_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSids(String str) {
        str.getClass();
        ensureTrackSidsIsMutable();
        this.trackSids_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSidsBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureTrackSidsIsMutable();
        this.trackSids_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabled() {
        this.disabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFps() {
        this.fps_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuality() {
        this.quality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSids() {
        this.trackSids_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    private void ensureTrackSidsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.trackSids_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.trackSids_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$UpdateTrackSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14617L4 newBuilder() {
        return (C14617L4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$UpdateTrackSettings parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabled(boolean z6) {
        this.disabled_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFps(int i10) {
        this.fps_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(int i10) {
        this.priority_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuality(EnumC14761i3 enumC14761i3) {
        this.quality_ = enumC14761i3.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityValue(int i10) {
        this.quality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSids(int i10, String str) {
        str.getClass();
        ensureTrackSidsIsMutable();
        this.trackSids_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i10) {
        this.width_ = i10;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0001\u0000\u0001Ț\u0003\u0007\u0004\f\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b", new Object[]{"trackSids_", "disabled_", "quality_", "width_", "height_", "fps_", "priority_"});
            case 3:
                return new LivekitRtc$UpdateTrackSettings();
            case 4:
                return new C14617L4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$UpdateTrackSettings.class) {
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

    public boolean getDisabled() {
        return this.disabled_;
    }

    public int getFps() {
        return this.fps_;
    }

    public int getHeight() {
        return this.height_;
    }

    public int getPriority() {
        return this.priority_;
    }

    public EnumC14761i3 getQuality() {
        EnumC14761i3 enumC14761i3M16050a = EnumC14761i3.m16050a(this.quality_);
        return enumC14761i3M16050a == null ? EnumC14761i3.UNRECOGNIZED : enumC14761i3M16050a;
    }

    public int getQualityValue() {
        return this.quality_;
    }

    public String getTrackSids(int i10) {
        return (String) this.trackSids_.get(i10);
    }

    public AbstractC12171m getTrackSidsBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.trackSids_.get(i10));
    }

    public int getTrackSidsCount() {
        return this.trackSids_.size();
    }

    public List<String> getTrackSidsList() {
        return this.trackSids_;
    }

    public int getWidth() {
        return this.width_;
    }

    public static C14617L4 newBuilder(LivekitRtc$UpdateTrackSettings livekitRtc$UpdateTrackSettings) {
        return (C14617L4) DEFAULT_INSTANCE.createBuilder(livekitRtc$UpdateTrackSettings);
    }

    public static LivekitRtc$UpdateTrackSettings parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(byte[] bArr) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
