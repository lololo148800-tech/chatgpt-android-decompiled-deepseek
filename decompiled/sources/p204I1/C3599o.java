package p204I1;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C16557y;
import kotlin.jvm.internal.C16558z;
import p117Eb.C2385o;
import p117Eb.C2392v;
import p179H0.C3186d;
import p230J1.C4199z;
import p393Q1.AbstractC6559k;
import p393Q1.C6551c;
import p467T1.C7200j;
import p492U1.C7536a;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p544W9.AbstractC8640h;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9388w4;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.AbstractC14337O;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.C14341T;
import p774h1.C14361q;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p821j1.AbstractC16040e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: I1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3599o {

    /* JADX INFO: renamed from: a */
    public final C2392v f10958a;

    /* JADX INFO: renamed from: b */
    public final int f10959b;

    /* JADX INFO: renamed from: c */
    public final boolean f10960c;

    /* JADX INFO: renamed from: d */
    public final float f10961d;

    /* JADX INFO: renamed from: e */
    public final float f10962e;

    /* JADX INFO: renamed from: f */
    public final int f10963f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f10964g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f10965h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public C3599o(C2392v c2392v, long j10, int i10, boolean z6) {
        boolean z10;
        int iM7853h;
        this.f10958a = c2392v;
        this.f10959b = i10;
        if (C7536a.m7856k(j10) != 0 || C7536a.m7855j(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c2392v.f7440r0;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        float f10 = 0.0f;
        while (true) {
            if (i11 >= size) {
                z10 = false;
                break;
            }
            C3602r c3602r = (C3602r) arrayList2.get(i11);
            C6551c c6551c = c3602r.f10975a;
            int iM7854i = C7536a.m7854i(j10);
            if (C7536a.m7849d(j10)) {
                iM7853h = C7536a.m7853h(j10) - ((int) Math.ceil(f10));
                if (iM7853h < 0) {
                    iM7853h = 0;
                }
            } else {
                iM7853h = C7536a.m7853h(j10);
            }
            C3585a c3585a = new C3585a(c6551c, this.f10959b - i12, z6, AbstractC9388w4.m9959b(iM7854i, iM7853h, 5));
            float fM4282b = c3585a.m4282b() + f10;
            C4199z c4199z = c3585a.f10918d;
            int i13 = i12 + c4199z.f13641g;
            ArrayList arrayList3 = arrayList2;
            arrayList.add(new C3601q(c3585a, c3602r.f10976b, c3602r.f10977c, i12, i13, f10, fM4282b));
            if (c4199z.f13638d || (i13 == this.f10959b && i11 != AbstractC17681o.m19381j((ArrayList) this.f10958a.f7440r0))) {
                z10 = true;
                f10 = fM4282b;
                i12 = i13;
                break;
            } else {
                i11++;
                f10 = fM4282b;
                i12 = i13;
                arrayList2 = arrayList3;
            }
        }
        this.f10962e = f10;
        this.f10963f = i12;
        this.f10960c = z10;
        this.f10965h = arrayList;
        this.f10961d = C7536a.m7854i(j10);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C3601q c3601q = (C3601q) arrayList.get(i14);
            ?? r10 = c3601q.f10968a.f10920f;
            ArrayList arrayList5 = new ArrayList(r10.size());
            int size3 = r10.size();
            for (int i15 = 0; i15 < size3; i15++) {
                C13801c c13801c = (C13801c) r10.get(i15);
                arrayList5.add(c13801c != null ? c13801c.m15326m(AbstractC8088f6.m8536b(0.0f, c3601q.f10973f)) : null);
            }
            AbstractC17686t.m19398v(arrayList5, arrayList4);
        }
        if (arrayList4.size() < ((List) this.f10958a.f7437o0).size()) {
            int size4 = ((List) this.f10958a.f7437o0).size() - arrayList4.size();
            ArrayList arrayList6 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList6.add(null);
            }
            arrayList4 = AbstractC17680n.m19361k0(arrayList6, arrayList4);
        }
        this.f10964g = arrayList4;
    }

    /* JADX INFO: renamed from: g */
    public static void m4307g(C3599o c3599o, InterfaceC14362r interfaceC14362r, long j10, C14338P c14338p, C7200j c7200j, AbstractC16040e abstractC16040e, int i10, int i11) {
        long j11 = (i11 & 2) != 0 ? C14365u.f45060j : j10;
        C14338P c14338p2 = (i11 & 4) != 0 ? null : c14338p;
        C7200j c7200j2 = (i11 & 8) != 0 ? null : c7200j;
        AbstractC16040e abstractC16040e2 = (i11 & 16) != 0 ? null : abstractC16040e;
        int i12 = (i11 & 32) != 0 ? 3 : i10;
        interfaceC14362r.mo15706e();
        ArrayList arrayList = c3599o.f10965h;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            C3601q c3601q = (C3601q) arrayList.get(i13);
            c3601q.f10968a.m4286f(interfaceC14362r, j11, c14338p2, c7200j2, abstractC16040e2, i12);
            interfaceC14362r.mo15717p(0.0f, c3601q.f10968a.m4282b());
            i13++;
            j11 = j11;
        }
        interfaceC14362r.mo15719r();
    }

    /* JADX INFO: renamed from: h */
    public static void m4308h(C3599o c3599o, InterfaceC14362r interfaceC14362r, AbstractC14360p abstractC14360p, float f10, C14338P c14338p, C7200j c7200j, AbstractC16040e abstractC16040e) {
        interfaceC14362r.mo15706e();
        ArrayList arrayList = c3599o.f10965h;
        if (arrayList.size() <= 1 || (abstractC14360p instanceof C14341T)) {
            AbstractC6559k.m7124a(c3599o, interfaceC14362r, abstractC14360p, f10, c14338p, c7200j, abstractC16040e, 3);
        } else if (abstractC14360p instanceof AbstractC14337O) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM4282b = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                C3601q c3601q = (C3601q) arrayList.get(i10);
                fM4282b += c3601q.f10968a.m4282b();
                fMax = Math.max(fMax, c3601q.f10968a.m4284d());
            }
            Shader shaderMo14804b = ((AbstractC14337O) abstractC14360p).mo14804b(AbstractC8112i6.m8603a(fMax, fM4282b));
            Matrix matrix = new Matrix();
            shaderMo14804b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C3601q c3601q2 = (C3601q) arrayList.get(i11);
                c3601q2.f10968a.m4287g(interfaceC14362r, new C14361q(shaderMo14804b), f10, c14338p, c7200j, abstractC16040e, 3);
                C3585a c3585a = c3601q2.f10968a;
                interfaceC14362r.mo15717p(0.0f, c3585a.m4282b());
                matrix.setTranslate(0.0f, -c3585a.m4282b());
                shaderMo14804b.setLocalMatrix(matrix);
            }
        }
        interfaceC14362r.mo15719r();
    }

    /* JADX INFO: renamed from: a */
    public final void m4309a(long j10, float[] fArr) {
        m4315i(C3581L.m4270f(j10));
        m4316j(C3581L.m4269e(j10));
        C16558z c16558z = new C16558z();
        c16558z.f51287Y = 0;
        AbstractC8640h.m9307f(this.f10965h, j10, new C3186d(j10, fArr, c16558z, new C16557y()));
    }

    /* JADX INFO: renamed from: b */
    public final float m4310b(int i10) {
        m4317k(i10);
        ArrayList arrayList = this.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(AbstractC8640h.m9305d(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        return c3585a.f10918d.m4898e(i10 - c3601q.f10971d) + c3601q.f10973f;
    }

    /* JADX INFO: renamed from: c */
    public final int m4311c(float f10) {
        ArrayList arrayList = this.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(AbstractC8640h.m9306e(arrayList, f10));
        int i10 = c3601q.f10970c - c3601q.f10969b;
        int i11 = c3601q.f10971d;
        if (i10 == 0) {
            return i11;
        }
        float f11 = f10 - c3601q.f10973f;
        C4199z c4199z = c3601q.f10968a.f10918d;
        return i11 + c4199z.f13640f.getLineForVertical(((int) f11) - c4199z.f13642h);
    }

    /* JADX INFO: renamed from: d */
    public final float m4312d(int i10) {
        m4317k(i10);
        ArrayList arrayList = this.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(AbstractC8640h.m9305d(i10, arrayList));
        C3585a c3585a = c3601q.f10968a;
        return c3585a.f10918d.m4900g(i10 - c3601q.f10971d) + c3601q.f10973f;
    }

    /* JADX INFO: renamed from: e */
    public final int m4313e(long j10) {
        ArrayList arrayList = this.f10965h;
        C3601q c3601q = (C3601q) arrayList.get(AbstractC8640h.m9306e(arrayList, C13800b.m15307h(j10)));
        int i10 = c3601q.f10970c;
        int i11 = c3601q.f10969b;
        if (i10 - i11 == 0) {
            return i11;
        }
        long jM8536b = AbstractC8088f6.m8536b(C13800b.m15306g(j10), C13800b.m15307h(j10) - c3601q.f10973f);
        C3585a c3585a = c3601q.f10968a;
        int iM15307h = (int) C13800b.m15307h(jM8536b);
        C4199z c4199z = c3585a.f10918d;
        int i12 = iM15307h - c4199z.f13642h;
        Layout layout = c4199z.f13640f;
        int lineForVertical = layout.getLineForVertical(i12);
        return i11 + layout.getOffsetForHorizontal(lineForVertical, (c4199z.m4895b(lineForVertical) * (-1)) + C13800b.m15306g(jM8536b));
    }

    /* JADX INFO: renamed from: f */
    public final long m4314f(C13801c c13801c, int i10, C2385o c2385o) {
        long jM4318a;
        long j10;
        ArrayList arrayList = this.f10965h;
        int iM9306e = AbstractC8640h.m9306e(arrayList, c13801c.f43587b);
        float f10 = ((C3601q) arrayList.get(iM9306e)).f10974g;
        float f11 = c13801c.f43589d;
        if (f10 >= f11 || iM9306e == AbstractC17681o.m19381j(arrayList)) {
            C3601q c3601q = (C3601q) arrayList.get(iM9306e);
            return c3601q.m4318a(c3601q.f10968a.m4283c(c13801c.m15326m(AbstractC8088f6.m8536b(0.0f, -c3601q.f10973f)), i10, c2385o), true);
        }
        int iM9306e2 = AbstractC8640h.m9306e(arrayList, f11);
        long jM4318a2 = C3581L.f10906b;
        while (true) {
            jM4318a = C3581L.f10906b;
            if (!C3581L.m4266b(jM4318a2, jM4318a) || iM9306e > iM9306e2) {
                break;
            }
            C3601q c3601q2 = (C3601q) arrayList.get(iM9306e);
            jM4318a2 = c3601q2.m4318a(c3601q2.f10968a.m4283c(c13801c.m15326m(AbstractC8088f6.m8536b(0.0f, -c3601q2.f10973f)), i10, c2385o), true);
            iM9306e++;
        }
        if (C3581L.m4266b(jM4318a2, jM4318a)) {
            return jM4318a;
        }
        while (true) {
            j10 = C3581L.f10906b;
            if (!C3581L.m4266b(jM4318a, j10) || iM9306e > iM9306e2) {
                break;
            }
            C3601q c3601q3 = (C3601q) arrayList.get(iM9306e2);
            jM4318a = c3601q3.m4318a(c3601q3.f10968a.m4283c(c13801c.m15326m(AbstractC8088f6.m8536b(0.0f, -c3601q3.f10973f)), i10, c2385o), true);
            iM9306e2--;
        }
        return C3581L.m4266b(jM4318a, j10) ? jM4318a2 : AbstractC8676n.m9365b((int) (jM4318a2 >> 32), (int) (4294967295L & jM4318a));
    }

    /* JADX INFO: renamed from: i */
    public final void m4315i(int i10) {
        C2392v c2392v = this.f10958a;
        if (i10 < 0 || i10 >= ((C3590f) c2392v.f7436Z).f10934Y.length()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "offset(", ") is out of bounds [0, ");
            sbM11057o.append(((C3590f) c2392v.f7436Z).f10934Y.length());
            sbM11057o.append(')');
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4316j(int i10) {
        C2392v c2392v = this.f10958a;
        if (i10 < 0 || i10 > ((C3590f) c2392v.f7436Z).f10934Y.length()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "offset(", ") is out of bounds [0, ");
            sbM11057o.append(((C3590f) c2392v.f7436Z).f10934Y.length());
            sbM11057o.append(']');
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4317k(int i10) {
        int i11 = this.f10963f;
        if (i10 < 0 || i10 >= i11) {
            throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')').toString());
        }
    }
}
