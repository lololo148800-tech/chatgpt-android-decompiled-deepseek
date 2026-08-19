package p586Y0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1091wn.C21030k;
import p972qm.InterfaceC18770c;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: Y0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9559k extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int[] f28744Z;

    /* JADX INFO: renamed from: o0 */
    public int f28745o0;

    /* JADX INFO: renamed from: p0 */
    public int f28746p0;

    /* JADX INFO: renamed from: q0 */
    public int f28747q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f28748r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C9560l f28749s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9559k(C9560l c9560l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f28749s0 = c9560l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C9559k c9559k = new C9559k(this.f28749s0, interfaceC18770c);
        c9559k.f28748r0 = obj;
        return c9559k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C9559k) create((C21030k) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:27:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00cd -> B:39:0x00ce). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:28:0x009d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p586Y0.C9559k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
