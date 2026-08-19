package p672c3;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6002f0;
import p349O0.C6010j0;
import p349O0.InterfaceC5985X;
import p492U1.C7542g;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9400y4;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.C9550b;
import p845k3.C16329f;
import p845k3.C16331h;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C11611j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35123Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35124Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11617m f35125o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Context f35126p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f35127q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11611j(C11617m c11617m, Context context, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35125o0 = c11617m;
        this.f35126p0 = context;
        this.f35127q0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11611j c11611j = new C11611j(this.f35125o0, this.f35126p0, this.f35127q0, interfaceC18770c);
        c11611j.f35124Z = obj;
        return c11611j;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11611j) create((C6010j0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C6010j0 c6010j0;
        C16331h c16331h;
        C9550b c9550bMo10041C;
        long jM9979b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35123Y;
        Context context = this.f35126p0;
        C11617m c11617m = this.f35125o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6010j0 c6010j1 = (C6010j0) this.f35124Z;
            if (c11617m.f35175j.getValue() != null || (c16331h = c11617m.f35169d.f35022c) == null) {
                c6010j0 = c6010j1;
                obj = null;
            } else {
                this.f35124Z = c6010j1;
                this.f35123Y = 1;
                Object objM17921c = ((C16329f) c11617m.f35171f).m17921c(context, c16331h, c11617m.f35166a, this);
                if (objM17921c == enumC19250a) {
                    return enumC19250a;
                }
                c6010j0 = c6010j1;
                obj = objM17921c;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6010j0 = (C6010j0) this.f35124Z;
            AbstractC9233X.m9807c(obj);
        }
        InterfaceC5985X interfaceC5985X = this.f35127q0;
        AbstractC9556h abstractC9556hM10087k = AbstractC9562n.m10087k();
        C9550b c9550b = abstractC9556hM10087k instanceof C9550b ? (C9550b) abstractC9556hM10087k : null;
        if (c9550b == null || (c9550bMo10041C = c9550b.mo10041C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            AbstractC9556h abstractC9556hM10070j = c9550bMo10041C.m10070j();
            try {
                C11597c c11597c = c11617m.f35170e;
                C6002f0 c6002f0 = c11617m.f35176k;
                int i11 = c11597c.f35088a;
                boolean z6 = false;
                if (Integer.MIN_VALUE <= i11 && i11 < -1) {
                    z6 = true;
                }
                if (!z6) {
                    Object systemService = context.getSystemService("appwidget");
                    AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.appwidget.AppWidgetManager");
                    AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(c11597c.f35088a);
                    if (appWidgetInfo == null) {
                        jM9979b = 0;
                    } else {
                        int iMin = Math.min(appWidgetInfo.minWidth, (1 & appWidgetInfo.resizeMode) != 0 ? appWidgetInfo.minResizeWidth : Integer.MAX_VALUE);
                        int iMin2 = Math.min(appWidgetInfo.minHeight, (appWidgetInfo.resizeMode & 2) != 0 ? appWidgetInfo.minResizeHeight : Integer.MAX_VALUE);
                        float f10 = displayMetrics.density;
                        jM9979b = AbstractC9400y4.m9979b(iMin / f10, iMin2 / f10);
                    }
                    interfaceC5985X.setValue(new C7542g(jM9979b));
                    if (((Bundle) c6002f0.getValue()) == null) {
                        c6002f0.setValue(appWidgetManager.getAppWidgetOptions(c11597c.f35088a));
                    }
                }
                if (obj != null) {
                    c11617m.f35175j.setValue(obj);
                }
                c6010j0.setValue(Boolean.TRUE);
                AbstractC9556h.m10068p(abstractC9556hM10070j);
                c9550bMo10041C.mo10058v().mo10071c();
                c9550bMo10041C.mo10043c();
                return C17296C.f55119a;
            } catch (Throwable th2) {
                AbstractC9556h.m10068p(abstractC9556hM10070j);
                throw th2;
            }
        } catch (Throwable th3) {
            c9550bMo10041C.mo10043c();
            throw th3;
        }
    }
}
