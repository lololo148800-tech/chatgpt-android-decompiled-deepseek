package com.revenuecat.purchases.utils;

import bo.AbstractC11523k;
import co.AbstractC11809J;
import co.C11807H;
import co.C11823m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import livekit.LivekitInternal$NodeStats;
import p1113xn.AbstractC21328v;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m18067d2 = {"Lkotlinx/serialization/json/b;", "", "", "", "asMap", "(Lkotlinx/serialization/json/b;)Ljava/util/Map;", "getExtractedContent", "(Lkotlinx/serialization/json/b;)Ljava/lang/Object;", "extractedContent", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class JsonElementExtensionsKt {
    public static final Map<String, Object> asMap(AbstractC16643b abstractC16643b) {
        AbstractC16544l.m18094g(abstractC16643b, "<this>");
        if (!(abstractC16643b instanceof C16644c)) {
            return null;
        }
        Set<Map.Entry> setEntrySet = AbstractC11523k.m12917j(abstractC16643b).f53331Y.entrySet();
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(setEntrySet, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getKey(), getExtractedContent((AbstractC16643b) entry.getValue()));
        }
        return linkedHashMap;
    }

    private static final Object getExtractedContent(AbstractC16643b abstractC16643b) {
        String strM12913f;
        Long lValueOf = null;
        if (!(abstractC16643b instanceof AbstractC16645d)) {
            if (abstractC16643b instanceof C16642a) {
                C16642a c16642aM12916i = AbstractC11523k.m12916i(abstractC16643b);
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c16642aM12916i, 10));
                Iterator it = c16642aM12916i.f53330Y.iterator();
                while (it.hasNext()) {
                    arrayList.add(getExtractedContent((AbstractC16643b) it.next()));
                }
                return arrayList;
            }
            if (!(abstractC16643b instanceof C16644c)) {
                return null;
            }
            Set<Map.Entry> setEntrySet = AbstractC11523k.m12917j(abstractC16643b).f53331Y.entrySet();
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(setEntrySet, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(entry.getKey(), getExtractedContent((AbstractC16643b) entry.getValue()));
            }
            return linkedHashMap;
        }
        AbstractC16645d abstractC16645dM12918k = AbstractC11523k.m12918k(abstractC16643b);
        if (!abstractC16645dM12918k.mo12923j()) {
            String strMo12922f = abstractC16645dM12918k.mo12922f();
            String[] strArr = AbstractC11809J.f35796a;
            AbstractC16544l.m18094g(strMo12922f, "<this>");
            Object objM12915h = strMo12922f.equalsIgnoreCase("true") ? Boolean.TRUE : strMo12922f.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            if (objM12915h == null && (objM12915h = AbstractC11523k.m12915h(abstractC16645dM12918k)) == null) {
                try {
                    lValueOf = Long.valueOf(new C11807H(abstractC16645dM12918k.mo12922f()).m6925i());
                } catch (C11823m unused) {
                }
                if (lValueOf != null) {
                    return lValueOf;
                }
                objM12915h = AbstractC21328v.m21720g(abstractC16645dM12918k.mo12922f());
                if (objM12915h == null && (objM12915h = AbstractC21328v.m21719f(abstractC16645dM12918k.mo12922f())) == null) {
                    strM12913f = AbstractC11523k.m12913f(abstractC16645dM12918k);
                }
            }
            return objM12915h;
        }
        strM12913f = abstractC16645dM12918k.mo12922f();
        return strM12913f;
    }
}
