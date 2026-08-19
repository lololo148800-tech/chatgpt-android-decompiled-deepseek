package p228J;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p001A.C0011F0;
import p001A.C0063g0;
import p007A5.C0376k;
import p080D0.C1817m0;
import p523V9.AbstractC8072d6;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: J.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3863t0 extends AbstractC3855p0 {

    /* JADX INFO: renamed from: i */
    public final C0376k f11671i = new C0376k(6);

    /* JADX INFO: renamed from: j */
    public boolean f11672j = true;

    /* JADX INFO: renamed from: k */
    public boolean f11673k = false;

    /* JADX INFO: renamed from: l */
    public final ArrayList f11674l = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m4588a(C3865u0 c3865u0) {
        Object objMo39b;
        C3799E c3799e = c3865u0.f11683g;
        int i10 = c3799e.f11484c;
        C0063g0 c0063g0 = this.f11656b;
        if (i10 != -1) {
            this.f11673k = true;
            int i11 = c0063g0.f283a;
            Integer numValueOf = Integer.valueOf(i10);
            List list = C3865u0.f11676i;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i11))) {
                i10 = i11;
            }
            c0063g0.f283a = i10;
        }
        C3828c c3828c = C3799E.f11481k;
        Object objMo39b2 = C3836g.f11605f;
        C3835f0 c3835f0 = c3799e.f11483b;
        try {
            objMo39b2 = c3835f0.mo39b(c3828c);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objMo39b2;
        Objects.requireNonNull(range);
        Range range2 = C3836g.f11605f;
        if (!range.equals(range2)) {
            C3825a0 c3825a0 = (C3825a0) c0063g0.f287e;
            C3828c c3828c2 = C3799E.f11481k;
            c3825a0.getClass();
            try {
                objMo39b = c3825a0.mo39b(c3828c2);
            } catch (IllegalArgumentException unused2) {
                objMo39b = range2;
            }
            if (((Range) objMo39b).equals(range2)) {
                ((C3825a0) c0063g0.f287e).m4561x(C3799E.f11481k, range);
            } else {
                C3825a0 c3825a1 = (C3825a0) c0063g0.f287e;
                C3828c c3828c3 = C3799E.f11481k;
                Object objMo39b3 = C3836g.f11605f;
                c3825a1.getClass();
                try {
                    objMo39b3 = c3825a1.mo39b(c3828c3);
                } catch (IllegalArgumentException unused3) {
                }
                if (!((Range) objMo39b3).equals(range)) {
                    this.f11672j = false;
                    AbstractC8072d6.m8486c("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                }
            }
        }
        int iM4504b = c3799e.m4504b();
        if (iM4504b != 0) {
            c0063g0.getClass();
            if (iM4504b != 0) {
                ((C3825a0) c0063g0.f287e).m4561x(InterfaceC3800E0.f11494H, Integer.valueOf(iM4504b));
            }
        }
        int iM4505c = c3799e.m4505c();
        if (iM4505c != 0) {
            c0063g0.getClass();
            if (iM4505c != 0) {
                ((C3825a0) c0063g0.f287e).m4561x(InterfaceC3800E0.f11495J, Integer.valueOf(iM4505c));
            }
        }
        C3799E c3799e2 = c3865u0.f11683g;
        ((C3829c0) c0063g0.f289g).f11718a.putAll((Map) c3799e2.f11488g.f11718a);
        this.f11657c.addAll(c3865u0.f11679c);
        this.f11658d.addAll(c3865u0.f11680d);
        c0063g0.m241a(c3799e2.f11486e);
        this.f11659e.addAll(c3865u0.f11681e);
        InterfaceC3861s0 interfaceC3861s0 = c3865u0.f11682f;
        if (interfaceC3861s0 != null) {
            this.f11674l.add(interfaceC3861s0);
        }
        InputConfiguration inputConfiguration = c3865u0.f11684h;
        if (inputConfiguration != null) {
            this.f11661g = inputConfiguration;
        }
        LinkedHashSet<C3832e> linkedHashSet = this.f11655a;
        linkedHashSet.addAll(c3865u0.f11677a);
        HashSet hashSet = (HashSet) c0063g0.f286d;
        hashSet.addAll(DesugarCollections.unmodifiableList(c3799e.f11482a));
        ArrayList arrayList = new ArrayList();
        for (C3832e c3832e : linkedHashSet) {
            arrayList.add(c3832e.f11597a);
            Iterator it = c3832e.f11598b.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC3810L) it.next());
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            AbstractC8072d6.m8486c("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.f11672j = false;
        }
        C3832e c3832e2 = c3865u0.f11678b;
        if (c3832e2 != null) {
            C3832e c3832e3 = this.f11662h;
            if (c3832e3 == c3832e2 || c3832e3 == null) {
                this.f11662h = c3832e2;
            } else {
                AbstractC8072d6.m8486c("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.f11672j = false;
            }
        }
        c0063g0.m243c(c3835f0);
    }

    /* JADX INFO: renamed from: b */
    public final C3865u0 m4589b() {
        if (!this.f11672j) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList = new ArrayList(this.f11655a);
        C0376k c0376k = this.f11671i;
        if (c0376k.f1278Z) {
            Collections.sort(arrayList, new C1817m0(c0376k, 2));
        }
        return new C3865u0(arrayList, new ArrayList(this.f11657c), new ArrayList(this.f11658d), new ArrayList(this.f11659e), this.f11656b.m244d(), !this.f11674l.isEmpty() ? new C0011F0(this, 4) : null, this.f11661g, this.f11662h);
    }
}
