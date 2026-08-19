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
import p793ho.C14687X3;
import p793ho.InterfaceC14681W3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$RegionSettings extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitRtc$RegionSettings DEFAULT_INSTANCE;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int REGIONS_FIELD_NUMBER = 1;
    private InterfaceC12172m0 regions_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$RegionSettings livekitRtc$RegionSettings = new LivekitRtc$RegionSettings();
        DEFAULT_INSTANCE = livekitRtc$RegionSettings;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$RegionSettings.class, livekitRtc$RegionSettings);
    }

    private LivekitRtc$RegionSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegions(Iterable<? extends LivekitRtc$RegionInfo> iterable) {
        ensureRegionsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.regions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegions(LivekitRtc$RegionInfo livekitRtc$RegionInfo) {
        livekitRtc$RegionInfo.getClass();
        ensureRegionsIsMutable();
        this.regions_.add(livekitRtc$RegionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegions() {
        this.regions_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureRegionsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.regions_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.regions_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$RegionSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14687X3 newBuilder() {
        return (C14687X3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$RegionSettings parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RegionSettings parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegions(int i10) {
        ensureRegionsIsMutable();
        this.regions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegions(int i10, LivekitRtc$RegionInfo livekitRtc$RegionInfo) {
        livekitRtc$RegionInfo.getClass();
        ensureRegionsIsMutable();
        this.regions_.set(i10, livekitRtc$RegionInfo);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"regions_", LivekitRtc$RegionInfo.class});
            case 3:
                return new LivekitRtc$RegionSettings();
            case 4:
                return new C14687X3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$RegionSettings.class) {
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

    public LivekitRtc$RegionInfo getRegions(int i10) {
        return (LivekitRtc$RegionInfo) this.regions_.get(i10);
    }

    public int getRegionsCount() {
        return this.regions_.size();
    }

    public List<LivekitRtc$RegionInfo> getRegionsList() {
        return this.regions_;
    }

    public InterfaceC14681W3 getRegionsOrBuilder(int i10) {
        return (InterfaceC14681W3) this.regions_.get(i10);
    }

    public List<? extends InterfaceC14681W3> getRegionsOrBuilderList() {
        return this.regions_;
    }

    public static C14687X3 newBuilder(LivekitRtc$RegionSettings livekitRtc$RegionSettings) {
        return (C14687X3) DEFAULT_INSTANCE.createBuilder(livekitRtc$RegionSettings);
    }

    public static LivekitRtc$RegionSettings parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$RegionSettings parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$RegionSettings parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegions(int i10, LivekitRtc$RegionInfo livekitRtc$RegionInfo) {
        livekitRtc$RegionInfo.getClass();
        ensureRegionsIsMutable();
        this.regions_.add(i10, livekitRtc$RegionInfo);
    }

    public static LivekitRtc$RegionSettings parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$RegionSettings parseFrom(byte[] bArr) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$RegionSettings parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$RegionSettings parseFrom(InputStream inputStream) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RegionSettings parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$RegionSettings parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$RegionSettings parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$RegionSettings) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
