package com.statsig.androidsdk;

import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigLogger$timer$1", m20656f = "StatsigLogger.kt", m20657l = {43, 44}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
public final class StatsigLogger$timer$1 extends AbstractC19694j implements InterfaceC1439n {
    int label;
    final /* synthetic */ StatsigLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigLogger$timer$1(StatsigLogger statsigLogger, InterfaceC18770c<? super StatsigLogger$timer$1> interfaceC18770c) {
        super(2, interfaceC18770c);
        this.this$0 = statsigLogger;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
        return new StatsigLogger$timer$1(this.this$0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        return ((StatsigLogger$timer$1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003c -> B:11:0x001c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L19
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            p571X9.AbstractC9233X.m9807c(r7)
            goto L34
        L19:
            p571X9.AbstractC9233X.m9807c(r7)
        L1c:
            com.statsig.androidsdk.StatsigLogger r7 = r6.this$0
            An.F r7 = com.statsig.androidsdk.StatsigLogger.access$getCoroutineScope$p(r7)
            boolean r7 = p025An.AbstractC0575H.m1196y(r7)
            if (r7 == 0) goto L3f
            r6.label = r3
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r7 = p025An.AbstractC0575H.m1184m(r4, r6)
            if (r7 != r0) goto L34
            return r0
        L34:
            com.statsig.androidsdk.StatsigLogger r7 = r6.this$0
            r6.label = r2
            java.lang.Object r7 = r7.flush(r6)
            if (r7 != r0) goto L1c
            return r0
        L3f:
            mm.C r7 = mm.C17296C.f55119a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigLogger$timer$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
