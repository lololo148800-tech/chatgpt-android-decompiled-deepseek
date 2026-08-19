package p530Vi;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vi.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C8299G extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f25859Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f25860Z;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C8299G c8299g = new C8299G(2, interfaceC18770c);
        c8299g.f25860Z = obj;
        return c8299g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8299G) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0047
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r5.f25859Y
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r5.f25860Z
            An.F r1 = (p025An.InterfaceC0571F) r1
            p571X9.AbstractC9233X.m9807c(r6)     // Catch: java.util.concurrent.CancellationException -> L47
            goto L21
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            p571X9.AbstractC9233X.m9807c(r6)
            java.lang.Object r6 = r5.f25860Z
            An.F r6 = (p025An.InterfaceC0571F) r6
            r1 = r6
        L21:
            boolean r6 = p025An.AbstractC0575H.m1196y(r1)
            if (r6 == 0) goto L4d
            Vi.H r6 = p530Vi.C8300H.f25862Y
            r6.m8908b()     // Catch: java.lang.Throwable -> L2d
            goto L37
        L2d:
            r6 = move-exception
            Vi.H r3 = p530Vi.C8300H.f25862Y
            Vi.F r3 = p530Vi.C8300H.f25866q0
            if (r3 == 0) goto L37
            r3.invoke(r6)
        L37:
            Vi.H r6 = p530Vi.C8300H.f25862Y     // Catch: java.util.concurrent.CancellationException -> L47
            r6 = 30000(0x7530, float:4.2039E-41)
            long r3 = (long) r6     // Catch: java.util.concurrent.CancellationException -> L47
            r5.f25860Z = r1     // Catch: java.util.concurrent.CancellationException -> L47
            r5.f25859Y = r2     // Catch: java.util.concurrent.CancellationException -> L47
            java.lang.Object r6 = p025An.AbstractC0575H.m1184m(r3, r5)     // Catch: java.util.concurrent.CancellationException -> L47
            if (r6 != r0) goto L21
            return r0
        L47:
            Vi.H r6 = p530Vi.C8300H.f25862Y
            r6.m8908b()
            goto L21
        L4d:
            mm.C r6 = mm.C17296C.f55119a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p530Vi.C8299G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
