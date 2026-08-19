package p591Y5;

import io.sentry.internal.debugmeta.C15384c;
import java.util.Collections;
import p802i6.C14935a;

/* JADX INFO: renamed from: Y5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9665p extends AbstractC9653d {

    /* JADX INFO: renamed from: i */
    public final Object f29141i;

    public C9665p(C15384c c15384c, Object obj) {
        super(Collections.emptyList());
        m10239j(c15384c);
        this.f29141i = obj;
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: b */
    public final float mo10231b() {
        return 1.0f;
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: e */
    public final Object mo10234e() {
        C15384c c15384c = this.f29086e;
        float f10 = this.f29085d;
        Object obj = this.f29141i;
        return c15384c.m16641r(0.0f, 0.0f, obj, obj, f10, f10, f10);
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: f */
    public final Object mo10235f(C14935a c14935a, float f10) {
        return mo10234e();
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: h */
    public final void mo10237h() {
        if (this.f29086e != null) {
            super.mo10237h();
        }
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: i */
    public final void mo10238i(float f10) {
        this.f29085d = f10;
    }
}
