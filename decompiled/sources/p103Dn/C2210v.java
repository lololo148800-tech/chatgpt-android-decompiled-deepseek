package p103Dn;

import cl.C11774a;
import java.util.ArrayList;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p582Xk.C9525b;
import p666bl.C11507w;
import p666bl.EnumC11489e;
import p666bl.InterfaceC11491g;
import p754fl.C13693c;
import p792hl.AbstractC14527b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C2210v extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6779Y = 0;

    /* JADX INFO: renamed from: Z */
    public int f6780Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f6781o0;

    /* JADX INFO: renamed from: p0 */
    public Object f6782p0;

    /* JADX INFO: renamed from: q0 */
    public Object f6783q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f6784r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f6785s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f6786t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2210v(C2198p c2198p, InterfaceC2184i interfaceC2184i, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f6785s0 = c2198p;
        this.f6786t0 = interfaceC2184i;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Bm.n, sm.j] */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f6779Y) {
            case 0:
                C2210v c2210v = new C2210v((C2198p) this.f6785s0, (InterfaceC2184i) this.f6786t0, (InterfaceC18770c) obj3);
                c2210v.f6781o0 = (InterfaceC0571F) obj;
                c2210v.f6784r0 = (InterfaceC2186j) obj2;
                return c2210v.invokeSuspend(C17296C.f55119a);
            case 1:
                ArrayList arrayList = (ArrayList) this.f6783q0;
                InterfaceC11491g interfaceC11491g = (InterfaceC11491g) this.f6784r0;
                ArrayList arrayList2 = (ArrayList) this.f6786t0;
                C2210v c2210v2 = new C2210v(arrayList, interfaceC11491g, (EnumC11489e) this.f6785s0, arrayList2, (InterfaceC18770c) obj3);
                c2210v2.f6781o0 = (C11507w) obj;
                c2210v2.f6782p0 = (C13693c) obj2;
                return c2210v2.invokeSuspend(C17296C.f55119a);
            default:
                ?? r6 = (AbstractC19694j) this.f6786t0;
                C2210v c2210v3 = new C2210v((C9525b) this.f6785s0, (InterfaceC1439n) r6, (InterfaceC18770c) obj3);
                c2210v3.f6781o0 = (C11774a) obj;
                c2210v3.f6784r0 = (AbstractC14527b) obj2;
                return c2210v3.invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0296  */
    /* JADX WARN: Code duplicated, block: B:103:0x029b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0215  */
    /* JADX WARN: Code duplicated, block: B:94:0x0233 A[PHI: r4 r10 r12 r13
      0x0233: PHI (r4v4 kotlin.jvm.internal.B) = (r4v6 kotlin.jvm.internal.B), (r4v7 kotlin.jvm.internal.B), (r4v7 kotlin.jvm.internal.B) binds: [B:93:0x0230, B:82:0x01fc, B:85:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r10v4 Cn.B) = (r10v6 Cn.B), (r10v7 Cn.B), (r10v7 Cn.B) binds: [B:93:0x0230, B:82:0x01fc, B:85:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r12v2 Dn.j) = (r12v4 Dn.j), (r12v5 Dn.j), (r12v5 Dn.j) binds: [B:93:0x0230, B:82:0x01fc, B:85:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r13v0 kotlin.jvm.internal.A) = (r13v4 kotlin.jvm.internal.A), (r13v6 kotlin.jvm.internal.A), (r13v6 kotlin.jvm.internal.A) binds: [B:93:0x0230, B:82:0x01fc, B:85:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0237  */
    /* JADX WARN: Code duplicated, block: B:99:0x024c  */
    /* JADX WARN: Type inference failed for: r2v38, types: [Bm.n, sm.j] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p103Dn.C2210v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2210v(C9525b c9525b, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f6785s0 = c9525b;
        this.f6786t0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2210v(ArrayList arrayList, InterfaceC11491g interfaceC11491g, EnumC11489e enumC11489e, ArrayList arrayList2, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f6783q0 = arrayList;
        this.f6784r0 = interfaceC11491g;
        this.f6785s0 = enumC11489e;
        this.f6786t0 = arrayList2;
    }
}
