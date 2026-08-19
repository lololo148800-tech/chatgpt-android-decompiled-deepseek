package ch;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p624Zg.C10337G;
import p624Zg.C10385q;
import p624Zg.C10386r;
import p624Zg.C10387s;
import p624Zg.EnumC10335E;
import p909nm.AbstractC17660E;

/* JADX INFO: renamed from: ch.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11748b {
    /* JADX INFO: renamed from: a */
    public static final C10385q m13043a(CustomerInfo customerInfo) {
        AbstractC16544l.m18094g(customerInfo, "<this>");
        Map<String, EntitlementInfo> active = customerInfo.getEntitlements().getActive();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(active.size()));
        Iterator<T> it = active.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String value = (String) entry.getKey();
            AbstractC16544l.m18094g(value, "value");
            linkedHashMap.put(new C10386r(value), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            EntitlementInfo entitlementInfo = (EntitlementInfo) entry2.getValue();
            String value2 = entitlementInfo.getIdentifier();
            AbstractC16544l.m18094g(value2, "value");
            linkedHashMap2.put(key, new C10387s(value2, entitlementInfo.getWillRenew(), entitlementInfo.isSandbox(), entitlementInfo.getLatestPurchaseDate()));
        }
        String value3 = Purchases.INSTANCE.getSharedInstance().getAppUserID();
        AbstractC16544l.m18094g(value3, "value");
        return new C10385q(value3, customerInfo.getManagementURL(), linkedHashMap2);
    }

    /* JADX INFO: renamed from: b */
    public static final C10337G m13044b(Package r6) {
        EnumC10335E enumC10335E;
        AbstractC16544l.m18094g(r6, "<this>");
        PackageType packageType = r6.getPackageType();
        AbstractC16544l.m18094g(packageType, "<this>");
        C3430e c3430eM8749b = AbstractC8168p6.m8749b("toPurchasePackageDuration", null);
        int i10 = AbstractC11747a.f35628a[packageType.ordinal()];
        if (i10 == 1) {
            enumC10335E = EnumC10335E.f30663Y;
        } else if (i10 == 2) {
            enumC10335E = EnumC10335E.f30664Z;
        } else if (i10 == 3) {
            enumC10335E = EnumC10335E.f30665o0;
        } else if (i10 != 4) {
            AbstractC8160o6.m8731f(c3430eM8749b, "Unsupported RevenueCat package type: " + packageType, null, null, 6);
            enumC10335E = null;
        } else {
            enumC10335E = EnumC10335E.f30666p0;
        }
        if (enumC10335E == null) {
            return null;
        }
        String value = r6.getIdentifier();
        AbstractC16544l.m18094g(value, "value");
        String formatted = r6.getProduct().getPrice().getFormatted();
        SubscriptionOptions subscriptionOptions = r6.getProduct().getSubscriptionOptions();
        return new C10337G(value, (subscriptionOptions != null ? subscriptionOptions.getFreeTrial() : null) != null, enumC10335E, formatted);
    }
}
