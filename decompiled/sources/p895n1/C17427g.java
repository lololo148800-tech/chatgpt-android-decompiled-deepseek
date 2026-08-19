package p895n1;

import android.graphics.Path;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import p571X9.AbstractC9227W;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14360p;
import p774h1.C14353i;
import p774h1.C14354j;
import p775h2.AbstractC14376f;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;
import p909nm.C17689w;

/* JADX INFO: renamed from: n1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17427g extends AbstractC17414B {

    /* JADX INFO: renamed from: b */
    public AbstractC14360p f55707b;

    /* JADX INFO: renamed from: c */
    public float f55708c = 1.0f;

    /* JADX INFO: renamed from: d */
    public Object f55709d;

    /* JADX INFO: renamed from: e */
    public float f55710e;

    /* JADX INFO: renamed from: f */
    public float f55711f;

    /* JADX INFO: renamed from: g */
    public AbstractC14360p f55712g;

    /* JADX INFO: renamed from: h */
    public int f55713h;

    /* JADX INFO: renamed from: i */
    public int f55714i;

    /* JADX INFO: renamed from: j */
    public float f55715j;

    /* JADX INFO: renamed from: k */
    public float f55716k;

    /* JADX INFO: renamed from: l */
    public float f55717l;

    /* JADX INFO: renamed from: m */
    public float f55718m;

    /* JADX INFO: renamed from: n */
    public boolean f55719n;

    /* JADX INFO: renamed from: o */
    public boolean f55720o;

    /* JADX INFO: renamed from: p */
    public boolean f55721p;

    /* JADX INFO: renamed from: q */
    public C16043h f55722q;

    /* JADX INFO: renamed from: r */
    public final C14353i f55723r;

    /* JADX INFO: renamed from: s */
    public C14353i f55724s;

    /* JADX INFO: renamed from: t */
    public final Object f55725t;

    public C17427g() {
        int i10 = AbstractC17418F.f55636a;
        this.f55709d = C17689w.f56480Y;
        this.f55710e = 1.0f;
        this.f55713h = 0;
        this.f55714i = 0;
        this.f55715j = 4.0f;
        this.f55717l = 1.0f;
        this.f55719n = true;
        this.f55720o = true;
        C14353i c14353iM15631i = AbstractC14334L.m15631i();
        this.f55723r = c14353iM15631i;
        this.f55724s = c14353iM15631i;
        this.f55725t = AbstractC9227W.m9799b(EnumC17307j.f55134Z, C17426f.f55704Z);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // p895n1.AbstractC17414B
    /* JADX INFO: renamed from: a */
    public final void mo19108a(InterfaceC16039d interfaceC16039d) {
        if (this.f55719n) {
            AbstractC17421a.m19117d(this.f55709d, this.f55723r);
            m19123e();
        } else if (this.f55721p) {
            m19123e();
        }
        this.f55719n = false;
        this.f55721p = false;
        AbstractC14360p abstractC14360p = this.f55707b;
        if (abstractC14360p != null) {
            AbstractC14376f.m15847m(interfaceC16039d, this.f55724s, abstractC14360p, this.f55708c, null, 56);
        }
        AbstractC14360p abstractC14360p2 = this.f55712g;
        if (abstractC14360p2 != null) {
            C16043h c16043h = this.f55722q;
            if (this.f55720o || c16043h == null) {
                c16043h = new C16043h(this.f55711f, this.f55715j, this.f55713h, this.f55714i, 16);
                this.f55722q = c16043h;
                this.f55720o = false;
            }
            AbstractC14376f.m15847m(interfaceC16039d, this.f55724s, abstractC14360p2, this.f55710e, c16043h, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: e */
    public final void m19123e() {
        Path path;
        float f10 = this.f55716k;
        C14353i c14353i = this.f55723r;
        if (f10 == 0.0f && this.f55717l == 1.0f) {
            this.f55724s = c14353i;
            return;
        }
        if (AbstractC16544l.m18089b(this.f55724s, c14353i)) {
            this.f55724s = AbstractC14334L.m15631i();
        } else {
            int i10 = this.f55724s.f45039a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f55724s.f45039a.rewind();
            this.f55724s.m15734f(i10);
        }
        ?? r6 = this.f55725t;
        C14354j c14354j = (C14354j) r6.getValue();
        if (c14353i != null) {
            c14354j.getClass();
            path = c14353i.f45039a;
        } else {
            path = null;
        }
        c14354j.f45043a.setPath(path, false);
        float length = ((C14354j) r6.getValue()).f45043a.getLength();
        float f11 = this.f55716k;
        float f12 = this.f55718m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f55717l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((C14354j) r6.getValue()).m15736a(f13, f14, this.f55724s);
        } else {
            ((C14354j) r6.getValue()).m15736a(f13, length, this.f55724s);
            ((C14354j) r6.getValue()).m15736a(0.0f, f14, this.f55724s);
        }
    }

    public final String toString() {
        return this.f55723r.toString();
    }
}
