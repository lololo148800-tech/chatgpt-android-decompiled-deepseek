package p544W9;

import kotlin.jvm.internal.C16557y;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p860l0.C16688K0;
import p860l0.C16691L0;
import p860l0.InterfaceC16736e1;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.u4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8723u4 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m9442c(InterfaceC16736e1 interfaceC16736e1, float f10, AbstractC19687c abstractC19687c) {
        C16688K0 c16688k0;
        C16557y c16557y;
        if (abstractC19687c instanceof C16688K0) {
            c16688k0 = (C16688K0) abstractC19687c;
            int i10 = c16688k0.f53472o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16688k0.f53472o0 = i10 - Integer.MIN_VALUE;
            } else {
                c16688k0 = new C16688K0(abstractC19687c);
            }
        } else {
            c16688k0 = new C16688K0(abstractC19687c);
        }
        Object obj = c16688k0.f53471Z;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c16688k0.f53472o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16557y c16557y2 = new C16557y();
            InterfaceC1439n c16691l0 = new C16691L0(c16557y2, f10, null);
            c16688k0.f53470Y = c16557y2;
            c16688k0.f53472o0 = 1;
            if (interfaceC16736e1.mo5256b(EnumC14284g0.f44821Y, c16691l0, c16688k0) == obj2) {
                return obj2;
            }
            c16557y = c16557y2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16557y = c16688k0.f53470Y;
            AbstractC9233X.m9807c(obj);
        }
        return new Float(c16557y.f51286Y);
    }
}
