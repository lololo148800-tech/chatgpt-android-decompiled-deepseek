package p504Ue;

import p025An.C0644w;
import p1113xn.C21307a;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21937L1;
import p1155zi.C21952P1;
import p409Qk.C6752c;
import p432Rh.C6901n;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ue.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C7634d {

    /* JADX INFO: renamed from: a */
    public final C6901n f24138a;

    public C7634d(C6901n c6901n) {
        this.f24138a = c6901n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7968a(String str, AbstractC19687c abstractC19687c) throws Throwable {
        C7631a c7631a;
        if (abstractC19687c instanceof C7631a) {
            c7631a = (C7631a) abstractC19687c;
            int i10 = c7631a.f24130o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7631a.f24130o0 = i10 - Integer.MIN_VALUE;
            } else {
                c7631a = new C7631a(this, abstractC19687c);
            }
        } else {
            c7631a = new C7631a(this, abstractC19687c);
        }
        Object objM7969b = c7631a.f24128Y;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c7631a.f24130o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7969b);
            c7631a.f24130o0 = 1;
            objM7969b = m7969b(str, c7631a);
            if (objM7969b == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM7969b);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM7969b;
        if (abstractC21955Q1 instanceof C21952P1) {
            return new C21952P1(new String((byte[]) ((C21952P1) abstractC21955Q1).f69511a, C21307a.f67720a));
        }
        if ((abstractC21955Q1 instanceof C21929J1) || (abstractC21955Q1 instanceof AbstractC21933K1)) {
            return abstractC21955Q1;
        }
        throw new C0644w();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7969b(String str, AbstractC19687c abstractC19687c) throws Throwable {
        C7632b c7632b;
        if (abstractC19687c instanceof C7632b) {
            c7632b = (C7632b) abstractC19687c;
            int i10 = c7632b.f24133o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7632b.f24133o0 = i10 - Integer.MIN_VALUE;
            } else {
                c7632b = new C7632b(this, abstractC19687c);
            }
        } else {
            c7632b = new C7632b(this, abstractC19687c);
        }
        Object objM16037b = c7632b.f24131Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7632b.f24133o0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM16037b);
                C6752c c6752c = this.f24138a.f22119a;
                C13693c c13693c = new C13693c();
                AbstractC13695e.m15172b(c13693c, str);
                c13693c.m15168c(C16438E.f50984b);
                C14535j c14535j = new C14535j(c13693c, c6752c);
                C7633c c7633c = new C7633c(2, null);
                c7632b.f24133o0 = 1;
                objM16037b = c14535j.m16037b(c7633c, c7632b);
                if (objM16037b == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM16037b);
            }
            return new C21952P1((byte[]) objM16037b);
        } catch (Exception e10) {
            return new C21937L1(e10);
        }
    }
}
