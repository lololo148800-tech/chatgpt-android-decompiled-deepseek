package p775h2;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p571X9.AbstractC9306j0;
import p655b2.C11219c;
import p760g2.AbstractC13813j;
import p760g2.C13807d;
import p760g2.C13808e;
import p959q8.C18639a;

/* JADX INFO: renamed from: h2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C14385o {

    /* JADX INFO: renamed from: f */
    public static int f45098f;

    /* JADX INFO: renamed from: a */
    public ArrayList f45099a;

    /* JADX INFO: renamed from: b */
    public int f45100b;

    /* JADX INFO: renamed from: c */
    public int f45101c;

    /* JADX INFO: renamed from: d */
    public ArrayList f45102d;

    /* JADX INFO: renamed from: e */
    public int f45103e;

    /* JADX INFO: renamed from: a */
    public final void m15880a(ArrayList arrayList) {
        int size = this.f45099a.size();
        if (this.f45103e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                C14385o c14385o = (C14385o) arrayList.get(i10);
                if (this.f45103e == c14385o.f45100b) {
                    m15882c(this.f45101c, c14385o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m15881b(C11219c c11219c, int i10) {
        int iM12456n;
        int iM12456n2;
        ArrayList arrayList = this.f45099a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C13808e c13808e = ((C13807d) arrayList.get(0)).f43649U;
        c11219c.m12475t();
        c13808e.mo15340c(c11219c, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((C13807d) arrayList.get(i11)).mo15340c(c11219c, false);
        }
        if (i10 == 0 && c13808e.f43698A0 > 0) {
            AbstractC13813j.m15417a(c13808e, c11219c, arrayList, 0);
        }
        if (i10 == 1 && c13808e.f43699B0 > 0) {
            AbstractC13813j.m15417a(c13808e, c11219c, arrayList, 1);
        }
        try {
            c11219c.m12471p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f45102d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            C13807d c13807d = (C13807d) arrayList.get(i12);
            C18639a c18639a = new C18639a(26);
            new WeakReference(c13807d);
            C11219c.m12456n(c13807d.f43638J);
            C11219c.m12456n(c13807d.f43639K);
            C11219c.m12456n(c13807d.f43640L);
            C11219c.m12456n(c13807d.f43641M);
            C11219c.m12456n(c13807d.f43642N);
            this.f45102d.add(c18639a);
        }
        if (i10 == 0) {
            iM12456n = C11219c.m12456n(c13808e.f43638J);
            iM12456n2 = C11219c.m12456n(c13808e.f43640L);
            c11219c.m12475t();
        } else {
            iM12456n = C11219c.m12456n(c13808e.f43639K);
            iM12456n2 = C11219c.m12456n(c13808e.f43641M);
            c11219c.m12475t();
        }
        return iM12456n2 - iM12456n;
    }

    /* JADX INFO: renamed from: c */
    public final void m15882c(int i10, C14385o c14385o) {
        for (C13807d c13807d : this.f45099a) {
            ArrayList arrayList = c14385o.f45099a;
            if (!arrayList.contains(c13807d)) {
                arrayList.add(c13807d);
            }
            int i11 = c14385o.f45100b;
            if (i10 == 0) {
                c13807d.f43684o0 = i11;
            } else {
                c13807d.f43686p0 = i11;
            }
        }
        this.f45103e = c14385o.f45100b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f45101c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else {
            str = i10 == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strM11056n = AbstractC10763a.m11056n(sb2, this.f45100b, "] <");
        for (C13807d c13807d : this.f45099a) {
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(strM11056n, Separators.f31991SP);
            sbM9895n.append(c13807d.f43672i0);
            strM11056n = sbM9895n.toString();
        }
        return AbstractC10763a.m11052j(strM11056n, " >");
    }
}
