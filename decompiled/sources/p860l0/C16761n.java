package p860l0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p349O0.C5994b0;
import p349O0.C6002f0;

/* JADX INFO: renamed from: l0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C16761n extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53779Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16782u f53780Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16761n(C16782u c16782u, int i10) {
        super(0);
        this.f53779Y = i10;
        this.f53780Z = c16782u;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object value;
        switch (this.f53779Y) {
            case 0:
                return this.f53780Z.m18548b();
            case 1:
                C16782u c16782u = this.f53780Z;
                return new C17309l(c16782u.m18548b(), c16782u.f53867i.getValue());
            case 2:
                C16782u c16782u2 = this.f53780Z;
                float fM18495e = c16782u2.m18548b().m18495e(c16782u2.f53866h.getValue());
                float fM18495e2 = c16782u2.m18548b().m18495e(c16782u2.f53867i.getValue()) - fM18495e;
                float fAbs = Math.abs(fM18495e2);
                float f10 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fM18550d = (c16782u2.m18550d() - fM18495e) / fM18495e2;
                    if (fM18550d < 1.0E-6f) {
                        f10 = 0.0f;
                    } else if (fM18550d <= 0.999999f) {
                        f10 = fM18550d;
                    }
                }
                return Float.valueOf(f10);
            default:
                C16782u c16782u3 = this.f53780Z;
                Object value2 = c16782u3.f53870l.getValue();
                if (value2 != null) {
                    return value2;
                }
                C5994b0 c5994b0 = c16782u3.f53868j;
                boolean zIsNaN = Float.isNaN(c5994b0.m6409g());
                C6002f0 c6002f0 = c16782u3.f53865g;
                if (zIsNaN || (value = c16782u3.m18548b().m18491a(c5994b0.m6409g())) == null) {
                    value = c6002f0.getValue();
                }
                return value;
        }
    }
}
