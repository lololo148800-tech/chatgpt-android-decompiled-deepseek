package p591Y5;

import io.sentry.internal.debugmeta.C15384c;
import p779h6.AbstractC14417f;
import p802i6.C14935a;

/* JADX INFO: renamed from: Y5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9656g extends AbstractC9658i {
    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: f */
    public final Object mo10235f(C14935a c14935a, float f10) {
        return Float.valueOf(m10244l(c14935a, f10));
    }

    /* JADX INFO: renamed from: k */
    public final float m10243k() {
        return m10244l(this.f29084c.mo4176k(), m10232c());
    }

    /* JADX INFO: renamed from: l */
    public final float m10244l(C14935a c14935a, float f10) {
        if (c14935a.f46525b == null || c14935a.f46526c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C15384c c15384c = this.f29086e;
        Object obj = c14935a.f46525b;
        if (c15384c != null) {
            Float f11 = (Float) c14935a.f46526c;
            float fM10233d = m10233d();
            float f12 = this.f29085d;
            Float f13 = (Float) c15384c.m16641r(c14935a.f46530g, c14935a.f46531h.floatValue(), (Float) obj, f11, f10, fM10233d, f12);
            if (f13 != null) {
                return f13.floatValue();
            }
        }
        if (c14935a.f46532i == -3987645.8f) {
            c14935a.f46532i = ((Float) obj).floatValue();
        }
        float f14 = c14935a.f46532i;
        if (c14935a.f46533j == -3987645.8f) {
            c14935a.f46533j = ((Float) c14935a.f46526c).floatValue();
        }
        return AbstractC14417f.m15928e(f14, c14935a.f46533j, f10);
    }
}
