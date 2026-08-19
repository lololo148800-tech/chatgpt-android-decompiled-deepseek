package com.revenuecat.purchases.utils;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.utils.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import org.json.JSONObject;
import p049Bm.InterfaceC1436k;
import p817j$.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0011\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00102\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0013\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006\""}, m18067d2 = {"Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/utils/Event;", TokenNames.f32019T, "", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "", "filePath", "Lkotlin/Function1;", "eventDeserializer", "<init>", "(Lcom/revenuecat/purchases/common/FileHelper;Ljava/lang/String;LBm/k;)V", "string", "mapToEvent", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;", "event", "Lmm/C;", "appendEvent", "(Lcom/revenuecat/purchases/utils/Event;)V", "j$/util/stream/Stream", "streamBlock", "readFile", "(LBm/k;)V", "Lorg/json/JSONObject;", "readFileAsJson", "", "eventsToDeleteCount", SDPKeywords.CLEAR, "(I)V", "deleteFile", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "Ljava/lang/String;", "LBm/k;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class EventsFileHelper<T extends Event> {
    private final InterfaceC1436k eventDeserializer;
    private final FileHelper fileHelper;
    private final String filePath;

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1 */
    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/Event;", TokenNames.f32019T, "j$/util/stream/Stream", "", "stream", "Lmm/C;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127701 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $streamBlock;
        final /* synthetic */ EventsFileHelper<T> this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18067d2 = {"<anonymous>", TokenNames.f32019T, "kotlin.jvm.PlatformType", "Lcom/revenuecat/purchases/utils/Event;", "line", "", "invoke", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ EventsFileHelper<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(EventsFileHelper<T> eventsFileHelper) {
                super(1);
                this.this$0 = eventsFileHelper;
            }

            @Override // p049Bm.InterfaceC1436k
            public final T invoke(String line) {
                EventsFileHelper<T> eventsFileHelper = this.this$0;
                AbstractC16544l.m18093f(line, "line");
                return (T) eventsFileHelper.mapToEvent(line);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127701(InterfaceC1436k interfaceC1436k, EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.$streamBlock = interfaceC1436k;
            this.this$0 = eventsFileHelper;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Event invoke$lambda$0(InterfaceC1436k tmp0, Object obj) {
            AbstractC16544l.m18094g(tmp0, "$tmp0");
            return (Event) tmp0.invoke(obj);
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<String>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Stream<String> stream) {
            AbstractC16544l.m18094g(stream, "stream");
            InterfaceC1436k interfaceC1436k = this.$streamBlock;
            Object map = stream.map(new C12773a(0, new AnonymousClass1(this.this$0)));
            AbstractC16544l.m18093f(map, "@Synchronized\n    fun re…        }\n        }\n    }");
            interfaceC1436k.invoke(map);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1 */
    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/Event;", TokenNames.f32019T, "j$/util/stream/Stream", "", "stream", "Lmm/C;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127711 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $streamBlock;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m18067d2 = {"<anonymous>", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", TokenNames.f32019T, "Lcom/revenuecat/purchases/utils/Event;", "it", "", "invoke"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final JSONObject invoke(String str) {
                return new JSONObject(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127711(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$streamBlock = interfaceC1436k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final JSONObject invoke$lambda$0(InterfaceC1436k tmp0, Object obj) {
            AbstractC16544l.m18094g(tmp0, "$tmp0");
            return (JSONObject) tmp0.invoke(obj);
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<String>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Stream<String> stream) {
            AbstractC16544l.m18094g(stream, "stream");
            InterfaceC1436k interfaceC1436k = this.$streamBlock;
            Object map = stream.map(new C12773a(1, AnonymousClass1.INSTANCE));
            AbstractC16544l.m18093f(map, "stream.map { JSONObject(it) }");
            interfaceC1436k.invoke(map);
        }
    }

    public EventsFileHelper(FileHelper fileHelper, String filePath, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(fileHelper, "fileHelper");
        AbstractC16544l.m18094g(filePath, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = filePath;
        this.eventDeserializer = interfaceC1436k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T mapToEvent(String string) {
        InterfaceC1436k interfaceC1436k = this.eventDeserializer;
        if (interfaceC1436k == null) {
            return null;
        }
        try {
            return (T) interfaceC1436k.invoke(string);
        } catch (SerializationException e10) {
            LogUtilsKt.errorLog("Error parsing event from file: " + string, e10);
            return null;
        } catch (IllegalArgumentException e11) {
            LogUtilsKt.errorLog("Error parsing event from file: " + string, e11);
            return null;
        }
    }

    public final synchronized void appendEvent(T event) {
        AbstractC16544l.m18094g(event, "event");
        FileHelper fileHelper = this.fileHelper;
        String str = this.filePath;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(event);
        sb2.append('\n');
        fileHelper.appendToFile(str, sb2.toString());
    }

    public final synchronized void clear(int eventsToDeleteCount) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, eventsToDeleteCount);
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogUtilsKt.verboseLog("Failed to delete events file in " + this.filePath + '.');
        }
    }

    public final synchronized void readFile(InterfaceC1436k streamBlock) {
        try {
            AbstractC16544l.m18094g(streamBlock, "streamBlock");
            if (this.eventDeserializer == null || this.fileHelper.fileIsEmpty(this.filePath)) {
                Stream streamEmpty = Stream.CC.empty();
                AbstractC16544l.m18093f(streamEmpty, "empty()");
                streamBlock.invoke(streamEmpty);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new C127701(streamBlock, this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void readFileAsJson(InterfaceC1436k streamBlock) {
        try {
            AbstractC16544l.m18094g(streamBlock, "streamBlock");
            if (this.fileHelper.fileIsEmpty(this.filePath)) {
                Stream streamEmpty = Stream.CC.empty();
                AbstractC16544l.m18093f(streamEmpty, "empty()");
                streamBlock.invoke(streamEmpty);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new C127711(streamBlock));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public /* synthetic */ EventsFileHelper(FileHelper fileHelper, String str, InterfaceC1436k interfaceC1436k, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileHelper, str, (i10 & 4) != 0 ? null : interfaceC1436k);
    }
}
