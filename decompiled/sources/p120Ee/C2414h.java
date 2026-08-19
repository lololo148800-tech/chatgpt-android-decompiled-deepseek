package p120Ee;

import java.util.Collection;
import java.util.Iterator;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p763g5.C13820e;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ee.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2414h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public boolean f7495Y;

    /* JADX INFO: renamed from: Z */
    public C2423q f7496Z;

    /* JADX INFO: renamed from: o0 */
    public Collection f7497o0;

    /* JADX INFO: renamed from: p0 */
    public Iterator f7498p0;

    /* JADX INFO: renamed from: q0 */
    public Collection f7499q0;

    /* JADX INFO: renamed from: r0 */
    public int f7500r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C2423q f7501s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ boolean f7502t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2414h(C2423q c2423q, InterfaceC18770c interfaceC18770c, boolean z6) {
        super(2, interfaceC18770c);
        this.f7501s0 = c2423q;
        this.f7502t0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2414h(this.f7501s0, interfaceC18770c, this.f7502t0);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2414h) create((C13820e) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0073  */
    /* JADX WARN: Code duplicated, block: B:13:0x007c  */
    /* JADX WARN: Code duplicated, block: B:14:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x007c -> B:19:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00b6 -> B:18:0x00b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x007c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f7500r0
            r3 = 1
            if (r2 == 0) goto L2a
            if (r2 != r3) goto L22
            boolean r2 = r0.f7495Y
            java.util.Collection r4 = r0.f7499q0
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r0.f7498p0
            java.util.Collection r6 = r0.f7497o0
            java.util.Collection r6 = (java.util.Collection) r6
            Ee.q r7 = r0.f7496Z
            p571X9.AbstractC9233X.m9807c(r27)
            r8 = r7
            r7 = r6
            r6 = r27
            goto Lb8
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2a:
            p571X9.AbstractC9233X.m9807c(r27)
            Ee.q r2 = r0.f7501s0
            Qc.e r4 = r2.f7535b
            r4.getClass()
            java.lang.String r5 = "DBConversation"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            J0.z3 r6 = new J0.z3
            r7 = 29
            r6.<init>(r4, r7)
            java.lang.String r7 = "driver"
            java.lang.Object r4 = r4.f11539Z
            Y8.j r4 = (p593Y8.C9683j) r4
            kotlin.jvm.internal.AbstractC16544l.m18094g(r4, r7)
            g5.a r7 = new g5.a
            r7.<init>(r5, r4, r6)
            java.util.List r4 = r7.m784i()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = p909nm.AbstractC17682p.m19389r(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
            boolean r6 = r0.f7502t0
            r7 = r2
            r2 = r6
            r25 = r5
            r5 = r4
            r4 = r25
        L6d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lc0
            java.lang.Object r6 = r5.next()
            r8 = r6
            Qd.i r8 = (p403Qd.C6636i) r8
            if (r2 == 0) goto La0
            r7.getClass()
            Qd.I r20 = p403Qd.EnumC6603I.f21318Y
            r22 = 0
            r23 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r24 = 1966079(0x1dffff, float:2.755063E-39)
            Qd.i r6 = p403Qd.C6636i.m7162a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r8 = r7
            r7 = r4
            goto Lba
        La0:
            r0.f7496Z = r7
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            r0.f7497o0 = r6
            r0.f7498p0 = r5
            r0.f7499q0 = r6
            r0.f7495Y = r2
            r0.f7500r0 = r3
            java.lang.Object r6 = p120Ee.C2423q.m3576a(r7, r8, r0)
            if (r6 != r1) goto Lb6
            return r1
        Lb6:
            r8 = r7
            r7 = r4
        Lb8:
            Qd.i r6 = (p403Qd.C6636i) r6
        Lba:
            r4.add(r6)
            r4 = r7
            r7 = r8
            goto L6d
        Lc0:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p120Ee.C2414h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
