package p1016t3;

import java.util.Arrays;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.T */
/* JADX INFO: loaded from: classes.dex */
public final class C19769T {

    /* JADX INFO: renamed from: a */
    public final int f62642a;

    /* JADX INFO: renamed from: b */
    public final C19765O f62643b;

    /* JADX INFO: renamed from: c */
    public final boolean f62644c;

    /* JADX INFO: renamed from: d */
    public final int[] f62645d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f62646e;

    static {
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
        AbstractC20817s.m21425z(3);
        AbstractC20817s.m21425z(4);
    }

    public C19769T(C19765O c19765o, boolean z6, int[] iArr, boolean[] zArr) {
        int i10 = c19765o.f62602a;
        this.f62642a = i10;
        boolean z10 = false;
        AbstractC20800b.m21316d(i10 == iArr.length && i10 == zArr.length);
        this.f62643b = c19765o;
        if (z6 && i10 > 1) {
            z10 = true;
        }
        this.f62644c = z10;
        this.f62645d = (int[]) iArr.clone();
        this.f62646e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19769T.class != obj.getClass()) {
            return false;
        }
        C19769T c19769t = (C19769T) obj;
        return this.f62644c == c19769t.f62644c && this.f62643b.equals(c19769t.f62643b) && Arrays.equals(this.f62645d, c19769t.f62645d) && Arrays.equals(this.f62646e, c19769t.f62646e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f62646e) + ((Arrays.hashCode(this.f62645d) + (((this.f62643b.hashCode() * 31) + (this.f62644c ? 1 : 0)) * 31)) * 31);
    }
}
