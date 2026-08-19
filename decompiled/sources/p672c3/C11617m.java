package p672c3;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import io.sentry.android.core.AbstractC15256t;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0631p0;
import p077Cn.C1743k;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p523V9.AbstractC8017W3;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8070d4;
import p523V9.AbstractC8078e4;
import p523V9.AbstractC8086f4;
import p571X9.AbstractC9233X;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.C9550b;
import p637a3.AbstractC10494k;
import p845k3.C16329f;
import p845k3.C16331h;
import p845k3.InterfaceC16324a;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import ph.C18417e;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C11617m {

    /* JADX INFO: renamed from: a */
    public final String f35166a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f35167b;

    /* JADX INFO: renamed from: c */
    public final C1743k f35168c;

    /* JADX INFO: renamed from: d */
    public final AbstractC11579L f35169d;

    /* JADX INFO: renamed from: e */
    public final C11597c f35170e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC16324a f35171f;

    /* JADX INFO: renamed from: g */
    public final ComponentName f35172g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC11563A0 f35173h;

    /* JADX INFO: renamed from: i */
    public final boolean f35174i;

    /* JADX INFO: renamed from: j */
    public final C6002f0 f35175j;

    /* JADX INFO: renamed from: k */
    public final C6002f0 f35176k;

    /* JADX INFO: renamed from: l */
    public Object f35177l;

    /* JADX INFO: renamed from: m */
    public final C0631p0 f35178m;

    /* JADX INFO: renamed from: n */
    public final C2153Q0 f35179n;

    public C11617m(AbstractC11579L abstractC11579L, C11597c c11597c, Bundle bundle, int i10) {
        bundle = (i10 & 4) != 0 ? null : bundle;
        C16329f c16329f = C16329f.f50659a;
        C11642y0 c11642y0 = ((C18417e) abstractC11579L).f58772d;
        this.f35166a = AbstractC8038Z3.m8392a(c11597c.f35088a);
        this.f35167b = new AtomicBoolean(true);
        this.f35168c = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
        this.f35169d = abstractC11579L;
        this.f35170e = c11597c;
        this.f35171f = c16329f;
        this.f35172g = null;
        this.f35173h = c11642y0;
        this.f35174i = true;
        int i11 = c11597c.f35088a;
        if (Integer.MIN_VALUE <= i11 && i11 < -1) {
            throw new IllegalArgumentException("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
        }
        C5975S c5975s = C5975S.f19445o0;
        this.f35175j = C5997d.m6430Q(null, c5975s);
        this.f35176k = C5997d.m6430Q(bundle, c5975s);
        this.f35177l = C17690x.f56481Y;
        this.f35178m = AbstractC0575H.m1175d();
        this.f35179n = AbstractC2124C.m3204c(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m12990a(Context context, Throwable th2) throws Throwable {
        AbstractC15256t.m16466d("GlanceAppWidget", "Error in Glance App Widget", th2);
        if (!this.f35174i) {
            throw th2;
        }
        int i10 = this.f35170e.f35088a;
        int i11 = this.f35169d.f35020a;
        if (i11 == 0) {
            throw th2;
        }
        AppWidgetManager.getInstance(context).updateAppWidget(i10, new RemoteViews(context.getPackageName(), i11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a3.k, android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [a3.k, android.content.Context, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final Object m12991b(Context context, AbstractC10494k abstractC10494k, AbstractC19687c abstractC19687c) throws Throwable {
        C11607h c11607h;
        C11617m c11617m;
        Context context2;
        AbstractC10494k abstractC10494k2;
        C11606g0 c11606g0;
        AppWidgetManager appWidgetManager;
        ?? r6;
        ?? r10;
        Throwable th2;
        C11597c c11597c;
        ComponentName componentName;
        if (abstractC19687c instanceof C11607h) {
            c11607h = (C11607h) abstractC19687c;
            int i10 = c11607h.f35116r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11607h.f35116r0 = i10 - Integer.MIN_VALUE;
            } else {
                c11607h = new C11607h(this, abstractC19687c);
            }
        } else {
            c11607h = new C11607h(this, abstractC19687c);
        }
        Object objM13004b = c11607h.f35114p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11607h.f35116r0;
        try {
            try {
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objM13004b);
                    if (AbstractC8070d4.m8481h(abstractC10494k)) {
                        return Boolean.FALSE;
                    }
                    AbstractC16544l.m18092e(abstractC10494k, "null cannot be cast to non-null type androidx.glance.appwidget.RemoteViewsRoot");
                    C11641y c11641y = C11606g0.f35104g;
                    int i12 = this.f35170e.f35088a;
                    c11607h.f35111Y = this;
                    c11607h.f35112Z = context;
                    c11607h.f35113o0 = abstractC10494k;
                    c11607h.f35116r0 = 1;
                    objM13004b = c11641y.m13004b(context, i12, c11607h);
                    if (objM13004b == enumC19250a) {
                        return enumC19250a;
                    }
                    c11617m = this;
                    context2 = context;
                    abstractC10494k2 = abstractC10494k;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2 || i11 == 3 || i11 == 4) {
                            AbstractC9233X.m9807c(objM13004b);
                            AbstractC11567C0.m12964a();
                            return Boolean.TRUE;
                        }
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) c11607h.f35111Y;
                        AbstractC9233X.m9807c(objM13004b);
                        AbstractC11567C0.m12964a();
                        throw th2;
                    }
                    abstractC10494k2 = c11607h.f35113o0;
                    context2 = c11607h.f35112Z;
                    c11617m = (C11617m) c11607h.f35111Y;
                    AbstractC9233X.m9807c(objM13004b);
                }
                RemoteViews remoteViewsM8528o = AbstractC8086f4.m8528o(context2, c11597c.f35088a, (C11628r0) abstractC10494k2, c11606g0, c11606g0.m12980a(abstractC10494k2), componentName);
                if (c11617m.f35174i) {
                    appWidgetManager.updateAppWidget(c11597c.f35088a, remoteViewsM8528o);
                }
                c11617m.f35179n.setValue(remoteViewsM8528o);
                c11607h.f35111Y = null;
                c11607h.f35112Z = null;
                c11607h.f35113o0 = null;
                c11607h.f35116r0 = 2;
                if (c11606g0.m12981b(c11607h) == enumC19250a) {
                    return enumC19250a;
                }
            } catch (CancellationException unused) {
                c11607h.f35111Y = r10;
                c11607h.f35112Z = r10;
                c11607h.f35113o0 = r10;
                c11607h.f35116r0 = 3;
                if (c11606g0.m12981b(c11607h) == enumC19250a) {
                    return enumC19250a;
                }
            } catch (Throwable th3) {
                th = th3;
                r6 = r10;
                try {
                    c11617m.m12990a(context2, th);
                    c11607h.f35111Y = r6;
                    c11607h.f35112Z = r6;
                    c11607h.f35113o0 = r6;
                    c11607h.f35116r0 = 4;
                    if (c11606g0.m12981b(c11607h) == enumC19250a) {
                        return enumC19250a;
                    }
                } catch (Throwable th4) {
                    c11607h.f35111Y = th4;
                    c11607h.f35112Z = r6;
                    c11607h.f35113o0 = r6;
                    c11607h.f35116r0 = 5;
                    if (c11606g0.m12981b(c11607h) == enumC19250a) {
                        return enumC19250a;
                    }
                    th2 = th4;
                }
            }
            ComponentName componentName2 = c11617m.f35172g;
            c11597c = c11617m.f35170e;
            if (componentName2 == null) {
                AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(c11597c.f35088a);
                if (appWidgetInfo == null) {
                    throw new IllegalArgumentException(("No app widget info for " + c11597c.f35088a).toString());
                }
                componentName = appWidgetInfo.provider;
            } else {
                componentName = componentName2;
            }
            AbstractC8078e4.m8496c((C11628r0) abstractC10494k2);
            c11617m.f35177l = AbstractC8078e4.m8500g(abstractC10494k2);
            r10 = 0;
        } catch (CancellationException unused2) {
            r10 = 0;
        } catch (Throwable th5) {
            th = th5;
            r6 = 0;
        }
        c11606g0 = (C11606g0) objM13004b;
        Object systemService = context2.getSystemService("appwidget");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.appwidget.AppWidgetManager");
        appWidgetManager = (AppWidgetManager) systemService;
        AbstractC11567C0.m12964a();
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public final Object m12992c(Context context, Object obj, AbstractC19687c abstractC19687c) throws Throwable {
        C11609i c11609i;
        C9550b c9550bMo10041C;
        C9550b c9550bMo10041C2;
        C11617m c11617m;
        C9550b c9550bMo10041C3;
        if (abstractC19687c instanceof C11609i) {
            c11609i = (C11609i) abstractC19687c;
            int i10 = c11609i.f35121p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11609i.f35121p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11609i = new C11609i(this, abstractC19687c);
            }
        } else {
            c11609i = new C11609i(this, abstractC19687c);
        }
        Object objM17921c = c11609i.f35119Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11609i.f35121p0;
        C17296C c17296c = C17296C.f55119a;
        C17296C c17296c2 = null;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM17921c);
            boolean z6 = obj instanceof C11603f;
            String str = this.f35166a;
            if (z6) {
                C16331h c16331h = this.f35169d.f35022c;
                if (c16331h != null) {
                    c11609i.f35118Y = this;
                    c11609i.f35121p0 = 1;
                    objM17921c = ((C16329f) this.f35171f).m17921c(context, c16331h, str, c11609i);
                    if (objM17921c == enumC19250a) {
                        return enumC19250a;
                    }
                    c11617m = this;
                } else {
                    c11617m = this;
                    objM17921c = null;
                }
            } else if (obj instanceof C11601e) {
                AbstractC9556h abstractC9556hM10087k = AbstractC9562n.m10087k();
                C9550b c9550b = abstractC9556hM10087k instanceof C9550b ? (C9550b) abstractC9556hM10087k : null;
                if (c9550b == null || (c9550bMo10041C2 = c9550b.mo10041C(null, null)) == null) {
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                }
                try {
                    AbstractC9556h abstractC9556hM10070j = c9550bMo10041C2.m10070j();
                    try {
                        this.f35176k.setValue(((C11601e) obj).f35094a);
                        AbstractC9556h.m10068p(abstractC9556hM10070j);
                        c9550bMo10041C2.mo10058v().mo10071c();
                        c9550bMo10041C2.mo10043c();
                    } catch (Throwable th2) {
                        AbstractC9556h.m10068p(abstractC9556hM10070j);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c9550bMo10041C2.mo10043c();
                    throw th3;
                }
            } else if (obj instanceof C11599d) {
                AbstractC9556h abstractC9556hM10087k2 = AbstractC9562n.m10087k();
                C9550b c9550b2 = abstractC9556hM10087k2 instanceof C9550b ? (C9550b) abstractC9556hM10087k2 : null;
                if (c9550b2 == null || (c9550bMo10041C = c9550b2.mo10041C(null, null)) == null) {
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                }
                try {
                    AbstractC9556h abstractC9556hM10070j2 = c9550bMo10041C.m10070j();
                    try {
                        List list = (List) this.f35177l.get(((C11599d) obj).f35090a);
                        if (list != null) {
                            Iterator it = list.iterator();
                            if (it.hasNext()) {
                                throw null;
                            }
                            c17296c2 = c17296c;
                        }
                        AbstractC9556h.m10068p(abstractC9556hM10070j2);
                        c9550bMo10041C.mo10058v().mo10071c();
                        c9550bMo10041C.mo10043c();
                        if (c17296c2 == null) {
                            new Integer(AbstractC15256t.m16482t("AppWidgetSession", "Triggering Action(" + ((C11599d) obj).f35090a + ") for session(" + str + ") failed"));
                        }
                    } catch (Throwable th4) {
                        AbstractC9556h.m10068p(abstractC9556hM10070j2);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    c9550bMo10041C.mo10043c();
                    throw th5;
                }
            } else {
                if (!(obj instanceof C11605g)) {
                    throw new IllegalArgumentException("Sent unrecognized event type " + obj.getClass() + " to AppWidgetSession");
                }
                C0631p0 c0631p0 = ((C11605g) obj).f35103a;
                if (c0631p0.mo1274a()) {
                    c0631p0.m1279g0();
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c11617m = c11609i.f35118Y;
        AbstractC9233X.m9807c(objM17921c);
        AbstractC9556h abstractC9556hM10087k3 = AbstractC9562n.m10087k();
        C9550b c9550b3 = abstractC9556hM10087k3 instanceof C9550b ? (C9550b) abstractC9556hM10087k3 : null;
        if (c9550b3 == null || (c9550bMo10041C3 = c9550b3.mo10041C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            AbstractC9556h abstractC9556hM10070j3 = c9550bMo10041C3.m10070j();
            try {
                c11617m.f35175j.setValue(objM17921c);
                AbstractC9556h.m10068p(abstractC9556hM10070j3);
                c9550bMo10041C3.mo10058v().mo10071c();
                c9550bMo10041C3.mo10043c();
                return c17296c;
            } catch (Throwable th6) {
                AbstractC9556h.m10068p(abstractC9556hM10070j3);
                throw th6;
            }
        } catch (Throwable th7) {
            c9550bMo10041C3.mo10043c();
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[Catch: t -> 0x008f, TRY_LEAVE, TryCatch #0 {t -> 0x008f, blocks: (B:13:0x002e, B:22:0x0058, B:26:0x006f, B:28:0x0077, B:18:0x0046, B:21:0x004d), top: B:34:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008c -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m12993d(android.content.Context r9, p482Tg.C7448e r10, sm.AbstractC19687c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p823j3.C16090l
            if (r0 == 0) goto L13
            r0 = r11
            j3.l r0 = (p823j3.C16090l) r0
            int r1 = r0.f49841s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49841s0 = r1
            goto L18
        L13:
            j3.l r0 = new j3.l
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f49839q0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f49841s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            Cn.d r9 = r0.f49838p0
            Bm.k r10 = r0.f49837o0
            android.content.Context r2 = r0.f49836Z
            c3.m r5 = r0.f49835Y
            p571X9.AbstractC9233X.m9807c(r11)     // Catch: p077Cn.C1752t -> L8f
        L31:
            r11 = r5
            r6 = r2
            r2 = r9
            r9 = r6
            goto L58
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            Cn.d r9 = r0.f49838p0
            Bm.k r10 = r0.f49837o0
            android.content.Context r2 = r0.f49836Z
            c3.m r5 = r0.f49835Y
            p571X9.AbstractC9233X.m9807c(r11)     // Catch: p077Cn.C1752t -> L8f
            goto L6f
        L4a:
            p571X9.AbstractC9233X.m9807c(r11)
            Cn.k r11 = r8.f35168c     // Catch: p077Cn.C1752t -> L8f
            r11.getClass()     // Catch: p077Cn.C1752t -> L8f
            Cn.d r2 = new Cn.d     // Catch: p077Cn.C1752t -> L8f
            r2.<init>(r11)     // Catch: p077Cn.C1752t -> L8f
            r11 = r8
        L58:
            r0.f49835Y = r11     // Catch: p077Cn.C1752t -> L8f
            r0.f49836Z = r9     // Catch: p077Cn.C1752t -> L8f
            r0.f49837o0 = r10     // Catch: p077Cn.C1752t -> L8f
            r0.f49838p0 = r2     // Catch: p077Cn.C1752t -> L8f
            r0.f49841s0 = r4     // Catch: p077Cn.C1752t -> L8f
            java.lang.Object r5 = r2.m2525b(r0)     // Catch: p077Cn.C1752t -> L8f
            if (r5 != r1) goto L69
            return r1
        L69:
            r6 = r2
            r2 = r9
            r9 = r6
            r7 = r5
            r5 = r11
            r11 = r7
        L6f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: p077Cn.C1752t -> L8f
            boolean r11 = r11.booleanValue()     // Catch: p077Cn.C1752t -> L8f
            if (r11 == 0) goto L8f
            java.lang.Object r11 = r9.m2526c()     // Catch: p077Cn.C1752t -> L8f
            r10.invoke(r11)     // Catch: p077Cn.C1752t -> L8f
            r0.f49835Y = r5     // Catch: p077Cn.C1752t -> L8f
            r0.f49836Z = r2     // Catch: p077Cn.C1752t -> L8f
            r0.f49837o0 = r10     // Catch: p077Cn.C1752t -> L8f
            r0.f49838p0 = r9     // Catch: p077Cn.C1752t -> L8f
            r0.f49841s0 = r3     // Catch: p077Cn.C1752t -> L8f
            java.lang.Object r11 = r5.m12992c(r2, r11, r0)     // Catch: p077Cn.C1752t -> L8f
            if (r11 != r1) goto L31
            return r1
        L8f:
            mm.C r9 = mm.C17296C.f55119a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p672c3.C11617m.m12993d(android.content.Context, Tg.e, sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final Object m12994e(Object obj, AbstractC19687c abstractC19687c) {
        Object objMo2523o = this.f35168c.mo2523o(obj, abstractC19687c);
        return objMo2523o == EnumC19250a.f61036Y ? objMo2523o : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m12995f(AbstractC19687c abstractC19687c) {
        C11615l c11615l;
        C11605g c11605g;
        if (abstractC19687c instanceof C11615l) {
            c11615l = (C11615l) abstractC19687c;
            int i10 = c11615l.f35162p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11615l.f35162p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11615l = new C11615l(this, abstractC19687c);
            }
        } else {
            c11615l = new C11615l(this, abstractC19687c);
        }
        Object obj = c11615l.f35160Z;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c11615l.f35162p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C11605g c11605g2 = new C11605g(new C0631p0(this.f35178m));
            c11615l.f35159Y = c11605g2;
            c11615l.f35162p0 = 1;
            if (m12994e(c11605g2, c11615l) == obj2) {
                return obj2;
            }
            c11605g = c11605g2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11605g = c11615l.f35159Y;
            AbstractC9233X.m9807c(obj);
        }
        return c11605g.f35103a;
    }
}
