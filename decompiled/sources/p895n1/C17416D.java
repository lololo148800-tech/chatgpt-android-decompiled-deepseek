package p895n1;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import io.sentry.android.core.internal.util.C15232d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9113C4;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14326D;
import p774h1.C14347c;
import p774h1.C14351g;
import p774h1.C14356l;
import p774h1.C14358n;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p775h2.AbstractC14376f;
import p821j1.C16036a;
import p821j1.C16037b;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: n1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C17416D extends AbstractC17414B {

    /* JADX INFO: renamed from: b */
    public final C17422b f55614b;

    /* JADX INFO: renamed from: c */
    public String f55615c;

    /* JADX INFO: renamed from: d */
    public boolean f55616d;

    /* JADX INFO: renamed from: e */
    public final C15232d f55617e;

    /* JADX INFO: renamed from: f */
    public AbstractC16546n f55618f;

    /* JADX INFO: renamed from: g */
    public final C6002f0 f55619g;

    /* JADX INFO: renamed from: h */
    public C14356l f55620h;

    /* JADX INFO: renamed from: i */
    public final C6002f0 f55621i;

    /* JADX INFO: renamed from: j */
    public long f55622j;

    /* JADX INFO: renamed from: k */
    public float f55623k;

    /* JADX INFO: renamed from: l */
    public float f55624l;

    /* JADX INFO: renamed from: m */
    public final C17415C f55625m;

    public C17416D(C17422b c17422b) {
        this.f55614b = c17422b;
        c17422b.f55660i = new C17415C(this, 0);
        this.f55615c = "";
        this.f55616d = true;
        this.f55617e = new C15232d();
        this.f55618f = C17426f.f55705o0;
        C5975S c5975s = C5975S.f19448r0;
        this.f55619g = C5997d.m6430Q(null, c5975s);
        this.f55621i = C5997d.m6430Q(new C13803e(0L), c5975s);
        this.f55622j = 9205357640488583168L;
        this.f55623k = 1.0f;
        this.f55624l = 1.0f;
        this.f55625m = new C17415C(this, 1);
    }

    @Override // p895n1.AbstractC17414B
    /* JADX INFO: renamed from: a */
    public final void mo19108a(InterfaceC16039d interfaceC16039d) {
        m19112e(interfaceC16039d, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX INFO: renamed from: e */
    public final void m19112e(InterfaceC16039d interfaceC16039d, float f10, C14356l c14356l) {
        C14356l c14356l2;
        long jM9643a;
        C14351g c14351gM15628f;
        C14347c c14347cM15623a;
        long j10;
        ColorFilter porterDuffColorFilter;
        C14356l c14356l3;
        C17422b c17422b = this.f55614b;
        boolean z6 = c17422b.f55655d;
        C6002f0 c6002f0 = this.f55619g;
        int i10 = (z6 && c17422b.f55656e != 16 && AbstractC17418F.m19113a((C14356l) c6002f0.getValue()) && AbstractC17418F.m19113a(c14356l)) ? 1 : 0;
        boolean z10 = this.f55616d;
        C15232d c15232d = this.f55617e;
        if (z10 || !C13803e.m15330b(this.f55622j, interfaceC16039d.mo17602i())) {
            if (C14326D.m15601a(i10, 1)) {
                j10 = c17422b.f55656e;
                if (Build.VERSION.SDK_INT >= 29) {
                    porterDuffColorFilter = C14358n.f45047a.m15769a(j10, 5);
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(AbstractC14334L.m15617F(j10), AbstractC14334L.m15621J(5));
                }
                c14356l2 = new C14356l(j10, 5, porterDuffColorFilter);
            } else {
                c14356l2 = null;
            }
            this.f55620h = c14356l2;
            float fM15333e = C13803e.m15333e(interfaceC16039d.mo17602i());
            C6002f0 c6002f1 = this.f55621i;
            this.f55623k = fM15333e / C13803e.m15333e(((C13803e) c6002f1.getValue()).f43598a);
            this.f55624l = C13803e.m15331c(interfaceC16039d.mo17602i()) / C13803e.m15331c(((C13803e) c6002f1.getValue()).f43598a);
            jM9643a = AbstractC9113C4.m9643a((int) Math.ceil(C13803e.m15333e(interfaceC16039d.mo17602i())), (int) Math.ceil(C13803e.m15331c(interfaceC16039d.mo17602i())));
            EnumC7546k layoutDirection = interfaceC16039d.getLayoutDirection();
            c14351gM15628f = (C14351g) c15232d.f47532c;
            C14347c c14347c = (C14347c) c15232d.f47533d;
            if (c14351gM15628f != null || c14347c == null) {
                c14351gM15628f = AbstractC14334L.m15628f((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L), i10);
                c14347cM15623a = AbstractC14334L.m15623a(c14351gM15628f);
                c15232d.f47532c = c14351gM15628f;
                c15232d.f47533d = c14347cM15623a;
                c15232d.f47531b = i10;
            } else {
                int i11 = (int) (jM9643a >> 32);
                Bitmap bitmap = c14351gM15628f.f45036a;
                if (i11 > bitmap.getWidth() || ((int) (jM9643a & 4294967295L)) > bitmap.getHeight() || !C14326D.m15601a(c15232d.f47531b, i10)) {
                    c14351gM15628f = AbstractC14334L.m15628f((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L), i10);
                    c14347cM15623a = AbstractC14334L.m15623a(c14351gM15628f);
                    c15232d.f47532c = c14351gM15628f;
                    c15232d.f47533d = c14347cM15623a;
                    c15232d.f47531b = i10;
                } else {
                    c14347cM15623a = c14347c;
                }
            }
            c15232d.f47530a = jM9643a;
            long jM9645c = AbstractC9113C4.m9645c(jM9643a);
            C16037b c16037b = (C16037b) c15232d.f47534e;
            C16036a c16036a = c16037b.f49478Y;
            InterfaceC7537b interfaceC7537b = c16036a.f49474a;
            EnumC7546k enumC7546k = c16036a.f49475b;
            InterfaceC14362r interfaceC14362r = c16036a.f49476c;
            long j11 = c16036a.f49477d;
            c16036a.f49474a = interfaceC16039d;
            c16036a.f49475b = layoutDirection;
            c16036a.f49476c = c14347cM15623a;
            c16036a.f49477d = jM9645c;
            c14347cM15623a.mo15706e();
            AbstractC14376f.m15850p(c16037b, C14365u.f45052b, 0L, 0L, 0.0f, 62);
            this.f55625m.invoke(c16037b);
            c14347cM15623a.mo15719r();
            C16036a c16036a2 = c16037b.f49478Y;
            c16036a2.f49474a = interfaceC7537b;
            c16036a2.f49475b = enumC7546k;
            c16036a2.f49476c = interfaceC14362r;
            c16036a2.f49477d = j11;
            c14351gM15628f.f45036a.prepareToDraw();
            this.f55616d = false;
            this.f55622j = interfaceC16039d.mo17602i();
        } else {
            C14351g c14351g = (C14351g) c15232d.f47532c;
            if (!C14326D.m15601a(i10, c14351g != null ? c14351g.m15728a() : 0)) {
                if (C14326D.m15601a(i10, 1)) {
                    j10 = c17422b.f55656e;
                    if (Build.VERSION.SDK_INT >= 29) {
                        porterDuffColorFilter = C14358n.f45047a.m15769a(j10, 5);
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(AbstractC14334L.m15617F(j10), AbstractC14334L.m15621J(5));
                    }
                    c14356l2 = new C14356l(j10, 5, porterDuffColorFilter);
                } else {
                    c14356l2 = null;
                }
                this.f55620h = c14356l2;
                float fM15333e2 = C13803e.m15333e(interfaceC16039d.mo17602i());
                C6002f0 c6002f2 = this.f55621i;
                this.f55623k = fM15333e2 / C13803e.m15333e(((C13803e) c6002f2.getValue()).f43598a);
                this.f55624l = C13803e.m15331c(interfaceC16039d.mo17602i()) / C13803e.m15331c(((C13803e) c6002f2.getValue()).f43598a);
                jM9643a = AbstractC9113C4.m9643a((int) Math.ceil(C13803e.m15333e(interfaceC16039d.mo17602i())), (int) Math.ceil(C13803e.m15331c(interfaceC16039d.mo17602i())));
                EnumC7546k layoutDirection2 = interfaceC16039d.getLayoutDirection();
                c14351gM15628f = (C14351g) c15232d.f47532c;
                C14347c c14347c2 = (C14347c) c15232d.f47533d;
                if (c14351gM15628f != null) {
                    c14351gM15628f = AbstractC14334L.m15628f((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L), i10);
                    c14347cM15623a = AbstractC14334L.m15623a(c14351gM15628f);
                    c15232d.f47532c = c14351gM15628f;
                    c15232d.f47533d = c14347cM15623a;
                    c15232d.f47531b = i10;
                } else {
                    c14351gM15628f = AbstractC14334L.m15628f((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L), i10);
                    c14347cM15623a = AbstractC14334L.m15623a(c14351gM15628f);
                    c15232d.f47532c = c14351gM15628f;
                    c15232d.f47533d = c14347cM15623a;
                    c15232d.f47531b = i10;
                }
                c15232d.f47530a = jM9643a;
                long jM9645c2 = AbstractC9113C4.m9645c(jM9643a);
                C16037b c16037b2 = (C16037b) c15232d.f47534e;
                C16036a c16036a3 = c16037b2.f49478Y;
                InterfaceC7537b interfaceC7537b2 = c16036a3.f49474a;
                EnumC7546k enumC7546k2 = c16036a3.f49475b;
                InterfaceC14362r interfaceC14362r2 = c16036a3.f49476c;
                long j12 = c16036a3.f49477d;
                c16036a3.f49474a = interfaceC16039d;
                c16036a3.f49475b = layoutDirection2;
                c16036a3.f49476c = c14347cM15623a;
                c16036a3.f49477d = jM9645c2;
                c14347cM15623a.mo15706e();
                AbstractC14376f.m15850p(c16037b2, C14365u.f45052b, 0L, 0L, 0.0f, 62);
                this.f55625m.invoke(c16037b2);
                c14347cM15623a.mo15719r();
                C16036a c16036a4 = c16037b2.f49478Y;
                c16036a4.f49474a = interfaceC7537b2;
                c16036a4.f49475b = enumC7546k2;
                c16036a4.f49476c = interfaceC14362r2;
                c16036a4.f49477d = j12;
                c14351gM15628f.f45036a.prepareToDraw();
                this.f55616d = false;
                this.f55622j = interfaceC16039d.mo17602i();
            }
        }
        if (c14356l != null) {
            c14356l3 = c14356l;
        } else {
            c14356l3 = ((C14356l) c6002f0.getValue()) != null ? (C14356l) c6002f0.getValue() : this.f55620h;
        }
        C14351g c14351g2 = (C14351g) c15232d.f47532c;
        if (c14351g2 != null) {
            AbstractC14376f.m15843i(interfaceC16039d, c14351g2, 0L, c15232d.f47530a, 0L, f10, c14356l3, 0, 858);
        } else {
            AbstractC8111i5.m8592c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f55615c);
        sb2.append("\n\tviewportWidth: ");
        C6002f0 c6002f0 = this.f55621i;
        sb2.append(C13803e.m15333e(((C13803e) c6002f0.getValue()).f43598a));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(C13803e.m15331c(((C13803e) c6002f0.getValue()).f43598a));
        sb2.append(Separators.RETURN);
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
