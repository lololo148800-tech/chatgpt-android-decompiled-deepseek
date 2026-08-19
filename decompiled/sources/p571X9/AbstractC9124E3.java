package p571X9;

import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: X9.E3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9124E3 {
    /* JADX INFO: renamed from: a */
    public static final Object[] m9655a(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC17678l.m19308o(0, i10, 6, objArr, objArr2);
        AbstractC17678l.m19304k(i10 + 2, i10, objArr.length, objArr, objArr2);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public static final Object[] m9656b(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC17678l.m19308o(0, i10, 6, objArr, objArr2);
        AbstractC17678l.m19304k(i10, i10 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: c */
    public static final Object[] m9657c(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC17678l.m19308o(0, i10, 6, objArr, objArr2);
        AbstractC17678l.m19304k(i10, i10 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: d */
    public static final int m9658d(int i10, int i11) {
        return (i10 >> i11) & 31;
    }
}
