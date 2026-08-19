package p1156zj;

import java.util.ArrayList;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C22164j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f70108Y;

    /* JADX INFO: renamed from: Z */
    public int f70109Z;

    /* JADX INFO: renamed from: o0 */
    public C22170l f70110o0;

    /* JADX INFO: renamed from: p0 */
    public ArrayList f70111p0;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f70112q0;

    /* JADX INFO: renamed from: r0 */
    public int f70113r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C22172l1 f70114s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C22170l f70115t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22164j(InterfaceC18770c interfaceC18770c, C22170l c22170l, C22172l1 c22172l1) {
        super(2, interfaceC18770c);
        this.f70114s0 = c22172l1;
        this.f70115t0 = c22170l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C22164j(interfaceC18770c, this.f70115t0, this.f70114s0);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C22164j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r10.f70113r0
            r2 = 1
            zj.l1 r3 = r10.f70114s0
            zj.l r4 = r10.f70115t0
            if (r1 == 0) goto L27
            if (r1 != r2) goto L1f
            int r1 = r10.f70109Z
            int r5 = r10.f70108Y
            java.util.ArrayList r6 = r10.f70112q0
            java.util.ArrayList r7 = r10.f70111p0
            zj.l r8 = r10.f70110o0
            p571X9.AbstractC9233X.m9807c(r11)
            mm.o r11 = (mm.C17312o) r11
            java.lang.Object r11 = r11.f55139Y
            goto L4e
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L27:
            p571X9.AbstractC9233X.m9807c(r11)
            int r11 = r3.f70200u
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            r5 = 0
            r6 = r1
            r8 = r4
            r1 = r5
            r5 = r11
        L36:
            if (r1 >= r5) goto L62
            pj.p r11 = r8.f70152b
            r10.f70110o0 = r8
            r10.f70111p0 = r6
            r10.f70112q0 = r6
            r10.f70108Y = r5
            r10.f70109Z = r1
            r10.f70113r0 = r2
            java.lang.Object r11 = r11.mo217k(r10)
            if (r11 != r0) goto L4d
            return r0
        L4d:
            r7 = r6
        L4e:
            java.lang.Throwable r9 = mm.C17312o.m18979a(r11)
            if (r9 != 0) goto L5b
            java.io.File r11 = (java.io.File) r11
            java.lang.String r11 = r11.getAbsolutePath()
            goto L5c
        L5b:
            r11 = 0
        L5c:
            r6.add(r11)
            int r1 = r1 + r2
            r6 = r7
            goto L36
        L62:
            Dj.b r11 = r4.f70151a
            android.widget.FrameLayout r11 = r11.f6291a
            r11.setHapticFeedbackEnabled(r2)
            r0 = 2
            int r1 = p1156zj.C22170l.f70150n
            r11.performHapticFeedback(r1, r0)
            Bm.n r11 = r3.f70197r
            java.util.ArrayList r0 = p909nm.AbstractC17680n.m19339O(r6)
            pj.p r1 = r4.f70152b
            pj.A r1 = r1.mo225v()
            r11.invoke(r0, r1)
            mm.C r11 = mm.C17296C.f55119a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p1156zj.C22164j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
