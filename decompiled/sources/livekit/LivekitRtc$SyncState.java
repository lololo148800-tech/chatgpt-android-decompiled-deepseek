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
import p793ho.C14611K4;
import p793ho.C14713b4;
import p793ho.C14874y4;
import p793ho.InterfaceC14560C4;
import p793ho.InterfaceC14610K3;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitRtc$SyncState extends AbstractC12133Z implements InterfaceC12094H0 {
    public static final int ANSWER_FIELD_NUMBER = 1;
    public static final int DATA_CHANNELS_FIELD_NUMBER = 4;
    private static final LivekitRtc$SyncState DEFAULT_INSTANCE;
    public static final int OFFER_FIELD_NUMBER = 5;
    private static volatile InterfaceC12124U0 PARSER = null;
    public static final int PUBLISH_TRACKS_FIELD_NUMBER = 3;
    public static final int SUBSCRIPTION_FIELD_NUMBER = 2;
    public static final int TRACK_SIDS_DISABLED_FIELD_NUMBER = 6;
    private LivekitRtc$SessionDescription answer_;
    private LivekitRtc$SessionDescription offer_;
    private LivekitRtc$UpdateSubscription subscription_;
    private InterfaceC12172m0 publishTracks_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 dataChannels_ = AbstractC12133Z.emptyProtobufList();
    private InterfaceC12172m0 trackSidsDisabled_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitRtc$SyncState livekitRtc$SyncState = new LivekitRtc$SyncState();
        DEFAULT_INSTANCE = livekitRtc$SyncState;
        AbstractC12133Z.registerDefaultInstance(LivekitRtc$SyncState.class, livekitRtc$SyncState);
    }

    private LivekitRtc$SyncState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDataChannels(Iterable<? extends LivekitRtc$DataChannelInfo> iterable) {
        ensureDataChannelsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.dataChannels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPublishTracks(Iterable<? extends LivekitRtc$TrackPublishedResponse> iterable) {
        ensurePublishTracksIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.publishTracks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackSidsDisabled(Iterable<String> iterable) {
        ensureTrackSidsDisabledIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.trackSidsDisabled_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataChannels(LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo) {
        livekitRtc$DataChannelInfo.getClass();
        ensureDataChannelsIsMutable();
        this.dataChannels_.add(livekitRtc$DataChannelInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublishTracks(LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        ensurePublishTracksIsMutable();
        this.publishTracks_.add(livekitRtc$TrackPublishedResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSidsDisabled(String str) {
        str.getClass();
        ensureTrackSidsDisabledIsMutable();
        this.trackSidsDisabled_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSidsDisabledBytes(AbstractC12171m abstractC12171m) {
        AbstractC12138b.checkByteStringIsUtf8(abstractC12171m);
        ensureTrackSidsDisabledIsMutable();
        this.trackSidsDisabled_.add(abstractC12171m.m14012w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswer() {
        this.answer_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataChannels() {
        this.dataChannels_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffer() {
        this.offer_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublishTracks() {
        this.publishTracks_ = AbstractC12133Z.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscription() {
        this.subscription_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSidsDisabled() {
        this.trackSidsDisabled_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureDataChannelsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.dataChannels_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.dataChannels_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensurePublishTracksIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.publishTracks_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.publishTracks_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    private void ensureTrackSidsDisabledIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.trackSidsDisabled_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.trackSidsDisabled_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitRtc$SyncState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        LivekitRtc$SessionDescription livekitRtc$SessionDescription2 = this.answer_;
        if (livekitRtc$SessionDescription2 == null || livekitRtc$SessionDescription2 == LivekitRtc$SessionDescription.getDefaultInstance()) {
            this.answer_ = livekitRtc$SessionDescription;
            return;
        }
        C14713b4 c14713b4NewBuilder = LivekitRtc$SessionDescription.newBuilder(this.answer_);
        c14713b4NewBuilder.m13865f(livekitRtc$SessionDescription);
        this.answer_ = (LivekitRtc$SessionDescription) c14713b4NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        LivekitRtc$SessionDescription livekitRtc$SessionDescription2 = this.offer_;
        if (livekitRtc$SessionDescription2 == null || livekitRtc$SessionDescription2 == LivekitRtc$SessionDescription.getDefaultInstance()) {
            this.offer_ = livekitRtc$SessionDescription;
            return;
        }
        C14713b4 c14713b4NewBuilder = LivekitRtc$SessionDescription.newBuilder(this.offer_);
        c14713b4NewBuilder.m13865f(livekitRtc$SessionDescription);
        this.offer_ = (LivekitRtc$SessionDescription) c14713b4NewBuilder.m13862c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubscription(LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        livekitRtc$UpdateSubscription.getClass();
        LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription2 = this.subscription_;
        if (livekitRtc$UpdateSubscription2 == null || livekitRtc$UpdateSubscription2 == LivekitRtc$UpdateSubscription.getDefaultInstance()) {
            this.subscription_ = livekitRtc$UpdateSubscription;
            return;
        }
        C14611K4 c14611k4NewBuilder = LivekitRtc$UpdateSubscription.newBuilder(this.subscription_);
        c14611k4NewBuilder.m13865f(livekitRtc$UpdateSubscription);
        this.subscription_ = (LivekitRtc$UpdateSubscription) c14611k4NewBuilder.m13862c();
    }

    public static C14874y4 newBuilder() {
        return (C14874y4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SyncState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SyncState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDataChannels(int i10) {
        ensureDataChannelsIsMutable();
        this.dataChannels_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePublishTracks(int i10) {
        ensurePublishTracksIsMutable();
        this.publishTracks_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.answer_ = livekitRtc$SessionDescription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataChannels(int i10, LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo) {
        livekitRtc$DataChannelInfo.getClass();
        ensureDataChannelsIsMutable();
        this.dataChannels_.set(i10, livekitRtc$DataChannelInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.offer_ = livekitRtc$SessionDescription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublishTracks(int i10, LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        ensurePublishTracksIsMutable();
        this.publishTracks_.set(i10, livekitRtc$TrackPublishedResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscription(LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        livekitRtc$UpdateSubscription.getClass();
        this.subscription_ = livekitRtc$UpdateSubscription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSidsDisabled(int i10, String str) {
        str.getClass();
        ensureTrackSidsDisabledIsMutable();
        this.trackSidsDisabled_.set(i10, str);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001\t\u0002\t\u0003\u001b\u0004\u001b\u0005\t\u0006Ț", new Object[]{"answer_", "subscription_", "publishTracks_", LivekitRtc$TrackPublishedResponse.class, "dataChannels_", LivekitRtc$DataChannelInfo.class, "offer_", "trackSidsDisabled_"});
            case 3:
                return new LivekitRtc$SyncState();
            case 4:
                return new C14874y4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitRtc$SyncState.class) {
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

    public LivekitRtc$SessionDescription getAnswer() {
        LivekitRtc$SessionDescription livekitRtc$SessionDescription = this.answer_;
        return livekitRtc$SessionDescription == null ? LivekitRtc$SessionDescription.getDefaultInstance() : livekitRtc$SessionDescription;
    }

    public LivekitRtc$DataChannelInfo getDataChannels(int i10) {
        return (LivekitRtc$DataChannelInfo) this.dataChannels_.get(i10);
    }

    public int getDataChannelsCount() {
        return this.dataChannels_.size();
    }

    public List<LivekitRtc$DataChannelInfo> getDataChannelsList() {
        return this.dataChannels_;
    }

    public InterfaceC14610K3 getDataChannelsOrBuilder(int i10) {
        return (InterfaceC14610K3) this.dataChannels_.get(i10);
    }

    public List<? extends InterfaceC14610K3> getDataChannelsOrBuilderList() {
        return this.dataChannels_;
    }

    public LivekitRtc$SessionDescription getOffer() {
        LivekitRtc$SessionDescription livekitRtc$SessionDescription = this.offer_;
        return livekitRtc$SessionDescription == null ? LivekitRtc$SessionDescription.getDefaultInstance() : livekitRtc$SessionDescription;
    }

    public LivekitRtc$TrackPublishedResponse getPublishTracks(int i10) {
        return (LivekitRtc$TrackPublishedResponse) this.publishTracks_.get(i10);
    }

    public int getPublishTracksCount() {
        return this.publishTracks_.size();
    }

    public List<LivekitRtc$TrackPublishedResponse> getPublishTracksList() {
        return this.publishTracks_;
    }

    public InterfaceC14560C4 getPublishTracksOrBuilder(int i10) {
        return (InterfaceC14560C4) this.publishTracks_.get(i10);
    }

    public List<? extends InterfaceC14560C4> getPublishTracksOrBuilderList() {
        return this.publishTracks_;
    }

    public LivekitRtc$UpdateSubscription getSubscription() {
        LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription = this.subscription_;
        return livekitRtc$UpdateSubscription == null ? LivekitRtc$UpdateSubscription.getDefaultInstance() : livekitRtc$UpdateSubscription;
    }

    public String getTrackSidsDisabled(int i10) {
        return (String) this.trackSidsDisabled_.get(i10);
    }

    public AbstractC12171m getTrackSidsDisabledBytes(int i10) {
        return AbstractC12171m.m14011m((String) this.trackSidsDisabled_.get(i10));
    }

    public int getTrackSidsDisabledCount() {
        return this.trackSidsDisabled_.size();
    }

    public List<String> getTrackSidsDisabledList() {
        return this.trackSidsDisabled_;
    }

    public boolean hasAnswer() {
        return this.answer_ != null;
    }

    public boolean hasOffer() {
        return this.offer_ != null;
    }

    public boolean hasSubscription() {
        return this.subscription_ != null;
    }

    public static C14874y4 newBuilder(LivekitRtc$SyncState livekitRtc$SyncState) {
        return (C14874y4) DEFAULT_INSTANCE.createBuilder(livekitRtc$SyncState);
    }

    public static LivekitRtc$SyncState parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SyncState parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitRtc$SyncState parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataChannels(int i10, LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo) {
        livekitRtc$DataChannelInfo.getClass();
        ensureDataChannelsIsMutable();
        this.dataChannels_.add(i10, livekitRtc$DataChannelInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublishTracks(int i10, LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        ensurePublishTracksIsMutable();
        this.publishTracks_.add(i10, livekitRtc$TrackPublishedResponse);
    }

    public static LivekitRtc$SyncState parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitRtc$SyncState parseFrom(byte[] bArr) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SyncState parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitRtc$SyncState parseFrom(InputStream inputStream) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SyncState parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitRtc$SyncState parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitRtc$SyncState parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitRtc$SyncState) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
