package p503Ud;

import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p607Yo.C10112a;
import p607Yo.C10119h;
import p690cp.AbstractC12915a;
import p712dp.C13191g;
import p756fp.AbstractC13719a;

/* JADX INFO: renamed from: Ud.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7630c extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final C7629b f24124a;

    /* JADX INFO: renamed from: b */
    public final StringBuilder f24125b;

    /* JADX INFO: renamed from: c */
    public boolean f24126c;

    /* JADX INFO: renamed from: d */
    public boolean f24127d;

    public C7630c() {
        C7629b c7629b = new C7629b();
        c7629b.f24121g = "";
        this.f24124a = c7629b;
        this.f24125b = new StringBuilder();
        this.f24126c = true;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: a */
    public final void mo7964a(C13191g c13191g) {
        boolean z6 = this.f24126c;
        CharSequence charSequence = c13191g.f41860a;
        if (z6 && AbstractC16544l.m18089b(charSequence, "contextList")) {
            return;
        }
        AbstractC16544l.m18093f(charSequence, "getContent(...)");
        boolean zM21672F = AbstractC21322p.m21672F(charSequence, ":::");
        StringBuilder sb2 = this.f24125b;
        if (zM21672F) {
            sb2.append(AbstractC21322p.m21689W(charSequence, ":::"));
            this.f24127d = true;
        } else {
            sb2.append(charSequence);
            sb2.append('\n');
        }
        this.f24126c = false;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: e */
    public final void mo7965e() {
        String string = AbstractC21322p.m21711s0(this.f24125b).toString();
        C7629b c7629b = this.f24124a;
        c7629b.getClass();
        AbstractC16544l.m18094g(string, "<set-?>");
        c7629b.f24121g = string;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        return this.f24124a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        return this.f24127d ? new C10112a(-1, -1, true) : C10112a.m10688a(0);
    }
}
