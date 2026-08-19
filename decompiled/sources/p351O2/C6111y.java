package p351O2;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import p049Bm.InterfaceC1439n;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6111y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC4814a f19883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C16556x f19884b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C16525B f19885c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C6084G f19886d;

    public C6111y(InterfaceC4814a interfaceC4814a, C16556x c16556x, C16525B c16525b, C6084G c6084g) {
        this.f19883a = interfaceC4814a;
        this.f19884b = c16556x;
        this.f19885c = c16525b;
        this.f19886d = c6084g;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ae, B:38:0x00b6), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m6664a(C6093g c6093g, AbstractC19687c abstractC19687c) throws Throwable {
        C6110x c6110x;
        C6084G c6084g;
        C16556x c16556x;
        C16525B c16525b;
        InterfaceC4814a interfaceC4814a;
        InterfaceC1439n interfaceC1439n;
        InterfaceC4814a interfaceC4814a2;
        InterfaceC4814a interfaceC4814a3;
        C6084G c6084g2;
        Object obj;
        C16525B c16525b2;
        InterfaceC4814a interfaceC4814a4;
        if (abstractC19687c instanceof C6110x) {
            c6110x = (C6110x) abstractC19687c;
            int i10 = c6110x.f19882t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6110x.f19882t0 = i10 - Integer.MIN_VALUE;
            } else {
                c6110x = new C6110x(this, abstractC19687c);
            }
        } else {
            c6110x = new C6110x(this, abstractC19687c);
        }
        Object obj2 = c6110x.f19880r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6110x.f19882t0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj2);
                c6110x.f19875Y = c6093g;
                InterfaceC4814a interfaceC4814a5 = this.f19883a;
                c6110x.f19876Z = interfaceC4814a5;
                C16556x c16556x2 = this.f19884b;
                c6110x.f19877o0 = c16556x2;
                C16525B c16525b3 = this.f19885c;
                c6110x.f19878p0 = c16525b3;
                c6084g = this.f19886d;
                c6110x.f19879q0 = c6084g;
                c6110x.f19882t0 = 1;
                C4816c c4816c = (C4816c) interfaceC4814a5;
                if (c4816c.m5448e(null, c6110x) == enumC19250a) {
                    return enumC19250a;
                }
                c16556x = c16556x2;
                c16525b = c16525b3;
                interfaceC1439n = c6093g;
                interfaceC4814a = c4816c;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = c6110x.f19877o0;
                        c16525b2 = (C16525B) c6110x.f19876Z;
                        interfaceC4814a2 = (InterfaceC4814a) c6110x.f19875Y;
                        try {
                            AbstractC9233X.m9807c(obj2);
                            interfaceC4814a4 = interfaceC4814a2;
                            c16525b2.f51262Y = obj;
                            c16525b = c16525b2;
                            interfaceC4814a2 = interfaceC4814a4;
                            Object obj3 = c16525b.f51262Y;
                            ((C4816c) interfaceC4814a2).m5450g(null);
                            return obj3;
                        } catch (Throwable th2) {
                            th = th2;
                            ((C4816c) interfaceC4814a2).m5450g(null);
                            throw th;
                        }
                    }
                    c6084g2 = (C6084G) c6110x.f19877o0;
                    c16525b = (C16525B) c6110x.f19876Z;
                    interfaceC4814a3 = (InterfaceC4814a) c6110x.f19875Y;
                    try {
                        AbstractC9233X.m9807c(obj2);
                        interfaceC4814a3 = interfaceC4814a3;
                        if (AbstractC16544l.m18089b(obj2, c16525b.f51262Y)) {
                            interfaceC4814a2 = interfaceC4814a3;
                        } else {
                            c6110x.f19875Y = interfaceC4814a3;
                            c6110x.f19876Z = c16525b;
                            c6110x.f19877o0 = obj2;
                            c6110x.f19882t0 = 3;
                            if (c6084g2.m6659k(obj2, c6110x) == enumC19250a) {
                                return enumC19250a;
                            }
                            obj = obj2;
                            c16525b2 = c16525b;
                            interfaceC4814a4 = interfaceC4814a3;
                            c16525b2.f51262Y = obj;
                            c16525b = c16525b2;
                            interfaceC4814a2 = interfaceC4814a4;
                        }
                        Object obj4 = c16525b.f51262Y;
                        ((C4816c) interfaceC4814a2).m5450g(null);
                        return obj4;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC4814a2 = interfaceC4814a3;
                        ((C4816c) interfaceC4814a2).m5450g(null);
                        throw th;
                    }
                }
                C6084G c6084g3 = c6110x.f19879q0;
                c16525b = c6110x.f19878p0;
                c16556x = (C16556x) c6110x.f19877o0;
                InterfaceC4814a interfaceC4814a6 = (InterfaceC4814a) c6110x.f19876Z;
                InterfaceC1439n interfaceC1439n2 = (InterfaceC1439n) c6110x.f19875Y;
                AbstractC9233X.m9807c(obj2);
                interfaceC4814a = interfaceC4814a6;
                c6084g = c6084g3;
                interfaceC1439n = interfaceC1439n2;
            }
            if (c16556x.f51285Y) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = c16525b.f51262Y;
            c6110x.f19875Y = interfaceC4814a;
            c6110x.f19876Z = c16525b;
            c6110x.f19877o0 = c6084g;
            c6110x.f19878p0 = null;
            c6110x.f19879q0 = null;
            c6110x.f19882t0 = 2;
            Object objInvoke = interfaceC1439n.invoke(obj5, c6110x);
            if (objInvoke == enumC19250a) {
                return enumC19250a;
            }
            interfaceC4814a3 = interfaceC4814a;
            obj2 = objInvoke;
            c6084g2 = c6084g;
            if (AbstractC16544l.m18089b(obj2, c16525b.f51262Y)) {
                c6110x.f19875Y = interfaceC4814a3;
                c6110x.f19876Z = c16525b;
                c6110x.f19877o0 = obj2;
                c6110x.f19882t0 = 3;
                if (c6084g2.m6659k(obj2, c6110x) == enumC19250a) {
                    return enumC19250a;
                }
                obj = obj2;
                c16525b2 = c16525b;
                interfaceC4814a4 = interfaceC4814a3;
                c16525b2.f51262Y = obj;
                c16525b = c16525b2;
                interfaceC4814a2 = interfaceC4814a4;
            } else {
                interfaceC4814a2 = interfaceC4814a3;
            }
            Object obj6 = c16525b.f51262Y;
            ((C4816c) interfaceC4814a2).m5450g(null);
            return obj6;
        } catch (Throwable th4) {
            th = th4;
            interfaceC4814a2 = interfaceC4814a;
            ((C4816c) interfaceC4814a2).m5450g(null);
            throw th;
        }
    }
}
