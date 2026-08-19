package p607Yo;

import java.util.ArrayList;
import p667bp.AbstractC11538a;
import p690cp.C12932r;

/* JADX INFO: renamed from: Yo.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C10125n {

    /* JADX INFO: renamed from: e */
    public StringBuilder f30018e;

    /* JADX INFO: renamed from: f */
    public String f30019f;

    /* JADX INFO: renamed from: g */
    public char f30020g;

    /* JADX INFO: renamed from: h */
    public StringBuilder f30021h;

    /* JADX INFO: renamed from: a */
    public int f30014a = 1;

    /* JADX INFO: renamed from: b */
    public final ArrayList f30015b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f30016c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f30017d = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f30022i = false;

    /* JADX INFO: renamed from: a */
    public final void m10722a() {
        if (this.f30022i) {
            String strM12930c = AbstractC11538a.m12930c(this.f30019f);
            StringBuilder sb2 = this.f30021h;
            String strM12930c2 = sb2 != null ? AbstractC11538a.m12930c(sb2.toString()) : null;
            String string = this.f30018e.toString();
            C12932r c12932r = new C12932r();
            c12932r.f41088g = string;
            c12932r.f41089h = strM12930c;
            c12932r.f41090i = strM12930c2;
            ArrayList arrayList = this.f30017d;
            c12932r.m14597i(arrayList);
            arrayList.clear();
            this.f30016c.add(c12932r);
            this.f30018e = null;
            this.f30022i = false;
            this.f30019f = null;
            this.f30021h = null;
        }
    }
}
