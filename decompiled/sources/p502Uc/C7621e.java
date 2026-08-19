package p502Uc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p620Zc.InterfaceC10277b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Uc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7621e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f24086Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f24087Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f24088o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10277b f24089p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f24090q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7621e(String str, InterfaceC10277b interfaceC10277b, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f24088o0 = str;
        this.f24089p0 = interfaceC10277b;
        this.f24090q0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7621e c7621e = new C7621e(this.f24088o0, this.f24089p0, this.f24090q0, interfaceC18770c);
        c7621e.f24087Z = obj;
        return c7621e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7621e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00af -> B:32:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ef -> B:40:0x00f2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p502Uc.C7621e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
