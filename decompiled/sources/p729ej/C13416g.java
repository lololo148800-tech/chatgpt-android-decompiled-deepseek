package p729ej;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p117Eb.C2391u;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ej.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13416g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f42492Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f42493Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2391u f42494o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2153Q0 f42495p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1439n f42496q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13416g(C2391u c2391u, C2153Q0 c2153q0, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f42494o0 = c2391u;
        this.f42495p0 = c2153q0;
        this.f42496q0 = interfaceC1439n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13416g c13416g = new C13416g(this.f42494o0, this.f42495p0, this.f42496q0, interfaceC18770c);
        c13416g.f42493Z = obj;
        return c13416g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13416g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:14:0x004a, B:16:0x0050, B:19:0x005f), top: B:40:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b9 -> B:35:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ca -> B:35:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p729ej.C13416g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
