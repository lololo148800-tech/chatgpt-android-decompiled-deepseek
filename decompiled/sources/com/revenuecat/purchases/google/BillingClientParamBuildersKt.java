package com.revenuecat.purchases.google;

import com.google.android.gms.internal.play_billing.AbstractC11857B;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p105E.C2223b;
import p153Fn.C2942t;
import p594Y9.C9895g4;
import p640a6.C10514i;
import p826j6.C16166t;
import p826j6.C16167u;
import p826j6.C16168v;
import p826j6.C16169w;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m18067d2 = {"", "Lj6/v;", "buildQueryPurchaseHistoryParams", "(Ljava/lang/String;)Lj6/v;", "Lj6/w;", "buildQueryPurchasesParams", "(Ljava/lang/String;)Lj6/w;", "", "productIds", "Lj6/u;", "buildQueryProductDetailsParams", "(Ljava/lang/String;Ljava/util/Set;)Lj6/u;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BillingClientParamBuildersKt {
    public static final C16167u buildQueryProductDetailsParams(String str, Set<String> productIds) {
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(productIds, "productIds");
        Set<String> set = productIds;
        ArrayList<C16166t> arrayList = new ArrayList(AbstractC17682p.m19389r(set, 10));
        for (String str2 : set) {
            C10514i c10514i = new C10514i(1);
            c10514i.f31159b = str2;
            c10514i.f31160c = str;
            if ("first_party".equals(str)) {
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }
            if (c10514i.f31159b == null) {
                throw new IllegalArgumentException("Product id must be provided.");
            }
            if (c10514i.f31160c == null) {
                throw new IllegalArgumentException("Product type must be provided.");
            }
            arrayList.add(new C16166t(c10514i));
        }
        C9895g4 c9895g4 = new C9895g4();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        for (C16166t c16166t : arrayList) {
            if (!"play_pass_subs".equals(c16166t.f50187b)) {
                hashSet.add(c16166t.f50187b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        AbstractC11857B abstractC11857BM13222u = AbstractC11857B.m13222u(arrayList);
        c9895g4.f29409Y = abstractC11857BM13222u;
        if (abstractC11857BM13222u != null) {
            return new C16167u(c9895g4);
        }
        throw new IllegalArgumentException("Product list must be set to a non empty list.");
    }

    public static final C16168v buildQueryPurchaseHistoryParams(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        if (!(str.equals("inapp") ? true : str.equals("subs"))) {
            return null;
        }
        C2223b c2223b = new C2223b();
        c2223b.f6807Y = str;
        return new C16168v(c2223b);
    }

    public static final C16169w buildQueryPurchasesParams(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        if (!(str.equals("inapp") ? true : str.equals("subs"))) {
            return null;
        }
        C2942t c2942t = new C2942t();
        c2942t.f8807Z = str;
        return new C16169w(c2942t);
    }
}
