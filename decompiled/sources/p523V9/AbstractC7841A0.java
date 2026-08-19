package p523V9;

import android.view.View;
import androidx.lifecycle.C11089Y;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p054C0.C1489b;
import p1006s6.EnumC19454d;
import p1006s6.InterfaceC19455e;
import p1091wn.AbstractC21031l;
import p204I1.C3582M;
import p328N1.InterfaceC5598n;
import p492U1.C7538c;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p544W9.AbstractC8682o;

/* JADX INFO: renamed from: V9.A0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7841A0 {
    /* JADX INFO: renamed from: a */
    public static C1489b m8089a(C1489b c1489b, EnumC7546k enumC7546k, C3582M c3582m, InterfaceC7537b interfaceC7537b, InterfaceC5598n interfaceC5598n) {
        if (c1489b != null && enumC7546k == c1489b.f3911a && AbstractC16544l.m18089b(c3582m, c1489b.f3912b) && interfaceC7537b.getDensity() == c1489b.f3913c.f23889Y && interfaceC5598n == c1489b.f3914d) {
            return c1489b;
        }
        C1489b c1489b2 = C1489b.f3910h;
        if (c1489b2 != null && enumC7546k == c1489b2.f3911a && AbstractC16544l.m18089b(c3582m, c1489b2.f3912b) && interfaceC7537b.getDensity() == c1489b2.f3913c.f23889Y && interfaceC5598n == c1489b2.f3914d) {
            return c1489b2;
        }
        C1489b c1489b3 = new C1489b(enumC7546k, AbstractC8682o.m9379b(c3582m, enumC7546k), new C7538c(interfaceC7537b.getDensity(), interfaceC7537b.mo7863X()), interfaceC5598n);
        C1489b.f3910h = c1489b3;
        return c1489b3;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC11112u m8090b(View view) {
        AbstractC16544l.m18094g(view, "<this>");
        return (InterfaceC11112u) AbstractC21031l.m21489m(AbstractC21031l.m21496t(AbstractC21031l.m21492p(C11089Y.f33453Z, view), C11089Y.f33454o0));
    }

    /* JADX INFO: renamed from: c */
    public static final Object m8091c(InterfaceC19455e interfaceC19455e) {
        Object obj;
        AbstractC16544l.m18094g(interfaceC19455e, "<this>");
        EnumC19454d enumC19454dPeek = interfaceC19455e.peek();
        int iOrdinal = enumC19454dPeek.ordinal();
        if (iOrdinal == 0) {
            interfaceC19455e.mo20581q();
            ArrayList arrayList = new ArrayList();
            while (interfaceC19455e.hasNext()) {
                arrayList.add(m8091c(interfaceC19455e));
            }
            interfaceC19455e.mo20580p();
            obj = arrayList;
        } else {
            if (iOrdinal != 2) {
                switch (iOrdinal) {
                    case 5:
                        return interfaceC19455e.mo20582x();
                    case 6:
                    case 7:
                        try {
                            try {
                                try {
                                    return Integer.valueOf(interfaceC19455e.mo20573g0());
                                } catch (Exception unused) {
                                    return Double.valueOf(interfaceC19455e.mo20563O());
                                }
                            } catch (Exception unused2) {
                                return interfaceC19455e.mo20583y0();
                            }
                        } catch (Exception unused3) {
                            return Long.valueOf(interfaceC19455e.mo20562E0());
                        }
                    case 8:
                        return Boolean.valueOf(interfaceC19455e.mo20566S0());
                    case 9:
                        interfaceC19455e.mo20572e0();
                        return null;
                    default:
                        throw new IllegalStateException(("unknown token " + enumC19454dPeek).toString());
                }
            }
            interfaceC19455e.mo20579o();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (interfaceC19455e.hasNext()) {
                linkedHashMap.put(interfaceC19455e.mo20570a0(), m8091c(interfaceC19455e));
            }
            interfaceC19455e.mo20574j();
            obj = linkedHashMap;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static final void m8092d(View view, InterfaceC11112u interfaceC11112u) {
        AbstractC16544l.m18094g(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC11112u);
    }
}
