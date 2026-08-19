package p026Ao;

import java.util.RandomAccess;
import p909nm.AbstractC17671e;

/* JADX INFO: renamed from: Ao.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C0653B extends AbstractC17671e implements RandomAccess {

    /* JADX INFO: renamed from: Y */
    public final C0678l[] f1908Y;

    /* JADX INFO: renamed from: Z */
    public final int[] f1909Z;

    public C0653B(C0678l[] c0678lArr, int[] iArr) {
        this.f1908Y = c0678lArr;
        this.f1909Z = iArr;
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0678l) {
            return super.contains((C0678l) obj);
        }
        return false;
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        return this.f1908Y.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f1908Y[i10];
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0678l) {
            return super.indexOf((C0678l) obj);
        }
        return -1;
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0678l) {
            return super.lastIndexOf((C0678l) obj);
        }
        return -1;
    }
}
