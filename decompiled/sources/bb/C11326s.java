package bb;

import java.util.Comparator;

/* JADX INFO: renamed from: bb.s */
/* JADX INFO: loaded from: classes.dex */
public final class C11326s extends AbstractC11328u {
    /* JADX INFO: renamed from: f */
    public static AbstractC11328u m12754f(int i10) {
        if (i10 < 0) {
            return AbstractC11328u.f34257b;
        }
        return i10 > 0 ? AbstractC11328u.f34258c : AbstractC11328u.f34256a;
    }

    @Override // bb.AbstractC11328u
    /* JADX INFO: renamed from: a */
    public final AbstractC11328u mo12755a(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else {
            i12 = i10 > i11 ? 1 : 0;
        }
        return m12754f(i12);
    }

    @Override // bb.AbstractC11328u
    /* JADX INFO: renamed from: b */
    public final AbstractC11328u mo12756b(Object obj, Object obj2, Comparator comparator) {
        return m12754f(comparator.compare(obj, obj2));
    }

    @Override // bb.AbstractC11328u
    /* JADX INFO: renamed from: c */
    public final AbstractC11328u mo12757c(boolean z6, boolean z10) {
        int i10;
        if (z6 == z10) {
            i10 = 0;
        } else {
            i10 = z6 ? 1 : -1;
        }
        return m12754f(i10);
    }

    @Override // bb.AbstractC11328u
    /* JADX INFO: renamed from: d */
    public final AbstractC11328u mo12758d(boolean z6, boolean z10) {
        int i10;
        if (z10 == z6) {
            i10 = 0;
        } else {
            i10 = z10 ? 1 : -1;
        }
        return m12754f(i10);
    }

    @Override // bb.AbstractC11328u
    /* JADX INFO: renamed from: e */
    public final int mo12759e() {
        return 0;
    }
}
