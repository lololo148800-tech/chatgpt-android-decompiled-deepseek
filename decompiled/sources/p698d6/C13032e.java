package p698d6;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Locale;
import p117Eb.C2392v;
import p520V5.C7781j;
import p571X9.AbstractC9306j0;
import p604Yk.C10077b;
import p658b5.C11232c;
import p660b6.C11249a;
import p660b6.C11250b;
import p660b6.C11252d;

/* JADX INFO: renamed from: d6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13032e {

    /* JADX INFO: renamed from: a */
    public final List f41376a;

    /* JADX INFO: renamed from: b */
    public final C7781j f41377b;

    /* JADX INFO: renamed from: c */
    public final String f41378c;

    /* JADX INFO: renamed from: d */
    public final long f41379d;

    /* JADX INFO: renamed from: e */
    public final int f41380e;

    /* JADX INFO: renamed from: f */
    public final long f41381f;

    /* JADX INFO: renamed from: g */
    public final String f41382g;

    /* JADX INFO: renamed from: h */
    public final List f41383h;

    /* JADX INFO: renamed from: i */
    public final C11252d f41384i;

    /* JADX INFO: renamed from: j */
    public final int f41385j;

    /* JADX INFO: renamed from: k */
    public final int f41386k;

    /* JADX INFO: renamed from: l */
    public final int f41387l;

    /* JADX INFO: renamed from: m */
    public final float f41388m;

    /* JADX INFO: renamed from: n */
    public final float f41389n;

    /* JADX INFO: renamed from: o */
    public final float f41390o;

    /* JADX INFO: renamed from: p */
    public final float f41391p;

    /* JADX INFO: renamed from: q */
    public final C11249a f41392q;

    /* JADX INFO: renamed from: r */
    public final C11232c f41393r;

    /* JADX INFO: renamed from: s */
    public final C11250b f41394s;

    /* JADX INFO: renamed from: t */
    public final List f41395t;

    /* JADX INFO: renamed from: u */
    public final int f41396u;

    /* JADX INFO: renamed from: v */
    public final boolean f41397v;

    /* JADX INFO: renamed from: w */
    public final C10077b f41398w;

    /* JADX INFO: renamed from: x */
    public final C2392v f41399x;

    /* JADX INFO: renamed from: y */
    public final int f41400y;

    public C13032e(List list, C7781j c7781j, String str, long j10, int i10, long j11, String str2, List list2, C11252d c11252d, int i11, int i12, int i13, float f10, float f11, float f12, float f13, C11249a c11249a, C11232c c11232c, List list3, int i14, C11250b c11250b, boolean z6, C10077b c10077b, C2392v c2392v, int i15) {
        this.f41376a = list;
        this.f41377b = c7781j;
        this.f41378c = str;
        this.f41379d = j10;
        this.f41380e = i10;
        this.f41381f = j11;
        this.f41382g = str2;
        this.f41383h = list2;
        this.f41384i = c11252d;
        this.f41385j = i11;
        this.f41386k = i12;
        this.f41387l = i13;
        this.f41388m = f10;
        this.f41389n = f11;
        this.f41390o = f12;
        this.f41391p = f13;
        this.f41392q = c11249a;
        this.f41393r = c11232c;
        this.f41395t = list3;
        this.f41396u = i14;
        this.f41394s = c11250b;
        this.f41397v = z6;
        this.f41398w = c10077b;
        this.f41399x = c2392v;
        this.f41400y = i15;
    }

    /* JADX INFO: renamed from: a */
    public final String m14784a(String str) {
        int i10;
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(str);
        sbM9893l.append(this.f41378c);
        sbM9893l.append(Separators.RETURN);
        C7781j c7781j = this.f41377b;
        C13032e c13032e = (C13032e) c7781j.f24588i.m14664d(this.f41381f);
        if (c13032e != null) {
            sbM9893l.append("\t\tParents: ");
            sbM9893l.append(c13032e.f41378c);
            for (C13032e c13032e2 = (C13032e) c7781j.f24588i.m14664d(c13032e.f41381f); c13032e2 != null; c13032e2 = (C13032e) c7781j.f24588i.m14664d(c13032e2.f41381f)) {
                sbM9893l.append("->");
                sbM9893l.append(c13032e2.f41378c);
            }
            sbM9893l.append(str);
            sbM9893l.append(Separators.RETURN);
        }
        List list = this.f41383h;
        if (!list.isEmpty()) {
            sbM9893l.append(str);
            sbM9893l.append("\tMasks: ");
            sbM9893l.append(list.size());
            sbM9893l.append(Separators.RETURN);
        }
        int i11 = this.f41385j;
        if (i11 != 0 && (i10 = this.f41386k) != 0) {
            sbM9893l.append(str);
            sbM9893l.append("\tBackground: ");
            sbM9893l.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f41387l)));
        }
        List list2 = this.f41376a;
        if (!list2.isEmpty()) {
            sbM9893l.append(str);
            sbM9893l.append("\tShapes:\n");
            for (Object obj : list2) {
                sbM9893l.append(str);
                sbM9893l.append("\t\t");
                sbM9893l.append(obj);
                sbM9893l.append(Separators.RETURN);
            }
        }
        return sbM9893l.toString();
    }

    public final String toString() {
        return m14784a("");
    }
}
