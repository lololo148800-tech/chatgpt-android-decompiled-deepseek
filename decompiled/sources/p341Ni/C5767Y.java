package p341Ni;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p387Pl.AbstractC6468O;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C5767Y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f18779Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f18780Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC6468O f18781o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f18782p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C5784h0 f18783q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5767Y(AbstractC6468O abstractC6468O, long j10, C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18781o0 = abstractC6468O;
        this.f18782p0 = j10;
        this.f18783q0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5767Y c5767y = new C5767Y(this.f18781o0, this.f18782p0, this.f18783q0, interfaceC18770c);
        c5767y.f18780Z = obj;
        return c5767y;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5767Y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[LOOP:1: B:34:0x00a3->B:36:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0104 A[LOOP:2: B:38:0x00fe->B:40:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x013a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0138 -> B:7:0x0015). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p341Ni.C5767Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
