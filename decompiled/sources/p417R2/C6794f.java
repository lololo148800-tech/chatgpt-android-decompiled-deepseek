package p417R2;

import androidx.datastore.preferences.protobuf.AbstractC10987u;
import androidx.datastore.preferences.protobuf.C10963i;
import androidx.datastore.preferences.protobuf.C10997z;
import androidx.datastore.preferences.protobuf.InterfaceC10991w;
import io.sentry.instrumentation.file.C15378c;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p1061vb.C20513d;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p351O2.C6084G;
import p351O2.C6087a;
import p351O2.C6090d;
import p351O2.C6102p;
import p351O2.InterfaceC6088b;
import p351O2.InterfaceC6097k;
import p394Q2.C6563c;
import p394Q2.C6565e;
import p394Q2.C6566f;
import p394Q2.C6567g;
import p394Q2.C6568h;
import p394Q2.C6569i;
import p571X9.AbstractC9393x3;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p959q8.C18639a;

/* JADX INFO: renamed from: R2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6794f implements InterfaceC6097k {

    /* JADX INFO: renamed from: a */
    public static final C6794f f21803a = new C6794f();

    /* JADX INFO: renamed from: d */
    public static C6792d m7235d(C20513d c20513d, C2925c c2925c, InterfaceC1426a interfaceC1426a, int i10) {
        C20513d c20513d2 = c20513d;
        if ((i10 & 1) != 0) {
            c20513d2 = null;
        }
        C17689w c17689w = C17689w.f56480Y;
        if ((i10 & 4) != 0) {
            C3516e c3516e = AbstractC0593T.f1824a;
            c2925c = AbstractC0575H.m1174c(ExecutorC3515d.f10633Z.plus(AbstractC0575H.m1176e()));
        }
        C2925c scope = c2925c;
        AbstractC16544l.m18094g(scope, "scope");
        C6794f c6794f = f21803a;
        C6793e c6793e = new C6793e(0, interfaceC1426a);
        InterfaceC6088b c18639a = c20513d2;
        if (c20513d2 == null) {
            c18639a = new C18639a(13);
        }
        return new C6792d(new C6084G(c6793e, c6794f, AbstractC9393x3.m9974d(new C6090d(c17689w, null)), c18639a, scope));
    }

    @Override // p351O2.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public Object mo6661a() {
        return new C6790b(true);
    }

    @Override // p351O2.InterfaceC6097k
    /* JADX INFO: renamed from: b */
    public void mo6662b(Object obj, C6102p c6102p) {
        AbstractC10987u abstractC10987uM11711a;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((C6790b) obj).f21795a);
        AbstractC16544l.m18093f(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        C6563c c6563cM7127k = C6565e.m7127k();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            C6795g c6795g = (C6795g) entry.getKey();
            Object value = entry.getValue();
            String str = c6795g.f21804a;
            if (value instanceof Boolean) {
                C6568h c6568hM7143y = C6569i.m7143y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                c6568hM7143y.m11713c();
                C6569i.m7139m((C6569i) c6568hM7143y.f33095Z, zBooleanValue);
                abstractC10987uM11711a = c6568hM7143y.m11711a();
            } else if (value instanceof Float) {
                C6568h c6568hM7143y2 = C6569i.m7143y();
                float fFloatValue = ((Number) value).floatValue();
                c6568hM7143y2.m11713c();
                C6569i.m7140n((C6569i) c6568hM7143y2.f33095Z, fFloatValue);
                abstractC10987uM11711a = c6568hM7143y2.m11711a();
            } else if (value instanceof Double) {
                C6568h c6568hM7143y3 = C6569i.m7143y();
                double dDoubleValue = ((Number) value).doubleValue();
                c6568hM7143y3.m11713c();
                C6569i.m7138l((C6569i) c6568hM7143y3.f33095Z, dDoubleValue);
                abstractC10987uM11711a = c6568hM7143y3.m11711a();
            } else if (value instanceof Integer) {
                C6568h c6568hM7143y4 = C6569i.m7143y();
                int iIntValue = ((Number) value).intValue();
                c6568hM7143y4.m11713c();
                C6569i.m7141o((C6569i) c6568hM7143y4.f33095Z, iIntValue);
                abstractC10987uM11711a = c6568hM7143y4.m11711a();
            } else if (value instanceof Long) {
                C6568h c6568hM7143y5 = C6569i.m7143y();
                long jLongValue = ((Number) value).longValue();
                c6568hM7143y5.m11713c();
                C6569i.m7135i((C6569i) c6568hM7143y5.f33095Z, jLongValue);
                abstractC10987uM11711a = c6568hM7143y5.m11711a();
            } else if (value instanceof String) {
                C6568h c6568hM7143y6 = C6569i.m7143y();
                c6568hM7143y6.m11713c();
                C6569i.m7136j((C6569i) c6568hM7143y6.f33095Z, (String) value);
                abstractC10987uM11711a = c6568hM7143y6.m11711a();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(AbstractC16544l.m18100m(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                C6568h c6568hM7143y7 = C6569i.m7143y();
                C6566f c6566fM7133l = C6567g.m7133l();
                c6566fM7133l.m11713c();
                C6567g.m7131i((C6567g) c6566fM7133l.f33095Z, (Set) value);
                c6568hM7143y7.m11713c();
                C6569i.m7137k((C6569i) c6568hM7143y7.f33095Z, c6566fM7133l);
                abstractC10987uM11711a = c6568hM7143y7.m11711a();
            }
            c6563cM7127k.getClass();
            str.getClass();
            c6563cM7127k.m11713c();
            C6565e.m7126i((C6565e) c6563cM7127k.f33095Z).put(str, (C6569i) abstractC10987uM11711a);
        }
        C6565e c6565e = (C6565e) c6563cM7127k.m11711a();
        int iMo11521a = c6565e.mo11521a();
        Logger logger = C10963i.f33052h;
        if (iMo11521a > 4096) {
            iMo11521a = 4096;
        }
        C10963i c10963i = new C10963i(c6102p, iMo11521a);
        c6565e.mo11523c(c10963i);
        if (c10963i.f33057f > 0) {
            c10963i.m11639P();
        }
    }

    @Override // p351O2.InterfaceC6097k
    /* JADX INFO: renamed from: c */
    public Object mo6663c(C15378c c15378c) throws C6087a {
        try {
            C6565e c6565eM7128l = C6565e.m7128l(c15378c);
            C6790b c6790b = new C6790b(false);
            AbstractC6796h[] pairs = (AbstractC6796h[]) Arrays.copyOf(new AbstractC6796h[0], 0);
            AbstractC16544l.m18094g(pairs, "pairs");
            c6790b.m7233a();
            if (pairs.length > 0) {
                AbstractC6796h abstractC6796h = pairs[0];
                throw null;
            }
            Map mapM7130j = c6565eM7128l.m7130j();
            AbstractC16544l.m18093f(mapM7130j, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM7130j.entrySet()) {
                String name = (String) entry.getKey();
                C6569i value = (C6569i) entry.getValue();
                AbstractC16544l.m18093f(name, "name");
                AbstractC16544l.m18093f(value, "value");
                int iM7151x = value.m7151x();
                switch (iM7151x == 0 ? -1 : AbstractC6798j.f21808a[AbstractC0010F.m24h(iM7151x)]) {
                    case -1:
                        throw new C6087a("Value case is null.", null);
                    case 0:
                    default:
                        throw new C0644w();
                    case 1:
                        c6790b.m7234b(new C6795g(name), Boolean.valueOf(value.m7144p()));
                        break;
                    case 2:
                        c6790b.m7234b(new C6795g(name), Float.valueOf(value.m7146s()));
                        break;
                    case 3:
                        c6790b.m7234b(new C6795g(name), Double.valueOf(value.m7145r()));
                        break;
                    case 4:
                        c6790b.m7234b(new C6795g(name), Integer.valueOf(value.m7147t()));
                        break;
                    case 5:
                        c6790b.m7234b(new C6795g(name), Long.valueOf(value.m7148u()));
                        break;
                    case 6:
                        C6795g c6795g = new C6795g(name);
                        String strM7149v = value.m7149v();
                        AbstractC16544l.m18093f(strM7149v, "value.string");
                        c6790b.m7234b(c6795g, strM7149v);
                        break;
                    case 7:
                        C6795g c6795g2 = new C6795g(name);
                        InterfaceC10991w interfaceC10991wM7134k = value.m7150w().m7134k();
                        AbstractC16544l.m18093f(interfaceC10991wM7134k, "value.stringSet.stringsList");
                        c6790b.m7234b(c6795g2, AbstractC17680n.m19328G0(interfaceC10991wM7134k));
                        break;
                    case 8:
                        throw new C6087a("Value not set.", null);
                }
            }
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(c6790b.f21795a);
            AbstractC16544l.m18093f(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
            return new C6790b(AbstractC17659D.m19256r(mapUnmodifiableMap), true);
        } catch (C10997z e10) {
            throw new C6087a("Unable to parse preferences proto.", e10);
        }
    }
}
