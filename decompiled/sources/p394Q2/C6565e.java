package p394Q2;

import androidx.datastore.preferences.protobuf.AbstractC10983s;
import androidx.datastore.preferences.protobuf.AbstractC10987u;
import androidx.datastore.preferences.protobuf.C10933L;
import androidx.datastore.preferences.protobuf.C10944X;
import androidx.datastore.preferences.protobuf.C10946Z;
import androidx.datastore.preferences.protobuf.C10959g;
import androidx.datastore.preferences.protobuf.C10969l;
import androidx.datastore.preferences.protobuf.C10985t;
import androidx.datastore.preferences.protobuf.C10997z;
import androidx.datastore.preferences.protobuf.InterfaceC10942V;
import androidx.datastore.preferences.protobuf.InterfaceC10948a0;
import io.sentry.instrumentation.file.C15378c;
import java.io.IOException;
import java.util.Map;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p370P0.C6277D;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: Q2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6565e extends AbstractC10987u {
    private static final C6565e DEFAULT_INSTANCE;
    private static volatile InterfaceC10942V PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C10933L preferences_ = C10933L.f32976Z;

    static {
        C6565e c6565e = new C6565e();
        DEFAULT_INSTANCE = c6565e;
        AbstractC10987u.m11717h(C6565e.class, c6565e);
    }

    /* JADX INFO: renamed from: i */
    public static C10933L m7126i(C6565e c6565e) {
        C10933L c10933l = c6565e.preferences_;
        if (!c10933l.f32977Y) {
            c6565e.preferences_ = c10933l.m11458b();
        }
        return c6565e.preferences_;
    }

    /* JADX INFO: renamed from: k */
    public static C6563c m7127k() {
        return (C6563c) ((AbstractC10983s) DEFAULT_INSTANCE.mo7129d(5));
    }

    /* JADX INFO: renamed from: l */
    public static C6565e m7128l(C15378c c15378c) {
        C6565e c6565e = DEFAULT_INSTANCE;
        C10959g c10959g = new C10959g(c15378c);
        C10969l c10969lM11670a = C10969l.m11670a();
        AbstractC10987u abstractC10987u = (AbstractC10987u) c6565e.mo7129d(4);
        try {
            C10944X c10944x = C10944X.f33003c;
            c10944x.getClass();
            InterfaceC10948a0 interfaceC10948a0M11515a = c10944x.m11515a(abstractC10987u.getClass());
            C6277D c6277d = c10959g.f33036b;
            if (c6277d == null) {
                c6277d = new C6277D(c10959g);
            }
            interfaceC10948a0M11515a.mo11498f(abstractC10987u, c6277d, c10969lM11670a);
            interfaceC10948a0M11515a.mo11493a(abstractC10987u);
            if (abstractC10987u.m11718g()) {
                return (C6565e) abstractC10987u;
            }
            throw new C10997z(new C0644w(13).getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof C10997z) {
                throw ((C10997z) e10.getCause());
            }
            throw new C10997z(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof C10997z) {
                throw ((C10997z) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10987u
    /* JADX INFO: renamed from: d */
    public final Object mo7129d(int i10) {
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C10946Z(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC6564d.f21235a});
            case 3:
                return new C6565e();
            case 4:
                return new C6563c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC10942V c10985t = PARSER;
                if (c10985t == null) {
                    synchronized (C6565e.class) {
                        try {
                            c10985t = PARSER;
                            if (c10985t == null) {
                                c10985t = new C10985t();
                                PARSER = c10985t;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c10985t;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: j */
    public final Map m7130j() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
