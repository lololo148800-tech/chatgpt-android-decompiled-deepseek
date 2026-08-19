package p178H;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p1138z.C21572a;
import p228J.AbstractC3810L;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3836g;
import p228J.C3865u0;
import p228J.InterfaceC3798D0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3806H0;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3864u;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p253K.AbstractC4503n;
import p283L5.AbstractC4941g;
import p326N.InterfaceC5569k;
import p490U.C7531b;
import p817j$.util.Objects;

/* JADX INFO: renamed from: H.u0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3174u0 {

    /* JADX INFO: renamed from: d */
    public InterfaceC3800E0 f9563d;

    /* JADX INFO: renamed from: e */
    public final Object f9564e;

    /* JADX INFO: renamed from: f */
    public InterfaceC3800E0 f9565f;

    /* JADX INFO: renamed from: g */
    public C3836g f9566g;

    /* JADX INFO: renamed from: h */
    public InterfaceC3800E0 f9567h;

    /* JADX INFO: renamed from: i */
    public Rect f9568i;

    /* JADX INFO: renamed from: k */
    public InterfaceC3870x f9570k;

    /* JADX INFO: renamed from: l */
    public InterfaceC3870x f9571l;

    /* JADX INFO: renamed from: a */
    public final HashSet f9560a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Object f9561b = new Object();

    /* JADX INFO: renamed from: c */
    public int f9562c = 2;

    /* JADX INFO: renamed from: j */
    public Matrix f9569j = new Matrix();

    /* JADX INFO: renamed from: m */
    public C3865u0 f9572m = C3865u0.m4590a();

    /* JADX INFO: renamed from: n */
    public C3865u0 f9573n = C3865u0.m4590a();

    public AbstractC3174u0(InterfaceC3800E0 interfaceC3800E0) {
        this.f9564e = interfaceC3800E0;
        this.f9565f = interfaceC3800E0;
    }

    /* JADX INFO: renamed from: A */
    public final void m4007A(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f9572m = (C3865u0) list.get(0);
        if (list.size() > 1) {
            this.f9573n = (C3865u0) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC3810L abstractC3810L : ((C3865u0) it.next()).m4591b()) {
                if (abstractC3810L.f11535j == null) {
                    abstractC3810L.f11535j = getClass();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4008a(InterfaceC3870x interfaceC3870x, InterfaceC3870x interfaceC3870x2, InterfaceC3800E0 interfaceC3800E0, InterfaceC3800E0 interfaceC3800E1) {
        synchronized (this.f9561b) {
            this.f9570k = interfaceC3870x;
            this.f9571l = interfaceC3870x2;
            this.f9560a.add(interfaceC3870x);
            if (interfaceC3870x2 != null) {
                this.f9560a.add(interfaceC3870x2);
            }
        }
        this.f9563d = interfaceC3800E0;
        this.f9567h = interfaceC3800E1;
        this.f9565f = m4016l(interfaceC3870x.mo122r(), this.f9563d, this.f9567h);
        mo3938p();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3870x m4009b() {
        InterfaceC3870x interfaceC3870x;
        synchronized (this.f9561b) {
            interfaceC3870x = this.f9570k;
        }
        return interfaceC3870x;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3864u m4010c() {
        synchronized (this.f9561b) {
            try {
                InterfaceC3870x interfaceC3870x = this.f9570k;
                if (interfaceC3870x == null) {
                    return InterfaceC3864u.f11675i;
                }
                return interfaceC3870x.mo111g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m4011d() {
        InterfaceC3870x interfaceC3870xM4009b = m4009b();
        AbstractC4941g.m5558Q(interfaceC3870xM4009b, "No camera attached to use case: " + this);
        return interfaceC3870xM4009b.mo122r().mo137b();
    }

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC3800E0 mo3936e(boolean z6, InterfaceC3806H0 interfaceC3806H0);

    /* JADX INFO: renamed from: f */
    public final String m4012f() {
        String strMo51v = this.f9565f.mo51v("<UnknownUseCase-" + hashCode() + Separators.GREATER_THAN);
        Objects.requireNonNull(strMo51v);
        return strMo51v;
    }

    /* JADX INFO: renamed from: g */
    public final int m4013g(InterfaceC3870x interfaceC3870x, boolean z6) {
        int iMo143h = interfaceC3870x.mo122r().mo143h(((InterfaceC3818U) this.f9565f).mo4541B());
        return (interfaceC3870x.mo120p() || !z6) ? iMo143h : AbstractC4503n.m5251g(-iMo143h);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC3870x m4014h() {
        InterfaceC3870x interfaceC3870x;
        synchronized (this.f9561b) {
            interfaceC3870x = this.f9571l;
        }
        return interfaceC3870x;
    }

    /* JADX INFO: renamed from: i */
    public Set mo3961i() {
        return Collections.emptySet();
    }

    /* JADX INFO: renamed from: j */
    public abstract InterfaceC3798D0 mo3937j(InterfaceC3805H interfaceC3805H);

    /* JADX INFO: renamed from: k */
    public final boolean m4015k(InterfaceC3870x interfaceC3870x) {
        int iMo4549j = ((InterfaceC3818U) this.f9565f).mo4549j();
        if (iMo4549j == -1 || iMo4549j == 0) {
            return false;
        }
        if (iMo4549j == 1) {
            return true;
        }
        if (iMo4549j == 2) {
            return interfaceC3870x.mo108d();
        }
        throw new AssertionError(AbstractC10763a.m11048f(iMo4549j, "Unknown mirrorMode: "));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J.H, java.lang.Object] */
    /* JADX INFO: renamed from: l */
    public final InterfaceC3800E0 m4016l(InterfaceC3866v interfaceC3866v, InterfaceC3800E0 interfaceC3800E0, InterfaceC3800E0 interfaceC3800E1) {
        C3825a0 c3825a0M4558d;
        if (interfaceC3800E1 != null) {
            c3825a0M4558d = C3825a0.m4559o(interfaceC3800E1);
            c3825a0M4558d.f11604Y.remove(InterfaceC5569k.f18064W);
        } else {
            c3825a0M4558d = C3825a0.m4558d();
        }
        C3828c c3828c = InterfaceC3818U.f11563l;
        ?? r6 = this.f9564e;
        boolean zMo37O = r6.mo37O(c3828c);
        TreeMap treeMap = c3825a0M4558d.f11604Y;
        if (zMo37O || r6.mo37O(InterfaceC3818U.f11567p)) {
            C3828c c3828c2 = InterfaceC3818U.f11571t;
            if (treeMap.containsKey(c3828c2)) {
                treeMap.remove(c3828c2);
            }
        }
        C3828c c3828c3 = InterfaceC3818U.f11571t;
        if (r6.mo37O(c3828c3)) {
            C3828c c3828c4 = InterfaceC3818U.f11569r;
            if (treeMap.containsKey(c3828c4) && ((C7531b) r6.mo39b(c3828c3)).f23874b != null) {
                treeMap.remove(c3828c4);
            }
        }
        Iterator it = r6.mo44k().iterator();
        while (it.hasNext()) {
            AbstractC0168G.m510E(c3825a0M4558d, c3825a0M4558d, r6, (C3828c) it.next());
        }
        if (interfaceC3800E0 != null) {
            for (C3828c c3828c5 : interfaceC3800E0.mo44k()) {
                if (!c3828c5.f11593a.equals(InterfaceC5569k.f18064W.f11593a)) {
                    AbstractC0168G.m510E(c3825a0M4558d, c3825a0M4558d, interfaceC3800E0, c3828c5);
                }
            }
        }
        if (treeMap.containsKey(InterfaceC3818U.f11567p)) {
            C3828c c3828c6 = InterfaceC3818U.f11563l;
            if (treeMap.containsKey(c3828c6)) {
                treeMap.remove(c3828c6);
            }
        }
        C3828c c3828c7 = InterfaceC3818U.f11571t;
        if (treeMap.containsKey(c3828c7)) {
            ((C7531b) c3825a0M4558d.mo39b(c3828c7)).getClass();
        }
        return mo3939r(interfaceC3866v, mo3937j(c3825a0M4558d));
    }

    /* JADX INFO: renamed from: m */
    public final void m4017m() {
        this.f9562c = 1;
        m4019o();
    }

    /* JADX INFO: renamed from: n */
    public final void m4018n() {
        Iterator it = this.f9560a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3172t0) it.next()).mo114j(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4019o() {
        int iM24h = AbstractC0010F.m24h(this.f9562c);
        HashSet hashSet = this.f9560a;
        if (iM24h == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC3172t0) it.next()).mo116l(this);
            }
        } else {
            if (iM24h != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((InterfaceC3172t0) it2.next()).mo109e(this);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract InterfaceC3800E0 mo3939r(InterfaceC3866v interfaceC3866v, InterfaceC3798D0 interfaceC3798D0);

    /* JADX INFO: renamed from: u */
    public abstract C3836g mo3940u(C21572a c21572a);

    /* JADX INFO: renamed from: v */
    public abstract C3836g mo3941v(C3836g c3836g, C3836g c3836g2);

    /* JADX INFO: renamed from: w */
    public abstract void mo3942w();

    /* JADX INFO: renamed from: x */
    public void mo3943x(Matrix matrix) {
        this.f9569j = new Matrix(matrix);
    }

    /* JADX INFO: renamed from: y */
    public void mo3944y(Rect rect) {
        this.f9568i = rect;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [J.E0, java.lang.Object] */
    /* JADX INFO: renamed from: z */
    public final void m4021z(InterfaceC3870x interfaceC3870x) {
        mo3942w();
        synchronized (this.f9561b) {
            try {
                InterfaceC3870x interfaceC3870x2 = this.f9570k;
                if (interfaceC3870x == interfaceC3870x2) {
                    this.f9560a.remove(interfaceC3870x2);
                    this.f9570k = null;
                }
                InterfaceC3870x interfaceC3870x3 = this.f9571l;
                if (interfaceC3870x == interfaceC3870x3) {
                    this.f9560a.remove(interfaceC3870x3);
                    this.f9571l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f9566g = null;
        this.f9568i = null;
        this.f9565f = this.f9564e;
        this.f9563d = null;
        this.f9567h = null;
    }

    /* JADX INFO: renamed from: p */
    public void mo3938p() {
    }

    /* JADX INFO: renamed from: q */
    public void mo3962q() {
    }

    /* JADX INFO: renamed from: s */
    public void mo4020s() {
    }

    /* JADX INFO: renamed from: t */
    public void mo3963t() {
    }
}
