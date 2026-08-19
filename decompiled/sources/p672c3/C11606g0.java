package p672c3;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import mm.C17296C;
import p523V9.AbstractC8118j4;
import p637a3.AbstractC10494k;
import p717e3.C13276i;
import p845k3.C16329f;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: c3.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11606g0 {

    /* JADX INFO: renamed from: g */
    public static final C11641y f35104g = new C11641y();

    /* JADX INFO: renamed from: a */
    public final Context f35105a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f35106b;

    /* JADX INFO: renamed from: c */
    public int f35107c;

    /* JADX INFO: renamed from: d */
    public final int f35108d;

    /* JADX INFO: renamed from: e */
    public final Set f35109e;

    /* JADX INFO: renamed from: f */
    public final Set f35110f;

    public C11606g0(Context context, LinkedHashMap linkedHashMap, int i10, int i11, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f35105a = context;
        this.f35106b = linkedHashMap;
        this.f35107c = i10;
        this.f35108d = i11;
        this.f35109e = linkedHashSet;
        this.f35110f = set;
    }

    /* JADX INFO: renamed from: a */
    public final int m12980a(AbstractC10494k abstractC10494k) {
        C13276i c13276iM8617c = AbstractC8118j4.m8617c(abstractC10494k);
        synchronized (this) {
            Integer num = (Integer) this.f35106b.get(c13276iM8617c);
            if (num != null) {
                int iIntValue = num.intValue();
                this.f35109e.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i10 = this.f35107c;
            while (this.f35110f.contains(Integer.valueOf(i10))) {
                i10 = (i10 + 1) % AbstractC11614k0.f35158c;
                if (i10 == this.f35107c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.f35107c = (i10 + 1) % AbstractC11614k0.f35158c;
            this.f35109e.add(Integer.valueOf(i10));
            this.f35110f.add(Integer.valueOf(i10));
            this.f35106b.put(c13276iM8617c, Integer.valueOf(i10));
            return i10;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m12981b(C11607h c11607h) {
        Object objM17922d = C16329f.f50659a.m17922d(this.f35105a, C11618m0.f35180a, "appWidgetLayout-" + this.f35108d, new C11604f0(this, null), c11607h);
        return objM17922d == EnumC19250a.f61036Y ? objM17922d : C17296C.f55119a;
    }
}
