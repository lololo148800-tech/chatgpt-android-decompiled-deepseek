package p1063vf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20601i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65363Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f65364Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20603k f65365o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20601i(C20603k c20603k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65365o0 = c20603k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20601i c20601i = new C20601i(this.f65365o0, interfaceC18770c);
        c20601i.f65364Z = obj;
        return c20601i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20601i) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a9 -> B:7:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r11.f65363Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r11.f65364Z
            An.F r1 = (p025An.InterfaceC0571F) r1
            p571X9.AbstractC9233X.m9807c(r12)
        L13:
            r12 = r1
            goto L2d
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            java.lang.Object r1 = r11.f65364Z
            An.F r1 = (p025An.InterfaceC0571F) r1
            p571X9.AbstractC9233X.m9807c(r12)
            goto La1
        L26:
            p571X9.AbstractC9233X.m9807c(r12)
            java.lang.Object r12 = r11.f65364Z
            An.F r12 = (p025An.InterfaceC0571F) r12
        L2d:
            boolean r1 = p025An.AbstractC0575H.m1196y(r12)
            if (r1 == 0) goto Lac
            vf.k r1 = r11.f65365o0
            C3.D r4 = r1.f65377k
            long r4 = r4.m2237W()
            C3.D r6 = r1.f65377k
            r6.m2256q0()
            boolean r7 = r6.m2243d0()
            if (r7 == 0) goto L60
            C3.Z r7 = r6.f4087k1
            J3.y r8 = r7.f4251b
            java.lang.Object r9 = r8.f13895a
            t3.N r7 = r7.f4250a
            t3.L r6 = r6.f4051A0
            r7.mo2416g(r9, r6)
            int r7 = r8.f13896b
            int r8 = r8.f13897c
            long r6 = r6.m20714a(r7, r8)
            long r6 = p1073w3.AbstractC20817s.m21399M(r6)
            goto L84
        L60:
            t3.N r7 = r6.m2239Y()
            boolean r8 = r7.m20728p()
            if (r8 == 0) goto L70
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L84
        L70:
            int r8 = r6.m2236V()
            r9 = 0
            java.lang.Object r6 = r6.f11539Z
            t3.M r6 = (p1016t3.C19763M) r6
            t3.M r6 = r7.mo2411m(r8, r6, r9)
            long r6 = r6.f62597l
            long r6 = p1073w3.AbstractC20817s.m21399M(r6)
        L84:
            Dn.D0 r1 = r1.f65373g
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r4)
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r6)
            mm.l r5 = new mm.l
            r5.<init>(r8, r4)
            r11.f65364Z = r12
            r11.f65363Y = r3
            java.lang.Object r1 = r1.mo395a(r5, r11)
            if (r1 != r0) goto La0
            return r0
        La0:
            r1 = r12
        La1:
            r11.f65364Z = r1
            r11.f65363Y = r2
            java.lang.Object r12 = p050Bn.AbstractC1454h.m2057c(r11)
            if (r12 != r0) goto L13
            return r0
        Lac:
            mm.C r12 = mm.C17296C.f55119a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p1063vf.C20601i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
