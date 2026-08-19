package p672c3;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.openai.chatgpt.R;
import com.openai.feature.widget.impl.WidgetReceiver;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0627n0;
import p167Gb.C3032c;
import p571X9.AbstractC9233X;
import p823j3.AbstractC16097s;
import p823j3.C16096r;
import p972qm.C18777j;
import p996rm.EnumC19250a;
import ph.C18417e;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11596b0 implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: a */
    public final GlanceRemoteViewsService f35084a;

    /* JADX INFO: renamed from: b */
    public final int f35085b;

    /* JADX INFO: renamed from: c */
    public final int f35086c;

    /* JADX INFO: renamed from: d */
    public final String f35087d;

    public C11596b0(GlanceRemoteViewsService glanceRemoteViewsService, int i10, int i11, String str) {
        this.f35084a = glanceRemoteViewsService;
        this.f35085b = i10;
        this.f35086c = i11;
        this.f35087d = str;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092 A[PHI: r8
      0x0092: PHI (r8v1 c3.b0) = (r8v0 c3.b0), (r8v3 c3.b0) binds: [B:27:0x007a, B:32:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m12978a(C11596b0 c11596b0, C11597c c11597c, AbstractC19687c abstractC19687c) throws Throwable {
        C11592Z c11592z;
        C18417e c18417e;
        ComponentName componentName;
        String className;
        InterfaceC0627n0 interfaceC0627n0;
        c11596b0.getClass();
        if (abstractC19687c instanceof C11592Z) {
            c11592z = (C11592Z) abstractC19687c;
            int i10 = c11592z.f35076p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11592z.f35076p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11592z = new C11592Z(c11596b0, abstractC19687c);
            }
        } else {
            c11592z = new C11592Z(c11596b0, abstractC19687c);
        }
        Object objM17652a = c11592z.f35074Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11592z.f35076p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                c11596b0 = c11592z.f35073Y;
                AbstractC9233X.m9807c(objM17652a);
            } else if (i11 == 2) {
                AbstractC9233X.m9807c(objM17652a);
                interfaceC0627n0 = (InterfaceC0627n0) objM17652a;
                if (interfaceC0627n0 != null) {
                    c11592z.f35073Y = null;
                    c11592z.f35076p0 = 3;
                    if (interfaceC0627n0.mo1272P(c11592z) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM17652a);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM17652a);
        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(c11596b0.f35084a).getAppWidgetInfo(c11596b0.f35085b);
        if (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null || (className = componentName.getClassName()) == null) {
            c18417e = null;
        } else {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            AbstractC16544l.m18092e(objNewInstance, "null cannot be cast to non-null type androidx.glance.appwidget.GlanceAppWidgetReceiver");
            c18417e = ((WidgetReceiver) objNewInstance).f40340b;
        }
        if (c18417e != null) {
            C16096r c16096r = AbstractC16097s.f49862a;
            C11594a0 c11594a0 = new C11594a0(c11596b0, c11597c, c18417e, null);
            c11592z.f35073Y = c11596b0;
            c11592z.f35076p0 = 1;
            objM17652a = c16096r.m17652a(c11594a0, c11592z);
            if (objM17652a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            C11641y c11641y = UnmanagedSessionReceiver.f33220a;
            C11641y.m13003a(c11596b0.f35085b);
            interfaceC0627n0 = null;
        }
        if (interfaceC0627n0 != null) {
            c11592z.f35073Y = null;
            c11592z.f35076p0 = 3;
            if (interfaceC0627n0.mo1272P(c11592z) == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
        interfaceC0627n0 = (InterfaceC0627n0) objM17652a;
        if (interfaceC0627n0 == null) {
            C11641y c11641y2 = UnmanagedSessionReceiver.f33220a;
            C11641y.m13003a(c11596b0.f35085b);
            interfaceC0627n0 = null;
        }
        if (interfaceC0627n0 != null) {
            c11592z.f35073Y = null;
            c11592z.f35076p0 = 3;
            if (interfaceC0627n0.mo1272P(c11592z) == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: b */
    public final C11624p0 m12979b() {
        C11624p0 c11624p0;
        C3032c c3032c = GlanceRemoteViewsService.f33219Y;
        int i10 = this.f35085b;
        int i11 = this.f35086c;
        String str = this.f35087d;
        C3032c c3032c2 = GlanceRemoteViewsService.f33219Y;
        synchronized (c3032c2) {
            c11624p0 = (C11624p0) ((LinkedHashMap) c3032c2.f9127Z).get(C3032c.m3910k(i10, i11, str));
            if (c11624p0 == null) {
                c11624p0 = C11624p0.f35222d;
            }
        }
        return c11624p0;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return m12979b().f35223a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i10) {
        try {
            return m12979b().f35223a[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i10) {
        try {
            return m12979b().f35224b[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f35084a.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return m12979b().f35225c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        m12979b().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() throws Throwable {
        AbstractC0575H.m1161I(C18777j.f59682Y, new C11591Y(this, null));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        C3032c c3032c = GlanceRemoteViewsService.f33219Y;
        int i10 = this.f35085b;
        int i11 = this.f35086c;
        String str = this.f35087d;
        C3032c c3032c2 = GlanceRemoteViewsService.f33219Y;
        synchronized (c3032c2) {
            ((LinkedHashMap) c3032c2.f9127Z).remove(C3032c.m3910k(i10, i11, str));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
