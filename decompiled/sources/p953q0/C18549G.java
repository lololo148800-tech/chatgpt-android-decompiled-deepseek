package p953q0;

import androidx.compose.foundation.lazy.layout.C10846a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.InterfaceC0571F;
import p492U1.C7536a;
import p774h1.InterfaceC14324B;
import p887m7.C17176b;

/* JADX INFO: renamed from: q0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C18549G {

    /* JADX INFO: renamed from: b */
    public C7536a f59102b;

    /* JADX INFO: renamed from: c */
    public int f59103c;

    /* JADX INFO: renamed from: d */
    public int f59104d;

    /* JADX INFO: renamed from: f */
    public int f59106f;

    /* JADX INFO: renamed from: g */
    public int f59107g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C10846a f59108h;

    /* JADX INFO: renamed from: a */
    public C18546D[] f59101a = AbstractC18551I.f59111a;

    /* JADX INFO: renamed from: e */
    public int f59105e = 1;

    public C18549G(C10846a c10846a) {
        this.f59108h = c10846a;
    }

    /* JADX INFO: renamed from: b */
    public static void m19918b(C18549G c18549g, InterfaceC18559Q interfaceC18559Q, InterfaceC0571F interfaceC0571F, InterfaceC14324B interfaceC14324B, int i10, int i11) {
        c18549g.f59108h.getClass();
        long jMo19816h = interfaceC18559Q.mo19816h(0);
        c18549g.m19919a(interfaceC18559Q, interfaceC0571F, interfaceC14324B, i10, i11, (int) (!interfaceC18559Q.mo19814f() ? jMo19816h & 4294967295L : jMo19816h >> 32));
    }

    /* JADX INFO: renamed from: a */
    public final void m19919a(InterfaceC18559Q interfaceC18559Q, InterfaceC0571F interfaceC0571F, InterfaceC14324B interfaceC14324B, int i10, int i11, int i12) {
        C18546D[] c18546dArr = this.f59101a;
        int length = c18546dArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                this.f59106f = i10;
                this.f59107g = i11;
                break;
            } else {
                C18546D c18546d = c18546dArr[i13];
                if (c18546d != null && c18546d.f59087g) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        int length2 = this.f59101a.length;
        for (int iMo19809a = interfaceC18559Q.mo19809a(); iMo19809a < length2; iMo19809a++) {
            C18546D c18546d2 = this.f59101a[iMo19809a];
            if (c18546d2 != null) {
                c18546d2.m19913c();
            }
        }
        if (this.f59101a.length != interfaceC18559Q.mo19809a()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f59101a, interfaceC18559Q.mo19809a());
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f59101a = (C18546D[]) objArrCopyOf;
        }
        this.f59102b = new C7536a(interfaceC18559Q.mo19812d());
        this.f59103c = i12;
        this.f59104d = interfaceC18559Q.mo19817i();
        this.f59105e = interfaceC18559Q.mo19813e();
        int iMo19809a2 = interfaceC18559Q.mo19809a();
        for (int i14 = 0; i14 < iMo19809a2; i14++) {
            Object objMo19811c = interfaceC18559Q.mo19811c(i14);
            C18592m c18592m = objMo19811c instanceof C18592m ? (C18592m) objMo19811c : null;
            if (c18592m == null) {
                C18546D c18546d3 = this.f59101a[i14];
                if (c18546d3 != null) {
                    c18546d3.m19913c();
                }
                this.f59101a[i14] = null;
            } else {
                C18546D c18546d4 = this.f59101a[i14];
                if (c18546d4 == null) {
                    c18546d4 = new C18546D(interfaceC0571F, interfaceC14324B, new C17176b(this.f59108h, 7));
                    this.f59101a[i14] = c18546d4;
                }
                c18546d4.f59084d = c18592m.f59232z0;
                c18546d4.f59085e = c18592m.f59230A0;
                c18546d4.f59086f = c18592m.f59231B0;
            }
        }
    }
}
