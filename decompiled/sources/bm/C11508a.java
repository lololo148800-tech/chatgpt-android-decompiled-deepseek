package bm;

import am.AbstractC10751e;
import am.C10752f;
import am.EnumC10750d;
import cm.C11783a;
import cm.C11784b;
import cm.C11785c;
import cm.C11786d;
import cm.C11787e;
import cm.C11788f;
import cm.C11790h;
import p117Eb.C2392v;
import p140Fa.C2685e;
import p167Gb.C3032c;
import p279L1.C4901b;

/* JADX INFO: renamed from: bm.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11508a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34826a;

    public /* synthetic */ C11508a(int i10) {
        this.f34826a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final Object m12901a(C2392v c2392v, C3032c c3032c) {
        switch (this.f34826a) {
            case 0:
                return new C11783a((C10752f) c2392v.f7436Z, 0);
            case 1:
                return new C11785c((C10752f) c2392v.f7436Z);
            case 2:
                return new C4901b((C10752f) c2392v.f7436Z, 1);
            case 3:
                return new C11786d(0);
            case 4:
                return new C11787e((C10752f) c2392v.f7436Z, ((Integer) AbstractC10751e.f31944d.m10908a(c3032c)).intValue());
            case 5:
                return new C11788f((C10752f) c2392v.f7436Z, (String) AbstractC10751e.f31945e.m10908a(c3032c), (C2685e) c2392v.f7438p0);
            case 6:
                EnumC10750d enumC10750d = EnumC10750d.f31938Y;
                Object objM10908a = AbstractC10751e.f31941a.m10908a(c3032c);
                C10752f c10752f = (C10752f) c2392v.f7436Z;
                return enumC10750d == objM10908a ? new C11784b(c10752f, ((Integer) AbstractC10751e.f31942b.m10908a(c3032c)).intValue()) : new C11790h(c10752f, String.valueOf(AbstractC10751e.f31943c.m10908a(c3032c)).concat(". "));
            case 7:
                return new C11786d(1);
            default:
                return new C11783a((C10752f) c2392v.f7436Z, 1);
        }
    }
}
