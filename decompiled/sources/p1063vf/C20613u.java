package p1063vf;

import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p005A3.AbstractC0322i;
import p005A3.C0320g;
import p005A3.C0334u;
import p005A3.InterfaceC0315b;
import p005A3.InterfaceC0328o;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p1062vd.C20567q;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;

/* JADX INFO: renamed from: vf.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C20613u implements InterfaceC0315b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0571F f65417a;

    /* JADX INFO: renamed from: b */
    public final C0334u f65418b;

    /* JADX INFO: renamed from: c */
    public final C20567q f65419c;

    /* JADX INFO: renamed from: d */
    public final C3430e f65420d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f65421e;

    public C20613u(InterfaceC0571F interfaceC0571F, C0334u cache, C20567q c20567q) {
        AbstractC16544l.m18094g(cache, "cache");
        this.f65417a = interfaceC0571F;
        this.f65418b = cache;
        this.f65419c = c20567q;
        this.f65420d = AbstractC8168p6.m8749b("WrappedCacheWithCompletionCallback", null);
        this.f65421e = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0082 -> B:22:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public static final java.lang.Object m21196j(p1063vf.C20613u r10, java.lang.String r11, long r12, sm.AbstractC19687c r14) {
        /*
            r10.getClass()
            boolean r0 = r14 instanceof p1063vf.C20612t
            if (r0 == 0) goto L16
            r0 = r14
            vf.t r0 = (p1063vf.C20612t) r0
            int r1 = r0.f65416t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f65416t0 = r1
            goto L1b
        L16:
            vf.t r0 = new vf.t
            r0.<init>(r10, r14)
        L1b:
            java.lang.Object r10 = r0.f65414r0
            rm.a r14 = p996rm.EnumC19250a.f61036Y
            int r1 = r0.f65416t0
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 != r2) goto L38
            int r11 = r0.f65413q0
            int r12 = r0.f65412p0
            long r3 = r0.f65411o0
            kotlin.jvm.internal.A r13 = r0.f65410Z
            java.lang.String r1 = r0.f65409Y
            p571X9.AbstractC9233X.m9807c(r10)
            r10 = r1
            r8 = r3
            r3 = r0
            r0 = r8
            goto L85
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            p571X9.AbstractC9233X.m9807c(r10)
            kotlin.jvm.internal.A r10 = new kotlin.jvm.internal.A
            r10.<init>()
            yn.a r1 = p1135yn.C21555b.f68260Z
            r1 = 50
            yn.d r3 = p1135yn.EnumC21557d.MILLISECONDS
            long r3 = p523V9.AbstractC8128k6.m8644j(r1, r3)
            r10.f51261Y = r3
            r1 = 20
            r3 = 0
            r8 = r12
            r13 = r10
            r10 = r11
            r12 = r1
            r11 = r3
            r3 = r0
            r0 = r8
        L5e:
            if (r11 >= r12) goto Lac
            java.io.File r4 = new java.io.File
            r4.<init>(r10)
            long r4 = r4.length()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L70
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            goto Lae
        L70:
            long r4 = r13.f51261Y
            r3.f65409Y = r10
            r3.f65410Z = r13
            r3.f65411o0 = r0
            r3.f65412p0 = r12
            r3.f65413q0 = r11
            r3.f65416t0 = r2
            java.lang.Object r4 = p025An.AbstractC0575H.m1185n(r4, r3)
            if (r4 != r14) goto L85
            goto Lae
        L85:
            long r4 = r13.f51261Y
            r6 = 2
            long r4 = p1135yn.C21555b.m21840j(r6, r4)
            yn.b r6 = new yn.b
            r6.<init>(r4)
            r4 = 200(0xc8, float:2.8E-43)
            yn.d r5 = p1135yn.EnumC21557d.MILLISECONDS
            long r4 = p523V9.AbstractC8128k6.m8644j(r4, r5)
            yn.b r7 = new yn.b
            r7.<init>(r4)
            int r4 = r6.compareTo(r7)
            if (r4 > 0) goto La5
            goto La6
        La5:
            r6 = r7
        La6:
            long r4 = r6.f68263Y
            r13.f51261Y = r4
            int r11 = r11 + r2
            goto L5e
        Lac:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
        Lae:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p1063vf.C20613u.m21196j(vf.u, java.lang.String, long, sm.c):java.lang.Object");
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: a */
    public final long mo915a() {
        return this.f65418b.mo915a();
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: b */
    public final void mo916b(String key, C0320g c0320g) {
        AbstractC16544l.m18094g(key, "key");
        C0334u c0334u = this.f65418b;
        c0334u.mo916b(key, c0320g);
        String str = (String) this.f65421e.get(key);
        if (str == null) {
            return;
        }
        long jM523l = AbstractC0168G.m523l(c0334u.mo919e(key));
        if (jM523l != -1) {
            AbstractC0575H.m1156D(this.f65417a, null, null, new C20611s(this, str, jM523l, key, null), 3);
        }
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: c */
    public final AbstractC0322i mo917c(long j10, long j11, String key) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC0322i abstractC0322iMo917c = this.f65418b.mo917c(j10, j11, key);
        if (abstractC0322iMo917c == null) {
            return null;
        }
        File file = abstractC0322iMo917c.f1125q0;
        if (file == null) {
            return abstractC0322iMo917c;
        }
        LinkedHashMap linkedHashMap = this.f65421e;
        String absolutePath = file.getAbsolutePath();
        AbstractC16544l.m18093f(absolutePath, "getAbsolutePath(...)");
        linkedHashMap.put(key, absolutePath);
        if (AbstractC0168G.m523l(this.f65418b.mo919e(key)) == -1) {
            return abstractC0322iMo917c;
        }
        String absolutePath2 = file.getAbsolutePath();
        AbstractC16544l.m18093f(absolutePath2, "getAbsolutePath(...)");
        this.f65419c.invoke(key, absolutePath2);
        return abstractC0322iMo917c;
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: d */
    public final void mo918d(AbstractC0322i p10) {
        AbstractC16544l.m18094g(p10, "p0");
        this.f65418b.mo918d(p10);
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: e */
    public final InterfaceC0328o mo919e(String p10) {
        AbstractC16544l.m18094g(p10, "p0");
        return this.f65418b.mo919e(p10);
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: f */
    public final File mo920f(long j10, long j11, String key) {
        AbstractC16544l.m18094g(key, "key");
        File fileMo920f = this.f65418b.mo920f(j10, j11, key);
        LinkedHashMap linkedHashMap = this.f65421e;
        String absolutePath = fileMo920f.getAbsolutePath();
        AbstractC16544l.m18093f(absolutePath, "getAbsolutePath(...)");
        linkedHashMap.put(key, absolutePath);
        return fileMo920f;
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: g */
    public final void mo921g(File p10, long j10) {
        AbstractC16544l.m18094g(p10, "p0");
        this.f65418b.mo921g(p10, j10);
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: h */
    public final void mo922h(String str) {
        this.f65418b.mo922h(str);
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: i */
    public final AbstractC0322i mo923i(long j10, long j11, String p10) {
        AbstractC16544l.m18094g(p10, "p0");
        return this.f65418b.mo923i(j10, j11, p10);
    }
}
