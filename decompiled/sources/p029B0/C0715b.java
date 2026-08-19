package p029B0;

import java.util.List;
import p586Y0.C9566r;

/* JADX INFO: renamed from: B0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0715b {

    /* JADX INFO: renamed from: a */
    public final int f2069a;

    /* JADX INFO: renamed from: b */
    public final C9566r f2070b;

    /* JADX INFO: renamed from: c */
    public final C9566r f2071c;

    public C0715b(List list, List list2, int i10) {
        this.f2069a = i10;
        C9566r c9566r = new C9566r();
        c9566r.addAll(list);
        this.f2070b = c9566r;
        C9566r c9566r2 = new C9566r();
        c9566r2.addAll(list2);
        this.f2071c = c9566r2;
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer");
        }
        if (this.f2071c.size() + this.f2070b.size() <= i10) {
            return;
        }
        throw new IllegalArgumentException(("Initial list of undo and redo operations have a size=(" + (this.f2071c.size() + this.f2070b.size()) + ") greater than the given capacity=(" + i10 + ").").toString());
    }
}
