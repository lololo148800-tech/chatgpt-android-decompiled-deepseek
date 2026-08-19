package p005A3;

import java.util.TreeSet;

/* JADX INFO: renamed from: A3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0331r {

    /* JADX INFO: renamed from: a */
    public final TreeSet f1147a = new TreeSet(new C0330q());

    /* JADX INFO: renamed from: b */
    public long f1148b;

    /* JADX INFO: renamed from: a */
    public final void m968a(C0334u c0334u, C0335v c0335v) {
        TreeSet treeSet = this.f1147a;
        treeSet.add(c0335v);
        this.f1148b += c0335v.f1123o0;
        while (this.f1148b > 314572800 && !treeSet.isEmpty()) {
            c0334u.m979r((AbstractC0322i) treeSet.first());
        }
    }
}
