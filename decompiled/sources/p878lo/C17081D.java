package p878lo;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C17081D extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f54586Y;

    /* JADX INFO: renamed from: Z */
    public int f54587Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f54588o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f54589p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17087J f54590q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17081D(C16525B c16525b, C17087J c17087j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54589p0 = c16525b;
        this.f54590q0 = c17087j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17081D c17081d = new C17081D(this.f54589p0, this.f54590q0, interfaceC18770c);
        c17081d.f54588o0 = obj;
        return c17081d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17081D) create((C17097f) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:20:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r11.f54587Z
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            kotlin.jvm.internal.B r1 = r11.f54586Y
            java.lang.Object r3 = r11.f54588o0
            lo.f r3 = (p878lo.C17097f) r3
            p571X9.AbstractC9233X.m9807c(r12)
            goto L69
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            p571X9.AbstractC9233X.m9807c(r12)
            java.lang.Object r12 = r11.f54588o0
            lo.f r12 = (p878lo.C17097f) r12
            r3 = r12
        L23:
            kotlin.jvm.internal.B r1 = r11.f54589p0
            java.lang.Object r12 = r1.f51262Y
            boolean r4 = r12 instanceof p878lo.C17079B
            if (r4 != 0) goto L6c
            boolean r4 = r12 instanceof p878lo.C17117z
            if (r4 == 0) goto L32
            lo.z r12 = (p878lo.C17117z) r12
            goto L33
        L32:
            r12 = 0
        L33:
            if (r12 == 0) goto L58
            b5.i r4 = r3.f54639a
            java.lang.Object r4 = r4.f34008Y
            Af.p r4 = (p017Af.C0485p) r4
            float r5 = r12.f54713a
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            g1.b r6 = new g1.b
            long r7 = r12.f54714b
            r6.<init>(r7)
            float r7 = r12.f54715c
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            g1.b r8 = new g1.b
            long r9 = r12.f54716d
            r8.<init>(r9)
            r4.mo985d(r5, r6, r7, r8)
        L58:
            lo.J r12 = r11.f54590q0
            Cn.k r12 = r12.f54615H0
            r11.f54588o0 = r3
            r11.f54586Y = r1
            r11.f54587Z = r2
            java.lang.Object r12 = r12.mo2514c(r11)
            if (r12 != r0) goto L69
            return r0
        L69:
            r1.f51262Y = r12
            goto L23
        L6c:
            mm.C r12 = mm.C17296C.f55119a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p878lo.C17081D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
