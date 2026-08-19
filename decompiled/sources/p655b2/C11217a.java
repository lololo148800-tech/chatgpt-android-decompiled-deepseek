package p655b2;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import p571X9.AbstractC9306j0;
import p658b5.C11242m;

/* JADX INFO: renamed from: b2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11217a {

    /* JADX INFO: renamed from: b */
    public final C11218b f33932b;

    /* JADX INFO: renamed from: c */
    public final C11242m f33933c;

    /* JADX INFO: renamed from: a */
    public int f33931a = 0;

    /* JADX INFO: renamed from: d */
    public int f33934d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f33935e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f33936f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f33937g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f33938h = -1;

    /* JADX INFO: renamed from: i */
    public int f33939i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f33940j = false;

    public C11217a(C11218b c11218b, C11242m c11242m) {
        this.f33932b = c11218b;
        this.f33933c = c11242m;
    }

    /* JADX INFO: renamed from: a */
    public final void m12439a(C11221e c11221e, float f10, boolean z6) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f33938h;
            C11218b c11218b = this.f33932b;
            if (i10 == -1) {
                this.f33938h = 0;
                this.f33937g[0] = f10;
                this.f33935e[0] = c11221e.f33968Z;
                this.f33936f[0] = -1;
                c11221e.f33977w0++;
                c11221e.m12478a(c11218b);
                this.f33931a++;
                if (this.f33940j) {
                    return;
                }
                int i11 = this.f33939i + 1;
                this.f33939i = i11;
                int[] iArr = this.f33935e;
                if (i11 >= iArr.length) {
                    this.f33940j = true;
                    this.f33939i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f33931a; i13++) {
                int i14 = this.f33935e[i10];
                int i15 = c11221e.f33968Z;
                if (i14 == i15) {
                    float[] fArr = this.f33937g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f33938h) {
                            this.f33938h = this.f33936f[i10];
                        } else {
                            int[] iArr2 = this.f33936f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z6) {
                            c11221e.m12479b(c11218b);
                        }
                        if (this.f33940j) {
                            this.f33939i = i10;
                        }
                        c11221e.f33977w0--;
                        this.f33931a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f33936f[i10];
            }
            int length = this.f33939i;
            int i16 = length + 1;
            if (this.f33940j) {
                int[] iArr3 = this.f33935e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f33935e;
            if (length >= iArr4.length && this.f33931a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f33935e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f33935e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f33934d * 2;
                this.f33934d = i18;
                this.f33940j = false;
                this.f33939i = length - 1;
                this.f33937g = Arrays.copyOf(this.f33937g, i18);
                this.f33935e = Arrays.copyOf(this.f33935e, this.f33934d);
                this.f33936f = Arrays.copyOf(this.f33936f, this.f33934d);
            }
            this.f33935e[length] = c11221e.f33968Z;
            this.f33937g[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f33936f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f33936f[length] = this.f33938h;
                this.f33938h = length;
            }
            c11221e.f33977w0++;
            c11221e.m12478a(c11218b);
            this.f33931a++;
            if (!this.f33940j) {
                this.f33939i++;
            }
            int i19 = this.f33939i;
            int[] iArr8 = this.f33935e;
            if (i19 >= iArr8.length) {
                this.f33940j = true;
                this.f33939i = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12440b() {
        int i10 = this.f33938h;
        for (int i11 = 0; i10 != -1 && i11 < this.f33931a; i11++) {
            C11221e c11221e = ((C11221e[]) this.f33933c.f34020o0)[this.f33935e[i10]];
            if (c11221e != null) {
                c11221e.m12479b(this.f33932b);
            }
            i10 = this.f33936f[i10];
        }
        this.f33938h = -1;
        this.f33939i = -1;
        this.f33940j = false;
        this.f33931a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final float m12441c(C11221e c11221e) {
        int i10 = this.f33938h;
        for (int i11 = 0; i10 != -1 && i11 < this.f33931a; i11++) {
            if (this.f33935e[i10] == c11221e.f33968Z) {
                return this.f33937g[i10];
            }
            i10 = this.f33936f[i10];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final int m12442d() {
        return this.f33931a;
    }

    /* JADX INFO: renamed from: e */
    public final C11221e m12443e(int i10) {
        int i11 = this.f33938h;
        for (int i12 = 0; i11 != -1 && i12 < this.f33931a; i12++) {
            if (i12 == i10) {
                return ((C11221e[]) this.f33933c.f34020o0)[this.f33935e[i11]];
            }
            i11 = this.f33936f[i11];
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final float m12444f(int i10) {
        int i11 = this.f33938h;
        for (int i12 = 0; i11 != -1 && i12 < this.f33931a; i12++) {
            if (i12 == i10) {
                return this.f33937g[i11];
            }
            i11 = this.f33936f[i11];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public final void m12445g(C11221e c11221e, float f10) {
        if (f10 == 0.0f) {
            m12446h(c11221e, true);
            return;
        }
        int i10 = this.f33938h;
        C11218b c11218b = this.f33932b;
        if (i10 == -1) {
            this.f33938h = 0;
            this.f33937g[0] = f10;
            this.f33935e[0] = c11221e.f33968Z;
            this.f33936f[0] = -1;
            c11221e.f33977w0++;
            c11221e.m12478a(c11218b);
            this.f33931a++;
            if (this.f33940j) {
                return;
            }
            int i11 = this.f33939i + 1;
            this.f33939i = i11;
            int[] iArr = this.f33935e;
            if (i11 >= iArr.length) {
                this.f33940j = true;
                this.f33939i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f33931a; i13++) {
            int i14 = this.f33935e[i10];
            int i15 = c11221e.f33968Z;
            if (i14 == i15) {
                this.f33937g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f33936f[i10];
        }
        int length = this.f33939i;
        int i16 = length + 1;
        if (this.f33940j) {
            int[] iArr2 = this.f33935e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f33935e;
        if (length >= iArr3.length && this.f33931a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f33935e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f33935e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f33934d * 2;
            this.f33934d = i18;
            this.f33940j = false;
            this.f33939i = length - 1;
            this.f33937g = Arrays.copyOf(this.f33937g, i18);
            this.f33935e = Arrays.copyOf(this.f33935e, this.f33934d);
            this.f33936f = Arrays.copyOf(this.f33936f, this.f33934d);
        }
        this.f33935e[length] = c11221e.f33968Z;
        this.f33937g[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f33936f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f33936f[length] = this.f33938h;
            this.f33938h = length;
        }
        c11221e.f33977w0++;
        c11221e.m12478a(c11218b);
        int i19 = this.f33931a + 1;
        this.f33931a = i19;
        if (!this.f33940j) {
            this.f33939i++;
        }
        int[] iArr7 = this.f33935e;
        if (i19 >= iArr7.length) {
            this.f33940j = true;
        }
        if (this.f33939i >= iArr7.length) {
            this.f33940j = true;
            this.f33939i = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final float m12446h(C11221e c11221e, boolean z6) {
        int i10 = this.f33938h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f33931a) {
            if (this.f33935e[i10] == c11221e.f33968Z) {
                if (i10 == this.f33938h) {
                    this.f33938h = this.f33936f[i10];
                } else {
                    int[] iArr = this.f33936f;
                    iArr[i12] = iArr[i10];
                }
                if (z6) {
                    c11221e.m12479b(this.f33932b);
                }
                c11221e.f33977w0--;
                this.f33931a--;
                this.f33935e[i10] = -1;
                if (this.f33940j) {
                    this.f33939i = i10;
                }
                return this.f33937g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f33936f[i10];
        }
        return 0.0f;
    }

    public final String toString() {
        int i10 = this.f33938h;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f33931a; i11++) {
            StringBuilder sbM9893l = AbstractC9306j0.m9893l(AbstractC10763a.m11052j(string, " -> "));
            sbM9893l.append(this.f33937g[i10]);
            sbM9893l.append(" : ");
            StringBuilder sbM9893l2 = AbstractC9306j0.m9893l(sbM9893l.toString());
            sbM9893l2.append(((C11221e[]) this.f33933c.f34020o0)[this.f33935e[i10]]);
            string = sbM9893l2.toString();
            i10 = this.f33936f[i10];
        }
        return string;
    }
}
