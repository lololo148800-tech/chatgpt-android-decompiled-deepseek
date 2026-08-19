package p692d0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p714e0.AbstractC13253a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C12960M implements Cloneable {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ boolean f41155Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ int[] f41156Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object[] f41157o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ int f41158p0;

    public C12960M(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f41156Z = new int[i14];
        this.f41157o0 = new Object[i14];
    }

    /* JADX INFO: renamed from: a */
    public final void m14650a(int i10, Object obj) {
        int i11 = this.f41158p0;
        if (i11 != 0 && i10 <= this.f41156Z[i11 - 1]) {
            m14654e(i10, obj);
            return;
        }
        if (this.f41155Y && i11 >= this.f41156Z.length) {
            AbstractC12978q.m14672a(this);
        }
        int i12 = this.f41158p0;
        if (i12 >= this.f41156Z.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f41156Z, i16);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f41156Z = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f41157o0, i16);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f41157o0 = objArrCopyOf;
        }
        this.f41156Z[i12] = i10;
        this.f41157o0[i12] = obj;
        this.f41158p0 = i12 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C12960M clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC16544l.m18092e(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C12960M c12960m = (C12960M) objClone;
        c12960m.f41156Z = (int[]) this.f41156Z.clone();
        c12960m.f41157o0 = (Object[]) this.f41157o0.clone();
        return c12960m;
    }

    /* JADX INFO: renamed from: c */
    public final Object m14652c(int i10) {
        Object obj;
        int iM14848a = AbstractC13253a.m14848a(this.f41158p0, i10, this.f41156Z);
        if (iM14848a < 0 || (obj = this.f41157o0[iM14848a]) == AbstractC12978q.f41193c) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final int m14653d(int i10) {
        if (this.f41155Y) {
            AbstractC12978q.m14672a(this);
        }
        return this.f41156Z[i10];
    }

    /* JADX INFO: renamed from: e */
    public final void m14654e(int i10, Object obj) {
        int iM14848a = AbstractC13253a.m14848a(this.f41158p0, i10, this.f41156Z);
        if (iM14848a >= 0) {
            this.f41157o0[iM14848a] = obj;
            return;
        }
        int i11 = ~iM14848a;
        int i12 = this.f41158p0;
        if (i11 < i12) {
            Object[] objArr = this.f41157o0;
            if (objArr[i11] == AbstractC12978q.f41193c) {
                this.f41156Z[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f41155Y && i12 >= this.f41156Z.length) {
            AbstractC12978q.m14672a(this);
            i11 = ~AbstractC13253a.m14848a(this.f41158p0, i10, this.f41156Z);
        }
        int i13 = this.f41158p0;
        if (i13 >= this.f41156Z.length) {
            int i14 = (i13 + 1) * 4;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f41156Z, i17);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f41156Z = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f41157o0, i17);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f41157o0 = objArrCopyOf;
        }
        int i18 = this.f41158p0;
        if (i18 - i11 != 0) {
            int[] iArr = this.f41156Z;
            int i19 = i11 + 1;
            AbstractC17678l.m19303j(i19, i11, i18, iArr, iArr);
            Object[] objArr2 = this.f41157o0;
            AbstractC17678l.m19304k(i19, i11, this.f41158p0, objArr2, objArr2);
        }
        this.f41156Z[i11] = i10;
        this.f41157o0[i11] = obj;
        this.f41158p0++;
    }

    /* JADX INFO: renamed from: f */
    public final int m14655f() {
        if (this.f41155Y) {
            AbstractC12978q.m14672a(this);
        }
        return this.f41158p0;
    }

    /* JADX INFO: renamed from: g */
    public final Object m14656g(int i10) {
        if (this.f41155Y) {
            AbstractC12978q.m14672a(this);
        }
        return this.f41157o0[i10];
    }

    public final String toString() {
        if (m14655f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f41158p0 * 28);
        sb2.append('{');
        int i10 = this.f41158p0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m14653d(i11));
            sb2.append('=');
            Object objM14656g = m14656g(i11);
            if (objM14656g != this) {
                sb2.append(objM14656g);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "buffer.toString()");
        return string;
    }
}
