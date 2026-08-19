package p624Zg;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: Zg.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C10378l implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final List f30750a;

    /* JADX INFO: renamed from: b */
    public final C10376k f30751b;

    public C10378l(List planPackages, C10376k c10376k) {
        AbstractC16544l.m18094g(planPackages, "planPackages");
        this.f30750a = planPackages;
        this.f30751b = c10376k;
    }

    /* JADX INFO: renamed from: e */
    public static C10378l m10892e(C10378l c10378l, List planPackages, C10376k c10376k, int i10) {
        if ((i10 & 1) != 0) {
            planPackages = c10378l.f30750a;
        }
        if ((i10 & 2) != 0) {
            c10376k = c10378l.f30751b;
        }
        c10378l.getClass();
        AbstractC16544l.m18094g(planPackages, "planPackages");
        return new C10378l(planPackages, c10376k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10378l)) {
            return false;
        }
        C10378l c10378l = (C10378l) obj;
        return AbstractC16544l.m18089b(this.f30750a, c10378l.f30750a) && AbstractC16544l.m18089b(this.f30751b, c10378l.f30751b);
    }

    public final int hashCode() {
        int iHashCode = this.f30750a.hashCode() * 31;
        C10376k c10376k = this.f30751b;
        return iHashCode + (c10376k == null ? 0 : c10376k.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
