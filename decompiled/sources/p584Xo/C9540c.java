package p584Xo;

import java.util.ArrayList;
import java.util.List;
import p228J.C3847l0;
import p544W9.AbstractC8495I3;
import p560Wo.C8982a;
import p560Wo.C8983b;
import p560Wo.C8984c;
import p560Wo.C8985d;
import p560Wo.C8986e;
import p607Yo.C10112a;
import p607Yo.C10119h;
import p607Yo.C10124m;
import p690cp.AbstractC12915a;
import p690cp.C12940z;
import p712dp.C13191g;
import p756fp.AbstractC13719a;

/* JADX INFO: renamed from: Xo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9540c extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final C8982a f28696a = new C8982a();

    /* JADX INFO: renamed from: b */
    public final ArrayList f28697b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f28698c;

    /* JADX INFO: renamed from: d */
    public boolean f28699d;

    public C9540c(ArrayList arrayList, C13191g c13191g) {
        ArrayList arrayList2 = new ArrayList();
        this.f28697b = arrayList2;
        this.f28699d = true;
        this.f28698c = arrayList;
        arrayList2.add(c13191g);
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m10033l(C13191g c13191g) {
        CharSequence charSequence = c13191g.f41860a;
        int iM9157e = AbstractC8495I3.m9157e(0, charSequence.length(), charSequence);
        int length = charSequence.length();
        if (charSequence.charAt(iM9157e) == '|') {
            iM9157e++;
            length = AbstractC8495I3.m9158f(charSequence.length() - 1, iM9157e, charSequence) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = iM9157e;
        while (iM9157e < length) {
            char cCharAt = charSequence.charAt(iM9157e);
            if (cCharAt == '\\') {
                int i11 = iM9157e + 1;
                if (i11 >= length || charSequence.charAt(i11) != '|') {
                    sb2.append('\\');
                } else {
                    sb2.append('|');
                    iM9157e = i11;
                }
            } else if (cCharAt != '|') {
                sb2.append(cCharAt);
            } else {
                arrayList.add(new C13191g(sb2.toString(), c13191g.m14847a(i10, iM9157e).f41861b));
                sb2.setLength(0);
                i10 = iM9157e + 1;
            }
            iM9157e++;
        }
        if (sb2.length() > 0) {
            arrayList.add(new C13191g(sb2.toString(), c13191g.m14847a(i10, c13191g.f41860a.length()).f41861b));
        }
        return arrayList;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: a */
    public final void mo7964a(C13191g c13191g) {
        this.f28697b.add(c13191g);
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: d */
    public final boolean mo10034d() {
        return this.f28699d;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        return this.f28696a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: i */
    public final void mo10035i(C10124m c10124m) {
        C8982a c8982a = this.f28696a;
        List listM14594e = c8982a.m14594e();
        C12940z c12940z = !listM14594e.isEmpty() ? (C12940z) listM14594e.get(0) : null;
        C8985d c8985d = new C8985d();
        if (c12940z != null) {
            c8985d.m14592b(c12940z);
        }
        c8982a.m14593c(c8985d);
        C8986e c8986e = new C8986e();
        c8986e.m14597i(c8985d.m14594e());
        c8985d.m14593c(c8986e);
        ArrayList arrayList = this.f28697b;
        ArrayList arrayListM10033l = m10033l((C13191g) arrayList.get(0));
        int size = arrayListM10033l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8984c c8984cM10036k = m10036k((C13191g) arrayListM10033l.get(i10), i10, c10124m);
            c8984cM10036k.f27424g = true;
            c8986e.m14593c(c8984cM10036k);
        }
        int i11 = 2;
        C8983b c8983b = null;
        while (i11 < arrayList.size()) {
            C13191g c13191g = (C13191g) arrayList.get(i11);
            C12940z c12940z2 = i11 < listM14594e.size() ? (C12940z) listM14594e.get(i11) : null;
            ArrayList arrayListM10033l2 = m10033l(c13191g);
            C8986e c8986e2 = new C8986e();
            if (c12940z2 != null) {
                c8986e2.m14592b(c12940z2);
            }
            int i12 = 0;
            while (i12 < size) {
                c8986e2.m14593c(m10036k(i12 < arrayListM10033l2.size() ? (C13191g) arrayListM10033l2.get(i12) : new C13191g("", null), i12, c10124m));
                i12++;
            }
            if (c8983b == null) {
                c8983b = new C8983b();
                c8982a.m14593c(c8983b);
            }
            c8983b.m14593c(c8986e2);
            c8983b.m14592b(c12940z2);
            i11++;
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        CharSequence charSequence = c10119h.f29969a.f41860a;
        int iM9154b = AbstractC8495I3.m9154b('|', charSequence, c10119h.f29974f);
        if (iM9154b == -1) {
            return null;
        }
        if (iM9154b != c10119h.f29974f || AbstractC8495I3.m9157e(iM9154b + 1, charSequence.length(), charSequence) != charSequence.length()) {
            return C10112a.m10688a(c10119h.f29971c);
        }
        this.f28699d = false;
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C8984c m10036k(C13191g c13191g, int i10, C10124m c10124m) {
        C8984c c8984c = new C8984c();
        C12940z c12940z = c13191g.f41861b;
        if (c12940z != null) {
            c8984c.m14592b(c12940z);
        }
        ArrayList arrayList = this.f28698c;
        if (i10 < arrayList.size()) {
            c8984c.f27425h = ((C9539b) arrayList.get(i10)).f28695a;
        }
        CharSequence charSequence = c13191g.f41860a;
        int iM9157e = AbstractC8495I3.m9157e(0, charSequence.length(), charSequence);
        C13191g c13191gM14847a = c13191g.m14847a(iM9157e, AbstractC8495I3.m9158f(charSequence.length() - 1, iM9157e, charSequence) + 1);
        C3847l0 c3847l0 = new C3847l0(1);
        c3847l0.f11629a.add(c13191gM14847a);
        c10124m.m10718e(c3847l0, c8984c);
        return c8984c;
    }
}
