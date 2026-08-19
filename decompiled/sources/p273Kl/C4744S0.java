package p273Kl;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4744S0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15455Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4750V0 f15456Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4744S0(C4750V0 c4750v0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15456Z = c4750v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4744S0(this.f15456Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C4744S0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0084  */
    /* JADX WARN: Code duplicated, block: B:17:0x0089  */
    /* JADX WARN: Code duplicated, block: B:18:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0096
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r9.f15455Y
            r2 = 1
            Kl.V0 r3 = r9.f15456Z
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p571X9.AbstractC9233X.m9807c(r10)
            goto L25
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            p571X9.AbstractC9233X.m9807c(r10)
        L1a:
            long r4 = r3.f15501y
            r9.f15455Y = r2
            java.lang.Object r10 = p025An.AbstractC0575H.m1184m(r4, r9)
            if (r10 != r0) goto L25
            return r0
        L25:
            r3.getClass()
            java.util.Date r10 = new java.util.Date
            r10.<init>()
            long r4 = r10.getTime()
            ho.c4 r10 = livekit.LivekitRtc$SignalRequest.newBuilder()
            r10.m13863d()
            com.google.protobuf.Z r1 = r10.f36981Z
            livekit.LivekitRtc$SignalRequest r1 = (livekit.LivekitRtc$SignalRequest) r1
            livekit.LivekitRtc$SignalRequest.access$3800(r1, r4)
            com.google.protobuf.Z r10 = r10.m13861b()
            livekit.LivekitRtc$SignalRequest r10 = (livekit.LivekitRtc$SignalRequest) r10
            r3.m5430t(r10)
            ho.c4 r10 = livekit.LivekitRtc$SignalRequest.newBuilder()
            ho.S3 r1 = livekit.LivekitRtc$Ping.newBuilder()
            long r6 = r3.f15502z
            r1.m13863d()
            com.google.protobuf.Z r8 = r1.f36981Z
            livekit.LivekitRtc$Ping r8 = (livekit.LivekitRtc$Ping) r8
            livekit.LivekitRtc$Ping.access$57100(r8, r6)
            r1.m13863d()
            com.google.protobuf.Z r6 = r1.f36981Z
            livekit.LivekitRtc$Ping r6 = (livekit.LivekitRtc$Ping) r6
            livekit.LivekitRtc$Ping.access$56900(r6, r4)
            com.google.protobuf.Z r1 = r1.m13861b()
            livekit.LivekitRtc$Ping r1 = (livekit.LivekitRtc$Ping) r1
            r10.m13863d()
            com.google.protobuf.Z r6 = r10.f36981Z
            livekit.LivekitRtc$SignalRequest r6 = (livekit.LivekitRtc$SignalRequest) r6
            livekit.LivekitRtc$SignalRequest.access$4300(r6, r1)
            com.google.protobuf.Z r10 = r10.m13861b()
            livekit.LivekitRtc$SignalRequest r10 = (livekit.LivekitRtc$SignalRequest) r10
            r3.m5430t(r10)
            An.B0 r10 = r3.f15499w
            if (r10 == 0) goto L84
            goto L1a
        L84:
            Vl.a r10 = r3.f15491o
            r1 = 0
            if (r10 == 0) goto L96
            Kl.T0 r6 = new Kl.T0
            r6.<init>(r3, r4, r1)
            r4 = 3
            An.B0 r10 = p025An.AbstractC0575H.m1156D(r10, r1, r1, r6, r4)
            r3.f15499w = r10
            goto L1a
        L96:
            java.lang.String r10 = "coroutineScope"
            kotlin.jvm.internal.AbstractC16544l.m18103p(r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p273Kl.C4744S0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
