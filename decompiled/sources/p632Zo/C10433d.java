package p632Zo;

import java.util.regex.Pattern;
import p607Yo.C10124m;
import p690cp.C12912C;
import p690cp.C12925k;
import p734ep.C13458b;
import p734ep.InterfaceC13457a;

/* JADX INFO: renamed from: Zo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10433d implements InterfaceC13457a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f30907a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // p734ep.InterfaceC13457a
    /* JADX INFO: renamed from: a */
    public final C10439j mo10916a(C10124m c10124m) {
        C13458b c13458b = c10124m.f30009h;
        c13458b.m14987i();
        char cM14990l = c13458b.m14990l();
        if (cM14990l == '\n') {
            c13458b.m14987i();
            return new C10439j(new C12925k(), c13458b.m14991m());
        }
        if (!f30907a.matcher(String.valueOf(cM14990l)).matches()) {
            return new C10439j(new C12912C("\\"), c13458b.m14991m());
        }
        c13458b.m14987i();
        return new C10439j(new C12912C(String.valueOf(cM14990l)), c13458b.m14991m());
    }
}
