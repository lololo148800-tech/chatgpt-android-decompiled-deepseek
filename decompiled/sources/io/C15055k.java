package io;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p278L0.C4893t;
import p349O0.C6002f0;
import p492U1.C7545j;
import p544W9.AbstractC8560T3;
import p547Wc.C8805o;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13746W;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: io.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C15055k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f46781Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f46782Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15105o f46783o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f46784p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15055k(C15105o c15105o, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f46783o0 = c15105o;
        this.f46784p0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C15055k c15055k = new C15055k(this.f46783o0, this.f46784p0, interfaceC18770c);
        c15055k.f46782Z = obj;
        return c15055k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C15055k) create((C4893t) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        float fSqrt;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f46781Y;
        C15049e c15049e = C15049e.f46776a;
        C15105o c15105o = this.f46783o0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C4893t c4893t = (C4893t) this.f46782Z;
                boolean z6 = c15105o.f46987b;
                C6002f0 c6002f0 = c15105o.f46992g;
                if (z6) {
                    try {
                        float radians = (float) Math.toRadians(20.0d);
                        float fSin = 1.0f - ((float) Math.sin(radians));
                        long j10 = ((C7545j) c6002f0.getValue()).f23903a;
                        int i11 = (int) (j10 >> 32);
                        int i12 = (int) (j10 & 4294967295L);
                        fSqrt = (((float) Math.sqrt((i12 * i12) + (i11 * i11))) / 2) * radians * fSin;
                    } catch (Throwable th2) {
                        th = th2;
                        c15105o.m16231d(c15049e);
                        throw th;
                    }
                } else {
                    fSqrt = 0.0f;
                }
                float fM16230c = c15105o.m16230c();
                float f10 = (((int) (((C7545j) c6002f0.getValue()).f23903a & 4294967295L)) + fSqrt) * (c15105o.m16230c() > 0.0f ? 1.0f : -1.0f);
                float f11 = this.f46784p0;
                C13746W c13746wM15254s = AbstractC13758e.m15254s(0.0f, 400.0f, null, 5);
                C15045a c15045a = new C15045a(c15105o, 3);
                C8805o c8805o = new C8805o(c4893t, 15, c15105o);
                this.f46781Y = 1;
                if (AbstractC8560T3.m9223b(fM16230c, f10, f11, c13746wM15254s, c15045a, c8805o, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c15105o.m16231d(c15049e);
            return C17296C.f55119a;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
