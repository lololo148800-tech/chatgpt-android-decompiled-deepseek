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
import p793ho.C14606K;
import p793ho.InterfaceC14594I;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsEvents extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitAnalytics$AnalyticsEvents DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    private static volatile InterfaceC12124U0 PARSER;
    private InterfaceC12172m0 events_ = AbstractC12133Z.emptyProtobufList();

    static {
        LivekitAnalytics$AnalyticsEvents livekitAnalytics$AnalyticsEvents = new LivekitAnalytics$AnalyticsEvents();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsEvents;
        AbstractC12133Z.registerDefaultInstance(LivekitAnalytics$AnalyticsEvents.class, livekitAnalytics$AnalyticsEvents);
    }

    private LivekitAnalytics$AnalyticsEvents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends LivekitAnalytics$AnalyticsEvent> iterable) {
        ensureEventsIsMutable();
        AbstractC12138b.addAll((Iterable) iterable, (List) this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent) {
        livekitAnalytics$AnalyticsEvent.getClass();
        ensureEventsIsMutable();
        this.events_.add(livekitAnalytics$AnalyticsEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = AbstractC12133Z.emptyProtobufList();
    }

    private void ensureEventsIsMutable() {
        InterfaceC12172m0 interfaceC12172m0 = this.events_;
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return;
        }
        this.events_ = AbstractC12133Z.mutableCopy(interfaceC12172m0);
    }

    public static LivekitAnalytics$AnalyticsEvents getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14606K newBuilder() {
        return (C14606K) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsEvents parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i10) {
        ensureEventsIsMutable();
        this.events_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i10, LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent) {
        livekitAnalytics$AnalyticsEvent.getClass();
        ensureEventsIsMutable();
        this.events_.set(i10, livekitAnalytics$AnalyticsEvent);
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"events_", LivekitAnalytics$AnalyticsEvent.class});
            case 3:
                return new LivekitAnalytics$AnalyticsEvents();
            case 4:
                return new C14606K(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitAnalytics$AnalyticsEvents.class) {
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

    public LivekitAnalytics$AnalyticsEvent getEvents(int i10) {
        return (LivekitAnalytics$AnalyticsEvent) this.events_.get(i10);
    }

    public int getEventsCount() {
        return this.events_.size();
    }

    public List<LivekitAnalytics$AnalyticsEvent> getEventsList() {
        return this.events_;
    }

    public InterfaceC14594I getEventsOrBuilder(int i10) {
        return (InterfaceC14594I) this.events_.get(i10);
    }

    public List<? extends InterfaceC14594I> getEventsOrBuilderList() {
        return this.events_;
    }

    public static C14606K newBuilder(LivekitAnalytics$AnalyticsEvents livekitAnalytics$AnalyticsEvents) {
        return (C14606K) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsEvents);
    }

    public static LivekitAnalytics$AnalyticsEvents parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i10, LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent) {
        livekitAnalytics$AnalyticsEvent.getClass();
        ensureEventsIsMutable();
        this.events_.add(i10, livekitAnalytics$AnalyticsEvent);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitAnalytics$AnalyticsEvents parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitAnalytics$AnalyticsEvents) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
