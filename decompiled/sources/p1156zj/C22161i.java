package p1156zj;

import java.util.ArrayList;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C22161i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f70071Y;

    /* JADX INFO: renamed from: Z */
    public int f70072Z;

    /* JADX INFO: renamed from: o0 */
    public C22170l f70073o0;

    /* JADX INFO: renamed from: p0 */
    public C22172l1 f70074p0;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f70075q0;

    /* JADX INFO: renamed from: r0 */
    public ArrayList f70076r0;

    /* JADX INFO: renamed from: s0 */
    public int f70077s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C22172l1 f70078t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C22170l f70079u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22161i(InterfaceC18770c interfaceC18770c, C22170l c22170l, C22172l1 c22172l1) {
        super(2, interfaceC18770c);
        this.f70078t0 = c22172l1;
        this.f70079u0 = c22170l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C22161i(interfaceC18770c, this.f70079u0, this.f70078t0);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C22161i) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0055). Please report as a decompilation issue!!! */
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
            int r1 = r12.f70077s0
            mm.C r2 = mm.C17296C.f55119a
            r3 = 1
            zj.l1 r4 = r12.f70078t0
            zj.l r5 = r12.f70079u0
            if (r1 == 0) goto L2b
            if (r1 != r3) goto L23
            int r1 = r12.f70072Z
            int r6 = r12.f70071Y
            java.util.ArrayList r7 = r12.f70076r0
            java.util.ArrayList r8 = r12.f70075q0
            zj.l1 r9 = r12.f70074p0
            zj.l r10 = r12.f70073o0
            p571X9.AbstractC9233X.m9807c(r13)
            mm.o r13 = (mm.C17312o) r13
            java.lang.Object r13 = r13.f55139Y
            goto L55
        L23:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2b:
            p571X9.AbstractC9233X.m9807c(r13)
            int r13 = r4.f70200u
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r13)
            r6 = 0
            r7 = r1
            r9 = r4
            r10 = r5
            r1 = r6
            r6 = r13
        L3b:
            if (r1 >= r6) goto L6d
            pj.p r13 = r10.f70152b
            r12.f70073o0 = r10
            r12.f70074p0 = r9
            r12.f70075q0 = r7
            r12.f70076r0 = r7
            r12.f70071Y = r6
            r12.f70072Z = r1
            r12.f70077s0 = r3
            java.lang.Object r13 = r13.mo217k(r12)
            if (r13 != r0) goto L54
            return r0
        L54:
            r8 = r7
        L55:
            java.lang.Throwable r11 = mm.C17312o.m18979a(r13)
            if (r11 != 0) goto L67
            java.io.File r13 = (java.io.File) r13
            java.lang.String r13 = r13.getAbsolutePath()
            r7.add(r13)
            int r1 = r1 + r3
            r7 = r8
            goto L3b
        L67:
            Bm.k r13 = r9.f70198s
            r13.invoke(r11)
            return r2
        L6d:
            Dj.b r13 = r5.f70151a
            android.widget.FrameLayout r13 = r13.f6291a
            r13.setHapticFeedbackEnabled(r3)
            r0 = 2
            int r1 = p1156zj.C22170l.f70150n
            r13.performHapticFeedback(r1, r0)
            Bm.n r13 = r4.f70189j
            pj.p r0 = r5.f70152b
            pj.A r0 = r0.mo225v()
            r13.invoke(r7, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p1156zj.C22161i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
