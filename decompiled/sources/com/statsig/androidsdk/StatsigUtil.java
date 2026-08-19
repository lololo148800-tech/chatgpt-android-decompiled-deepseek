package com.statsig.androidsdk;

import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p214Ib.C3669l;
import p214Ib.C3670m;
import p214Ib.EnumC3655A;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigUtil;", "", "<init>", "()V", "", "", "user", "normalizeUser", "(Ljava/util/Map;)Ljava/util/Map;", "Landroid/content/SharedPreferences;", "sharedPrefs", SubscriberAttributeKt.JSON_NAME_KEY, "syncGetFromSharedPrefs$build_release", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;", "syncGetFromSharedPrefs", "value", "Lmm/C;", "saveStringToSharedPrefs$build_release", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "saveStringToSharedPrefs", "removeFromSharedPrefs$build_release", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "removeFromSharedPrefs", "getFromSharedPrefs$build_release", "getFromSharedPrefs", "LIb/l;", "getGson$build_release", "()LIb/l;", "getGson", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StatsigUtil {
    public static final StatsigUtil INSTANCE = new StatsigUtil();
    private static final CoroutineDispatcherProvider dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);

    private StatsigUtil() {
    }

    public final Object getFromSharedPrefs$build_release(SharedPreferences sharedPreferences, String str, InterfaceC18770c<? super String> interfaceC18770c) {
        if (sharedPreferences == null) {
            return null;
        }
        return AbstractC0575H.m1168P(dispatcherProvider.getIo(), new StatsigUtil$getFromSharedPrefs$2(sharedPreferences, str, null), interfaceC18770c);
    }

    public final C3669l getGson$build_release() {
        C3670m c3670m = new C3670m();
        c3670m.f11169l = EnumC3655A.f11140o0;
        return c3670m.m4378a();
    }

    public final Map<String, Object> normalizeUser(Map<String, ? extends Object> user) {
        if (user == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : user.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                Object[] objArr = (Object[]) value;
                int length = objArr.length;
                ArrayList arrayList = new ArrayList();
                for (Object obj : objArr) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                if (length == arrayList.size()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if ((value instanceof String) || (value instanceof Boolean) || (value instanceof Double)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final Object removeFromSharedPrefs$build_release(SharedPreferences sharedPreferences, String str, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        Object objM1168P;
        C17296C c17296c = C17296C.f55119a;
        return (sharedPreferences != null && (objM1168P = AbstractC0575H.m1168P(dispatcherProvider.getIo(), new StatsigUtil$removeFromSharedPrefs$2(sharedPreferences, str, null), interfaceC18770c)) == EnumC19250a.f61036Y) ? objM1168P : c17296c;
    }

    public final Object saveStringToSharedPrefs$build_release(SharedPreferences sharedPreferences, String str, String str2, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        Object objM1168P;
        C17296C c17296c = C17296C.f55119a;
        return (sharedPreferences != null && (objM1168P = AbstractC0575H.m1168P(dispatcherProvider.getIo(), new StatsigUtil$saveStringToSharedPrefs$2(sharedPreferences, str, str2, null), interfaceC18770c)) == EnumC19250a.f61036Y) ? objM1168P : c17296c;
    }

    public final String syncGetFromSharedPrefs$build_release(SharedPreferences sharedPrefs, String key) {
        AbstractC16544l.m18094g(key, "key");
        if (sharedPrefs == null) {
            return null;
        }
        try {
            return sharedPrefs.getString(key, null);
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
