package p717e3;

import androidx.glance.appwidget.protobuf.AbstractC11032b;
import androidx.glance.appwidget.protobuf.AbstractC11059u;
import androidx.glance.appwidget.protobuf.C11005A;
import androidx.glance.appwidget.protobuf.C11023T;
import androidx.glance.appwidget.protobuf.C11024U;
import androidx.glance.appwidget.protobuf.C11025V;
import androidx.glance.appwidget.protobuf.C11028Y;
import androidx.glance.appwidget.protobuf.C11046i;
import androidx.glance.appwidget.protobuf.C11051m;
import androidx.glance.appwidget.protobuf.C11058t;
import androidx.glance.appwidget.protobuf.InterfaceC11022S;
import androidx.glance.appwidget.protobuf.InterfaceC11026W;
import androidx.glance.appwidget.protobuf.InterfaceC11062x;
import io.sentry.instrumentation.file.C15378c;
import java.io.IOException;
import p001A.AbstractC0010F;
import p370P0.C6277D;

/* JADX INFO: renamed from: e3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13272e extends AbstractC11059u {
    private static final C13272e DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile InterfaceC11022S PARSER;
    private InterfaceC11062x layout_ = C11024U.f33269p0;
    private int nextIndex_;

    static {
        C13272e c13272e = new C13272e();
        DEFAULT_INSTANCE = c13272e;
        AbstractC11059u.m12098k(C13272e.class, c13272e);
    }

    /* JADX INFO: renamed from: m */
    public static void m14872m(C13272e c13272e, C13274g c13274g) {
        c13272e.getClass();
        InterfaceC11062x interfaceC11062x = c13272e.layout_;
        if (!((AbstractC11032b) interfaceC11062x).f33285Y) {
            int size = interfaceC11062x.size();
            c13272e.layout_ = ((C11024U) interfaceC11062x).m11921j(size == 0 ? 10 : size * 2);
        }
        c13272e.layout_.add(c13274g);
    }

    /* JADX INFO: renamed from: n */
    public static void m14873n(C13272e c13272e) {
        c13272e.getClass();
        c13272e.layout_ = C11024U.f33269p0;
    }

    /* JADX INFO: renamed from: o */
    public static void m14874o(C13272e c13272e, int i10) {
        c13272e.nextIndex_ = i10;
    }

    /* JADX INFO: renamed from: p */
    public static C13272e m14875p() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static C13272e m14876s(C15378c c15378c) throws C11005A {
        C13272e c13272e = DEFAULT_INSTANCE;
        C11046i c11046i = new C11046i(c15378c);
        C11051m c11051mM12089a = C11051m.m12089a();
        AbstractC11059u abstractC11059uM12104j = c13272e.m12104j();
        try {
            C11023T c11023t = C11023T.f33266c;
            c11023t.getClass();
            InterfaceC11026W interfaceC11026WM11919a = c11023t.m11919a(abstractC11059uM12104j.getClass());
            C6277D c6277d = (C6277D) c11046i.f2131Z;
            if (c6277d == null) {
                c6277d = new C6277D(c11046i);
            }
            interfaceC11026WM11919a.mo11904h(abstractC11059uM12104j, c6277d, c11051mM12089a);
            interfaceC11026WM11919a.mo11897a(abstractC11059uM12104j);
            if (AbstractC11059u.m12097g(abstractC11059uM12104j, true)) {
                return (C13272e) abstractC11059uM12104j;
            }
            throw new C11005A(new C11028Y().getMessage());
        } catch (C11005A e10) {
            if (e10.f33223Y) {
                throw new C11005A(e10.getMessage(), e10);
            }
            throw e10;
        } catch (C11028Y e11) {
            throw new C11005A(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof C11005A) {
                throw ((C11005A) e12.getCause());
            }
            throw new C11005A(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C11005A) {
                throw ((C11005A) e13.getCause());
            }
            throw e13;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11059u
    /* JADX INFO: renamed from: d */
    public final Object mo12101d(int i10) {
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C11025V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", C13274g.class, "nextIndex_"});
            case 3:
                return new C13272e();
            case 4:
                return new C13271d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC11022S c11058t = PARSER;
                if (c11058t == null) {
                    synchronized (C13272e.class) {
                        try {
                            c11058t = PARSER;
                            if (c11058t == null) {
                                c11058t = new C11058t();
                                PARSER = c11058t;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c11058t;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC11062x m14877q() {
        return this.layout_;
    }

    /* JADX INFO: renamed from: r */
    public final int m14878r() {
        return this.nextIndex_;
    }
}
