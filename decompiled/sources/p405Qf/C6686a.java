package p405Qf;

import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1149zc.AbstractC21864z;
import p1155zi.C21891A;
import p269Kh.C4673B;
import p292Lg.C5034f;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p430Rf.C6881c;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Qf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6686a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f21498Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC21864z f21499Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6881c f21500o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6687b f21501p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6686a(AbstractC21864z abstractC21864z, C6881c c6881c, C6687b c6687b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f21499Z = abstractC21864z;
        this.f21500o0 = c6881c;
        this.f21501p0 = c6687b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6686a(this.f21499Z, this.f21500o0, this.f21501p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6686a) create((C21891A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC6224C abstractC6224C;
        boolean z6;
        C6687b c6687b;
        C6689d c6689d;
        C5034f c5034f;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f21498Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                abstractC6224C = (AbstractC6224C) obj;
                z6 = abstractC6224C instanceof C6223B;
                c6687b = this.f21501p0;
                if (z6) {
                    C4673B c4673b = (C4673B) ((C6223B) abstractC6224C).f20258a;
                    c6689d = c6687b.f21502b;
                    c5034f = new C5034f(c6687b, 22, c4673b);
                    this.f21498Y = 3;
                    if (c6689d.m21029b(c5034f, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (abstractC6224C instanceof AbstractC6249w) {
                    AbstractC8160o6.m8731f(c6687b.f21504d, "Error fetching models", ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
                } else if (!(abstractC6224C instanceof C6248v)) {
                    throw new C0644w();
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        this.f21498Y = 1;
        obj = this.f21499Z.m22317a(this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        if (((Boolean) obj).booleanValue()) {
            this.f21498Y = 2;
            obj = this.f21500o0.m7284a(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            abstractC6224C = (AbstractC6224C) obj;
            z6 = abstractC6224C instanceof C6223B;
            c6687b = this.f21501p0;
            if (z6) {
                C4673B c4673b2 = (C4673B) ((C6223B) abstractC6224C).f20258a;
                c6689d = c6687b.f21502b;
                c5034f = new C5034f(c6687b, 22, c4673b2);
                this.f21498Y = 3;
                if (c6689d.m21029b(c5034f, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (abstractC6224C instanceof AbstractC6249w) {
                AbstractC8160o6.m8731f(c6687b.f21504d, "Error fetching models", ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
            } else if (!(abstractC6224C instanceof C6248v)) {
                throw new C0644w();
            }
        }
        return C17296C.f55119a;
    }
}
