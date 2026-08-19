package p860l0;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p077Cn.C1743k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16771q0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f53816Y;

    /* JADX INFO: renamed from: Z */
    public int f53817Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f53818o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f53819p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC16777s0 f53820q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16771q0(C16525B c16525b, AbstractC16777s0 abstractC16777s0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53819p0 = c16525b;
        this.f53820q0 = abstractC16777s0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16771q0 c16771q0 = new C16771q0(this.f53819p0, this.f53820q0, interfaceC18770c);
        c16771q0.f53818o0 = obj;
        return c16771q0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16771q0) create((InterfaceC1436k) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0041 -> B:25:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004d -> B:24:0x0050). Please report as a decompilation issue!!! */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1436k interfaceC1436k;
        C16525B c16525b;
        Object obj2;
        AbstractC16708T abstractC16708T;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53817Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            interfaceC1436k = (InterfaceC1436k) this.f53818o0;
            c16525b = this.f53819p0;
            obj2 = c16525b.f51262Y;
            if (!(obj2 instanceof C16706S) || (obj2 instanceof C16699O)) {
                return C17296C.f55119a;
            }
            abstractC16708T = null;
            C16701P c16701p = obj2 instanceof C16701P ? (C16701P) obj2 : null;
            if (c16701p != null) {
                interfaceC1436k.invoke(c16701p);
            }
            C1743k c1743k = this.f53820q0.f53843F0;
            if (c1743k != null) {
                this.f53818o0 = interfaceC1436k;
                this.f53816Y = c16525b;
                this.f53817Z = 1;
                obj = c1743k.mo2514c(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            }
            c16525b.f51262Y = abstractC16708T;
            c16525b = this.f53819p0;
            obj2 = c16525b.f51262Y;
            if (obj2 instanceof C16706S) {
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c16525b = this.f53816Y;
        interfaceC1436k = (InterfaceC1436k) this.f53818o0;
        AbstractC9233X.m9807c(obj);
        abstractC16708T = (AbstractC16708T) obj;
        c16525b.f51262Y = abstractC16708T;
        c16525b = this.f53819p0;
        obj2 = c16525b.f51262Y;
        if (obj2 instanceof C16706S) {
        }
        return C17296C.f55119a;
    }
}
