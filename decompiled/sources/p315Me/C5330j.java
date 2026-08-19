package p315Me;

import gd.C13979q0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1081wc.C20857C;
import p1081wc.InterfaceC20904w;
import p1135yn.C21555b;
import p195Hh.C3430e;
import p216Id.C3704l;
import p228J.AbstractC3812N;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p525Vb.C8258a;
import p544W9.AbstractC8465D3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Me.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5330j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20904w f17539a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13849E f17540b;

    /* JADX INFO: renamed from: c */
    public final C3430e f17541c = AbstractC8168p6.m8749b("turn-analytics", null);

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f17542d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public C5322b f17543e = new C5322b(0, 0, null);

    public C5330j(InterfaceC20904w interfaceC20904w, InterfaceC13849E interfaceC13849E) {
        this.f17539a = interfaceC20904w;
        this.f17540b = interfaceC13849E;
    }

    /* JADX INFO: renamed from: b */
    public static void m5879b(C5328h c5328h, Throwable th2) {
        if (!(th2 instanceof C3704l)) {
            if (!AbstractC16544l.m18089b(th2 != null ? th2.getMessage() : null, "Conversation Stop Requested") && (!(th2 instanceof CancellationException) || (th2.getCause() != null && !(th2.getCause() instanceof CancellationException)))) {
                c5328h.f17527j = new C5325e(th2);
                return;
            }
        }
        c5328h.f17527j = C5324d.f17514o0;
    }

    /* JADX INFO: renamed from: a */
    public final void m5880a(C5328h c5328h) {
        String str;
        List list = c5328h.f17533p;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(C21555b.m21835e(((C5323c) it.next()).f17513a)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5322b c5322b = this.f17543e;
        int i10 = c5322b.f17510a;
        AbstractC3812N abstractC3812N = c5328h.f17527j;
        int i11 = i10 + (abstractC3812N instanceof C5327g ? 1 : 0);
        boolean z6 = abstractC3812N instanceof C5325e;
        int i12 = c5322b.f17511b + (z6 ? 1 : 0);
        C5325e c5325e = z6 ? (C5325e) abstractC3812N : null;
        C5322b c5322b2 = new C5322b(i11, i12, c5325e != null ? c5325e.f17515o0 : null);
        C17309l c17309l = new C17309l("turn_id", c5328h.f17519b);
        String str2 = c5328h.f17518a;
        C17309l c17309l2 = new C17309l("model", str2);
        C17309l c17309l3 = new C17309l("model_slug", str2);
        C17309l c17309l4 = new C17309l("trigger", c5328h.f17520c.f11241Y);
        C17309l c17309l5 = new C17309l("result", (String) abstractC3812N.f11539Z);
        C17309l c17309l6 = new C17309l("token_count", Integer.valueOf(list.size()));
        C17309l c17309l7 = new C17309l("model_message_update_count", Integer.valueOf(list.size()));
        C17309l c17309l8 = new C17309l("stream_update_event_count", Integer.valueOf(c5328h.f17535r));
        C17309l c17309l9 = new C17309l("message_update_event_count", Integer.valueOf(c5328h.f17534q));
        int i13 = c5328h.f17524g;
        C17309l c17309l10 = new C17309l("images", Integer.valueOf(i13));
        int i14 = c5328h.f17523f;
        C17309l c17309l11 = new C17309l("attachments", AbstractC17659D.m19244f(c17309l10, new C17309l("files", Integer.valueOf(i14)), new C17309l("total", Integer.valueOf(i14 + i13))));
        C17309l c17309l12 = new C17309l("tools_used", AbstractC17680n.m19322C0(c5328h.f17536s));
        C17309l c17309l13 = new C17309l("last_error", AbstractC8465D3.m9094h(this.f17543e.f17512c));
        C17309l c17309l14 = new C17309l("session_success_count", Integer.valueOf(i11));
        C17309l c17309l15 = new C17309l("session_failure_count", Integer.valueOf(i12));
        Long l4 = (Long) AbstractC17680n.m19343S(arrayList);
        C17309l c17309l16 = new C17309l("first_token_lat", Long.valueOf(l4 != null ? l4.longValue() : -1L));
        C17309l c17309l17 = new C17309l("total_request_time", Long.valueOf(C21555b.m21835e(c5328h.f17530m)));
        C17309l c17309l18 = new C17309l("time_since_prompt_sent_ms", Long.valueOf(C21555b.m21835e(c5328h.f17530m)));
        C17309l c17309l19 = new C17309l("request_step", c5328h.f17529l);
        C17309l c17309l20 = new C17309l("stream_buffering", Boolean.valueOf(c5328h.f17526i));
        String str3 = c5328h.f17525h;
        if (str3 == null) {
            str3 = "";
            str = str3;
        } else {
            str = "";
        }
        C17309l c17309l21 = new C17309l("stream_encoding", str3);
        String str4 = c5328h.f17521d;
        if (str4 == null) {
            str4 = null;
        }
        if (str4 == null) {
            str4 = str;
        }
        C17309l c17309l22 = new C17309l("gizmo_id", str4);
        String str5 = c5328h.f17522e;
        linkedHashMap.putAll(AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, c17309l6, c17309l7, c17309l8, c17309l9, c17309l11, c17309l12, c17309l13, c17309l14, c17309l15, c17309l16, c17309l17, c17309l18, c17309l19, c17309l20, c17309l21, c17309l22, new C17309l("gizmo_type", str5 == null ? str : str5), new C17309l("feature_gates", AbstractC17659D.m19244f(new C17309l("token_provider_recreate_disabled", Boolean.TRUE), new C17309l("conversation_tokens_enabled", Boolean.valueOf(!((C14005w2) this.f17540b).m15481a(C13979q0.f44037c)))))));
        linkedHashMap.putAll(c5328h.f17537t);
        AbstractC3812N abstractC3812N2 = c5328h.f17527j;
        if (abstractC3812N2 instanceof C5325e) {
            AbstractC16544l.m18092e(abstractC3812N2, "null cannot be cast to non-null type com.openai.feature.conversations.tangled.impl.metrics.TurnCompletionData.Result.Error");
            linkedHashMap.put("error", AbstractC8465D3.m9094h(((C5325e) abstractC3812N2).f17515o0));
        }
        if (!list.isEmpty()) {
            List listM19336L = AbstractC17680n.m19336L(arrayList, 1);
            if (!listM19336L.isEmpty()) {
                List list3 = listM19336L;
                C17309l c17309l23 = new C17309l("max_token_lat", AbstractC17680n.m19356f0(list3));
                C17309l c17309l24 = new C17309l("mean_token_lat", Double.valueOf(AbstractC17680n.m19331I(list3)));
                List listM19369s0 = AbstractC17680n.m19369s0(list3);
                C17309l c17309l25 = new C17309l("median_token_lat", Long.valueOf(((Number) listM19369s0.get(listM19369s0.size() / 2)).longValue()));
                Iterator it2 = list3.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                Comparable comparable = (Comparable) it2.next();
                while (it2.hasNext()) {
                    Comparable comparable2 = (Comparable) it2.next();
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
                C17309l c17309l26 = new C17309l("min_token_lat", comparable);
                C17309l c17309l27 = new C17309l("p95_token_lat", Long.valueOf(C8258a.m8894h(95, listM19336L)));
                C17309l c17309l28 = new C17309l("p99_token_lat", Long.valueOf(C8258a.m8894h(99, listM19336L)));
                double dM19331I = AbstractC17680n.m19331I(list3);
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Double.valueOf(((Number) it3.next()).longValue() - dM19331I));
                }
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    double dDoubleValue = ((Number) it4.next()).doubleValue();
                    arrayList3.add(Double.valueOf(dDoubleValue * dDoubleValue));
                }
                Iterator it5 = arrayList3.iterator();
                double dDoubleValue2 = 0.0d;
                int i15 = 0;
                while (it5.hasNext()) {
                    dDoubleValue2 += ((Number) it5.next()).doubleValue();
                    i15++;
                    if (i15 < 0) {
                        AbstractC17681o.m19387p();
                        throw null;
                    }
                }
                linkedHashMap.putAll(AbstractC17659D.m19244f(c17309l23, c17309l24, c17309l25, c17309l26, c17309l27, c17309l28, new C17309l("std_dev_token_lat", Double.valueOf(Math.sqrt(i15 == 0 ? Double.NaN : dDoubleValue2 / ((double) i15)))), new C17309l("time_since_last_event_ms", Long.valueOf(C21555b.m21835e(c5328h.f17532o)))));
            }
        }
        this.f17543e = c5322b2;
        this.f17539a.mo21447a(C20857C.f66325g, linkedHashMap);
        AbstractC8160o6.m8728c(this.f17541c, "Turn Exchange Complete", null, AbstractC17660E.m19258c(new C17309l("turn_analytics", linkedHashMap)), 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5330j)) {
            return false;
        }
        C5330j c5330j = (C5330j) obj;
        return AbstractC16544l.m18089b(this.f17539a, c5330j.f17539a) && AbstractC16544l.m18089b(this.f17540b, c5330j.f17540b);
    }

    public final int hashCode() {
        return this.f17540b.hashCode() + (this.f17539a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
