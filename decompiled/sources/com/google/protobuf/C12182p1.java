package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.p1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12182p1 {

    /* JADX INFO: renamed from: f */
    public static final C12182p1 f37068f = new C12182p1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f37069a;

    /* JADX INFO: renamed from: b */
    public int[] f37070b;

    /* JADX INFO: renamed from: c */
    public Object[] f37071c;

    /* JADX INFO: renamed from: d */
    public int f37072d;

    /* JADX INFO: renamed from: e */
    public boolean f37073e;

    public C12182p1() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: e */
    public static C12182p1 m14067e(C12182p1 c12182p1, C12182p1 c12182p2) {
        int i10 = c12182p1.f37069a + c12182p2.f37069a;
        int[] iArrCopyOf = Arrays.copyOf(c12182p1.f37070b, i10);
        System.arraycopy(c12182p2.f37070b, 0, iArrCopyOf, c12182p1.f37069a, c12182p2.f37069a);
        Object[] objArrCopyOf = Arrays.copyOf(c12182p1.f37071c, i10);
        System.arraycopy(c12182p2.f37071c, 0, objArrCopyOf, c12182p1.f37069a, c12182p2.f37069a);
        return new C12182p1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m14068a() {
        if (!this.f37073e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14069b(int i10) {
        int[] iArr = this.f37070b;
        if (i10 > iArr.length) {
            int i11 = this.f37069a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f37070b = Arrays.copyOf(iArr, i10);
            this.f37071c = Arrays.copyOf(this.f37071c, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m14070c() {
        int iM14149w0;
        int i10 = this.f37072d;
        if (i10 != -1) {
            return i10;
        }
        int iM14070c = 0;
        for (int i11 = 0; i11 < this.f37069a; i11++) {
            int i12 = this.f37070b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iM14149w0 = AbstractC12195u.m14149w0(i13, ((Long) this.f37071c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f37071c[i11]).getClass();
                iM14149w0 = AbstractC12195u.m14134h0(i13);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iM14070c = ((C12182p1) this.f37071c[i11]).m14070c() + (AbstractC12195u.m14146t0(i13) * 2) + iM14070c;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(C12181p0.m14062c());
                    }
                    ((Integer) this.f37071c[i11]).getClass();
                    iM14149w0 = AbstractC12195u.m14133g0(i13);
                }
            } else {
                iM14149w0 = AbstractC12195u.m14129c0(i13, (AbstractC12171m) this.f37071c[i11]);
            }
            iM14070c = iM14149w0 + iM14070c;
        }
        this.f37072d = iM14070c;
        return iM14070c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14071d(int i10, AbstractC12186r abstractC12186r) throws C12178o0 {
        int iMo14019E;
        m14068a();
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            m14072f(i10, Long.valueOf(abstractC12186r.mo14044u()));
            return true;
        }
        if (i12 == 1) {
            m14072f(i10, Long.valueOf(abstractC12186r.mo14040q()));
            return true;
        }
        if (i12 == 2) {
            m14072f(i10, abstractC12186r.mo14036m());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw C12181p0.m14062c();
            }
            m14072f(i10, Integer.valueOf(abstractC12186r.mo14039p()));
            return true;
        }
        C12182p1 c12182p1 = new C12182p1();
        do {
            iMo14019E = abstractC12186r.mo14019E();
            if (iMo14019E == 0) {
                break;
            }
        } while (c12182p1.m14071d(iMo14019E, abstractC12186r));
        abstractC12186r.mo14029a((i11 << 3) | 4);
        m14072f(i10, c12182p1);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C12182p1)) {
            return false;
        }
        C12182p1 c12182p1 = (C12182p1) obj;
        int i10 = this.f37069a;
        if (i10 == c12182p1.f37069a) {
            int[] iArr = this.f37070b;
            int[] iArr2 = c12182p1.f37070b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f37071c;
            Object[] objArr2 = c12182p1.f37071c;
            int i12 = this.f37069a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m14072f(int i10, Object obj) {
        m14068a();
        m14069b(this.f37069a + 1);
        int[] iArr = this.f37070b;
        int i11 = this.f37069a;
        iArr[i11] = i10;
        this.f37071c[i11] = obj;
        this.f37069a = i11 + 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m14073g(C12211z0 c12211z0) {
        if (this.f37069a == 0) {
            return;
        }
        c12211z0.getClass();
        for (int i10 = 0; i10 < this.f37069a; i10++) {
            int i11 = this.f37070b[i10];
            Object obj = this.f37071c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                c12211z0.m14209j(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c12211z0.m14205f(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                c12211z0.m14201b(i12, (AbstractC12171m) obj);
            } else if (i13 == 3) {
                AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
                abstractC12195u.mo14108Q0(i12, 3);
                ((C12182p1) obj).m14073g(c12211z0);
                abstractC12195u.mo14108Q0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(C12181p0.m14062c());
                }
                c12211z0.m14204e(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i10 = this.f37069a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f37070b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f37071c;
        int i15 = this.f37069a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public C12182p1(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.f37072d = -1;
        this.f37069a = i10;
        this.f37070b = iArr;
        this.f37071c = objArr;
        this.f37073e = z6;
    }
}
