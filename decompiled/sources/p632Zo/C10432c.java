package p632Zo;

import java.util.regex.Pattern;
import p030B2.C0781s;
import p228J.C3847l0;
import p571X9.AbstractC9306j0;
import p607Yo.C10124m;
import p690cp.C12912C;
import p690cp.C12931q;
import p734ep.C13458b;
import p734ep.InterfaceC13457a;

/* JADX INFO: renamed from: Zo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10432c implements InterfaceC13457a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f30905a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f30906b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // p734ep.InterfaceC13457a
    /* JADX INFO: renamed from: a */
    public final C10439j mo10916a(C10124m c10124m) {
        String strM9889h;
        C13458b c13458b = c10124m.f30009h;
        c13458b.m14987i();
        C0781s c0781sM14991m = c13458b.m14991m();
        if (c13458b.m14980b('>') > 0) {
            C3847l0 c3847l0M14982d = c13458b.m14982d(c0781sM14991m, c13458b.m14991m());
            String strM4580g = c3847l0M14982d.m4580g();
            c13458b.m14987i();
            if (f30905a.matcher(strM4580g).matches()) {
                strM9889h = strM4580g;
            } else {
                strM9889h = f30906b.matcher(strM4580g).matches() ? AbstractC9306j0.m9889h("mailto:", strM4580g) : null;
            }
            if (strM9889h != null) {
                C12931q c12931q = new C12931q(strM9889h, null);
                C12912C c12912c = new C12912C(strM4580g);
                c12912c.m14597i(c3847l0M14982d.m4581h());
                c12931q.m14593c(c12912c);
                return new C10439j(c12931q, c13458b.m14991m());
            }
        }
        return null;
    }
}
