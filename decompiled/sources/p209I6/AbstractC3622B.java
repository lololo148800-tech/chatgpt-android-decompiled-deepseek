package p209I6;

import android.javax.sip.C10808o;
import java.io.EOFException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p1006s6.C19451a;
import p1053v3.p1054lN.IGDwkYw;
import p1159zo.C22221g;
import p523V9.AbstractC7849B0;
import p917o6.C17852e;
import p959q8.C18639a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3622B {

    /* JADX INFO: renamed from: a */
    public final C3624b f11043a;

    /* JADX INFO: renamed from: b */
    public final C10808o f11044b;

    public AbstractC3622B(C3624b webSocketConnection, C10808o listener) {
        AbstractC16544l.m18094g(webSocketConnection, "webSocketConnection");
        AbstractC16544l.m18094g(listener, "listener");
        this.f11043a = webSocketConnection;
        this.f11044b = listener;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0047 -> B:25:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public static java.lang.Object m4329e(p209I6.AbstractC3622B r4, sm.AbstractC19687c r5) {
        /*
            boolean r0 = r5 instanceof p209I6.C3621A
            if (r0 == 0) goto L13
            r0 = r5
            I6.A r0 = (p209I6.C3621A) r0
            int r1 = r0.f11042q0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11042q0 = r1
            goto L18
        L13:
            I6.A r0 = new I6.A
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11040o0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f11042q0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            I6.B r4 = r0.f11039Z
            I6.B r2 = r0.f11038Y
            p571X9.AbstractC9233X.m9807c(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L48
        L2b:
            r4 = move-exception
            goto L54
        L2d:
            r4 = move-exception
            goto L6a
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            p571X9.AbstractC9233X.m9807c(r5)
        L3a:
            r0.f11038Y = r4     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L52
            r0.f11039Z = r4     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L52
            r0.f11042q0 = r3     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L52
            java.lang.Object r5 = r4.m4332c(r0)     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L52
            if (r5 != r1) goto L47
            return r1
        L47:
            r2 = r4
        L48:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r4.mo4331b(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r4 = r2
            goto L3a
        L4f:
            r2 = r4
            r4 = r5
            goto L54
        L52:
            r5 = move-exception
            goto L4f
        L54:
            android.javax.sip.o r5 = r2.f11044b
            r5.getClass()
            java.lang.Object r5 = r5.f32040Z
            I6.w r5 = (p209I6.C3645w) r5
            Cn.k r5 = r5.f11124g
            J6.g r0 = new J6.g
            r0.<init>(r4)
            r5.mo2524p(r0)
            mm.C r4 = mm.C17296C.f55119a
            return r4
        L6a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p209I6.AbstractC3622B.m4329e(I6.B, sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo4330a(AbstractC19687c abstractC19687c);

    /* JADX INFO: renamed from: b */
    public abstract void mo4331b(Map map);

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:20:0x0054, B:22:0x006d), top: B:28:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:19:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m4332c(sm.AbstractC19687c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p209I6.C3648z
            if (r0 == 0) goto L13
            r0 = r9
            I6.z r0 = (p209I6.C3648z) r0
            int r1 = r0.f11135q0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11135q0 = r1
            goto L18
        L13:
            I6.z r0 = new I6.z
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f11133o0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f11135q0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            I6.B r2 = r0.f11132Z
            I6.B r4 = r0.f11131Y
            p571X9.AbstractC9233X.m9807c(r9)
            goto L49
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            p571X9.AbstractC9233X.m9807c(r9)
            r2 = r8
        L37:
            I6.b r9 = r2.f11043a
            r0.f11131Y = r2
            r0.f11132Z = r2
            r0.f11135q0 = r3
            Cn.o r9 = r9.f11050a
            java.lang.Object r9 = r9.mo2514c(r0)
            if (r9 != r1) goto L48
            return r1
        L48:
            r4 = r2
        L49:
            java.lang.String r9 = (java.lang.String) r9
            r2.getClass()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.AbstractC16544l.m18094g(r9, r2)
            r2 = 0
            o6.b r5 = p917o6.AbstractC17850c.f56906d     // Catch: java.lang.Exception -> L70
            s6.b r6 = new s6.b     // Catch: java.lang.Exception -> L70
            Ao.i r7 = new Ao.i     // Catch: java.lang.Exception -> L70
            r7.<init>()     // Catch: java.lang.Exception -> L70
            r7.m1444l1(r9)     // Catch: java.lang.Exception -> L70
            r6.<init>(r7)     // Catch: java.lang.Exception -> L70
            o6.t r9 = p917o6.C17867t.f56960f     // Catch: java.lang.Exception -> L70
            java.lang.Object r9 = r5.mo373j(r6, r9)     // Catch: java.lang.Exception -> L70
            boolean r5 = r9 instanceof java.util.Map     // Catch: java.lang.Exception -> L70
            if (r5 == 0) goto L70
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L70
            r2 = r9
        L70:
            if (r2 == 0) goto L73
            return r2
        L73:
            r2 = r4
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: p209I6.AbstractC3622B.m4332c(sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public Object mo4333d(C3643u c3643u) {
        return m4329e(this, c3643u);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo4335g(C17852e c17852e);

    /* JADX INFO: renamed from: h */
    public abstract void mo4336h(C17852e c17852e);

    /* JADX INFO: renamed from: f */
    public final void m4334f(Map map, EnumC3646x frameType) throws EOFException {
        AbstractC16544l.m18094g(map, IGDwkYw.QuD);
        AbstractC16544l.m18094g(frameType, "frameType");
        int iOrdinal = frameType.ordinal();
        C3624b c3624b = this.f11043a;
        if (iOrdinal == 0) {
            C0675i c0675i = new C0675i();
            AbstractC7849B0.m8108c(new C19451a(c0675i, null), map);
            String strM1428Z0 = c0675i.m1428Z0();
            c3624b.getClass();
            C22221g c22221g = (C22221g) c3624b.f11051b;
            c22221g.getClass();
            C0678l c0678l = C0678l.f1971p0;
            if (c22221g.m22413i(1, C18639a.m19996n(strM1428Z0))) {
                return;
            }
            c3624b.f11050a.mo2522l(null);
            return;
        }
        if (iOrdinal != 1) {
            throw new C0644w();
        }
        C0675i c0675i2 = new C0675i();
        AbstractC7849B0.m8108c(new C19451a(c0675i2, null), map);
        C0678l data = c0675i2.m1417C0(c0675i2.f1970Z);
        c3624b.getClass();
        AbstractC16544l.m18094g(data, "data");
        C22221g c22221g2 = (C22221g) c3624b.f11051b;
        c22221g2.getClass();
        if (c22221g2.m22413i(2, data)) {
            return;
        }
        c3624b.f11050a.mo2522l(null);
    }
}
