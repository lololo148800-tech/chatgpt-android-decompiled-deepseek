package p165G9;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Color;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import p1145z7.InterfaceC21808e;
import p437Rn.InterfaceC6948f;
import p544W9.AbstractC8751z2;
import p675c6.C11668c;
import p742f6.InterfaceC13548D;
import p758g0.AbstractC13784r;
import p758g0.InterfaceC13789t0;
import p764g6.AbstractC13821a;
import p779h6.AbstractC14417f;

/* JADX INFO: renamed from: G9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3024j implements InterfaceC3017c, InterfaceC6948f, InterfaceC13548D, InterfaceC13789t0, InterfaceC21808e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9111Y;

    /* JADX INFO: renamed from: Z */
    public int f9112Z;

    public /* synthetic */ C3024j(int i10, int i11) {
        this.f9111Y = i11;
        this.f9112Z = i10;
    }

    @Override // p758g0.InterfaceC13789t0
    /* JADX INFO: renamed from: F */
    public int mo3876F() {
        return this.f9112Z;
    }

    @Override // p758g0.InterfaceC13789t0
    /* JADX INFO: renamed from: N */
    public int mo3878N() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    @Override // p742f6.InterfaceC13548D
    /* JADX INFO: renamed from: a */
    public Object mo3879a(AbstractC13821a abstractC13821a, float f10) {
        int i10;
        int i11;
        float f11;
        int iArgb;
        int iArgb2;
        float f12;
        float fM15928e;
        ArrayList arrayList = new ArrayList();
        int i12 = 1;
        boolean z6 = abstractC13821a.mo15424P() == 1;
        if (z6) {
            abstractC13821a.mo15429a();
        }
        while (abstractC13821a.hasNext()) {
            arrayList.add(Float.valueOf((float) abstractC13821a.mo15423O()));
        }
        int i13 = 4;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f9112Z = 2;
        }
        if (z6) {
            abstractC13821a.mo15433k();
        }
        if (this.f9112Z == -1) {
            this.f9112Z = arrayList.size() / 4;
        }
        int i14 = this.f9112Z;
        float[] fArr = new float[i14];
        int[] iArr = new int[i14];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i10 = this.f9112Z * i13;
            if (i15 >= i10) {
                break;
            }
            int i18 = i15 / 4;
            double dFloatValue = ((Float) arrayList.get(i15)).floatValue();
            int i19 = i15 % 4;
            if (i19 != 0) {
                if (i19 == i12) {
                    i16 = (int) (dFloatValue * 255.0d);
                } else if (i19 == 2) {
                    i17 = (int) (dFloatValue * 255.0d);
                } else if (i19 == 3) {
                    iArr[i18] = Color.argb(255, i16, i17, (int) (dFloatValue * 255.0d));
                }
            } else if (i18 > 0) {
                float f13 = (float) dFloatValue;
                if (fArr[i18 - 1] >= f13) {
                    fArr[i18] = f13 + 0.01f;
                } else {
                    fArr[i18] = (float) dFloatValue;
                }
            } else {
                fArr[i18] = (float) dFloatValue;
            }
            i15++;
            i12 = 1;
            i13 = 4;
        }
        C11668c c11668c = new C11668c(fArr, iArr);
        if (arrayList.size() <= i10) {
            return c11668c;
        }
        int size = (arrayList.size() - i10) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i20 = 0;
        while (i10 < arrayList.size()) {
            if (i10 % 2 == 0) {
                fArr2[i20] = ((Float) arrayList.get(i10)).floatValue();
            } else {
                fArr3[i20] = ((Float) arrayList.get(i10)).floatValue();
                i20++;
            }
            i10++;
        }
        float[] fArrCopyOf = c11668c.f35331a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                float f14 = i22 < fArrCopyOf.length ? fArrCopyOf[i22] : Float.NaN;
                float f15 = i23 < size ? fArr2[i23] : Float.NaN;
                if (Float.isNaN(f15) || f14 < f15) {
                    fArr4[i24] = f14;
                    i22++;
                } else if (Float.isNaN(f14) || f15 < f14) {
                    fArr4[i24] = f15;
                    i23++;
                } else {
                    fArr4[i24] = f14;
                    i22++;
                    i23++;
                    i21++;
                }
            }
            fArrCopyOf = i21 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i21);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        for (int i25 = 0; i25 < length2; i25++) {
            float f16 = fArrCopyOf[i25];
            int iBinarySearch = Arrays.binarySearch(fArr, f16);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f16);
            int[] iArr3 = c11668c.f35332b;
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f17 = fArr3[iBinarySearch2];
                if (iArr3.length < 2 || f16 == fArr[0]) {
                    i11 = iArr3[0];
                } else {
                    int i26 = 1;
                    while (true) {
                        if (i26 >= i14) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f11 = fArr[i26];
                        if (f11 >= f16 || i26 == i14 - 1) {
                            break;
                        }
                        i26++;
                    }
                    if (i26 != i14 - 1 || f16 < f11) {
                        int i27 = i26 - 1;
                        float f18 = fArr[i27];
                        int iM9506c = AbstractC8751z2.m9506c((f16 - f18) / (f11 - f18), iArr3[i27], iArr3[i26]);
                        iArgb = Color.argb((int) (f17 * 255.0f), Color.red(iM9506c), Color.green(iM9506c), Color.blue(iM9506c));
                    } else {
                        iArgb = Color.argb((int) (f17 * 255.0f), Color.red(iArr3[i26]), Color.green(iArr3[i26]), Color.blue(iArr3[i26]));
                    }
                    i11 = iArgb;
                }
                iArr2[i25] = i11;
            } else {
                int i28 = iArr3[iBinarySearch];
                if (size < 2 || f16 <= fArr2[0]) {
                    iArgb2 = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i28), Color.green(i28), Color.blue(i28));
                } else {
                    int i29 = 1;
                    while (true) {
                        if (i29 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f12 = fArr2[i29];
                        if (f12 >= f16 || i29 == size - 1) {
                            break;
                        }
                        i29++;
                    }
                    if (f12 <= f16) {
                        fM15928e = fArr3[i29];
                    } else {
                        int i30 = i29 - 1;
                        float f19 = fArr2[i30];
                        fM15928e = AbstractC14417f.m15928e(fArr3[i30], fArr3[i29], (f16 - f19) / (f12 - f19));
                    }
                    iArgb2 = Color.argb((int) (fM15928e * 255.0f), Color.red(i28), Color.green(i28), Color.blue(i28));
                }
                iArr2[i25] = iArgb2;
            }
        }
        return new C11668c(fArrCopyOf, iArr2);
    }

    @Override // p437Rn.InterfaceC6948f
    /* JADX INFO: renamed from: b */
    public String mo2693b() {
        switch (this.f9111Y) {
            case 1:
                return AbstractC10763a.m11056n(new StringBuilder("expected at least "), this.f9112Z, " digits");
            default:
                return AbstractC10763a.m11056n(new StringBuilder("expected at most "), this.f9112Z, " digits");
        }
    }

    /* JADX INFO: renamed from: c */
    public int m3880c() {
        int i10 = this.f9112Z;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean mo3881d() {
        return false;
    }

    @Override // p165G9.InterfaceC3017c
    /* JADX INFO: renamed from: e */
    public int mo3862e(Context context, String str, boolean z6) {
        return 0;
    }

    @Override // p165G9.InterfaceC3017c
    /* JADX INFO: renamed from: f */
    public int mo3863f(Context context, String str) {
        return this.f9112Z;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: q */
    public long mo3882q(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((long) mo3876F()) * 1000000;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: s */
    public AbstractC13784r mo3883s(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return abstractC13784r3;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: u */
    public AbstractC13784r mo3884u(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return j10 < ((long) this.f9112Z) * 1000000 ? abstractC13784r : abstractC13784r2;
    }

    public C3024j(int i10) {
        this.f9111Y = i10;
        switch (i10) {
            case 6:
                this.f9112Z = Build.VERSION.SDK_INT;
                break;
        }
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: K */
    public AbstractC13784r mo3877K(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return abstractC13784r3;
    }
}
