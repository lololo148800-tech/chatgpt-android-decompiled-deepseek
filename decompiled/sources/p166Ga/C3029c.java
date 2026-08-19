package p166Ga;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.WeakHashMap;
import lc.C16842b;
import lc.EnumC16841a;
import mc.AbstractC17223b;
import mc.C17225d;
import p001A.AbstractC0010F;
import p001A.RunnableC0000A;
import p003A1.RunnableC0153B;
import p030B2.AbstractC0738T;
import p1009s9.C19501d;
import p1036u9.InterfaceC20165k;
import p1060v9.AbstractC20502t;
import p310M9.C5311e;
import p785hc.C14443b;
import p808ic.C14960d;

/* JADX INFO: renamed from: Ga.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3029c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9116a;

    /* JADX INFO: renamed from: b */
    public int f9117b;

    /* JADX INFO: renamed from: c */
    public boolean f9118c;

    /* JADX INFO: renamed from: d */
    public Object f9119d;

    /* JADX INFO: renamed from: e */
    public Object f9120e;

    public /* synthetic */ C3029c() {
        this.f9116a = 3;
    }

    /* JADX INFO: renamed from: a */
    public static void m3899a(C17225d[][][] c17225dArr, int i10, C17225d c17225d) {
        C17225d[] c17225dArr2 = c17225dArr[i10 + c17225d.f54971d][c17225d.f54970c];
        EnumC16841a enumC16841a = c17225d.f54968a;
        int iOrdinal = enumC16841a.ordinal();
        char c9 = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c9 = 1;
            } else if (iOrdinal == 4) {
                c9 = 3;
            } else {
                if (iOrdinal != 6) {
                    throw new IllegalStateException("Illegal mode " + enumC16841a);
                }
                c9 = 0;
            }
        }
        C17225d c17225d2 = c17225dArr2[c9];
        if (c17225d2 != null) {
            if (c17225d2.f54973f <= c17225d.f54973f) {
                return;
            }
        }
        c17225dArr2[c9] = c17225d;
    }

    /* JADX INFO: renamed from: d */
    public static C3029c m3900d() {
        C3029c c3029c = new C3029c();
        c3029c.f9118c = true;
        c3029c.f9117b = 0;
        return c3029c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3901e(EnumC16841a enumC16841a, char c9) {
        int i10;
        int iOrdinal = enumC16841a.ordinal();
        if (iOrdinal == 1) {
            return c9 >= '0' && c9 <= '9';
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 4) {
                return true;
            }
            if (iOrdinal != 6) {
                return false;
            }
            return AbstractC17223b.m18955b(String.valueOf(c9));
        }
        if (c9 < '`') {
            i10 = AbstractC17223b.f54962a[c9];
        } else {
            int[] iArr = AbstractC17223b.f54962a;
            i10 = -1;
        }
        return i10 != -1;
    }

    /* JADX INFO: renamed from: h */
    public static C16842b m3902h(int i10) {
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h != 0) {
            return iM24h != 1 ? C16842b.m18573a(40) : C16842b.m18573a(26);
        }
        return C16842b.m18573a(9);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0036  */
    /* JADX INFO: renamed from: b */
    public void m3903b(C16842b c16842b, C17225d[][][] c17225dArr, int i10, C17225d c17225d) {
        int i11;
        C14960d c14960d = (C14960d) this.f9120e;
        int length = c14960d.f46597a.length;
        String str = (String) this.f9119d;
        CharsetEncoder[] charsetEncoderArr = c14960d.f46597a;
        int i12 = c14960d.f46598b;
        if (i12 >= 0) {
            char cCharAt = str.charAt(i10);
            if (charsetEncoderArr[i12].canEncode("" + cCharAt)) {
                length = i12 + 1;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        int i13 = length;
        for (int i14 = i12; i14 < i13; i14++) {
            char cCharAt2 = str.charAt(i10);
            if (charsetEncoderArr[i14].canEncode("" + cCharAt2)) {
                m3899a(c17225dArr, i10, new C17225d(this, EnumC16841a.BYTE, i10, i14, 1, c17225d, c16842b));
            }
        }
        EnumC16841a enumC16841a = EnumC16841a.KANJI;
        if (m3901e(enumC16841a, str.charAt(i10))) {
            m3899a(c17225dArr, i10, new C17225d(this, enumC16841a, i10, 0, 1, c17225d, c16842b));
        }
        int length2 = str.length();
        EnumC16841a enumC16841a2 = EnumC16841a.ALPHANUMERIC;
        if (m3901e(enumC16841a2, str.charAt(i10))) {
            int i15 = i10 + 1;
            m3899a(c17225dArr, i10, new C17225d(this, enumC16841a2, i10, 0, (i15 >= length2 || !m3901e(enumC16841a2, str.charAt(i15))) ? 1 : 2, c17225d, c16842b));
        }
        EnumC16841a enumC16841a3 = EnumC16841a.NUMERIC;
        if (m3901e(enumC16841a3, str.charAt(i10))) {
            int i16 = i10 + 1;
            if (i16 >= length2 || !m3901e(enumC16841a3, str.charAt(i16))) {
                i11 = 1;
            } else {
                int i17 = i10 + 2;
                i11 = (i17 >= length2 || !m3901e(enumC16841a3, str.charAt(i17))) ? 2 : 3;
            }
            m3899a(c17225dArr, i10, new C17225d(this, enumC16841a3, i10, 0, i11, c17225d, c16842b));
        }
    }

    /* JADX INFO: renamed from: c */
    public C3029c m3904c() {
        AbstractC20502t.m21150a("execute parameter required", ((InterfaceC20165k) this.f9119d) != null);
        return new C3029c(this, (C19501d[]) this.f9120e, this.f9118c, this.f9117b);
    }

    /* JADX INFO: renamed from: f */
    public void m3905f(int i10) {
        switch (this.f9116a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9120e;
                WeakReference weakReference = sideSheetBehavior.f36691o;
                if (weakReference != null && weakReference.get() != null) {
                    this.f9117b = i10;
                    if (!this.f9118c) {
                        View view = (View) sideSheetBehavior.f36691o.get();
                        RunnableC0000A runnableC0000A = (RunnableC0000A) this.f9119d;
                        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                        view.postOnAnimation(runnableC0000A);
                        this.f9118c = true;
                    }
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f9120e;
                WeakReference weakReference2 = bottomSheetBehavior.f36432V;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f9117b = i10;
                    if (!this.f9118c) {
                        View view2 = (View) bottomSheetBehavior.f36432V.get();
                        RunnableC0153B runnableC0153B = (RunnableC0153B) this.f9119d;
                        WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                        view2.postOnAnimation(runnableC0153B);
                        this.f9118c = true;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public C5311e m3906g(C16842b c16842b) throws C14443b {
        CharsetEncoder[] charsetEncoderArr;
        int i10;
        String str = (String) this.f9119d;
        int length = str.length();
        C14960d c14960d = (C14960d) this.f9120e;
        int i11 = 1;
        C17225d[][][] c17225dArr = (C17225d[][][]) Array.newInstance((Class<?>) C17225d.class, length + 1, c14960d.f46597a.length, 4);
        m3903b(c16842b, c17225dArr, 0, null);
        while (true) {
            charsetEncoderArr = c14960d.f46597a;
            if (i11 > length) {
                break;
            }
            for (int i12 = 0; i12 < charsetEncoderArr.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    C17225d c17225d = c17225dArr[i11][i12][i13];
                    if (c17225d != null && i11 < length) {
                        m3903b(c16842b, c17225dArr, i11, c17225d);
                    }
                }
            }
            i11++;
        }
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        for (int i17 = 0; i17 < charsetEncoderArr.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                C17225d c17225d2 = c17225dArr[length][i17][i18];
                if (c17225d2 != null && (i10 = c17225d2.f54973f) < i15) {
                    i14 = i17;
                    i16 = i18;
                    i15 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new C5311e(this, c16842b, c17225dArr[length][i14][i16]);
        }
        throw new C14443b(AbstractC10763a.m11054l("Internal error: failed to encode \"", str, Separators.DOUBLE_QUOTE));
    }

    public C3029c(C3029c c3029c, C19501d[] c19501dArr, boolean z6, int i10) {
        this.f9116a = 4;
        this.f9120e = c3029c;
        this.f9119d = c19501dArr;
        boolean z10 = false;
        if (c19501dArr != null && z6) {
            z10 = true;
        }
        this.f9118c = z10;
        this.f9117b = i10;
    }

    public C3029c(String str, Charset charset, boolean z6, int i10) {
        this.f9116a = 2;
        this.f9119d = str;
        this.f9118c = z6;
        this.f9120e = new C14960d(str, charset);
        this.f9117b = i10;
    }

    public C3029c(SideSheetBehavior sideSheetBehavior) {
        this.f9116a = 0;
        this.f9120e = sideSheetBehavior;
        this.f9119d = new RunnableC0000A(this, 15);
    }

    public C3029c(BottomSheetBehavior bottomSheetBehavior) {
        this.f9116a = 1;
        this.f9120e = bottomSheetBehavior;
        this.f9119d = new RunnableC0153B(this, 28);
    }
}
