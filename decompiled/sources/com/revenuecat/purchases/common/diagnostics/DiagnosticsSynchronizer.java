package com.revenuecat.purchases.common.diagnostics;

import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import org.json.JSONObject;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p817j$.util.stream.Collectors;
import p817j$.util.stream.Stream;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001f"}, m18067d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "diagnosticsHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "<init>", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/Dispatcher;)V", "", "Lorg/json/JSONObject;", "getEventsToSync", "()Ljava/util/List;", "Lkotlin/Function0;", "Lmm/C;", "command", "enqueue", "(LBm/a;)V", "syncDiagnosticsFileIfNeeded", "()V", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DiagnosticsSynchronizer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_EVENTS_TO_SYNC_PER_REQUEST = 200;
    public static final int MAX_NUMBER_POST_RETRIES = 3;
    private final Backend backend;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsHelper diagnosticsHelper;
    private final DiagnosticsTracker diagnosticsTracker;

    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002¨\u0006\r"}, m18067d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer$Companion;", "", "()V", "MAX_EVENTS_TO_SYNC_PER_REQUEST", "", "getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations", "MAX_NUMBER_POST_RETRIES", "", "getMAX_NUMBER_POST_RETRIES$annotations", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations() {
        }

        public static /* synthetic */ void getMAX_NUMBER_POST_RETRIES$annotations() {
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            AbstractC16544l.m18094g(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_" + context.getPackageName() + "_preferences_diagnostics", 0);
            AbstractC16544l.m18093f(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$getEventsToSync$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"j$/util/stream/Stream", "Lorg/json/JSONObject;", "stream", "Lmm/C;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126861 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ C16525B $eventsToSync;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126861(C16525B c16525b) {
            super(1);
            this.$eventsToSync = c16525b;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<JSONObject>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Stream<JSONObject> stream) {
            AbstractC16544l.m18094g(stream, "stream");
            C16525B c16525b = this.$eventsToSync;
            Object objCollect = stream.limit(200L).collect(Collectors.toList());
            AbstractC16544l.m18093f(objCollect, "stream.limit(MAX_EVENTS_…lect(Collectors.toList())");
            c16525b.f51262Y = objCollect;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126871 extends AbstractC16546n implements InterfaceC1426a {

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lorg/json/JSONObject;", "it", "Lmm/C;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ int $diagnosticsCount;
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DiagnosticsSynchronizer diagnosticsSynchronizer, int i10) {
                super(1);
                this.this$0 = diagnosticsSynchronizer;
                this.$diagnosticsCount = i10;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return C17296C.f55119a;
            }

            public final void invoke(JSONObject it) {
                AbstractC16544l.m18094g(it, "it");
                LogUtilsKt.verboseLog("Synced diagnostics file successfully.");
                this.this$0.diagnosticsHelper.clearConsecutiveNumberOfErrors();
                this.this$0.diagnosticsFileHelper.clear(this.$diagnosticsCount);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldRetry", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1439n {
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DiagnosticsSynchronizer diagnosticsSynchronizer) {
                super(2);
                this.this$0 = diagnosticsSynchronizer;
            }

            @Override // p049Bm.InterfaceC1439n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return C17296C.f55119a;
            }

            public final void invoke(PurchasesError error, boolean z6) {
                AbstractC16544l.m18094g(error, "error");
                if (!z6) {
                    LogUtilsKt.verboseLog("Error syncing diagnostics file: " + error + ". Deleting diagnostics file without retrying.");
                    this.this$0.diagnosticsHelper.resetDiagnosticsStatus();
                    this.this$0.diagnosticsTracker.trackClearingDiagnosticsAfterFailedSync();
                    return;
                }
                LogUtilsKt.verboseLog("Error syncing diagnostics file: " + error + ". Will retry the next time the SDK is initialized");
                if (this.this$0.diagnosticsHelper.increaseConsecutiveNumberOfErrors() >= 3) {
                    LogUtilsKt.verboseLog("Error syncing diagnostics file: " + error + ". This was the final attempt (3). Deleting diagnostics file without posting.");
                    this.this$0.diagnosticsHelper.resetDiagnosticsStatus();
                    this.this$0.diagnosticsTracker.trackMaxDiagnosticsSyncRetriesReached();
                }
            }
        }

        public C126871() {
            super(0);
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22503invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22503invoke() {
            try {
                List<? extends JSONObject> eventsToSync = DiagnosticsSynchronizer.this.getEventsToSync();
                int size = eventsToSync.size();
                if (size == 0) {
                    LogUtilsKt.verboseLog("No diagnostics to sync.");
                } else {
                    DiagnosticsSynchronizer.this.backend.postDiagnostics(eventsToSync, new AnonymousClass1(DiagnosticsSynchronizer.this, size), new AnonymousClass2(DiagnosticsSynchronizer.this));
                }
            } catch (Exception e10) {
                LogUtilsKt.verboseLog("Error syncing diagnostics file: " + e10);
                try {
                    DiagnosticsSynchronizer.this.diagnosticsHelper.resetDiagnosticsStatus();
                } catch (IOException e11) {
                    LogUtilsKt.verboseLog("Error deleting diagnostics file: " + e11);
                }
            }
        }
    }

    public DiagnosticsSynchronizer(DiagnosticsHelper diagnosticsHelper, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsTracker diagnosticsTracker, Backend backend, Dispatcher diagnosticsDispatcher) {
        AbstractC16544l.m18094g(diagnosticsHelper, "diagnosticsHelper");
        AbstractC16544l.m18094g(diagnosticsFileHelper, "diagnosticsFileHelper");
        AbstractC16544l.m18094g(diagnosticsTracker, "diagnosticsTracker");
        AbstractC16544l.m18094g(backend, "backend");
        AbstractC16544l.m18094g(diagnosticsDispatcher, "diagnosticsDispatcher");
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsTracker = diagnosticsTracker;
        this.backend = backend;
        this.diagnosticsDispatcher = diagnosticsDispatcher;
    }

    private final void enqueue(InterfaceC1426a command) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new RunnableC0156C(3, command), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(InterfaceC1426a tmp0) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<JSONObject> getEventsToSync() {
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = C17689w.f56480Y;
        this.diagnosticsFileHelper.readFileAsJson(new C126861(c16525b));
        return (List) c16525b.f51262Y;
    }

    public final void syncDiagnosticsFileIfNeeded() {
        enqueue(new C126871());
    }
}
