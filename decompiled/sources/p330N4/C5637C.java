package p330N4;

import android.animation.TimeInterpolator;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p117Eb.C2391u;
import p451Sb.C7102a;
import p544W9.AbstractC8609b4;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: N4.C */
/* JADX INFO: loaded from: classes.dex */
public class C5637C extends AbstractC5673x {

    /* JADX INFO: renamed from: L0 */
    public int f18311L0;

    /* JADX INFO: renamed from: J0 */
    public ArrayList f18309J0 = new ArrayList();

    /* JADX INFO: renamed from: K0 */
    public boolean f18310K0 = true;

    /* JADX INFO: renamed from: M0 */
    public boolean f18312M0 = false;

    /* JADX INFO: renamed from: N0 */
    public int f18313N0 = 0;

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: A */
    public final void mo6046A(AbstractC8609b4 abstractC8609b4) {
        this.f18313N0 |= 8;
        int size = this.f18309J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5673x) this.f18309J0.get(i10)).mo6046A(abstractC8609b4);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: C */
    public final void mo6048C(C7102a c7102a) {
        super.mo6048C(c7102a);
        this.f18313N0 |= 4;
        if (this.f18309J0 != null) {
            for (int i10 = 0; i10 < this.f18309J0.size(); i10++) {
                ((AbstractC5673x) this.f18309J0.get(i10)).mo6048C(c7102a);
            }
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: D */
    public final void mo6049D(C5666q c5666q) {
        this.f18412E0 = c5666q;
        this.f18313N0 |= 2;
        int size = this.f18309J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5673x) this.f18309J0.get(i10)).mo6049D(c5666q);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: F */
    public final void mo6050F(long j10) {
        this.f18415Z = j10;
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: H */
    public final String mo6051H(String str) {
        String strMo6051H = super.mo6051H(str);
        for (int i10 = 0; i10 < this.f18309J0.size(); i10++) {
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(strMo6051H, Separators.RETURN);
            sbM9895n.append(((AbstractC5673x) this.f18309J0.get(i10)).mo6051H(str + "  "));
            strMo6051H = sbM9895n.toString();
        }
        return strMo6051H;
    }

    /* JADX INFO: renamed from: I */
    public final void m6052I(AbstractC5673x abstractC5673x) {
        this.f18309J0.add(abstractC5673x);
        abstractC5673x.f18422u0 = this;
        long j10 = this.f18416o0;
        if (j10 >= 0) {
            abstractC5673x.mo6065z(j10);
        }
        if ((this.f18313N0 & 1) != 0) {
            abstractC5673x.mo6047B(this.f18417p0);
        }
        if ((this.f18313N0 & 2) != 0) {
            abstractC5673x.mo6049D(this.f18412E0);
        }
        if ((this.f18313N0 & 4) != 0) {
            abstractC5673x.mo6048C(this.f18413F0);
        }
        if ((this.f18313N0 & 8) != 0) {
            abstractC5673x.mo6046A(null);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void mo6065z(long j10) {
        ArrayList arrayList;
        this.f18416o0 = j10;
        if (j10 < 0 || (arrayList = this.f18309J0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5673x) this.f18309J0.get(i10)).mo6065z(j10);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void mo6047B(TimeInterpolator timeInterpolator) {
        this.f18313N0 |= 1;
        ArrayList arrayList = this.f18309J0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC5673x) this.f18309J0.get(i10)).mo6047B(timeInterpolator);
            }
        }
        this.f18417p0 = timeInterpolator;
    }

    /* JADX INFO: renamed from: L */
    public final void m6055L(int i10) {
        if (i10 == 0) {
            this.f18310K0 = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException(AbstractC10763a.m11048f(i10, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f18310K0 = false;
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: c */
    public final void mo6056c(C5640F c5640f) {
        if (m6105t(c5640f.f18321b)) {
            for (AbstractC5673x abstractC5673x : this.f18309J0) {
                if (abstractC5673x.m6105t(c5640f.f18321b)) {
                    abstractC5673x.mo6056c(c5640f);
                    c5640f.f18322c.add(abstractC5673x);
                }
            }
        }
    }

    @Override // p330N4.AbstractC5673x
    public final void cancel() {
        super.cancel();
        int size = this.f18309J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5673x) this.f18309J0.get(i10)).cancel();
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: e */
    public final void mo6057e(C5640F c5640f) {
        super.mo6057e(c5640f);
        int size = this.f18309J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5673x) this.f18309J0.get(i10)).mo6057e(c5640f);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: f */
    public final void mo6058f(C5640F c5640f) {
        if (m6105t(c5640f.f18321b)) {
            for (AbstractC5673x abstractC5673x : this.f18309J0) {
                if (abstractC5673x.m6105t(c5640f.f18321b)) {
                    abstractC5673x.mo6058f(c5640f);
                    c5640f.f18322c.add(abstractC5673x);
                }
            }
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: i */
    public final AbstractC5673x clone() {
        C5637C c5637c = (C5637C) super.clone();
        c5637c.f18309J0 = new ArrayList();
        int size = this.f18309J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5673x abstractC5673xClone = ((AbstractC5673x) this.f18309J0.get(i10)).clone();
            c5637c.f18309J0.add(abstractC5673xClone);
            abstractC5673xClone.f18422u0 = c5637c;
        }
        return c5637c;
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: k */
    public final void mo6060k(ViewGroup viewGroup, C2391u c2391u, C2391u c2391u2, ArrayList arrayList, ArrayList arrayList2) {
        long j10 = this.f18415Z;
        int size = this.f18309J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5673x abstractC5673x = (AbstractC5673x) this.f18309J0.get(i10);
            if (j10 > 0 && (this.f18310K0 || i10 == 0)) {
                long j11 = abstractC5673x.f18415Z;
                if (j11 > 0) {
                    abstractC5673x.mo6050F(j11 + j10);
                } else {
                    abstractC5673x.mo6050F(j10);
                }
            }
            abstractC5673x.mo6060k(viewGroup, c2391u, c2391u2, arrayList, arrayList2);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: n */
    public final void mo6061n(FrameLayout frameLayout) {
        super.mo6061n(frameLayout);
        int size = this.f18309J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5673x) this.f18309J0.get(i10)).mo6061n(frameLayout);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: v */
    public final void mo6062v(ViewGroup viewGroup) {
        super.mo6062v(viewGroup);
        int size = this.f18309J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5673x) this.f18309J0.get(i10)).mo6062v(viewGroup);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: x */
    public final void mo6063x(View view) {
        super.mo6063x(view);
        int size = this.f18309J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5673x) this.f18309J0.get(i10)).mo6063x(view);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: y */
    public final void mo6064y() {
        if (this.f18309J0.isEmpty()) {
            m6097G();
            m6102l();
            return;
        }
        C5660k c5660k = new C5660k();
        c5660k.f18381b = this;
        Iterator it = this.f18309J0.iterator();
        while (it.hasNext()) {
            ((AbstractC5673x) it.next()).m6098a(c5660k);
        }
        this.f18311L0 = this.f18309J0.size();
        if (this.f18310K0) {
            Iterator it2 = this.f18309J0.iterator();
            while (it2.hasNext()) {
                ((AbstractC5673x) it2.next()).mo6064y();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f18309J0.size(); i10++) {
            ((AbstractC5673x) this.f18309J0.get(i10 - 1)).m6098a(new C5660k((AbstractC5673x) this.f18309J0.get(i10), 1));
        }
        AbstractC5673x abstractC5673x = (AbstractC5673x) this.f18309J0.get(0);
        if (abstractC5673x != null) {
            abstractC5673x.mo6064y();
        }
    }
}
