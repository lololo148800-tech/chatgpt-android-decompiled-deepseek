package p544W9;

import io.ktor.utils.p815io.InterfaceC15088n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import ml.AbstractC17288f;
import p283L5.C4953s;
import p283L5.C4954t;
import p283L5.C4955u;
import p354O5.C6135e;
import p354O5.C6136f;
import p354O5.C6137g;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p792hl.AbstractC14527b;
import p857kl.AbstractC16449P;
import p857kl.C16438E;
import p857kl.InterfaceC16476x;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.C4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8460C4 {
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[LOOP:1: B:22:0x005d->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x005f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m9081a(p1014t1.C19748y r8, sm.AbstractC19685a r9) {
        /*
            boolean r0 = r9 instanceof p878lo.C17108q
            if (r0 == 0) goto L13
            r0 = r9
            lo.q r0 = (p878lo.C17108q) r0
            int r1 = r0.f54672o0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54672o0 = r1
            goto L18
        L13:
            lo.q r0 = new lo.q
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f54671Z
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f54672o0
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            t1.y r8 = r0.f54670Y
            p571X9.AbstractC9233X.m9807c(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            p571X9.AbstractC9233X.m9807c(r9)
        L34:
            r0.f54670Y = r8
            r0.f54672o0 = r3
            java.lang.Object r9 = p911o0.AbstractC17792x.m19522e(r8, r0)
            if (r9 != r1) goto L3f
            goto L6f
        L3f:
            t1.f r9 = (p1014t1.C19729f) r9
            java.lang.Object r2 = r9.f62460a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L49:
            if (r6 >= r4) goto L57
            java.lang.Object r7 = r2.get(r6)
            t1.o r7 = (p1014t1.C19738o) r7
            r7.m20691a()
            int r6 = r6 + 1
            goto L49
        L57:
            java.lang.Object r9 = r9.f62460a
            int r2 = r9.size()
        L5d:
            if (r5 >= r2) goto L6d
            java.lang.Object r4 = r9.get(r5)
            t1.o r4 = (p1014t1.C19738o) r4
            boolean r4 = r4.f62481d
            if (r4 == 0) goto L6a
            goto L34
        L6a:
            int r5 = r5 + 1
            goto L5d
        L6d:
            mm.C r1 = mm.C17296C.f55119a
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p544W9.AbstractC8460C4.m9081a(t1.y, sm.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final C13693c m9082b(C4954t c4954t, AbstractC19687c abstractC19687c) {
        C6136f c6136f;
        if (abstractC19687c instanceof C6136f) {
            c6136f = (C6136f) abstractC19687c;
            int i10 = c6136f.f19997Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6136f.f19997Z = i10 - Integer.MIN_VALUE;
            } else {
                c6136f = new C6136f(abstractC19687c);
            }
        } else {
            c6136f = new C6136f(abstractC19687c);
        }
        Object obj = c6136f.f19996Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6136f.f19997Z;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                return null;
            }
            if (bArr instanceof AbstractC17288f) {
                throw null;
            }
            throw null;
        }
        AbstractC9233X.m9807c(obj);
        C13693c c13693c = new C13693c();
        AbstractC16449P.m18026b(c13693c.f43195a, c4954t.f16158a);
        C16438E c16438e = C16438E.f50984b;
        String method = c4954t.f16159b;
        AbstractC16544l.m18094g(method, "method");
        C16438E c16438e2 = C16438E.f50984b;
        if (!method.equals(c16438e2.f50992a)) {
            c16438e2 = C16438E.f50985c;
            if (!method.equals(c16438e2.f50992a)) {
                c16438e2 = C16438E.f50986d;
                if (!method.equals(c16438e2.f50992a)) {
                    c16438e2 = C16438E.f50987e;
                    if (!method.equals(c16438e2.f50992a)) {
                        c16438e2 = C16438E.f50988f;
                        if (!method.equals(c16438e2.f50992a)) {
                            c16438e2 = C16438E.f50989g;
                            if (!method.equals(c16438e2.f50992a)) {
                                c16438e2 = C16438E.f50990h;
                                if (!method.equals(c16438e2.f50992a)) {
                                    c16438e2 = new C16438E(method);
                                }
                            }
                        }
                    }
                }
            }
        }
        c13693c.f43196b = c16438e2;
        for (Map.Entry entry : c4954t.f16160c.f16157a.entrySet()) {
            c13693c.f43197c.mo4533m((String) entry.getKey(), (List) entry.getValue());
        }
        return c13693c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public static final Object m9083c(AbstractC14527b abstractC14527b, AbstractC19687c abstractC19687c) {
        C6137g c6137g;
        AbstractC14527b abstractC14527b2;
        int i10;
        C4953s c4953s;
        long j10;
        long j11;
        if (abstractC19687c instanceof C6137g) {
            c6137g = (C6137g) abstractC19687c;
            int i11 = c6137g.f20004s0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6137g.f20004s0 = i11 - Integer.MIN_VALUE;
            } else {
                c6137g = new C6137g(abstractC19687c);
            }
        } else {
            c6137g = new C6137g(abstractC19687c);
        }
        Object obj = c6137g.f20003r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c6137g.f20004s0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            int i13 = abstractC14527b.mo7307f().f51013Y;
            long j12 = abstractC14527b.mo7305d().f64480u0;
            long j13 = abstractC14527b.mo7306e().f64480u0;
            InterfaceC16476x interfaceC16476xMo7301a = abstractC14527b.mo7301a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : interfaceC16476xMo7301a.mo7977a()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                String lowerCase = str.toLowerCase(Locale.ROOT);
                AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                linkedHashMap.put(lowerCase, AbstractC17680n.m19323D0(list));
            }
            C4953s c4953s2 = new C4953s(AbstractC17659D.m19254p(linkedHashMap));
            c6137g.f19998Y = abstractC14527b;
            c6137g.f19999Z = c4953s2;
            c6137g.f20000o0 = i13;
            c6137g.f20001p0 = j12;
            c6137g.f20002q0 = j13;
            c6137g.f20004s0 = 1;
            Object objM9226a = AbstractC8565U2.m9226a(abstractC14527b, c6137g);
            if (objM9226a == enumC19250a) {
                return enumC19250a;
            }
            abstractC14527b2 = abstractC14527b;
            i10 = i13;
            obj = objM9226a;
            c4953s = c4953s2;
            j10 = j12;
            j11 = j13;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j14 = c6137g.f20002q0;
            long j15 = c6137g.f20001p0;
            int i14 = c6137g.f20000o0;
            C4953s c4953s3 = c6137g.f19999Z;
            AbstractC14527b abstractC14527b3 = c6137g.f19998Y;
            AbstractC9233X.m9807c(obj);
            i10 = i14;
            abstractC14527b2 = abstractC14527b3;
            j11 = j14;
            j10 = j15;
            c4953s = c4953s3;
        }
        return new C4955u(i10, j10, j11, c4953s, new C6135e((InterfaceC15088n) obj), abstractC14527b2);
    }
}
