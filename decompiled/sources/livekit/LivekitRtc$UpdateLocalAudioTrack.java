package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12138b;
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
import p525Vb.C8258a;
import p793ho.C14587G4;
import p793ho.EnumC14679W1;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$UpdateLocalAudioTrack extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$UpdateLocalAudioTrack DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int TRACK_SID_FIELD_NUMBER = 1;
    private static final InterfaceC12163j0 features_converter_ = new C8258a();
    private int featuresMemoizedSerializedSize;
    private String trackSid_ = "";
    private InterfaceC12160i0 features_ = AbstractC12133Z.emptyIntList();

    static {
        LivekitRtc$UpdateLocalAudioTrack livekitRtc$UpdateLocalAudioTrack = new LivekitRtc$UpdateLocalAudioTrack();
        DEFAULT_INSTANCE = livekitRtc$UpdateLocalAudioTrack;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$UpdateLocalAudioTrack.class, livekitRtc$UpdateLocalAudioTrack);
    }

    private LivekitRtc$UpdateLocalAudioTrack() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeatures(Iterable<? extends EnumC14679W1> iterable) {
        ensureFeaturesIsMutable();
        for (EnumC14679W1 enumC14679W1 : iterable) {
            ((C12142c0) this.features_).m13938j(enumC14679W1.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeaturesValue(Iterable<Integer> iterable) {
        ensureFeaturesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            ((C12142c0) this.features_).m13938j(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatures(EnumC14679W1 enumC14679W1) {
        enumC14679W1.getClass();
        ensureFeaturesIsMutable();
        ((C12142c0) this.features_).m13938j(enumC14679W1.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeaturesValue(int i10) {
        ensureFeaturesIsMutable();
        ((C12142c0) this.features_).m13938j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = AbstractC12133Z.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureFeaturesIsMutable() {
        InterfaceC12160i0 interfaceC12160i0 = this.features_;
        if (((AbstractC12141c) interfaceC12160i0).f37021Y) {
            return;
        }
        this.features_ = AbstractC12133Z.mutableCopy(interfaceC12160i0);
    }

    public static LivekitRtc$UpdateLocalAudioTrack getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14587G4 newBuilder() {
        return (C14587G4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(int i10, EnumC14679W1 enumC14679W1) {
        enumC14679W1.getClass();
        ensureFeaturesIsMutable();
        ((C12142c0) this.features_).m13941q(i10, enumC14679W1.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeaturesValue(int i10, int i11) {
        ensureFeaturesIsMutable();
        ((C12142c0) this.features_).m13941q(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(String str) {
        str.getClass();
        this.trackSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSidBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        this.trackSid_ = abstractC12171m.m14012w();
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002,", new Object[]{"trackSid_", "features_"});
            case 3:
                return new LivekitRtc$UpdateLocalAudioTrack();
            case 4:
                return new C14587G4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$UpdateLocalAudioTrack.class) {
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

    public EnumC14679W1 getFeatures(int i10) {
        EnumC14679W1 enumC14679W1M16044a = EnumC14679W1.m16044a(((C12142c0) this.features_).m13940p(i10));
        return enumC14679W1M16044a == null ? EnumC14679W1.UNRECOGNIZED : enumC14679W1M16044a;
    }

    public int getFeaturesCount() {
        return this.features_.size();
    }

    public List<EnumC14679W1> getFeaturesList() {
        return new C12166k0(this.features_, features_converter_);
    }

    public int getFeaturesValue(int i10) {
        return ((C12142c0) this.features_).m13940p(i10);
    }

    public List<Integer> getFeaturesValueList() {
        return this.features_;
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC12171m getTrackSidBytes() {
        return AbstractC12171m.m14011m(this.trackSid_);
    }

    public static C14587G4 newBuilder(LivekitRtc$UpdateLocalAudioTrack livekitRtc$UpdateLocalAudioTrack) {
        return (C14587G4) DEFAULT_INSTANCE.createBuilder(livekitRtc$UpdateLocalAudioTrack);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(byte[] bArr) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$UpdateLocalAudioTrack parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$UpdateLocalAudioTrack) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
