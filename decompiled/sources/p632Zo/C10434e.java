package p632Zo;

import p030B2.C0781s;
import p607Yo.C10124m;
import p690cp.C12912C;
import p690cp.C12918d;
import p734ep.C13458b;
import p734ep.InterfaceC13457a;

/* JADX INFO: renamed from: Zo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10434e implements InterfaceC13457a {
    @Override // p734ep.InterfaceC13457a
    /* JADX INFO: renamed from: a */
    public final C10439j mo10916a(C10124m c10124m) {
        C13458b c13458b = c10124m.f30009h;
        C0781s c0781sM14991m = c13458b.m14991m();
        int iM14985g = c13458b.m14985g('`');
        C0781s c0781sM14991m2 = c13458b.m14991m();
        while (c13458b.m14980b('`') > 0) {
            C0781s c0781sM14991m3 = c13458b.m14991m();
            if (c13458b.m14985g('`') == iM14985g) {
                C12918d c12918d = new C12918d();
                String strReplace = c13458b.m14982d(c0781sM14991m2, c0781sM14991m3).m4580g().replace('\n', ' ');
                if (strReplace.length() >= 3) {
                    int i10 = 0;
                    if (strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                        int length = strReplace.length();
                        while (true) {
                            if (i10 >= length) {
                                i10 = length;
                                break;
                            }
                            if (strReplace.charAt(i10) != ' ') {
                                break;
                            }
                            i10++;
                        }
                        if (i10 != length) {
                            strReplace = strReplace.substring(1, strReplace.length() - 1);
                        }
                    }
                }
                c12918d.f41070g = strReplace;
                return new C10439j(c12918d, c13458b.m14991m());
            }
        }
        return new C10439j(new C12912C(c13458b.m14982d(c0781sM14991m, c0781sM14991m2).m4580g()), c0781sM14991m2);
    }
}
