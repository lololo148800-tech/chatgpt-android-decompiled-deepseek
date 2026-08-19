package p670c1;

import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.p650ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.AbstractC0232b0;
import p003A1.AbstractC0240d0;
import p003A1.C0283r;
import p003A1.C0294u1;
import p049Bm.InterfaceC1436k;
import p056C2.AbstractC1510d;
import p077Cn.C1743k;
import p081D1.AbstractC1845b;
import p081D1.AbstractC1846c;
import p081D1.AbstractC1847d;
import p081D1.AbstractC1852i;
import p081D1.C1844a;
import p081D1.C1848e;
import p081D1.C1853j;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.C21658D;
import p156G1.AbstractC2962i;
import p156G1.C2954a;
import p156G1.C2960g;
import p156G1.C2963j;
import p156G1.C2968o;
import p156G1.C2971r;
import p156G1.C2974u;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3590f;
import p329N3.RunnableC5611a;
import p492U1.C7548m;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8017W3;
import p523V9.AbstractC8062c4;
import p523V9.AbstractC8111i5;
import p594Y9.AbstractC9918k3;
import p692d0.AbstractC12972k;
import p692d0.C12967f;
import p692d0.C12982u;
import p692d0.C12983v;
import p759g1.C13801c;
import p817j$.util.Objects;

/* JADX INFO: renamed from: c1.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC11560d implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: A0 */
    public C0294u1 f34938A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f34939B0;

    /* JADX INFO: renamed from: C0 */
    public final RunnableC5611a f34940C0;

    /* JADX INFO: renamed from: Y */
    public final AndroidComposeView f34941Y;

    /* JADX INFO: renamed from: Z */
    public final C0283r f34942Z;

    /* JADX INFO: renamed from: o0 */
    public C1848e f34943o0;

    /* JADX INFO: renamed from: p0 */
    public final C12982u f34944p0 = new C12982u();

    /* JADX INFO: renamed from: q0 */
    public final C12983v f34945q0 = new C12983v();

    /* JADX INFO: renamed from: r0 */
    public final long f34946r0 = 100;

    /* JADX INFO: renamed from: s0 */
    public int f34947s0 = 1;

    /* JADX INFO: renamed from: t0 */
    public boolean f34948t0 = true;

    /* JADX INFO: renamed from: u0 */
    public final C12967f f34949u0 = new C12967f(0);

    /* JADX INFO: renamed from: v0 */
    public final C1743k f34950v0 = AbstractC8017W3.m8337a(1, 6, null);

    /* JADX INFO: renamed from: w0 */
    public final Handler f34951w0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: x0 */
    public C12982u f34952x0;

    /* JADX INFO: renamed from: y0 */
    public long f34953y0;

    /* JADX INFO: renamed from: z0 */
    public final C12982u f34954z0;

    public ViewOnAttachStateChangeListenerC11560d(AndroidComposeView androidComposeView, C0283r c0283r) {
        this.f34941Y = androidComposeView;
        this.f34942Z = c0283r;
        C12982u c12982u = AbstractC12972k.f41182a;
        AbstractC16544l.m18092e(c12982u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f34952x0 = c12982u;
        this.f34954z0 = new C12982u();
        C2968o c2968oM3805a = androidComposeView.getSemanticsOwner().m3805a();
        AbstractC16544l.m18092e(c12982u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f34938A0 = new C0294u1(c2968oM3805a, c12982u);
        this.f34940C0 = new RunnableC5611a(this, 23);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:13:0x002a, B:25:0x004e, B:28:0x005b, B:30:0x0063, B:32:0x006c, B:33:0x006f, B:35:0x0073, B:36:0x007c, B:20:0x003c), top: B:48:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006c A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:13:0x002a, B:25:0x004e, B:28:0x005b, B:30:0x0063, B:32:0x006c, B:33:0x006f, B:35:0x0073, B:36:0x007c, B:20:0x003c), top: B:48:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:13:0x002a, B:25:0x004e, B:28:0x005b, B:30:0x0063, B:32:0x006c, B:33:0x006f, B:35:0x0073, B:36:0x007c, B:20:0x003c), top: B:48:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x008d -> B:25:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m12955a(sm.AbstractC19687c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p670c1.C11559c
            if (r0 == 0) goto L13
            r0 = r9
            c1.c r0 = (p670c1.C11559c) r0
            int r1 = r0.f34937q0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34937q0 = r1
            goto L18
        L13:
            c1.c r0 = new c1.c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f34935o0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f34937q0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            Cn.d r2 = r0.f34934Z
            c1.d r5 = r0.f34933Y
            p571X9.AbstractC9233X.m9807c(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4e
        L2e:
            r9 = move-exception
            goto L9c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            Cn.d r2 = r0.f34934Z
            c1.d r5 = r0.f34933Y
            p571X9.AbstractC9233X.m9807c(r9)     // Catch: java.lang.Throwable -> L2e
            goto L5b
        L40:
            p571X9.AbstractC9233X.m9807c(r9)
            Cn.k r9 = r8.f34950v0     // Catch: java.lang.Throwable -> L9a
            r9.getClass()     // Catch: java.lang.Throwable -> L9a
            Cn.d r2 = new Cn.d     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            r5 = r8
        L4e:
            r0.f34933Y = r5     // Catch: java.lang.Throwable -> L2e
            r0.f34934Z = r2     // Catch: java.lang.Throwable -> L2e
            r0.f34937q0 = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r2.m2525b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L90
            r2.m2526c()     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r5.m12957c()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L6f
            r5.m12958d()     // Catch: java.lang.Throwable -> L2e
        L6f:
            boolean r9 = r5.f34939B0     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L7c
            r5.f34939B0 = r4     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r9 = r5.f34951w0     // Catch: java.lang.Throwable -> L2e
            N3.a r6 = r5.f34940C0     // Catch: java.lang.Throwable -> L2e
            r9.post(r6)     // Catch: java.lang.Throwable -> L2e
        L7c:
            d0.f r9 = r5.f34949u0     // Catch: java.lang.Throwable -> L2e
            r9.clear()     // Catch: java.lang.Throwable -> L2e
            long r6 = r5.f34946r0     // Catch: java.lang.Throwable -> L2e
            r0.f34933Y = r5     // Catch: java.lang.Throwable -> L2e
            r0.f34934Z = r2     // Catch: java.lang.Throwable -> L2e
            r0.f34937q0 = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = p025An.AbstractC0575H.m1184m(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4e
            return r1
        L90:
            d0.f r9 = r5.f34949u0
            r9.clear()
            mm.C r9 = mm.C17296C.f55119a
            return r9
        L98:
            r5 = r8
            goto L9c
        L9a:
            r9 = move-exception
            goto L98
        L9c:
            d0.f r0 = r5.f34949u0
            r0.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p670c1.ViewOnAttachStateChangeListenerC11560d.m12955a(sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public final C12982u m12956b() {
        if (this.f34948t0) {
            this.f34948t0 = false;
            this.f34952x0 = AbstractC0240d0.m795f(this.f34941Y.getSemanticsOwner());
            this.f34953y0 = System.currentTimeMillis();
        }
        return this.f34952x0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12957c() {
        return this.f34943o0 != null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[LOOP:0: B:13:0x0031->B:24:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0072 A[EDGE_INSN: B:74:0x0072->B:25:0x0072 BREAK  A[LOOP:0: B:13:0x0031->B:24:0x006d], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m12958d() {
        C1848e c1848e = this.f34943o0;
        if (c1848e != null && Build.VERSION.SDK_INT >= 29) {
            C12982u c12982u = this.f34944p0;
            int i10 = c12982u.f41208e;
            Object obj = c1848e.f5340a;
            char c9 = 7;
            View view = c1848e.f5341b;
            if (i10 != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = c12982u.f41206c;
                long[] jArr = c12982u.f41204a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        Object[] objArr2 = objArr;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j10 & 255) < 128) {
                                    arrayList.add((C1853j) objArr2[(i11 << 3) + i13]);
                                }
                                j10 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                            if (i11 != length) {
                                break;
                            }
                            i11++;
                            objArr = objArr2;
                        } else if (i11 != length) {
                            break;
                            break;
                        } else {
                            i11++;
                            objArr = objArr2;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList2.add(((C1853j) arrayList.get(i14)).f5342a);
                }
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 34) {
                    AbstractC1847d.m2701a(AbstractC1510d.m2192i(obj), arrayList2);
                } else if (i15 >= 29) {
                    ViewStructure viewStructureM2696b = AbstractC1846c.m2696b(AbstractC1510d.m2192i(obj), view);
                    AbstractC1845b.m2694a(viewStructureM2696b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    AbstractC1846c.m2698d(AbstractC1510d.m2192i(obj), viewStructureM2696b);
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        AbstractC1846c.m2698d(AbstractC1510d.m2192i(obj), (ViewStructure) arrayList2.get(i16));
                    }
                    ViewStructure viewStructureM2696b2 = AbstractC1846c.m2696b(AbstractC1510d.m2192i(obj), view);
                    AbstractC1845b.m2694a(viewStructureM2696b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                    AbstractC1846c.m2698d(AbstractC1510d.m2192i(obj), viewStructureM2696b2);
                }
                c12982u.m14689a();
            }
            C12983v c12983v = this.f34945q0;
            if (c12983v.f41213d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = c12983v.f41211b;
                long[] jArr2 = c12983v.f41210a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j11 = jArr2[i17];
                        if ((((~j11) << c9) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j11 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i17 << 3) + i19]));
                                }
                                j11 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            }
                        }
                        if (i17 == length2) {
                            break;
                        }
                        i17++;
                        c9 = 7;
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i20 = 0; i20 < size2; i20++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i20)).intValue()));
                }
                long[] jArr3 = new long[arrayList4.size()];
                Iterator it = arrayList4.iterator();
                int i21 = 0;
                while (it.hasNext()) {
                    jArr3[i21] = ((Number) it.next()).longValue();
                    i21++;
                }
                int i22 = Build.VERSION.SDK_INT;
                if (i22 >= 34) {
                    ContentCaptureSession contentCaptureSessionM2192i = AbstractC1510d.m2192i(obj);
                    C1844a c1844aM8456b = AbstractC8062c4.m8456b(view);
                    Objects.requireNonNull(c1844aM8456b);
                    AbstractC1846c.m2700f(contentCaptureSessionM2192i, AbstractC0232b0.m756n(c1844aM8456b.f5339Y), jArr3);
                } else if (i22 >= 29) {
                    ViewStructure viewStructureM2696b3 = AbstractC1846c.m2696b(AbstractC1510d.m2192i(obj), view);
                    AbstractC1845b.m2694a(viewStructureM2696b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    AbstractC1846c.m2698d(AbstractC1510d.m2192i(obj), viewStructureM2696b3);
                    ContentCaptureSession contentCaptureSessionM2192i2 = AbstractC1510d.m2192i(obj);
                    C1844a c1844aM8456b2 = AbstractC8062c4.m8456b(view);
                    Objects.requireNonNull(c1844aM8456b2);
                    AbstractC1846c.m2700f(contentCaptureSessionM2192i2, AbstractC0232b0.m756n(c1844aM8456b2.f5339Y), jArr3);
                    ViewStructure viewStructureM2696b4 = AbstractC1846c.m2696b(AbstractC1510d.m2192i(obj), view);
                    AbstractC1845b.m2694a(viewStructureM2696b4).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                    AbstractC1846c.m2698d(AbstractC1510d.m2192i(obj), viewStructureM2696b4);
                }
                c12983v.m14699b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[LOOP:1: B:14:0x0044->B:29:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0094 A[EDGE_INSN: B:48:0x0094->B:30:0x0094 BREAK  A[LOOP:1: B:14:0x0044->B:29:0x0091], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m12959f(C2968o c2968o, C0294u1 c0294u1) {
        List listM3790h = C2968o.m3790h(c2968o, true, 4);
        int size = listM3790h.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2968o c2968o2 = (C2968o) listM3790h.get(i10);
            if (m12956b().m14690b(c2968o2.f8892g) && !c0294u1.f1065b.m14700c(c2968o2.f8892g)) {
                m12962i(c2968o2);
            }
        }
        C12982u c12982u = this.f34954z0;
        int[] iArr = c12982u.f41205b;
        long[] jArr = c12982u.f41204a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = iArr[(i11 << 3) + i13];
                            if (!m12956b().m14690b(i14)) {
                                C12982u c12982u2 = this.f34944p0;
                                if (c12982u2.m14691c(i14)) {
                                    c12982u2.m14696h(i14);
                                } else {
                                    this.f34945q0.m14698a(i14);
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        List listM3790h2 = C2968o.m3790h(c2968o, true, 4);
        int size2 = listM3790h2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            C2968o c2968o3 = (C2968o) listM3790h2.get(i15);
            if (m12956b().m14690b(c2968o3.f8892g)) {
                int i16 = c2968o3.f8892g;
                if (c12982u.m14690b(i16)) {
                    Object objM14694f = c12982u.m14694f(i16);
                    if (objM14694f == null) {
                        AbstractC8111i5.m8593d("node not present in pruned tree before this change");
                        throw null;
                    }
                    m12959f(c2968o3, (C0294u1) objM14694f);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12960g(int i10, String str) {
        C1848e c1848e;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && (c1848e = this.f34943o0) != null) {
            AutofillId autofillIdM2702a = c1848e.m2702a(i10);
            if (autofillIdM2702a == null) {
                AbstractC8111i5.m8593d("Invalid content capture ID");
                throw null;
            }
            if (i11 >= 29) {
                AbstractC1846c.m2699e(AbstractC1510d.m2192i(c1848e.f5340a), autofillIdM2702a, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5 A[LOOP:1: B:18:0x0058->B:36:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0 A[EDGE_INSN: B:53:0x00a0->B:34:0x00a0 BREAK  A[LOOP:1: B:18:0x0058->B:36:0x00a5], SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final void m12961h(C2968o c2968o, C0294u1 c0294u1) {
        C12983v c12983v = new C12983v();
        List listM3790h = C2968o.m3790h(c2968o, true, 4);
        int size = listM3790h.size();
        int i10 = 0;
        while (true) {
            C1743k c1743k = this.f34950v0;
            C17296C c17296c = C17296C.f55119a;
            C12967f c12967f = this.f34949u0;
            C21658D c21658d = c2968o.f8888c;
            if (i10 >= size) {
                C12983v c12983v2 = c0294u1.f1065b;
                int[] iArr = c12983v2.f41211b;
                long[] jArr = c12983v2.f41210a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j10 & 255) < 128) {
                                    if (!c12983v.m14700c(iArr[(i11 << 3) + i14])) {
                                        if (c12967f.add(c21658d)) {
                                            c1743k.mo2524p(c17296c);
                                            return;
                                        }
                                        return;
                                    }
                                    i12 = 8;
                                }
                                j10 >>= i12;
                            }
                            if (i13 != i12) {
                                break;
                            } else if (i11 != length) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                List listM3790h2 = C2968o.m3790h(c2968o, true, 4);
                int size2 = listM3790h2.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    C2968o c2968o2 = (C2968o) listM3790h2.get(i15);
                    if (m12956b().m14690b(c2968o2.f8892g)) {
                        Object objM14694f = this.f34954z0.m14694f(c2968o2.f8892g);
                        if (objM14694f == null) {
                            AbstractC8111i5.m8593d("node not present in pruned tree before this change");
                            throw null;
                        }
                        m12961h(c2968o2, (C0294u1) objM14694f);
                    }
                }
                return;
            }
            C2968o c2968o3 = (C2968o) listM3790h.get(i10);
            if (m12956b().m14690b(c2968o3.f8892g)) {
                C12983v c12983v3 = c0294u1.f1065b;
                int i16 = c2968o3.f8892g;
                if (!c12983v3.m14700c(i16)) {
                    if (c12967f.add(c21658d)) {
                        c1743k.mo2524p(c17296c);
                        return;
                    }
                    return;
                }
                c12983v.m14698a(i16);
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public final void m12962i(C2968o c2968o) {
        InterfaceC1436k interfaceC1436k;
        int iNumberOfTrailingZeros;
        int i10;
        C1844a c1844aM8456b;
        AutofillId autofillIdM756n;
        AbstractC21678Y abstractC21678YM3793c;
        String strM807r;
        InterfaceC1436k interfaceC1436k2;
        if (m12957c()) {
            C2963j c2963j = c2968o.f8889d;
            C2974u c2974u = C2971r.f8937w;
            LinkedHashMap linkedHashMap = c2963j.f8880Y;
            Object obj = linkedHashMap.get(c2974u);
            Object obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            if (obj == null) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            int i11 = 1;
            if (this.f34947s0 == 1 && AbstractC16544l.m18089b(bool, Boolean.TRUE)) {
                Object obj3 = linkedHashMap.get(AbstractC2962i.f8864k);
                if (obj3 == null) {
                    obj3 = null;
                }
                C2954a c2954a = (C2954a) obj3;
                if (c2954a != null && (interfaceC1436k2 = (InterfaceC1436k) c2954a.f8838b) != null) {
                }
            } else if (this.f34947s0 == 2 && AbstractC16544l.m18089b(bool, Boolean.FALSE)) {
                Object obj4 = linkedHashMap.get(AbstractC2962i.f8864k);
                if (obj4 == null) {
                    obj4 = null;
                }
                C2954a c2954a2 = (C2954a) obj4;
                if (c2954a2 != null && (interfaceC1436k = (InterfaceC1436k) c2954a2.f8838b) != null) {
                }
            }
            C1848e c1848e = this.f34943o0;
            int i12 = c2968o.f8892g;
            if (c1848e != null && (i10 = Build.VERSION.SDK_INT) >= 29 && (c1844aM8456b = AbstractC8062c4.m8456b(this.f34941Y)) != null) {
                C2968o c2968oM3799j = c2968o.m3799j();
                if (c2968oM3799j != null) {
                    autofillIdM756n = c1848e.m2702a(c2968oM3799j.f8892g);
                    if (autofillIdM756n != null) {
                    }
                } else {
                    autofillIdM756n = AbstractC0232b0.m756n(c1844aM8456b.f5339Y);
                }
                C1853j c1853j = i10 >= 29 ? new C1853j(AbstractC1846c.m2697c(AbstractC1510d.m2192i(c1848e.f5340a), autofillIdM756n, i12)) : null;
                if (c1853j != null) {
                    C2974u c2974u2 = C2971r.f8910C;
                    C2963j c2963j2 = c2968o.f8889d;
                    LinkedHashMap linkedHashMap2 = c2963j2.f8880Y;
                    if (!linkedHashMap2.containsKey(c2974u2)) {
                        ViewStructure viewStructure = c1853j.f5342a;
                        Bundle bundleM2706a = AbstractC1852i.m2706a(viewStructure);
                        if (bundleM2706a != null) {
                            bundleM2706a.putLong("android.view.contentcapture.EventTimestamp", this.f34953y0);
                        }
                        Object obj5 = linkedHashMap2.get(C2971r.f8934t);
                        if (obj5 == null) {
                            obj5 = null;
                        }
                        String str = (String) obj5;
                        if (str != null) {
                            viewStructure.setId(i12, null, null, str);
                        }
                        Object obj6 = linkedHashMap2.get(C2971r.f8935u);
                        if (obj6 == null) {
                            obj6 = null;
                        }
                        List list = (List) obj6;
                        ViewStructure viewStructure2 = c1853j.f5342a;
                        if (list != null) {
                            AbstractC1852i.m2707b(viewStructure2, "android.widget.TextView");
                            AbstractC1852i.m2710e(viewStructure2, AbstractC9918k3.m10573a(list, Separators.RETURN, null, 62));
                        }
                        Object obj7 = linkedHashMap2.get(C2971r.f8938x);
                        if (obj7 == null) {
                            obj7 = null;
                        }
                        C3590f c3590f = (C3590f) obj7;
                        if (c3590f != null) {
                            AbstractC1852i.m2707b(viewStructure2, "android.widget.EditText");
                            AbstractC1852i.m2710e(viewStructure2, c3590f);
                        }
                        Object obj8 = linkedHashMap2.get(C2971r.f8915a);
                        if (obj8 == null) {
                            obj8 = null;
                        }
                        List list2 = (List) obj8;
                        if (list2 != null) {
                            AbstractC1852i.m2708c(viewStructure, AbstractC9918k3.m10573a(list2, Separators.RETURN, null, 62));
                        }
                        Object obj9 = linkedHashMap2.get(C2971r.f8933s);
                        if (obj9 == null) {
                            obj9 = null;
                        }
                        C2960g c2960g = (C2960g) obj9;
                        if (c2960g != null && (strM807r = AbstractC0240d0.m807r(c2960g.f8849a)) != null) {
                            AbstractC1852i.m2707b(viewStructure2, strM807r);
                        }
                        C3578I c3578iM797h = AbstractC0240d0.m797h(c2963j2);
                        if (c3578iM797h != null) {
                            C3577H c3577h = c3578iM797h.f10892a;
                            float fM7895c = C7548m.m7895c(c3577h.f10883b.f10910a.f10860b);
                            InterfaceC7537b interfaceC7537b = c3577h.f10888g;
                            AbstractC1852i.m2711f(viewStructure, interfaceC7537b.mo7863X() * interfaceC7537b.getDensity() * fM7895c, 0, 0, 0);
                        }
                        C2968o c2968oM3799j2 = c2968o.m3799j();
                        C13801c c13801cMo21528y = C13801c.f43585e;
                        if (c2968oM3799j2 != null && (abstractC21678YM3793c = c2968o.m3793c()) != null) {
                            AbstractC21678Y abstractC21678Y = abstractC21678YM3793c.mo22159J0().f30972y0 ? abstractC21678YM3793c : null;
                            if (abstractC21678Y != null) {
                                c13801cMo21528y = AbstractC21690f.m22215t(c2968oM3799j2.f8886a, 8).mo21528y(abstractC21678Y, true);
                            }
                        }
                        AbstractC1852i.m2709d(viewStructure, (int) c13801cMo21528y.f43586a, (int) c13801cMo21528y.f43587b, 0, 0, (int) c13801cMo21528y.m15321h(), (int) c13801cMo21528y.m15318e());
                        obj2 = c1853j;
                    }
                }
            }
            if (obj2 != null) {
                C12983v c12983v = this.f34945q0;
                if (c12983v.m14700c(i12)) {
                    int i13 = (-862048943) * i12;
                    int i14 = i13 ^ (i13 << 16);
                    int i15 = i14 & 127;
                    int i16 = c12983v.f41212c;
                    int i17 = (i14 >>> 7) & i16;
                    int i18 = 0;
                    loop0: while (true) {
                        long[] jArr = c12983v.f41210a;
                        int i19 = i17 >> 3;
                        int i20 = (i17 & 7) << 3;
                        long j10 = (((-i20) >> 63) & (jArr[i19 + i11] << (64 - i20))) | (jArr[i19] >>> i20);
                        long j11 = (((long) i15) * 72340172838076673L) ^ j10;
                        for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                            iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i17) & i16;
                            if (c12983v.f41211b[iNumberOfTrailingZeros] == i12) {
                                break loop0;
                            }
                        }
                        if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                            iNumberOfTrailingZeros = -1;
                            break;
                        } else {
                            i18 += 8;
                            i17 = (i17 + i18) & i16;
                            i11 = 1;
                        }
                    }
                    if (iNumberOfTrailingZeros >= 0) {
                        c12983v.m14703f(iNumberOfTrailingZeros);
                    }
                } else {
                    this.f34944p0.m14697i(i12, obj2);
                }
            }
            List listM3790h = C2968o.m3790h(c2968o, true, 4);
            int size = listM3790h.size();
            for (int i21 = 0; i21 < size; i21++) {
                m12962i((C2968o) listM3790h.get(i21));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12963j(C2968o c2968o) {
        if (m12957c()) {
            int i10 = c2968o.f8892g;
            C12982u c12982u = this.f34944p0;
            if (c12982u.m14691c(i10)) {
                c12982u.m14696h(i10);
            } else {
                this.f34945q0.m14698a(i10);
            }
            List listM3790h = C2968o.m3790h(c2968o, true, 4);
            int size = listM3790h.size();
            for (int i11 = 0; i11 < size; i11++) {
                m12963j((C2968o) listM3790h.get(i11));
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12154b(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC11112u interfaceC11112u) {
        this.f34943o0 = (C1848e) this.f34942Z.invoke();
        m12962i(this.f34941Y.getSemanticsOwner().m3805a());
        m12958d();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC11112u interfaceC11112u) {
        m12963j(this.f34941Y.getSemanticsOwner().m3805a());
        m12958d();
        this.f34943o0 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f34951w0.removeCallbacks(this.f34940C0);
        this.f34943o0 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
