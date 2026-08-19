package p1017t4;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.nio.charset.Charset;
import java.util.List;
import p003A1.AbstractC0168G;
import p1053v3.C20421b;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1073w3.InterfaceC20802d;
import p548Wd.p549VF.zakks;
import p644ab.AbstractC10531d;
import p775h2.AbstractC14376f;
import p885m4.C17153c;
import p885m4.C17162l;
import p885m4.InterfaceC17157g;
import p885m4.InterfaceC17163m;

/* JADX INFO: renamed from: t4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19800a implements InterfaceC17163m {

    /* JADX INFO: renamed from: Y */
    public final C20811m f62816Y = new C20811m();

    /* JADX INFO: renamed from: Z */
    public final boolean f62817Z;

    /* JADX INFO: renamed from: o0 */
    public final int f62818o0;

    /* JADX INFO: renamed from: p0 */
    public final int f62819p0;

    /* JADX INFO: renamed from: q0 */
    public final String f62820q0;

    /* JADX INFO: renamed from: r0 */
    public final float f62821r0;

    /* JADX INFO: renamed from: s0 */
    public final int f62822s0;

    public C19800a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f62818o0 = 0;
            this.f62819p0 = -1;
            this.f62820q0 = "sans-serif";
            this.f62817Z = false;
            this.f62821r0 = 0.85f;
            this.f62822s0 = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f62818o0 = bArr[24];
        this.f62819p0 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f62820q0 = "Serif".equals(new String(bArr, 43, bArr.length - 43, AbstractC10531d.f31242c)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f62822s0 = i10;
        boolean z6 = (bArr[0] & 32) != 0;
        this.f62817Z = z6;
        if (z6) {
            this.f62821r0 = AbstractC20817s.m21407h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f62821r0 = 0.85f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20760a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20761b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z6 = (i10 & 1) != 0;
            boolean z10 = (i10 & 2) != 0;
            if (z6) {
                if (z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z11 = (i10 & 4) != 0;
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z11 || z6 || z10) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo3514c() {
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC17157g mo3516i(byte[] bArr, int i10, int i11) {
        return AbstractC14376f.m15838d(this, bArr, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: o */
    public final void mo3519o(byte[] bArr, int i10, int i11, C17162l c17162l, InterfaceC20802d interfaceC20802d) {
        String strM21363r;
        int i12 = 1;
        C20811m c20811m = this.f62816Y;
        c20811m.m21342D(i10 + i11, bArr);
        c20811m.m21344F(i10);
        int i13 = 2;
        int i14 = 0;
        AbstractC20800b.m21316d(c20811m.m21346a() >= 2);
        int iM21371z = c20811m.m21371z();
        if (iM21371z == 0) {
            strM21363r = "";
        } else {
            int i15 = c20811m.f66093b;
            Charset charsetM21340B = c20811m.m21340B();
            int i16 = iM21371z - (c20811m.f66093b - i15);
            if (charsetM21340B == null) {
                charsetM21340B = AbstractC10531d.f31242c;
            }
            strM21363r = c20811m.m21363r(i16, charsetM21340B);
        }
        if (strM21363r.isEmpty()) {
            C11276A c11276a = AbstractC11278C.f34162Z;
            interfaceC20802d.accept(new C17153c(C11294T.f34185q0, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM21363r);
        m20761b(spannableStringBuilder, this.f62818o0, 0, 0, spannableStringBuilder.length(), 16711680);
        m20760a(spannableStringBuilder, this.f62819p0, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = zakks.dzeLp;
        String str2 = this.f62820q0;
        if (str2 != str) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float fM21407h = this.f62821r0;
        while (c20811m.m21346a() >= 8) {
            int i17 = c20811m.f66093b;
            int iM21352g = c20811m.m21352g();
            int iM21352g2 = c20811m.m21352g();
            if (iM21352g2 == 1937013100) {
                AbstractC20800b.m21316d(c20811m.m21346a() >= i13 ? i12 : i14);
                int iM21371z2 = c20811m.m21371z();
                int i18 = i14;
                while (i18 < iM21371z2) {
                    AbstractC20800b.m21316d(c20811m.m21346a() >= 12 ? i12 : i14);
                    int iM21371z3 = c20811m.m21371z();
                    int iM21371z4 = c20811m.m21371z();
                    c20811m.m21345G(i13);
                    int iM21365t = c20811m.m21365t();
                    c20811m.m21345G(i12);
                    int iM21352g3 = c20811m.m21352g();
                    if (iM21371z4 > spannableStringBuilder.length()) {
                        StringBuilder sbM11057o = AbstractC10763a.m11057o(iM21371z4, "Truncating styl end (", ") to cueText.length() (");
                        sbM11057o.append(spannableStringBuilder.length());
                        sbM11057o.append(").");
                        AbstractC20800b.m21332t("Tx3gParser", sbM11057o.toString());
                        iM21371z4 = spannableStringBuilder.length();
                    }
                    if (iM21371z3 >= iM21371z4) {
                        AbstractC20800b.m21332t("Tx3gParser", AbstractC0168G.m532u("Ignoring styl with start (", iM21371z3, ") >= end (", iM21371z4, ")."));
                    } else {
                        int i19 = iM21371z4;
                        m20761b(spannableStringBuilder, iM21365t, this.f62818o0, iM21371z3, i19, 0);
                        m20760a(spannableStringBuilder, iM21352g3, this.f62819p0, iM21371z3, i19, 0);
                    }
                    i12 = 1;
                    i18++;
                    i13 = 2;
                    i14 = 0;
                }
            } else if (iM21352g2 == 1952608120 && this.f62817Z) {
                i13 = 2;
                AbstractC20800b.m21316d(c20811m.m21346a() >= 2 ? i12 : 0);
                fM21407h = AbstractC20817s.m21407h(c20811m.m21371z() / this.f62822s0, 0.0f, 0.95f);
            } else {
                i13 = 2;
            }
            c20811m.m21344F(i17 + iM21352g);
            i14 = 0;
        }
        interfaceC20802d.accept(new C17153c(AbstractC11278C.m12695y(new C20421b(spannableStringBuilder, null, null, null, fM21407h, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }
}
