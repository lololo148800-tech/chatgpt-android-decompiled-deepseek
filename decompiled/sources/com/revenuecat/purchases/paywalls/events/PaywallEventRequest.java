package com.revenuecat.purchases.paywalls.events;

import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
import ao.C11158d;
import bo.AbstractC11516d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p559Wn.InterfaceC8975g;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u0015¨\u0006'"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;", "", "", "Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "events", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/util/List;Lao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEvents", "getCacheKey", "cacheKey", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PaywallEventRequest {
    private final List<PaywallBackendEvent> events;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AbstractC11516d json = AbstractC11516d.f34842d;
    private static final KSerializer[] $childSerializers = {new C11158d(PaywallBackendEvent$$serializer.INSTANCE, 0)};

    @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lbo/d;", "json", "Lbo/d;", "getJson", "()Lbo/d;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC11516d getJson() {
            return PaywallEventRequest.json;
        }

        public final KSerializer serializer() {
            return PaywallEventRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC17300c
    public /* synthetic */ PaywallEventRequest(int i10, List list, AbstractC11171j0 abstractC11171j0) {
        if (1 == (i10 & 1)) {
            this.events = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, PaywallEventRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallEventRequest copy$default(PaywallEventRequest paywallEventRequest, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = paywallEventRequest.events;
        }
        return paywallEventRequest.copy(list);
    }

    public final List<PaywallBackendEvent> component1() {
        return this.events;
    }

    public final PaywallEventRequest copy(List<PaywallBackendEvent> events) {
        AbstractC16544l.m18094g(events, "events");
        return new PaywallEventRequest(events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaywallEventRequest) && AbstractC16544l.m18089b(this.events, ((PaywallEventRequest) other).events);
    }

    public final List<String> getCacheKey() {
        List<PaywallBackendEvent> list = this.events;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((PaywallBackendEvent) it.next()).hashCode()));
        }
        return arrayList;
    }

    public final List<PaywallBackendEvent> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public String toString() {
        return "PaywallEventRequest(events=" + this.events + ')';
    }

    public PaywallEventRequest(List<PaywallBackendEvent> events) {
        AbstractC16544l.m18094g(events, "events");
        this.events = events;
    }
}
