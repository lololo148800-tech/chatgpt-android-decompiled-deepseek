package p586Y0;

import java.util.ArrayList;
import java.util.Iterator;
import p076Cm.InterfaceC1723a;
import p523V9.AbstractC7846A5;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Y0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9560l implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: q0 */
    public static final C9560l f28750q0 = new C9560l(0, 0, 0, null);

    /* JADX INFO: renamed from: Y */
    public final long f28751Y;

    /* JADX INFO: renamed from: Z */
    public final long f28752Z;

    /* JADX INFO: renamed from: o0 */
    public final int f28753o0;

    /* JADX INFO: renamed from: p0 */
    public final int[] f28754p0;

    public C9560l(long j10, long j11, int i10, int[] iArr) {
        this.f28751Y = j10;
        this.f28752Z = j11;
        this.f28753o0 = i10;
        this.f28754p0 = iArr;
    }

    /* JADX INFO: renamed from: f */
    public final C9560l m10072f(C9560l c9560l) {
        C9560l c9560lM10073j;
        int[] iArr;
        C9560l c9560l2 = f28750q0;
        if (c9560l == c9560l2) {
            return this;
        }
        if (this == c9560l2) {
            return c9560l2;
        }
        int i10 = c9560l.f28753o0;
        int[] iArr2 = c9560l.f28754p0;
        long j10 = c9560l.f28752Z;
        long j11 = c9560l.f28751Y;
        int i11 = this.f28753o0;
        if (i10 == i11 && iArr2 == (iArr = this.f28754p0)) {
            return new C9560l(this.f28751Y & (~j11), this.f28752Z & (~j10), i11, iArr);
        }
        if (iArr2 != null) {
            c9560lM10073j = this;
            for (int i12 : iArr2) {
                c9560lM10073j = c9560lM10073j.m10073j(i12);
            }
        } else {
            c9560lM10073j = this;
        }
        int i13 = c9560l.f28753o0;
        if (j10 != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if (((1 << i14) & j10) != 0) {
                    c9560lM10073j = c9560lM10073j.m10073j(i14 + i13);
                }
            }
        }
        if (j11 != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j11) != 0) {
                    c9560lM10073j = c9560lM10073j.m10073j(i15 + 64 + i13);
                }
            }
        }
        return c9560lM10073j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC7846A5.m8098a(new C9559k(this, null));
    }

    /* JADX INFO: renamed from: j */
    public final C9560l m10073j(int i10) {
        int[] iArr;
        int iM10107b;
        int i11 = this.f28753o0;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f28752Z;
            if ((j11 & j10) != 0) {
                return new C9560l(this.f28751Y, j11 & (~j10), i11, this.f28754p0);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f28751Y;
            if ((j13 & j12) != 0) {
                return new C9560l(j13 & (~j12), this.f28752Z, i11, this.f28754p0);
            }
        } else if (i12 < 0 && (iArr = this.f28754p0) != null && (iM10107b = AbstractC9567s.m10107b(iArr, i10)) >= 0) {
            int length = iArr.length;
            int i13 = length - 1;
            if (i13 == 0) {
                return new C9560l(this.f28751Y, this.f28752Z, this.f28753o0, null);
            }
            int[] iArr2 = new int[i13];
            if (iM10107b > 0) {
                AbstractC17678l.m19303j(0, 0, iM10107b, iArr, iArr2);
            }
            if (iM10107b < i13) {
                AbstractC17678l.m19303j(iM10107b, iM10107b + 1, length, iArr, iArr2);
            }
            return new C9560l(this.f28751Y, this.f28752Z, this.f28753o0, iArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m10074m(int i10) {
        int[] iArr;
        int i11 = i10 - this.f28753o0;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.f28752Z) != 0;
        }
        if (i11 >= 64 && i11 < 128) {
            return ((1 << (i11 - 64)) & this.f28751Y) != 0;
        }
        if (i11 <= 0 && (iArr = this.f28754p0) != null) {
            return AbstractC9567s.m10107b(iArr, i10) >= 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final C9560l m10075p(C9560l c9560l) {
        C9560l c9560lM10076q;
        int[] iArr;
        C9560l c9560lM10076q2 = c9560l;
        C9560l c9560l2 = f28750q0;
        if (c9560lM10076q2 == c9560l2) {
            return this;
        }
        if (this == c9560l2) {
            return c9560lM10076q2;
        }
        int i10 = c9560lM10076q2.f28753o0;
        long j10 = this.f28752Z;
        long j11 = this.f28751Y;
        int[] iArr2 = c9560lM10076q2.f28754p0;
        long j12 = c9560lM10076q2.f28752Z;
        long j13 = c9560lM10076q2.f28751Y;
        int i11 = this.f28753o0;
        if (i10 == i11 && iArr2 == (iArr = this.f28754p0)) {
            return new C9560l(j11 | j13, j10 | j12, i11, iArr);
        }
        int[] iArr3 = this.f28754p0;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i12 : iArr3) {
                    c9560lM10076q2 = c9560lM10076q2.m10076q(i12);
                }
            }
            int i13 = this.f28753o0;
            if (j10 != 0) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if (((1 << i14) & j10) != 0) {
                        c9560lM10076q2 = c9560lM10076q2.m10076q(i14 + i13);
                    }
                }
            }
            if (j11 == 0) {
                return c9560lM10076q2;
            }
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j11) != 0) {
                    c9560lM10076q2 = c9560lM10076q2.m10076q(i15 + 64 + i13);
                }
            }
            return c9560lM10076q2;
        }
        if (iArr2 != null) {
            c9560lM10076q = this;
            for (int i16 : iArr2) {
                c9560lM10076q = c9560lM10076q.m10076q(i16);
            }
        } else {
            c9560lM10076q = this;
        }
        int i17 = c9560lM10076q2.f28753o0;
        if (j12 != 0) {
            for (int i18 = 0; i18 < 64; i18++) {
                if (((1 << i18) & j12) != 0) {
                    c9560lM10076q = c9560lM10076q.m10076q(i18 + i17);
                }
            }
        }
        if (j13 != 0) {
            for (int i19 = 0; i19 < 64; i19++) {
                if (((1 << i19) & j13) != 0) {
                    c9560lM10076q = c9560lM10076q.m10076q(i19 + 64 + i17);
                }
            }
        }
        return c9560lM10076q;
    }

    /* JADX INFO: renamed from: q */
    public final C9560l m10076q(int i10) {
        long j10;
        int i11;
        int i12 = this.f28753o0;
        int i13 = i10 - i12;
        long j11 = this.f28752Z;
        if (i13 < 0 || i13 >= 64) {
            long j12 = this.f28751Y;
            if (i13 < 64 || i13 >= 128) {
                int[] iArrM19321B0 = this.f28754p0;
                if (i13 < 128) {
                    if (iArrM19321B0 == null) {
                        return new C9560l(j12, j11, i12, new int[]{i10});
                    }
                    int iM10107b = AbstractC9567s.m10107b(iArrM19321B0, i10);
                    if (iM10107b < 0) {
                        int i14 = -(iM10107b + 1);
                        int length = iArrM19321B0.length;
                        int[] iArr = new int[length + 1];
                        AbstractC17678l.m19303j(0, 0, i14, iArrM19321B0, iArr);
                        AbstractC17678l.m19303j(i14 + 1, i14, length, iArrM19321B0, iArr);
                        iArr[i14] = i10;
                        return new C9560l(this.f28751Y, this.f28752Z, this.f28753o0, iArr);
                    }
                } else if (!m10074m(i10)) {
                    int i15 = ((i10 + 1) / 64) * 64;
                    int i16 = this.f28753o0;
                    ArrayList arrayList = null;
                    long j13 = j12;
                    while (true) {
                        if (i16 >= i15) {
                            j10 = j11;
                            i11 = i16;
                            break;
                        }
                        if (j11 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArrM19321B0 != null) {
                                    for (int i17 : iArrM19321B0) {
                                        arrayList.add(Integer.valueOf(i17));
                                    }
                                }
                            }
                            for (int i18 = 0; i18 < 64; i18++) {
                                if (((1 << i18) & j11) != 0) {
                                    arrayList.add(Integer.valueOf(i18 + i16));
                                }
                            }
                        }
                        if (j13 == 0) {
                            i11 = i15;
                            j10 = 0;
                            break;
                        }
                        i16 += 64;
                        j11 = j13;
                        j13 = 0;
                    }
                    if (arrayList != null) {
                        iArrM19321B0 = AbstractC17680n.m19321B0(arrayList);
                    }
                    return new C9560l(j13, j10, i11, iArrM19321B0).m10076q(i10);
                }
            } else {
                long j14 = 1 << (i13 - 64);
                if ((j12 & j14) == 0) {
                    return new C9560l(j12 | j14, j11, i12, this.f28754p0);
                }
            }
        } else {
            long j15 = 1 << i13;
            if ((j11 & j15) == 0) {
                return new C9560l(this.f28751Y, j11 | j15, i12, this.f28754p0);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
