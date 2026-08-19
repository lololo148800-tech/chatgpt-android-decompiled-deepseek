package p454Se;

import android.app.Application;
import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import ni.C17628b;
import p025An.C0644w;
import p1061vb.C20513d;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21945N1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p437Rn.C6959q;
import p480Te.C7392q;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9227W;
import p948pi.C18418a;

/* JADX INFO: renamed from: Se.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C7112f implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final Application f22641Y;

    /* JADX INFO: renamed from: Z */
    public final C7392q f22642Z;

    /* JADX INFO: renamed from: o0 */
    public final C7115i f22643o0;

    /* JADX INFO: renamed from: q0 */
    public final C17314q f22645q0;

    /* JADX INFO: renamed from: p0 */
    public final C3430e f22644p0 = AbstractC8168p6.m8749b(zakks.FFrxil, null);

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f22646r0 = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00aa -> B:29:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m7518a(p454Se.C7112f r10, java.lang.String r11, sm.AbstractC19687c r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof p454Se.C7108b
            if (r0 == 0) goto L16
            r0 = r12
            Se.b r0 = (p454Se.C7108b) r0
            int r1 = r0.f22617u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f22617u0 = r1
            goto L1b
        L16:
            Se.b r0 = new Se.b
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f22615s0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f22617u0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            int r10 = r0.f22614r0
            int r11 = r0.f22613q0
            kotlin.jvm.internal.B r2 = r0.f22611o0
            java.lang.String r5 = r0.f22610Z
            Se.f r6 = r0.f22609Y
            p571X9.AbstractC9233X.m9807c(r12)
            r12 = r2
            r2 = r11
            r11 = r5
            goto Lae
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L43:
            int r10 = r0.f22614r0
            int r11 = r0.f22613q0
            kotlin.jvm.internal.B r2 = r0.f22612p0
            kotlin.jvm.internal.B r5 = r0.f22611o0
            java.lang.String r6 = r0.f22610Z
            Se.f r7 = r0.f22609Y
            p571X9.AbstractC9233X.m9807c(r12)
            goto L82
        L53:
            p571X9.AbstractC9233X.m9807c(r12)
            kotlin.jvm.internal.B r12 = new kotlin.jvm.internal.B
            r12.<init>()
            Oh.v r2 = p364Oh.C6248v.f20327a
            r12.f51262Y = r2
            r2 = 15
            r5 = 0
        L62:
            if (r5 >= r2) goto Lb2
            Te.q r6 = r10.f22642Z
            r0.f22609Y = r10
            r0.f22610Z = r11
            r0.f22611o0 = r12
            r0.f22612p0 = r12
            r0.f22613q0 = r2
            r0.f22614r0 = r5
            r0.f22617u0 = r4
            java.lang.Object r6 = r6.m7792b(r11, r0)
            if (r6 != r1) goto L7b
            goto Lb4
        L7b:
            r7 = r10
            r10 = r5
            r5 = r12
            r12 = r6
            r6 = r11
            r11 = r2
            r2 = r5
        L82:
            r2.f51262Y = r12
            java.lang.Object r12 = r5.f51262Y
            boolean r2 = r12 instanceof p364Oh.AbstractC6249w
            if (r2 != 0) goto L8c
            r1 = r12
            goto Lb4
        L8c:
            yn.a r12 = p1135yn.C21555b.f68260Z
            yn.d r12 = p1135yn.EnumC21557d.SECONDS
            long r8 = p523V9.AbstractC8128k6.m8644j(r4, r12)
            r0.f22609Y = r7
            r0.f22610Z = r6
            r0.f22611o0 = r5
            r12 = 0
            r0.f22612p0 = r12
            r0.f22613q0 = r11
            r0.f22614r0 = r10
            r0.f22617u0 = r3
            java.lang.Object r12 = p025An.AbstractC0575H.m1185n(r8, r0)
            if (r12 != r1) goto Laa
            goto Lb4
        Laa:
            r2 = r11
            r12 = r5
            r11 = r6
            r6 = r7
        Lae:
            int r5 = r10 + 1
            r10 = r6
            goto L62
        Lb2:
            java.lang.Object r1 = r12.f51262Y
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p454Se.C7112f.m7518a(Se.f, java.lang.String, sm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x011a -> B:61:0x011e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public static final java.lang.Object m7519e(p454Se.C7112f r12, java.lang.String r13, sm.AbstractC19687c r14) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p454Se.C7112f.m7519e(Se.f, java.lang.String, sm.c):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f22646r0.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC21955Q1 m7520k() {
        try {
            File fileCreateTempFile = File.createTempFile(UUID.randomUUID().toString(), "", (File) this.f22645q0.getValue());
            ArrayList arrayList = this.f22646r0;
            AbstractC16544l.m18091d(fileCreateTempFile);
            arrayList.add(fileCreateTempFile);
            return new C21952P1(fileCreateTempFile);
        } catch (IOException e10) {
            AbstractC8160o6.m8728c(this.f22644p0, "Unable to create temporary file", e10, null, 4);
            return new C21945N1(e10);
        }
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC21955Q1 m7521m() {
        AbstractC21955Q1 abstractC21955Q1M7520k = m7520k();
        if (abstractC21955Q1M7520k instanceof C21952P1) {
            return new C21952P1(Uri.fromFile((File) ((C21952P1) abstractC21955Q1M7520k).f69511a));
        }
        if ((abstractC21955Q1M7520k instanceof C21929J1) || (abstractC21955Q1M7520k instanceof AbstractC21933K1)) {
            return abstractC21955Q1M7520k;
        }
        throw new C0644w();
    }

    public C7112f(Application application, C7392q c7392q, C7115i c7115i, C18418a c18418a, C17628b c17628b, C20513d c20513d) {
        this.f22641Y = application;
        this.f22642Z = c7392q;
        this.f22643o0 = c7115i;
        this.f22645q0 = AbstractC9227W.m9800c(new C6959q(c18418a, this, c17628b, 2));
    }
}
