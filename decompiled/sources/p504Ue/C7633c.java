package p504Ue;

import java.io.ByteArrayOutputStream;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p792hl.AbstractC14527b;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ue.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7633c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public ByteArrayOutputStream f24134Y;

    /* JADX INFO: renamed from: Z */
    public byte[] f24135Z;

    /* JADX INFO: renamed from: o0 */
    public int f24136o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f24137p0;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7633c c7633c = new C7633c(2, interfaceC18770c);
        c7633c.f24137p0 = obj;
        return c7633c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7633c) create((AbstractC14527b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006b -> B:22:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r8.f24136o0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            byte[] r1 = r8.f24135Z
            java.io.ByteArrayOutputStream r4 = r8.f24134Y
            java.lang.Object r5 = r8.f24137p0
            io.ktor.utils.io.n r5 = (io.ktor.utils.p815io.InterfaceC15088n) r5
            p571X9.AbstractC9233X.m9807c(r9)
            goto L6e
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            p571X9.AbstractC9233X.m9807c(r9)
            goto L4c
        L25:
            p571X9.AbstractC9233X.m9807c(r9)
            java.lang.Object r9 = r8.f24137p0
            hl.b r9 = (p792hl.AbstractC14527b) r9
            Rk.c r9 = r9.mo7303b()
            kotlin.jvm.internal.D r1 = kotlin.jvm.internal.AbstractC16526C.f51263a
            java.lang.Class<io.ktor.utils.io.n> r5 = io.ktor.utils.p815io.InterfaceC15088n.class
            Im.d r1 = r1.mo5693b(r5)
            Im.y r5 = kotlin.jvm.internal.AbstractC16526C.m18075c(r5)     // Catch: java.lang.Throwable -> L3d
            goto L3e
        L3d:
            r5 = 0
        L3e:
            xl.a r6 = new xl.a
            r6.<init>(r1, r5)
            r8.f24136o0 = r4
            java.lang.Object r9 = r9.m7294a(r6, r8)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            if (r9 == 0) goto L7f
            io.ktor.utils.io.n r9 = (io.ktor.utils.p815io.InterfaceC15088n) r9
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r4 = 102400(0x19000, float:1.43493E-40)
            byte[] r4 = new byte[r4]
            r5 = r9
            r7 = r4
            r4 = r1
            r1 = r7
        L5e:
            r8.f24137p0 = r5
            r8.f24134Y = r4
            r8.f24135Z = r1
            r8.f24136o0 = r3
            int r9 = r1.length
            java.lang.Object r9 = io.ktor.utils.p815io.AbstractC15070F.m16181i(r5, r1, r2, r9, r8)
            if (r9 != r0) goto L6e
            return r0
        L6e:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 <= 0) goto L7a
            r4.write(r1, r2, r9)
            goto L5e
        L7a:
            byte[] r9 = r4.toByteArray()
            return r9
        L7f:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p504Ue.C7633c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
