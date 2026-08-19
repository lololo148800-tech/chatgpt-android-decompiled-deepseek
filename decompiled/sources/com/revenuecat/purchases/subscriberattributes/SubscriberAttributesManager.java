package com.revenuecat.purchases.subscriberattributes;

import android.app.Application;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001AB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122 \u0010\u0015\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0004\u0012\u00020\u000f0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u00020\u000f2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u0011J'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\u000f2\n\u0010 \u001a\u00060\u000bj\u0002`\u001f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u000f2\n\u0010$\u001a\u00060\u000bj\u0002`\u001f2\n\u0010%\u001a\u00060\u000bj\u0002`\u001f¢\u0006\u0004\b&\u0010'J9\u0010)\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\"\u0010\u0015\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`(\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0004\b)\u0010*J7\u0010/\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b1\u00102J/\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u0002032\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, m18067d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "backend", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "deviceIdentifiersFetcher", "<init>", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "attributesAsObjects", "appUserID", "Lmm/C;", "storeAttributesIfNeeded", "(Ljava/util/Map;Ljava/lang/String;)V", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;LBm/k;)V", "attributesToSet", "setAttributes", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", SubscriberAttributeKt.JSON_NAME_KEY, "value", "setAttribute", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "currentAppUserID", "Lkotlin/Function0;", "synchronizeSubscriberAttributesForAllUsers", "(Ljava/lang/String;LBm/a;)V", "originalAppUserId", "newAppUserID", "copyUnsyncedSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "getUnsyncedSubscriberAttributes", "(Ljava/lang/String;LBm/k;)V", "attributesToMarkAsSynced", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "markAsSynced", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "collectDeviceIdentifiers", "(Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "attributionKey", "setAttributionID", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "getBackend", "()Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "obtainingDeviceIdentifiersObservable", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "ObtainDeviceIdentifiersObservable", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriberAttributesManager {
    private final SubscriberAttributesPoster backend;
    private final SubscriberAttributesCache deviceCache;
    private final DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    private final ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable;

    @Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0011j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00128BX\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m18067d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "Ljava/util/Observable;", "<init>", "()V", "Lkotlin/Function0;", "Lmm/C;", "completion", "waitUntilIdle", "(LBm/a;)V", "", "value", "numberOfProcesses", TokenNames.f32012I, "getNumberOfProcesses", "()I", "setNumberOfProcesses", "(I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ObtainDeviceIdentifiersObservable extends Observable {
        private final ArrayList<InterfaceC1426a> listeners = new ArrayList<>();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new Observer() { // from class: com.revenuecat.purchases.subscriberattributes.a
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    SubscriberAttributesManager.ObtainDeviceIdentifiersObservable._init_$lambda$2(this.f40448a, observable, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$2(ObtainDeviceIdentifiersObservable this$0, Observable observable, Object obj) {
            AbstractC16544l.m18094g(this$0, "this$0");
            AbstractC16544l.m18092e(observable, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable");
            if (((ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (this$0) {
                    try {
                        Iterator<T> it = this$0.listeners.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1426a) it.next()).invoke();
                        }
                        this$0.listeners.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final synchronized int getNumberOfProcesses() {
            return this.numberOfProcesses;
        }

        public final synchronized void setNumberOfProcesses(int i10) {
            if (this.numberOfProcesses == i10) {
                return;
            }
            this.numberOfProcesses = i10;
            setChanged();
            notifyObservers();
        }

        public final synchronized void waitUntilIdle(InterfaceC1426a completion) {
            try {
                AbstractC16544l.m18094g(completion, "completion");
                if (this.numberOfProcesses == 0) {
                    completion.invoke();
                } else {
                    this.listeners.add(new C12758xb041ba2(completion));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$collectDeviceIdentifiers$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "", "deviceIdentifiers", "Lmm/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127591 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $appUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127591(String str) {
            super(1);
            this.$appUserID = str;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Map<String, String> deviceIdentifiers) {
            AbstractC16544l.m18094g(deviceIdentifiers, "deviceIdentifiers");
            SubscriberAttributesManager.this.setAttributes(deviceIdentifiers, this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getDeviceIdentifiers$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "", "deviceIdentifiers", "Lmm/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127601 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127601(InterfaceC1436k interfaceC1436k, SubscriberAttributesManager subscriberAttributesManager) {
            super(1);
            this.$completion = interfaceC1436k;
            this.this$0 = subscriberAttributesManager;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Map<String, String> deviceIdentifiers) {
            AbstractC16544l.m18094g(deviceIdentifiers, "deviceIdentifiers");
            this.$completion.invoke(deviceIdentifiers);
            ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.this$0.obtainingDeviceIdentifiersObservable;
            obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() - 1);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127611 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ InterfaceC1436k $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127611(InterfaceC1436k interfaceC1436k, SubscriberAttributesManager subscriberAttributesManager, String str) {
            super(0);
            this.$completion = interfaceC1436k;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22525invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22525invoke() {
            this.$completion.invoke(this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes(this.$appUserID));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$setAttributionID$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "", "deviceIdentifiers", "Lmm/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127621 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ SubscriberAttributeKey.AttributionIds $attributionKey;
        final /* synthetic */ String $value;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127621(SubscriberAttributeKey.AttributionIds attributionIds, String str, SubscriberAttributesManager subscriberAttributesManager, String str2) {
            super(1);
            this.$attributionKey = attributionIds;
            this.$value = str;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Map<String, String> deviceIdentifiers) {
            AbstractC16544l.m18094g(deviceIdentifiers, "deviceIdentifiers");
            this.this$0.setAttributes(AbstractC17659D.m19248j(AbstractC17660E.m19258c(new C17309l(this.$attributionKey.getBackendKey(), this.$value)), deviceIdentifiers), this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127631 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ InterfaceC1426a $completion;
        final /* synthetic */ String $currentAppUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127631(InterfaceC1426a interfaceC1426a, String str) {
            super(0);
            this.$completion = interfaceC1426a;
            this.$currentAppUserID = str;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22526invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22526invoke() {
            Map<String, Map<String, SubscriberAttribute>> unsyncedSubscriberAttributes = SubscriberAttributesManager.this.getDeviceCache().getUnsyncedSubscriberAttributes();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : unsyncedSubscriberAttributes.entrySet()) {
                if (!AbstractC21322p.m21681O(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                LogWrapperKt.log(LogIntent.DEBUG, AttributionStrings.NO_SUBSCRIBER_ATTRIBUTES_TO_SYNCHRONIZE);
                InterfaceC1426a interfaceC1426a = this.$completion;
                if (interfaceC1426a != null) {
                    interfaceC1426a.invoke();
                    return;
                }
                return;
            }
            int size = linkedHashMap.size();
            C16558z c16558z = new C16558z();
            SubscriberAttributesManager subscriberAttributesManager = SubscriberAttributesManager.this;
            String str = this.$currentAppUserID;
            InterfaceC1426a interfaceC1426a2 = this.$completion;
            for (Iterator it = linkedHashMap.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str2 = (String) entry2.getKey();
                Map map = (Map) entry2.getValue();
                subscriberAttributesManager.getBackend().postSubscriberAttributes(BackendHelpersKt.toBackendMap(map), str2, new C12764x2cb86e5e(subscriberAttributesManager, str2, map, str, c16558z, interfaceC1426a2, size), new C12765x2cb86e5f(subscriberAttributesManager, str2, map, c16558z, interfaceC1426a2, size));
                str = str;
            }
        }
    }

    public SubscriberAttributesManager(SubscriberAttributesCache deviceCache, SubscriberAttributesPoster backend, DeviceIdentifiersFetcher deviceIdentifiersFetcher) {
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(backend, "backend");
        AbstractC16544l.m18094g(deviceIdentifiersFetcher, "deviceIdentifiersFetcher");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher;
        this.obtainingDeviceIdentifiersObservable = new ObtainDeviceIdentifiersObservable();
    }

    private final void getDeviceIdentifiers(Application applicationContext, InterfaceC1436k completion) {
        ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(applicationContext, new C127601(completion, this));
    }

    private final void storeAttributesIfNeeded(Map<String, SubscriberAttribute> attributesAsObjects, String appUserID) {
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(appUserID);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : attributesAsObjects.entrySet()) {
            String key = entry.getKey();
            SubscriberAttribute value = entry.getValue();
            if (allStoredSubscriberAttributes.containsKey(key)) {
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (!AbstractC16544l.m18089b(subscriberAttribute != null ? subscriberAttribute.getValue() : null, value.getValue())) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        this.deviceCache.setAttributes(appUserID, linkedHashMap);
    }

    public static /* synthetic */ void synchronizeSubscriberAttributesForAllUsers$default(SubscriberAttributesManager subscriberAttributesManager, String str, InterfaceC1426a interfaceC1426a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC1426a = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, interfaceC1426a);
    }

    public final void collectDeviceIdentifiers(String appUserID, Application applicationContext) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        getDeviceIdentifiers(applicationContext, new C127591(appUserID));
    }

    public final synchronized void copyUnsyncedSubscriberAttributes(String originalAppUserId, String newAppUserID) {
        AbstractC16544l.m18094g(originalAppUserId, "originalAppUserId");
        AbstractC16544l.m18094g(newAppUserID, "newAppUserID");
        Map<String, SubscriberAttribute> unsyncedSubscriberAttributes = this.deviceCache.getUnsyncedSubscriberAttributes(originalAppUserId);
        if (unsyncedSubscriberAttributes.isEmpty()) {
            return;
        }
        LogUtilsKt.infoLog(String.format(AttributionStrings.COPYING_ATTRIBUTES_FROM_TO_USER, Arrays.copyOf(new Object[]{originalAppUserId, newAppUserID}, 2)));
        this.deviceCache.setAttributes(newAppUserID, unsyncedSubscriberAttributes);
        this.deviceCache.clearAllSubscriberAttributesFromUser(originalAppUserId);
    }

    public final SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(String appUserID, InterfaceC1436k completion) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(completion, "completion");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C127611(completion, this, appUserID));
    }

    public final synchronized void markAsSynced(String appUserID, Map<String, SubscriberAttribute> attributesToMarkAsSynced, List<SubscriberAttributeError> attributeErrors) {
        try {
            AbstractC16544l.m18094g(appUserID, "appUserID");
            AbstractC16544l.m18094g(attributesToMarkAsSynced, "attributesToMarkAsSynced");
            AbstractC16544l.m18094g(attributeErrors, "attributeErrors");
            if (!attributeErrors.isEmpty()) {
                LogWrapperKt.log(LogIntent.RC_ERROR, String.format(AttributionStrings.SUBSCRIBER_ATTRIBUTES_ERROR, Arrays.copyOf(new Object[]{attributeErrors}, 1)));
            }
            if (attributesToMarkAsSynced.isEmpty()) {
                return;
            }
            LogWrapperKt.log(LogIntent.INFO, String.format(AttributionStrings.MARKING_ATTRIBUTES_SYNCED, Arrays.copyOf(new Object[]{appUserID}, 1)) + AbstractC17680n.m19349Y(attributesToMarkAsSynced.values(), Separators.RETURN, null, null, 0, null, null, 62));
            Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(appUserID);
            LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(allStoredSubscriberAttributes);
            for (Map.Entry<String, SubscriberAttribute> entry : attributesToMarkAsSynced.entrySet()) {
                String key = entry.getKey();
                SubscriberAttribute value = entry.getValue();
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (subscriberAttribute != null) {
                    if (subscriberAttribute.isSynced()) {
                        subscriberAttribute = null;
                    }
                    if (subscriberAttribute != null) {
                        if ((AbstractC16544l.m18089b(subscriberAttribute.getValue(), value.getValue()) ? subscriberAttribute : null) != null) {
                            linkedHashMapM19256r.put(key, SubscriberAttribute.copy$default(value, null, null, null, null, true, 15, null));
                        }
                    }
                }
            }
            this.deviceCache.setAttributes(appUserID, linkedHashMapM19256r);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void setAttribute(SubscriberAttributeKey key, String value, String appUserID) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        setAttributes(AbstractC17660E.m19258c(new C17309l(key.getBackendKey(), value)), appUserID);
    }

    public final synchronized void setAttributes(Map<String, String> attributesToSet, String appUserID) {
        try {
            AbstractC16544l.m18094g(attributesToSet, "attributesToSet");
            AbstractC16544l.m18094g(appUserID, "appUserID");
            ArrayList arrayList = new ArrayList(attributesToSet.size());
            for (Map.Entry<String, String> entry : attributesToSet.entrySet()) {
                String key = entry.getKey();
                arrayList.add(new C17309l(key, new SubscriberAttribute(key, entry.getValue(), (DateProvider) null, (Date) null, false, 28, (DefaultConstructorMarker) null)));
            }
            storeAttributesIfNeeded(AbstractC17659D.m19253o(arrayList), appUserID);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setAttributionID(SubscriberAttributeKey.AttributionIds attributionKey, String value, String appUserID, Application applicationContext) {
        AbstractC16544l.m18094g(attributionKey, "attributionKey");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        getDeviceIdentifiers(applicationContext, new C127621(attributionKey, value, this, appUserID));
    }

    public final void synchronizeSubscriberAttributesForAllUsers(String currentAppUserID, InterfaceC1426a completion) {
        AbstractC16544l.m18094g(currentAppUserID, "currentAppUserID");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C127631(completion, currentAppUserID));
    }
}
