package p112E6;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p942p6.C18301e;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: E6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2348g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7290Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7291Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f7292o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18301e f7293p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2348g(C16525B c16525b, C18301e c18301e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7292o0 = c16525b;
        this.f7293p0 = c18301e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2348g c2348g = new C2348g(this.f7292o0, this.f7293p0, interfaceC18770c);
        c2348g.f7291Z = obj;
        return c2348g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2348g) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00e6 A[EDGE_INSN: B:106:0x00e6->B:42:0x00e6 BREAK  A[LOOP:2: B:39:0x00d8->B:41:0x00e2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2 A[LOOP:2: B:39:0x00d8->B:41:0x00e2, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01a4 -> B:82:0x01a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:39:0x00d8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112E6.C2348g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
