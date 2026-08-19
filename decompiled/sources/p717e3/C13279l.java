package p717e3;

import androidx.glance.appwidget.protobuf.C11005A;
import androidx.glance.appwidget.protobuf.C11012H;
import androidx.glance.appwidget.protobuf.C11023T;
import androidx.glance.appwidget.protobuf.C11048j;
import androidx.glance.appwidget.protobuf.InterfaceC11026W;
import io.sentry.instrumentation.file.C15378c;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import p351O2.C6087a;
import p351O2.C6102p;
import p351O2.InterfaceC6097k;

/* JADX INFO: renamed from: e3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C13279l implements InterfaceC6097k {

    /* JADX INFO: renamed from: a */
    public static final C13279l f41976a = new C13279l();

    /* JADX INFO: renamed from: b */
    public static final C13272e f41977b;

    static {
        C13272e c13272eM14875p = C13272e.m14875p();
        AbstractC16544l.m18093f(c13272eM14875p, "getDefaultInstance()");
        f41977b = c13272eM14875p;
    }

    @Override // p351O2.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final Object mo6661a() {
        return f41977b;
    }

    @Override // p351O2.InterfaceC6097k
    /* JADX INFO: renamed from: b */
    public final void mo6662b(Object obj, C6102p c6102p) {
        C13272e c13272e = (C13272e) obj;
        c13272e.getClass();
        int iMo11976a = c13272e.mo11976a(null);
        Logger logger = C11048j.f33321f;
        if (iMo11976a > 4096) {
            iMo11976a = 4096;
        }
        C11048j c11048j = new C11048j(c6102p, iMo11976a);
        c13272e.getClass();
        C11023T c11023t = C11023T.f33266c;
        c11023t.getClass();
        InterfaceC11026W interfaceC11026WM11919a = c11023t.m11919a(c13272e.getClass());
        C11012H c11012h = c11048j.f33323a;
        if (c11012h == null) {
            c11012h = new C11012H(c11048j);
        }
        interfaceC11026WM11919a.mo11905i(c13272e, c11012h);
        if (c11048j.f33326d > 0) {
            c11048j.m12067F();
        }
    }

    @Override // p351O2.InterfaceC6097k
    /* JADX INFO: renamed from: c */
    public final Object mo6663c(C15378c c15378c) throws C6087a {
        try {
            return C13272e.m14876s(c15378c);
        } catch (C11005A e10) {
            throw new C6087a("Cannot read proto.", e10);
        }
    }
}
