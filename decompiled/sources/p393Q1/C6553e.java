package p393Q1;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.internal.AbstractC16544l;
import p349O0.C5944C;
import p349O0.C5997d;
import p467T1.C7200j;
import p571X9.AbstractC9154J3;
import p759g1.C13800b;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14337O;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.C14341T;
import p821j1.AbstractC16040e;
import p821j1.C16042g;
import p821j1.C16043h;
import p985r9.C18903m;

/* JADX INFO: renamed from: Q1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6553e extends TextPaint {

    /* JADX INFO: renamed from: a */
    public C18903m f21212a;

    /* JADX INFO: renamed from: b */
    public C7200j f21213b;

    /* JADX INFO: renamed from: c */
    public int f21214c;

    /* JADX INFO: renamed from: d */
    public C14338P f21215d;

    /* JADX INFO: renamed from: e */
    public AbstractC14360p f21216e;

    /* JADX INFO: renamed from: f */
    public C5944C f21217f;

    /* JADX INFO: renamed from: g */
    public C13803e f21218g;

    /* JADX INFO: renamed from: h */
    public AbstractC16040e f21219h;

    /* JADX INFO: renamed from: a */
    public final C18903m m7114a() {
        C18903m c18903m = this.f21212a;
        if (c18903m != null) {
            return c18903m;
        }
        C18903m c18903m2 = new C18903m(this);
        this.f21212a = c18903m2;
        return c18903m2;
    }

    /* JADX INFO: renamed from: b */
    public final void m7115b(int i10) {
        if (AbstractC14334L.m15639q(i10, this.f21214c)) {
            return;
        }
        m7114a().m20221e(i10);
        this.f21214c = i10;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX INFO: renamed from: c */
    public final void m7116c(AbstractC14360p abstractC14360p, long j10, float f10) {
        if (abstractC14360p == null) {
            this.f21217f = null;
            this.f21216e = null;
            this.f21218g = null;
            setShader(null);
            return;
        }
        if (abstractC14360p instanceof C14341T) {
            m7117d(AbstractC9154J3.m9702a(f10, ((C14341T) abstractC14360p).f45021a));
            return;
        }
        if (abstractC14360p instanceof AbstractC14337O) {
            if (AbstractC16544l.m18089b(this.f21216e, abstractC14360p)) {
                C13803e c13803e = this.f21218g;
                if (!(c13803e == null ? false : C13803e.m15330b(c13803e.f43598a, j10))) {
                    if (j10 != 9205357640488583168L) {
                        this.f21216e = abstractC14360p;
                        this.f21218g = new C13803e(j10);
                        this.f21217f = C5997d.m6421H(new C6552d(abstractC14360p, j10, 0));
                    }
                }
            } else {
                if (j10 != 9205357640488583168L) {
                    this.f21216e = abstractC14360p;
                    this.f21218g = new C13803e(j10);
                    this.f21217f = C5997d.m6421H(new C6552d(abstractC14360p, j10, 0));
                }
            }
            C18903m c18903mM7114a = m7114a();
            C5944C c5944c = this.f21217f;
            c18903mM7114a.m20225i(c5944c != null ? (Shader) c5944c.getValue() : null);
            AbstractC6559k.m7125b(this, f10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7117d(long j10) {
        if (j10 != 16) {
            setColor(AbstractC14334L.m15617F(j10));
            this.f21217f = null;
            this.f21216e = null;
            this.f21218g = null;
            setShader(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7118e(AbstractC16040e abstractC16040e) {
        if (abstractC16040e == null || AbstractC16544l.m18089b(this.f21219h, abstractC16040e)) {
            return;
        }
        this.f21219h = abstractC16040e;
        if (abstractC16040e.equals(C16042g.f49483a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC16040e instanceof C16043h) {
            m7114a().m20229m(1);
            C16043h c16043h = (C16043h) abstractC16040e;
            m7114a().m20228l(c16043h.f49484a);
            ((Paint) m7114a().f60268b).setStrokeMiter(c16043h.f49485b);
            m7114a().m20227k(c16043h.f49487d);
            m7114a().m20226j(c16043h.f49486c);
            ((Paint) m7114a().f60268b).setPathEffect(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7119f(C14338P c14338p) {
        if (c14338p == null || AbstractC16544l.m18089b(this.f21215d, c14338p)) {
            return;
        }
        this.f21215d = c14338p;
        if (c14338p.equals(C14338P.f45000d)) {
            clearShadowLayer();
            return;
        }
        C14338P c14338p2 = this.f21215d;
        float f10 = c14338p2.f45003c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, C13800b.m15306g(c14338p2.f45002b), C13800b.m15307h(this.f21215d.f45002b), AbstractC14334L.m15617F(this.f21215d.f45001a));
    }

    /* JADX INFO: renamed from: g */
    public final void m7120g(C7200j c7200j) {
        if (c7200j == null || AbstractC16544l.m18089b(this.f21213b, c7200j)) {
            return;
        }
        this.f21213b = c7200j;
        int i10 = c7200j.f22866a;
        setUnderlineText((i10 | 1) == i10);
        C7200j c7200j2 = this.f21213b;
        c7200j2.getClass();
        int i11 = c7200j2.f22866a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
