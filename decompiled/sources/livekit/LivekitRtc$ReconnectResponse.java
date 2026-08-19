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
import p793ho.C14669U3;
import p793ho.C14697Z1;
import p793ho.InterfaceC14622M3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$ReconnectResponse extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int CLIENT_CONFIGURATION_FIELD_NUMBER = 2;
    private static final LivekitRtc$ReconnectResponse DEFAULT_INSTANCE;
    public static final int ICE_SERVERS_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private LivekitModels$ClientConfiguration clientConfiguration_;
    private InterfaceC12172m0 iceServers_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$ReconnectResponse livekitRtc$ReconnectResponse = new LivekitRtc$ReconnectResponse();
        DEFAULT_INSTANCE = livekitRtc$ReconnectResponse;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$ReconnectResponse.class, livekitRtc$ReconnectResponse);
    }

    private LivekitRtc$ReconnectResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIceServers(Iterable<? extends LivekitRtc$ICEServer> iterable) {
        ensureIceServersIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.iceServers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIceServers(LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.add(livekitRtc$ICEServer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientConfiguration() {
        this.clientConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIceServers() {
        this.iceServers_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureIceServersIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.iceServers_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.iceServers_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$ReconnectResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientConfiguration(LivekitModels$ClientConfiguration livekitModels$ClientConfiguration) {
        livekitModels$ClientConfiguration.getClass();
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration2 = this.clientConfiguration_;
        if (livekitModels$ClientConfiguration2 == null || livekitModels$ClientConfiguration2 == LivekitModels$ClientConfiguration.getDefaultInstance()) {
            this.clientConfiguration_ = livekitModels$ClientConfiguration;
            return;
        }
        C14697Z1 c14697z1NewBuilder = LivekitModels$ClientConfiguration.newBuilder(this.clientConfiguration_);
        c14697z1NewBuilder.m13865f(livekitModels$ClientConfiguration);
        this.clientConfiguration_ = (LivekitModels$ClientConfiguration) c14697z1NewBuilder.m13862c();
    }

    public static C14669U3 newBuilder() {
        return (C14669U3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$ReconnectResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIceServers(int i10) {
        ensureIceServersIsMutable();
        this.iceServers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientConfiguration(LivekitModels$ClientConfiguration livekitModels$ClientConfiguration) {
        livekitModels$ClientConfiguration.getClass();
        this.clientConfiguration_ = livekitModels$ClientConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIceServers(int i10, LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.set(i10, livekitRtc$ICEServer);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"iceServers_", LivekitRtc$ICEServer.class, "clientConfiguration_"});
            case 3:
                return new LivekitRtc$ReconnectResponse();
            case 4:
                return new C14669U3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$ReconnectResponse.class) {
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

    public LivekitModels$ClientConfiguration getClientConfiguration() {
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration = this.clientConfiguration_;
        return livekitModels$ClientConfiguration == null ? LivekitModels$ClientConfiguration.getDefaultInstance() : livekitModels$ClientConfiguration;
    }

    public LivekitRtc$ICEServer getIceServers(int i10) {
        return (LivekitRtc$ICEServer) this.iceServers_.get(i10);
    }

    public int getIceServersCount() {
        return this.iceServers_.size();
    }

    public List<LivekitRtc$ICEServer> getIceServersList() {
        return this.iceServers_;
    }

    public InterfaceC14622M3 getIceServersOrBuilder(int i10) {
        return (InterfaceC14622M3) this.iceServers_.get(i10);
    }

    public List<? extends InterfaceC14622M3> getIceServersOrBuilderList() {
        return this.iceServers_;
    }

    public boolean hasClientConfiguration() {
        return this.clientConfiguration_ != null;
    }

    public static C14669U3 newBuilder(LivekitRtc$ReconnectResponse livekitRtc$ReconnectResponse) {
        return (C14669U3) DEFAULT_INSTANCE.createBuilder(livekitRtc$ReconnectResponse);
    }

    public static LivekitRtc$ReconnectResponse parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIceServers(int i10, LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.add(i10, livekitRtc$ICEServer);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$ReconnectResponse) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
