package com.revenuecat.purchases.paywalls.events;

import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p817j$.util.stream.Collectors;
import p817j$.util.stream.Stream;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u001e\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "fileHelper", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "paywallEventsDispatcher", "Lcom/revenuecat/purchases/common/Backend;", "backend", "<init>", "(Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Backend;)V", "", "getEventsToSync", "()Ljava/util/List;", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lkotlin/Function0;", "Lmm/C;", "command", "enqueue", "(Lcom/revenuecat/purchases/common/Delay;LBm/a;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "event", "track", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "flushEvents", "()V", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/common/Backend;", "", "<set-?>", "flushInProgress", "Z", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PaywallEventsManager {
    private static final long FLUSH_COUNT = 50;
    public static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private final Backend backend;
    private final EventsFileHelper<PaywallStoredEvent> fileHelper;
    private boolean flushInProgress;
    private final IdentityManager identityManager;
    private final Dispatcher paywallEventsDispatcher;

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127531 extends AbstractC16546n implements InterfaceC1426a {

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2$1, reason: invalid class name */
            @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
            public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {
                final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
                final /* synthetic */ PaywallEventsManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                    super(0);
                    this.this$0 = paywallEventsManager;
                    this.$eventsToSyncWithNullValues = list;
                }

                @Override // p049Bm.InterfaceC1426a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m22521invoke();
                    return C17296C.f55119a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m22521invoke() {
                    this.this$0.fileHelper.clear(this.$eventsToSyncWithNullValues.size());
                    this.this$0.flushInProgress = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(0);
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22520invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22520invoke() {
                LogUtilsKt.verboseLog("Paywall event flush: success.");
                PaywallEventsManager paywallEventsManager = this.this$0;
                PaywallEventsManager.enqueue$default(paywallEventsManager, null, new AnonymousClass1(paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldMarkAsSynced", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass3 extends AbstractC16546n implements InterfaceC1439n {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3$1, reason: invalid class name */
            @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
            public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {
                final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
                final /* synthetic */ boolean $shouldMarkAsSynced;
                final /* synthetic */ PaywallEventsManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(boolean z6, PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                    super(0);
                    this.$shouldMarkAsSynced = z6;
                    this.this$0 = paywallEventsManager;
                    this.$eventsToSyncWithNullValues = list;
                }

                @Override // p049Bm.InterfaceC1426a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m22522invoke();
                    return C17296C.f55119a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m22522invoke() {
                    if (this.$shouldMarkAsSynced) {
                        this.this$0.fileHelper.clear(this.$eventsToSyncWithNullValues.size());
                    }
                    this.this$0.flushInProgress = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(2);
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // p049Bm.InterfaceC1439n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return C17296C.f55119a;
            }

            public final void invoke(PurchasesError error, boolean z6) {
                AbstractC16544l.m18094g(error, "error");
                LogUtilsKt.errorLog$default("Paywall event flush error: " + error + '.', null, 2, null);
                PaywallEventsManager paywallEventsManager = this.this$0;
                PaywallEventsManager.enqueue$default(paywallEventsManager, null, new AnonymousClass1(z6, paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
            }
        }

        public C127531() {
            super(0);
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22519invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22519invoke() {
            if (PaywallEventsManager.this.flushInProgress) {
                LogUtilsKt.debugLog("Flush already in progress.");
                return;
            }
            PaywallEventsManager.this.flushInProgress = true;
            List eventsToSync = PaywallEventsManager.this.getEventsToSync();
            ArrayList arrayListM19339O = AbstractC17680n.m19339O(eventsToSync);
            int size = arrayListM19339O.size();
            if (arrayListM19339O.isEmpty()) {
                LogUtilsKt.verboseLog("No paywall events to sync.");
                PaywallEventsManager.this.flushInProgress = false;
                return;
            }
            LogUtilsKt.verboseLog("Paywall event flush: posting " + size + " events.");
            Backend backend = PaywallEventsManager.this.backend;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM19339O, 10));
            Iterator it = arrayListM19339O.iterator();
            while (it.hasNext()) {
                arrayList.add(((PaywallStoredEvent) it.next()).toPaywallBackendEvent());
            }
            backend.postPaywallEvents(new PaywallEventRequest(arrayList), new AnonymousClass2(PaywallEventsManager.this, eventsToSync), new AnonymousClass3(PaywallEventsManager.this, eventsToSync));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$getEventsToSync$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"j$/util/stream/Stream", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "stream", "Lmm/C;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127541 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ C16525B $eventsToSync;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127541(C16525B c16525b) {
            super(1);
            this.$eventsToSync = c16525b;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<PaywallStoredEvent>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Stream<PaywallStoredEvent> stream) {
            AbstractC16544l.m18094g(stream, "stream");
            C16525B c16525b = this.$eventsToSync;
            Object objCollect = stream.limit(PaywallEventsManager.FLUSH_COUNT).collect(Collectors.toList());
            AbstractC16544l.m18093f(objCollect, "stream.limit(FLUSH_COUNT…lect(Collectors.toList())");
            c16525b.f51262Y = objCollect;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$track$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127551 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ PaywallEvent $event;
        final /* synthetic */ PaywallEventsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127551(PaywallEvent paywallEvent, PaywallEventsManager paywallEventsManager) {
            super(0);
            this.$event = paywallEvent;
            this.this$0 = paywallEventsManager;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22523invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22523invoke() {
            LogUtilsKt.debugLog(qffLJgOYizGmMj.DMMg + this.$event);
            this.this$0.fileHelper.appendEvent(new PaywallStoredEvent(this.$event, this.this$0.identityManager.getCurrentAppUserID()));
        }
    }

    public PaywallEventsManager(EventsFileHelper<PaywallStoredEvent> fileHelper, IdentityManager identityManager, Dispatcher paywallEventsDispatcher, Backend backend) {
        AbstractC16544l.m18094g(fileHelper, "fileHelper");
        AbstractC16544l.m18094g(identityManager, "identityManager");
        AbstractC16544l.m18094g(paywallEventsDispatcher, "paywallEventsDispatcher");
        AbstractC16544l.m18094g(backend, "backend");
        this.fileHelper = fileHelper;
        this.identityManager = identityManager;
        this.paywallEventsDispatcher = paywallEventsDispatcher;
        this.backend = backend;
    }

    private final void enqueue(Delay delay, InterfaceC1426a command) {
        this.paywallEventsDispatcher.enqueue(new RunnableC0156C(7, command), delay);
    }

    public static /* synthetic */ void enqueue$default(PaywallEventsManager paywallEventsManager, Delay delay, InterfaceC1426a interfaceC1426a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            delay = Delay.NONE;
        }
        paywallEventsManager.enqueue(delay, interfaceC1426a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(InterfaceC1426a command) {
        AbstractC16544l.m18094g(command, "$command");
        command.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PaywallStoredEvent> getEventsToSync() {
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = C17689w.f56480Y;
        this.fileHelper.readFile(new C127541(c16525b));
        return (List) c16525b.f51262Y;
    }

    public final synchronized void flushEvents() {
        enqueue$default(this, null, new C127531(), 1, null);
    }

    public final synchronized void track(PaywallEvent event) {
        AbstractC16544l.m18094g(event, "event");
        enqueue$default(this, null, new C127551(event, this), 1, null);
    }
}
