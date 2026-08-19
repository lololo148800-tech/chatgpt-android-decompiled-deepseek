package p895n1;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p604Yk.C10077b;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14360p;
import p774h1.C14328F;
import p774h1.C14341T;
import p774h1.C14353i;
import p774h1.C14365u;
import p821j1.InterfaceC16039d;
import p858ko.C16482A;
import p909nm.C17689w;

/* JADX INFO: renamed from: n1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17422b extends AbstractC17414B {

    /* JADX INFO: renamed from: b */
    public float[] f55653b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f55654c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f55655d = true;

    /* JADX INFO: renamed from: e */
    public long f55656e = C14365u.f45060j;

    /* JADX INFO: renamed from: f */
    public List f55657f;

    /* JADX INFO: renamed from: g */
    public boolean f55658g;

    /* JADX INFO: renamed from: h */
    public C14353i f55659h;

    /* JADX INFO: renamed from: i */
    public AbstractC16546n f55660i;

    /* JADX INFO: renamed from: j */
    public final C16482A f55661j;

    /* JADX INFO: renamed from: k */
    public String f55662k;

    /* JADX INFO: renamed from: l */
    public float f55663l;

    /* JADX INFO: renamed from: m */
    public float f55664m;

    /* JADX INFO: renamed from: n */
    public float f55665n;

    /* JADX INFO: renamed from: o */
    public float f55666o;

    /* JADX INFO: renamed from: p */
    public float f55667p;

    /* JADX INFO: renamed from: q */
    public float f55668q;

    /* JADX INFO: renamed from: r */
    public float f55669r;

    /* JADX INFO: renamed from: s */
    public boolean f55670s;

    public C17422b() {
        int i10 = AbstractC17418F.f55636a;
        this.f55657f = C17689w.f56480Y;
        this.f55658g = true;
        this.f55661j = new C16482A(this, 11);
        this.f55662k = "";
        this.f55666o = 1.0f;
        this.f55667p = 1.0f;
        this.f55670s = true;
    }

    @Override // p895n1.AbstractC17414B
    /* JADX INFO: renamed from: a */
    public final void mo19108a(InterfaceC16039d interfaceC16039d) {
        if (this.f55670s) {
            float[] fArrM15602a = this.f55653b;
            if (fArrM15602a == null) {
                fArrM15602a = C14328F.m15602a();
                this.f55653b = fArrM15602a;
            } else {
                C14328F.m15605d(fArrM15602a);
            }
            C14328F.m15609h(fArrM15602a, this.f55668q + this.f55664m, this.f55669r + this.f55665n, 0.0f);
            C14328F.m15606e(fArrM15602a, this.f55663l);
            C14328F.m15607f(fArrM15602a, this.f55666o, this.f55667p, 1.0f);
            C14328F.m15609h(fArrM15602a, -this.f55664m, -this.f55665n, 0.0f);
            this.f55670s = false;
        }
        if (this.f55658g) {
            if (!this.f55657f.isEmpty()) {
                C14353i c14353iM15631i = this.f55659h;
                if (c14353iM15631i == null) {
                    c14353iM15631i = AbstractC14334L.m15631i();
                    this.f55659h = c14353iM15631i;
                }
                AbstractC17421a.m19117d(this.f55657f, c14353iM15631i);
            }
            this.f55658g = false;
        }
        C13711h c13711hMo17601f0 = interfaceC16039d.mo17601f0();
        long jM15202x = c13711hMo17601f0.m15202x();
        c13711hMo17601f0.m15196m().mo15706e();
        try {
            C10077b c10077b = (C10077b) c13711hMo17601f0.f43259Z;
            float[] fArr = this.f55653b;
            C13711h c13711h = (C13711h) c10077b.f29833Z;
            if (fArr != null) {
                c13711h.m15196m().mo15708g(fArr);
            }
            C14353i c14353i = this.f55659h;
            if (!this.f55657f.isEmpty() && c14353i != null) {
                c13711h.m15196m().mo15722u(c14353i, 1);
            }
            ArrayList arrayList = this.f55654c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC17414B) arrayList.get(i10)).mo19108a(interfaceC16039d);
            }
        } finally {
            AbstractC12107L1.m13830u(c13711hMo17601f0, jM15202x);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p895n1.AbstractC17414B
    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k mo19109b() {
        return this.f55660i;
    }

    @Override // p895n1.AbstractC17414B
    /* JADX INFO: renamed from: d */
    public final void mo19111d(C16482A c16482a) {
        this.f55660i = c16482a;
    }

    /* JADX INFO: renamed from: e */
    public final void m19118e(int i10, AbstractC17414B abstractC17414B) {
        ArrayList arrayList = this.f55654c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, abstractC17414B);
        } else {
            arrayList.add(abstractC17414B);
        }
        m19120g(abstractC17414B);
        abstractC17414B.mo19111d(this.f55661j);
        m19110c();
    }

    /* JADX INFO: renamed from: f */
    public final void m19119f(long j10) {
        if (this.f55655d && j10 != 16) {
            long j11 = this.f55656e;
            if (j11 == 16) {
                this.f55656e = j10;
                return;
            }
            int i10 = AbstractC17418F.f55636a;
            if (C14365u.m15780h(j11) == C14365u.m15780h(j10) && C14365u.m15779g(j11) == C14365u.m15779g(j10) && C14365u.m15777e(j11) == C14365u.m15777e(j10)) {
                return;
            }
            this.f55655d = false;
            this.f55656e = C14365u.f45060j;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19120g(AbstractC17414B abstractC17414B) {
        if (!(abstractC17414B instanceof C17427g)) {
            if (abstractC17414B instanceof C17422b) {
                C17422b c17422b = (C17422b) abstractC17414B;
                if (c17422b.f55655d && this.f55655d) {
                    m19119f(c17422b.f55656e);
                    return;
                } else {
                    this.f55655d = false;
                    this.f55656e = C14365u.f45060j;
                    return;
                }
            }
            return;
        }
        C17427g c17427g = (C17427g) abstractC17414B;
        AbstractC14360p abstractC14360p = c17427g.f55707b;
        if (this.f55655d && abstractC14360p != null) {
            if (abstractC14360p instanceof C14341T) {
                m19119f(((C14341T) abstractC14360p).f45021a);
            } else {
                this.f55655d = false;
                this.f55656e = C14365u.f45060j;
            }
        }
        AbstractC14360p abstractC14360p2 = c17427g.f55712g;
        if (this.f55655d && abstractC14360p2 != null) {
            if (abstractC14360p2 instanceof C14341T) {
                m19119f(((C14341T) abstractC14360p2).f45021a);
            } else {
                this.f55655d = false;
                this.f55656e = C14365u.f45060j;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f55662k);
        ArrayList arrayList = this.f55654c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC17414B abstractC17414B = (AbstractC17414B) arrayList.get(i10);
            sb2.append(Separators.f31990HT);
            sb2.append(abstractC17414B.toString());
            sb2.append(Separators.RETURN);
        }
        return sb2.toString();
    }
}
