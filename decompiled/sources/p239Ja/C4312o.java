package p239Ja;

import android.content.res.TypedArray;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.SparseArray;
import com.google.protobuf.AbstractC12107L1;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p1073w3.AbstractC20800b;
import p230J1.C4185l;
import p350O1.C6063l;
import p544W9.AbstractC8530O2;
import p571X9.AbstractC9306j0;
import p615Z6.C10173D;
import p615Z6.C10229o;
import p615Z6.InterfaceC10186K;
import p658b5.C11242m;
import p824j4.C16121q;
import p909nm.AbstractC17678l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Ja.o */
/* JADX INFO: loaded from: classes.dex */
public class C4312o implements InterfaceC10186K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14015a;

    /* JADX INFO: renamed from: b */
    public int f14016b;

    /* JADX INFO: renamed from: c */
    public int f14017c;

    /* JADX INFO: renamed from: d */
    public Object f14018d;

    /* JADX INFO: renamed from: e */
    public Object f14019e;

    public /* synthetic */ C4312o(int i10, byte b) {
        this.f14015a = i10;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m5068x(int i10) {
        return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
    }

    /* JADX INFO: renamed from: A */
    public C10173D m5069A() {
        float fM5106z = m5106z();
        if (Float.isNaN(fM5106z)) {
            return null;
        }
        int iM5073E = m5073E();
        return iM5073E == 0 ? new C10173D(1, fM5106z) : new C10173D(iM5073E, fM5106z);
    }

    /* JADX INFO: renamed from: B */
    public String m5070B() {
        if (m5098q()) {
            return null;
        }
        int i10 = this.f14016b;
        String str = (String) this.f14018d;
        char cCharAt = str.charAt(i10);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iM5089h = m5089h();
        while (iM5089h != -1 && iM5089h != cCharAt) {
            iM5089h = m5089h();
        }
        if (iM5089h == -1) {
            this.f14016b = i10;
            return null;
        }
        int i11 = this.f14016b;
        this.f14016b = i11 + 1;
        return str.substring(i10 + 1, i11);
    }

    /* JADX INFO: renamed from: C */
    public String m5071C() {
        return m5072D(' ', false);
    }

    /* JADX INFO: renamed from: D */
    public String m5072D(char c9, boolean z6) {
        if (m5098q()) {
            return null;
        }
        int i10 = this.f14016b;
        String str = (String) this.f14018d;
        char cCharAt = str.charAt(i10);
        if ((!z6 && m5068x(cCharAt)) || cCharAt == c9) {
            return null;
        }
        int i11 = this.f14016b;
        int iM5089h = m5089h();
        while (iM5089h != -1 && iM5089h != c9 && (z6 || !m5068x(iM5089h))) {
            iM5089h = m5089h();
        }
        return str.substring(i11, this.f14016b);
    }

    /* JADX INFO: renamed from: E */
    public int m5073E() {
        if (m5098q()) {
            return 0;
        }
        int i10 = this.f14016b;
        String str = (String) this.f14018d;
        if (str.charAt(i10) == '%') {
            this.f14016b++;
            return 9;
        }
        int i11 = this.f14016b;
        if (i11 > this.f14017c - 2) {
            return 0;
        }
        try {
            int iM9905x = AbstractC9306j0.m9905x(str.substring(i11, i11 + 2).toLowerCase(Locale.US));
            this.f14016b += 2;
            return iM9905x;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: F */
    public synchronized Object m5074F() {
        return this.f14017c == 0 ? null : m5076H();
    }

    /* JADX INFO: renamed from: G */
    public synchronized Object m5075G(long j10) {
        Object objM5076H;
        objM5076H = null;
        while (this.f14017c > 0 && j10 - ((long[]) this.f14018d)[this.f14016b] >= 0) {
            objM5076H = m5076H();
        }
        return objM5076H;
    }

    /* JADX INFO: renamed from: H */
    public Object m5076H() {
        AbstractC20800b.m21320h(this.f14017c > 0);
        Object[] objArr = (Object[]) this.f14019e;
        int i10 = this.f14016b;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f14016b = (i10 + 1) % objArr.length;
        this.f14017c--;
        return obj;
    }

    /* JADX INFO: renamed from: I */
    public float m5077I() {
        m5080L();
        int i10 = this.f14016b;
        int i11 = this.f14017c;
        C10229o c10229o = (C10229o) this.f14019e;
        float fM10793a = c10229o.m10793a(i10, i11, (String) this.f14018d);
        if (!Float.isNaN(fM10793a)) {
            this.f14016b = c10229o.f30367a;
        }
        return fM10793a;
    }

    /* JADX INFO: renamed from: J */
    public void m5078J(int i10, int i11, String str) {
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("start index must be less than or equal to end index: ", i10, i11, " > ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "start must be non-negative, but was ").toString());
        }
        C6063l c6063l = (C6063l) this.f14019e;
        if (c6063l == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(((String) this.f14018d).length() - i11, 64);
            String str2 = (String) this.f14018d;
            int i12 = i10 - iMin;
            AbstractC16544l.m18092e(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i12, i10, cArr, 0);
            String str3 = (String) this.f14018d;
            int i13 = iMax - iMin2;
            int i14 = iMin2 + i11;
            AbstractC16544l.m18092e(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i11, i14, cArr, i13);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C6063l c6063l2 = new C6063l(0);
            c6063l2.f19750b = iMax;
            c6063l2.f19751c = cArr;
            c6063l2.f19752d = length;
            c6063l2.f19753e = i13;
            this.f14019e = c6063l2;
            this.f14016b = i12;
            this.f14017c = i14;
            return;
        }
        int i15 = this.f14016b;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 < 0 || i17 > c6063l.f19750b - c6063l.m6638a()) {
            this.f14018d = toString();
            this.f14019e = null;
            this.f14016b = -1;
            this.f14017c = -1;
            m5078J(i10, i11, str);
            return;
        }
        int length2 = str.length() - (i17 - i16);
        if (length2 > c6063l.m6638a()) {
            int iM6638a = length2 - c6063l.m6638a();
            int i18 = c6063l.f19750b;
            do {
                i18 *= 2;
            } while (i18 - c6063l.f19750b < iM6638a);
            char[] cArr2 = new char[i18];
            AbstractC17678l.m19306m(c6063l.f19751c, cArr2, 0, 0, c6063l.f19752d);
            int i19 = c6063l.f19750b;
            int i20 = c6063l.f19753e;
            int i21 = i19 - i20;
            int i22 = i18 - i21;
            AbstractC17678l.m19306m(c6063l.f19751c, cArr2, i22, i20, i21 + i20);
            c6063l.f19751c = cArr2;
            c6063l.f19750b = i18;
            c6063l.f19753e = i22;
        }
        int i23 = c6063l.f19752d;
        if (i16 < i23 && i17 <= i23) {
            int i24 = i23 - i17;
            char[] cArr3 = c6063l.f19751c;
            AbstractC17678l.m19306m(cArr3, cArr3, c6063l.f19753e - i24, i17, i23);
            c6063l.f19752d = i16;
            c6063l.f19753e -= i24;
        } else if (i16 >= i23 || i17 < i23) {
            int iM6638a2 = c6063l.m6638a() + i16;
            int iM6638a3 = c6063l.m6638a() + i17;
            int i25 = c6063l.f19753e;
            char[] cArr4 = c6063l.f19751c;
            AbstractC17678l.m19306m(cArr4, cArr4, c6063l.f19752d, i25, iM6638a2);
            c6063l.f19752d += iM6638a2 - i25;
            c6063l.f19753e = iM6638a3;
        } else {
            c6063l.f19753e = c6063l.m6638a() + i17;
            c6063l.f19752d = i16;
        }
        str.getChars(0, str.length(), c6063l.f19751c, c6063l.f19752d);
        c6063l.f19752d = str.length() + c6063l.f19752d;
    }

    /* JADX INFO: renamed from: K */
    public synchronized int m5079K() {
        return this.f14017c;
    }

    /* JADX INFO: renamed from: L */
    public boolean m5080L() {
        m5081M();
        int i10 = this.f14016b;
        if (i10 == this.f14017c || ((String) this.f14018d).charAt(i10) != ',') {
            return false;
        }
        this.f14016b++;
        m5081M();
        return true;
    }

    /* JADX INFO: renamed from: M */
    public void m5081M() {
        while (true) {
            int i10 = this.f14016b;
            if (i10 >= this.f14017c || !m5068x(((String) this.f14018d).charAt(i10))) {
                return;
            } else {
                this.f14016b++;
            }
        }
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: a */
    public void mo5082a(float f10, float f11, float f12, float f13) {
        m5088g((byte) 3);
        m5096o(4);
        float[] fArr = (float[]) this.f14019e;
        int i10 = this.f14017c;
        int i11 = i10 + 1;
        this.f14017c = i11;
        fArr[i10] = f10;
        int i12 = i10 + 2;
        this.f14017c = i12;
        fArr[i11] = f11;
        int i13 = i10 + 3;
        this.f14017c = i13;
        fArr[i12] = f12;
        this.f14017c = i10 + 4;
        fArr[i13] = f13;
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: b */
    public void mo5083b(float f10, float f11) {
        m5088g((byte) 0);
        m5096o(2);
        float[] fArr = (float[]) this.f14019e;
        int i10 = this.f14017c;
        int i11 = i10 + 1;
        this.f14017c = i11;
        fArr[i10] = f10;
        this.f14017c = i10 + 2;
        fArr[i11] = f11;
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: c */
    public void mo5084c(float f10, float f11, float f12, float f13, float f14, float f15) {
        m5088g((byte) 2);
        m5096o(6);
        float[] fArr = (float[]) this.f14019e;
        int i10 = this.f14017c;
        int i11 = i10 + 1;
        this.f14017c = i11;
        fArr[i10] = f10;
        int i12 = i10 + 2;
        this.f14017c = i12;
        fArr[i11] = f11;
        int i13 = i10 + 3;
        this.f14017c = i13;
        fArr[i12] = f12;
        int i14 = i10 + 4;
        this.f14017c = i14;
        fArr[i13] = f13;
        int i15 = i10 + 5;
        this.f14017c = i15;
        fArr[i14] = f14;
        this.f14017c = i10 + 6;
        fArr[i15] = f15;
    }

    @Override // p615Z6.InterfaceC10186K
    public void close() {
        m5088g((byte) 8);
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: d */
    public void mo5085d(float f10, float f11, float f12, boolean z6, boolean z10, float f13, float f14) {
        m5088g((byte) ((z6 ? 2 : 0) | 4 | (z10 ? 1 : 0)));
        m5096o(5);
        float[] fArr = (float[]) this.f14019e;
        int i10 = this.f14017c;
        int i11 = i10 + 1;
        this.f14017c = i11;
        fArr[i10] = f10;
        int i12 = i10 + 2;
        this.f14017c = i12;
        fArr[i11] = f11;
        int i13 = i10 + 3;
        this.f14017c = i13;
        fArr[i12] = f12;
        int i14 = i10 + 4;
        this.f14017c = i14;
        fArr[i13] = f13;
        this.f14017c = i10 + 5;
        fArr[i14] = f14;
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: e */
    public void mo5086e(float f10, float f11) {
        m5088g((byte) 1);
        m5096o(2);
        float[] fArr = (float[]) this.f14019e;
        int i10 = this.f14017c;
        int i11 = i10 + 1;
        this.f14017c = i11;
        fArr[i10] = f10;
        this.f14017c = i10 + 2;
        fArr[i11] = f11;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m5087f(long j10, Object obj) {
        int i10 = this.f14017c;
        if (i10 > 0) {
            if (j10 <= ((long[]) this.f14018d)[((this.f14016b + i10) - 1) % ((Object[]) this.f14019e).length]) {
                m5093l();
            }
        }
        m5097p();
        int i11 = this.f14016b;
        int i12 = this.f14017c;
        Object[] objArr = (Object[]) this.f14019e;
        int length = (i11 + i12) % objArr.length;
        ((long[]) this.f14018d)[length] = j10;
        objArr[length] = obj;
        this.f14017c = i12 + 1;
    }

    /* JADX INFO: renamed from: g */
    public void m5088g(byte b) {
        int i10 = this.f14016b;
        byte[] bArr = (byte[]) this.f14018d;
        if (i10 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f14018d = bArr2;
        }
        byte[] bArr3 = (byte[]) this.f14018d;
        int i11 = this.f14016b;
        this.f14016b = i11 + 1;
        bArr3[i11] = b;
    }

    /* JADX INFO: renamed from: h */
    public int m5089h() {
        int i10 = this.f14016b;
        int i11 = this.f14017c;
        if (i10 == i11) {
            return -1;
        }
        int i12 = i10 + 1;
        this.f14016b = i12;
        if (i12 < i11) {
            return ((String) this.f14018d).charAt(i12);
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public void m5090i(int i10) {
        int i11 = this.f14016b;
        int i12 = this.f14017c;
        if (i10 > i12 || i11 > i10) {
            throw new IllegalArgumentException(AbstractC12107L1.m13826q(AbstractC0010F.m21e("Invalid offset: ", i10, ". Valid range is [", i11, " , "), i12, ']').toString());
        }
    }

    /* JADX INFO: renamed from: j */
    public Boolean m5091j(Object obj) {
        if (obj == null) {
            return null;
        }
        m5080L();
        int i10 = this.f14016b;
        if (i10 == this.f14017c) {
            return null;
        }
        char cCharAt = ((String) this.f14018d).charAt(i10);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f14016b++;
        return Boolean.valueOf(cCharAt == '1');
    }

    /* JADX INFO: renamed from: k */
    public float m5092k(float f10) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        m5080L();
        return m5106z();
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m5093l() {
        this.f14016b = 0;
        this.f14017c = 0;
        Arrays.fill((Object[]) this.f14019e, (Object) null);
    }

    /* JADX INFO: renamed from: m */
    public boolean m5094m(char c9) {
        int i10 = this.f14016b;
        boolean z6 = i10 < this.f14017c && ((String) this.f14018d).charAt(i10) == c9;
        if (z6) {
            this.f14016b++;
        }
        return z6;
    }

    /* JADX INFO: renamed from: n */
    public boolean m5095n(String str) {
        int length = str.length();
        int i10 = this.f14016b;
        boolean z6 = i10 <= this.f14017c - length && ((String) this.f14018d).substring(i10, i10 + length).equals(str);
        if (z6) {
            this.f14016b += length;
        }
        return z6;
    }

    /* JADX INFO: renamed from: o */
    public void m5096o(int i10) {
        float[] fArr = (float[]) this.f14019e;
        if (fArr.length < this.f14017c + i10) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f14019e = fArr2;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m5097p() {
        int length = ((Object[]) this.f14019e).length;
        if (this.f14017c < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f14016b;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f14018d, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.f14019e, this.f14016b, objArr, 0, i12);
        int i13 = this.f14016b;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f14018d, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.f14019e, 0, objArr, i12, this.f14016b);
        }
        this.f14018d = jArr;
        this.f14019e = objArr;
        this.f14016b = 0;
    }

    /* JADX INFO: renamed from: q */
    public boolean m5098q() {
        return this.f14016b == this.f14017c;
    }

    /* JADX INFO: renamed from: r */
    public void m5099r(InterfaceC10186K interfaceC10186K) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14016b; i11++) {
            byte b = ((byte[]) this.f14018d)[i11];
            if (b == 0) {
                float[] fArr = (float[]) this.f14019e;
                int i12 = i10 + 1;
                float f10 = fArr[i10];
                i10 += 2;
                interfaceC10186K.mo5083b(f10, fArr[i12]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.f14019e;
                int i13 = i10 + 1;
                float f11 = fArr2[i10];
                i10 += 2;
                interfaceC10186K.mo5086e(f11, fArr2[i13]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.f14019e;
                float f12 = fArr3[i10];
                float f13 = fArr3[i10 + 1];
                float f14 = fArr3[i10 + 2];
                float f15 = fArr3[i10 + 3];
                int i14 = i10 + 5;
                float f16 = fArr3[i10 + 4];
                i10 += 6;
                interfaceC10186K.mo5084c(f12, f13, f14, f15, f16, fArr3[i14]);
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.f14019e;
                float f17 = fArr4[i10];
                float f18 = fArr4[i10 + 1];
                int i15 = i10 + 3;
                float f19 = fArr4[i10 + 2];
                i10 += 4;
                interfaceC10186K.mo5082a(f17, f18, f19, fArr4[i15]);
            } else if (b != 8) {
                boolean z6 = (b & 2) != 0;
                boolean z10 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.f14019e;
                float f20 = fArr5[i10];
                float f21 = fArr5[i10 + 1];
                float f22 = fArr5[i10 + 2];
                int i16 = i10 + 4;
                float f23 = fArr5[i10 + 3];
                i10 += 5;
                interfaceC10186K.mo5085d(f20, f21, f22, z6, z10, f23, fArr5[i16]);
            } else {
                interfaceC10186K.close();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public int m5100s() {
        C6063l c6063l = (C6063l) this.f14019e;
        if (c6063l == null) {
            return ((String) this.f14018d).length();
        }
        return (c6063l.f19750b - c6063l.m6638a()) + (((String) this.f14018d).length() - (this.f14017c - this.f14016b));
    }

    /* JADX INFO: renamed from: t */
    public boolean m5101t(int i10) {
        return i10 <= this.f14017c && this.f14016b + 1 <= i10 && Character.isLetterOrDigit(Character.codePointBefore((CharSequence) this.f14018d, i10));
    }

    public String toString() {
        switch (this.f14015a) {
            case 2:
                C6063l c6063l = (C6063l) this.f14019e;
                if (c6063l == null) {
                    return (String) this.f14018d;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) this.f14018d, 0, this.f14016b);
                sb2.append(c6063l.f19751c, 0, c6063l.f19752d);
                char[] cArr = c6063l.f19751c;
                int i10 = c6063l.f19753e;
                sb2.append(cArr, i10, c6063l.f19750b - i10);
                String str = (String) this.f14018d;
                sb2.append((CharSequence) str, this.f14017c, str.length());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m5102u(int i10) {
        int i11 = this.f14016b + 1;
        if (i10 > this.f14017c || i11 > i10) {
            return false;
        }
        return AbstractC8530O2.m9192a(Character.codePointBefore((CharSequence) this.f14018d, i10));
    }

    /* JADX INFO: renamed from: v */
    public boolean m5103v(int i10) {
        return i10 < this.f14017c && this.f14016b <= i10 && Character.isLetterOrDigit(Character.codePointAt((CharSequence) this.f14018d, i10));
    }

    /* JADX INFO: renamed from: w */
    public boolean m5104w(int i10) {
        if (i10 >= this.f14017c || this.f14016b > i10) {
            return false;
        }
        return AbstractC8530O2.m9192a(Character.codePointAt((CharSequence) this.f14018d, i10));
    }

    /* JADX INFO: renamed from: y */
    public Integer m5105y() {
        int i10 = this.f14016b;
        if (i10 == this.f14017c) {
            return null;
        }
        this.f14016b = i10 + 1;
        return Integer.valueOf(((String) this.f14018d).charAt(i10));
    }

    /* JADX INFO: renamed from: z */
    public float m5106z() {
        int i10 = this.f14016b;
        int i11 = this.f14017c;
        C10229o c10229o = (C10229o) this.f14019e;
        float fM10793a = c10229o.m10793a(i10, i11, (String) this.f14018d);
        if (!Float.isNaN(fM10793a)) {
            this.f14016b = c10229o.f30367a;
        }
        return fM10793a;
    }

    public C4312o(CharSequence charSequence, int i10, Locale locale) {
        this.f14015a = 1;
        this.f14018d = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f14019e = wordInstance;
        this.f14016b = Math.max(0, -50);
        this.f14017c = Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new C4185l(i10, charSequence));
    }

    public C4312o() {
        this.f14015a = 6;
        this.f14018d = new long[10];
        this.f14019e = new Object[10];
    }

    public C4312o(C4313p c4313p, C11242m c11242m) {
        this.f14015a = 0;
        this.f14018d = new SparseArray();
        this.f14019e = c4313p;
        TypedArray typedArray = (TypedArray) c11242m.f34019Z;
        this.f14016b = typedArray.getResourceId(26, 0);
        this.f14017c = typedArray.getResourceId(50, 0);
    }

    public C4312o(int i10) {
        this.f14015a = 5;
        this.f14018d = new C16121q[i10];
        this.f14017c = 0;
    }

    public C4312o(String str) {
        this.f14015a = 4;
        this.f14016b = 0;
        this.f14017c = 0;
        this.f14019e = new C10229o();
        String strTrim = str.trim();
        this.f14018d = strTrim;
        this.f14017c = strTrim.length();
    }
}
