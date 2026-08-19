package p192He;

import java.util.Iterator;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: He.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3293e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Iterator f10039Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f10040Z;

    /* JADX INFO: renamed from: o0 */
    public int f10041o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f10042p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f10043q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C3294f f10044r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3293e(long j10, C3294f c3294f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10043q0 = j10;
        this.f10044r0 = c3294f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3293e c3293e = new C3293e(this.f10043q0, this.f10044r0, interfaceC18770c);
        c3293e.f10042p0 = obj;
        return c3293e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3293e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2 A[LOOP:1: B:39:0x00dc->B:41:0x00e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [An.F] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d1 -> B:37:0x00d4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:48:0x007e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p192He.C3293e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
