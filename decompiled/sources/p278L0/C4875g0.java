package p278L0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.C13781p0;
import p758g0.InterfaceC13763g0;

/* JADX INFO: renamed from: L0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4875g0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C4875g0 f15887Y = new C4875g0(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object c13781p0;
        InterfaceC13763g0 interfaceC13763g0 = (InterfaceC13763g0) obj;
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        c6021p.m6524S(-1154662212);
        EnumC4851O enumC4851O = EnumC4851O.f15799Y;
        EnumC4851O enumC4851O2 = EnumC4851O.f15800Z;
        if (interfaceC13763g0.mo15005b(enumC4851O, enumC4851O2)) {
            c13781p0 = AbstractC13758e.m15255t(67, 0, AbstractC13725A.f43291d, 2);
        } else {
            c13781p0 = (interfaceC13763g0.mo15005b(enumC4851O2, enumC4851O) || interfaceC13763g0.mo15005b(EnumC4851O.f15801o0, enumC4851O2)) ? new C13781p0(83, 67, AbstractC13725A.f43291d) : AbstractC13758e.m15254s(0.0f, 0.0f, null, 7);
        }
        c6021p.m6553p(false);
        return c13781p0;
    }
}
