package p672c3;

import android.content.Context;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import androidx.glance.appwidget.protobuf.InterfaceC11062x;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.util.LinkedHashMap;
import p351O2.C6087a;
import p571X9.AbstractC9233X;
import p717e3.C13272e;
import p717e3.C13274g;
import p845k3.C16329f;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18775h;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C11641y implements InterfaceC18775h {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ C11641y f35270Y = new C11641y();

    /* JADX INFO: renamed from: a */
    public static void m13003a(int i10) {
        synchronized (UnmanagedSessionReceiver.f33220a) {
            if (UnmanagedSessionReceiver.f33221b.get(Integer.valueOf(i10)) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m13004b(Context context, int i10, AbstractC19687c abstractC19687c) throws Throwable {
        C11602e0 c11602e0;
        C13272e c13272eM14875p;
        if (abstractC19687c instanceof C11602e0) {
            c11602e0 = (C11602e0) abstractC19687c;
            int i11 = c11602e0.f35099q0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c11602e0.f35099q0 = i11 - Integer.MIN_VALUE;
            } else {
                c11602e0 = new C11602e0(this, abstractC19687c);
            }
        } else {
            c11602e0 = new C11602e0(this, abstractC19687c);
        }
        Object objM17921c = c11602e0.f35097o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c11602e0.f35099q0;
        try {
            if (i12 == 0) {
                AbstractC9233X.m9807c(objM17921c);
                c11602e0.f35095Y = context;
                c11602e0.f35096Z = i10;
                c11602e0.f35099q0 = 1;
                objM17921c = C16329f.f50659a.m17921c(context, C11618m0.f35180a, "appWidgetLayout-" + i10, c11602e0);
                if (objM17921c == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = c11602e0.f35096Z;
                context = c11602e0.f35095Y;
                AbstractC9233X.m9807c(objM17921c);
            }
            c13272eM14875p = (C13272e) objM17921c;
        } catch (C6087a e10) {
            AbstractC15256t.m16466d("GlanceAppWidget", "Set of layout structures for App Widget id " + i10 + " is corrupted", e10);
            c13272eM14875p = C13272e.m14875p();
        } catch (IOException e11) {
            AbstractC15256t.m16466d("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + i10, e11);
            c13272eM14875p = C13272e.m14875p();
        }
        Context context2 = context;
        int i13 = i10;
        InterfaceC11062x<C13274g> interfaceC11062xM14877q = c13272eM14875p.m14877q();
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(interfaceC11062xM14877q, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (C13274g c13274g : interfaceC11062xM14877q) {
            linkedHashMap.put(c13274g.m14882o(), new Integer(c13274g.m14883p()));
        }
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(linkedHashMap);
        return new C11606g0(context2, linkedHashMapM19256r, c13272eM14875p.m14878r(), i13, AbstractC17680n.m19326F0(linkedHashMapM19256r.values()));
    }
}
