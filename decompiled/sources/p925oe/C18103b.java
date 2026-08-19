package p925oe;

import gd.C13969n2;
import java.util.Iterator;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p403Qd.C6636i;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: oe.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18103b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C13969n2 f57744Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f57745Z;

    /* JADX INFO: renamed from: o0 */
    public C6636i f57746o0;

    /* JADX INFO: renamed from: p0 */
    public int f57747p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f57748q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C18127p f57749r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C13969n2 f57750s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18103b(C18127p c18127p, C13969n2 c13969n2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f57749r0 = c18127p;
        this.f57750s0 = c13969n2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18103b c18103b = new C18103b(this.f57749r0, this.f57750s0, interfaceC18770c);
        c18103b.f57748q0 = obj;
        return c18103b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18103b) create((C17309l) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5 A[EDGE_INSN: B:28:0x00a5->B:29:0x00a6 BREAK  A[LOOP:0: B:9:0x0038->B:35:0x0038]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a5 -> B:29:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0058
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r10.f57747p0
            if (r2 == 0) goto L20
            if (r2 != r0) goto L18
            Qd.i r2 = r10.f57746o0
            java.util.Iterator r3 = r10.f57745Z
            gd.n2 r4 = r10.f57744Y
            java.lang.Object r5 = r10.f57748q0
            oe.p r5 = (p925oe.C18127p) r5
            p571X9.AbstractC9233X.m9807c(r11)
            goto La6
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            p571X9.AbstractC9233X.m9807c(r11)
            java.lang.Object r11 = r10.f57748q0
            mm.l r11 = (mm.C17309l) r11
            java.lang.Object r11 = r11.f55136Y
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            gd.n2 r2 = r10.f57750s0
            oe.p r3 = r10.f57749r0
            r4 = r2
            r5 = r3
            r3 = r11
        L38:
            boolean r11 = r3.hasNext()
            mm.C r2 = mm.C17296C.f55119a
            if (r11 == 0) goto Lac
            java.lang.Object r11 = r3.next()
            Qd.i r11 = (p403Qd.C6636i) r11
            Qd.c r6 = r11.f21393o
            if (r6 != 0) goto L4c
            r6 = -1
            goto L54
        L4c:
            int[] r7 = p925oe.AbstractC18101a.f57741a
            int r6 = r6.ordinal()
            r6 = r7[r6]
        L54:
            java.lang.String r7 = r11.f21379a
            if (r6 == r0) goto L86
            r2 = 2
            if (r6 == r2) goto L5c
            goto L38
        L5c:
            yn.a r2 = p1135yn.C21555b.f68260Z
            gd.y r2 = gd.C14009y.f44091d
            java.lang.Object r2 = r4.m15477a(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            yn.d r6 = p1135yn.EnumC21557d.MINUTES
            long r8 = p523V9.AbstractC8128k6.m8644j(r2, r6)
            boolean r11 = r11.m7166e(r8)
            if (r11 == 0) goto L38
            r5.getClass()
            oe.f r11 = new oe.f
            r2 = 0
            r11.<init>(r7, r5, r2, r0)
            ni.a r6 = r5.f57818a
            r7 = 3
            p025An.AbstractC0575H.m1156D(r6, r2, r2, r11, r7)
            goto L38
        L86:
            oe.g0 r6 = r5.f57821d
            r10.f57748q0 = r5
            r10.f57744Y = r4
            r10.f57745Z = r3
            r10.f57746o0 = r11
            r10.f57747p0 = r0
            oe.e r8 = new oe.e
            r8.<init>(r7, r0, r0)
            oe.k0 r6 = r6.f57783a
            java.lang.Object r6 = r6.m21029b(r8, r10)
            rm.a r7 = p996rm.EnumC19250a.f61036Y
            if (r6 != r7) goto La2
            r2 = r6
        La2:
            if (r2 != r1) goto La5
            return r1
        La5:
            r2 = r11
        La6:
            java.lang.String r11 = r2.f21379a
            p523V9.AbstractC8033Y5.m8385c(r5, r11)
            goto L38
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p925oe.C18103b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
