package p1000s0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p972qm.InterfaceC18770c;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: s0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C19411g extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public C19738o f61510Z;

    /* JADX INFO: renamed from: o0 */
    public C19738o f61511o0;

    /* JADX INFO: renamed from: p0 */
    public int f61512p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f61513q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C19408d f61514r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19411g(C19408d c19408d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f61514r0 = c19408d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19411g c19411g = new C19411g(this.f61514r0, interfaceC18770c);
        c19411g.f61513q0 = obj;
        return c19411g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19411g) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e A[LOOP:0: B:19:0x006f->B:23:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[EDGE_INSN: B:28:0x0055->B:14:0x0055 BREAK  A[LOOP:0: B:19:0x006f->B:23:0x007e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0063 -> B:18:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r12.f61512p0
            t1.g r2 = p1014t1.EnumC19730g.f62465Y
            r3 = 1
            s0.d r4 = r12.f61514r0
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L25
            if (r1 != r5) goto L1d
            t1.o r1 = r12.f61511o0
            t1.o r3 = r12.f61510Z
            java.lang.Object r7 = r12.f61513q0
            t1.y r7 = (p1014t1.C19748y) r7
            p571X9.AbstractC9233X.m9807c(r13)
            goto L66
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L25:
            java.lang.Object r1 = r12.f61513q0
            t1.y r1 = (p1014t1.C19748y) r1
            p571X9.AbstractC9233X.m9807c(r13)
            goto L40
        L2d:
            p571X9.AbstractC9233X.m9807c(r13)
            java.lang.Object r13 = r12.f61513q0
            r1 = r13
            t1.y r1 = (p1014t1.C19748y) r1
            r12.f61513q0 = r1
            r12.f61512p0 = r3
            java.lang.Object r13 = p860l0.AbstractC16689K1.m18505b(r1, r6, r2, r12)
            if (r13 != r0) goto L40
            return r0
        L40:
            t1.o r13 = (p1014t1.C19738o) r13
            r4.getClass()
            g1.b r3 = new g1.b
            r7 = 0
            r3.<init>(r7)
            O0.f0 r7 = r4.f61438a
            r7.setValue(r3)
            r3 = 0
            r7 = r1
            r1 = r3
            r3 = r13
        L55:
            if (r1 != 0) goto L8b
            r12.f61513q0 = r7
            r12.f61510Z = r3
            r12.f61511o0 = r1
            r12.f61512p0 = r5
            java.lang.Object r13 = r7.m20695a(r2, r12)
            if (r13 != r0) goto L66
            return r0
        L66:
            t1.f r13 = (p1014t1.C19729f) r13
            java.lang.Object r8 = r13.f62460a
            int r9 = r8.size()
            r10 = r6
        L6f:
            if (r10 >= r9) goto L81
            java.lang.Object r11 = r8.get(r10)
            t1.o r11 = (p1014t1.C19738o) r11
            boolean r11 = p1014t1.AbstractC19736m.m20680b(r11)
            if (r11 != 0) goto L7e
            goto L55
        L7e:
            int r10 = r10 + 1
            goto L6f
        L81:
            java.lang.Object r13 = r13.f62460a
            java.lang.Object r13 = r13.get(r6)
            r1 = r13
            t1.o r1 = (p1014t1.C19738o) r1
            goto L55
        L8b:
            long r2 = r3.f62480c
            long r0 = r1.f62480c
            long r0 = p759g1.C13800b.m15310k(r0, r2)
            r4.getClass()
            g1.b r13 = new g1.b
            r13.<init>(r0)
            O0.f0 r0 = r4.f61438a
            r0.setValue(r13)
            mm.C r13 = mm.C17296C.f55119a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p1000s0.C19411g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
