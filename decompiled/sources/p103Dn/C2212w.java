package p103Dn;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C2212w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6787Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6788Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f6789o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2212w(long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6789o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2212w c2212w = new C2212w(this.f6789o0, interfaceC18770c);
        c2212w.f6788Z = obj;
        return c2212w;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C2212w) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x005d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r7.f6787Y
            long r2 = r7.f6789o0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L23
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L12
            goto L23
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r0 = 0
            java.lang.String r0 = p160G5.p161rK.TVCuK.ArlyC
            r8.<init>(r0)
            throw r8
        L1b:
            java.lang.Object r1 = r7.f6788Z
            Cn.z r1 = (p077Cn.InterfaceC1758z) r1
            p571X9.AbstractC9233X.m9807c(r8)
            goto L53
        L23:
            java.lang.Object r1 = r7.f6788Z
            Cn.z r1 = (p077Cn.InterfaceC1758z) r1
            p571X9.AbstractC9233X.m9807c(r8)
            goto L3e
        L2b:
            p571X9.AbstractC9233X.m9807c(r8)
            java.lang.Object r8 = r7.f6788Z
            r1 = r8
            Cn.z r1 = (p077Cn.InterfaceC1758z) r1
            r7.f6788Z = r1
            r7.f6787Y = r6
            java.lang.Object r8 = p025An.AbstractC0575H.m1184m(r2, r7)
            if (r8 != r0) goto L3e
            return r0
        L3e:
            r8 = r1
            Cn.y r8 = (p077Cn.C1757y) r8
            r8.getClass()
            mm.C r6 = mm.C17296C.f55119a
            r7.f6788Z = r1
            r7.f6787Y = r5
            Cn.k r8 = r8.f5030p0
            java.lang.Object r8 = r8.mo2523o(r6, r7)
            if (r8 != r0) goto L53
            return r0
        L53:
            r7.f6788Z = r1
            r7.f6787Y = r4
            java.lang.Object r8 = p025An.AbstractC0575H.m1184m(r2, r7)
            if (r8 != r0) goto L3e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p103Dn.C2212w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
