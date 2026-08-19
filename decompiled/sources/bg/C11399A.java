package bg;

import cg.C11745q;
import eg.C13380c;
import eg.C13383f;
import java.util.ArrayList;
import java.util.List;
import p025An.C0644w;
import p195Hh.C3430e;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p872lg.C16946f;
import p909nm.AbstractC17682p;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: bg.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11399A {

    /* JADX INFO: renamed from: a */
    public final C11745q f34429a;

    /* JADX INFO: renamed from: b */
    public final C3430e f34430b = AbstractC8168p6.m8749b("OnboardingService", null);

    public C11399A(C11745q c11745q) {
        this.f34429a = c11745q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m12785a(AbstractC19687c abstractC19687c) {
        C11424x c11424x;
        if (abstractC19687c instanceof C11424x) {
            c11424x = (C11424x) abstractC19687c;
            int i10 = c11424x.f34508o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11424x.f34508o0 = i10 - Integer.MIN_VALUE;
            } else {
                c11424x = new C11424x(this, abstractC19687c);
            }
        } else {
            c11424x = new C11424x(this, abstractC19687c);
        }
        Object objM13035a = c11424x.f34506Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11424x.f34508o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM13035a);
            c11424x.f34508o0 = 1;
            objM13035a = this.f34429a.m13035a(c11424x);
            if (objM13035a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM13035a);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM13035a;
        if (!(abstractC6224C instanceof C6223B)) {
            if ((abstractC6224C instanceof C6248v) || (abstractC6224C instanceof AbstractC6249w)) {
                return abstractC6224C;
            }
            throw new C0644w();
        }
        List<C13383f> list = ((C13380c) ((C6223B) abstractC6224C).f20258a).f42419a;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (C13383f c13383f : list) {
            arrayList.add(new C16946f(c13383f.f42421a, c13383f.f42422b, c13383f.f42423c, c13383f.f42424d));
        }
        return new C6223B(arrayList);
    }
}
