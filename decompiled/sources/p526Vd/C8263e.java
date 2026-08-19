package p526Vd;

import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p607Yo.C10112a;
import p607Yo.C10119h;
import p690cp.AbstractC12915a;
import p690cp.C12924j;
import p712dp.C13191g;
import p756fp.AbstractC13719a;

/* JADX INFO: renamed from: Vd.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C8263e extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final C12924j f25762a = new C12924j();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f25763b = new StringBuilder();

    /* JADX INFO: renamed from: c */
    public boolean f25764c;

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: a */
    public final void mo7964a(C13191g c13191g) {
        CharSequence charSequence = c13191g.f41860a;
        AbstractC16544l.m18093f(charSequence, "getContent(...)");
        boolean zM21672F = AbstractC21322p.m21672F(charSequence, "\\]");
        StringBuilder sb2 = this.f25763b;
        if (zM21672F) {
            sb2.append(AbstractC21322p.m21689W(charSequence, "\\]"));
            this.f25764c = true;
        } else if (AbstractC21322p.m21672F(charSequence, "$$")) {
            sb2.append(AbstractC21322p.m21689W(charSequence, "$$"));
            this.f25764c = true;
        } else {
            sb2.append(charSequence);
            sb2.append('\n');
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: e */
    public final void mo7965e() {
        C12924j c12924j = this.f25762a;
        c12924j.f41078k = "latex";
        c12924j.f41079l = this.f25763b.toString();
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        return this.f25762a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        return this.f25764c ? new C10112a(-1, -1, true) : C10112a.m10688a(0);
    }
}
