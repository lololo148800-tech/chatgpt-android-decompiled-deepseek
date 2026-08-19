package p594Y9;

import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import nl.AbstractC17649c;
import nl.C17647a;
import nl.C17650d;
import nl.C17652f;
import nl.C17653g;
import nl.C17655i;
import nl.InterfaceC17648b;
import p571X9.AbstractC9306j0;
import p618Za.C10267f;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Y9.F4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9728F4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final C10267f m10318a(AbstractC17649c abstractC17649c, int i10, boolean z6) {
        int i11 = 6;
        int i12 = 0;
        if (abstractC17649c instanceof C17655i) {
            String strQuote = Pattern.quote(((C17655i) abstractC17649c).f56443a);
            AbstractC16544l.m18093f(strQuote, "quote(...)");
            return new C10267f(strQuote, i12, i11);
        }
        if (abstractC17649c instanceof C17653g) {
            ((C17653g) abstractC17649c).getClass();
            return new C10267f("\\d", i12, i11);
        }
        if (!(abstractC17649c instanceof InterfaceC17648b)) {
            if (abstractC17649c instanceof C17647a) {
                if (abstractC17649c instanceof C17647a) {
                    C10267f c10267fM10318a = m10318a(((C17647a) abstractC17649c).f56436a, i10, true);
                    return new C10267f(AbstractC9306j0.m9892k(new StringBuilder(), c10267fM10318a.f30497a, '+'), c10267fM10318a.f30498b, 4);
                }
                throw new IllegalStateException(("Unsupported simple grammar element: " + abstractC17649c).toString());
            }
            if (!(abstractC17649c instanceof C17652f)) {
                throw new IllegalStateException(("Unsupported grammar element: " + abstractC17649c).toString());
            }
            StringBuilder sb2 = new StringBuilder("[");
            C17652f c17652f = (C17652f) abstractC17649c;
            sb2.append(c17652f.f56440a);
            sb2.append('-');
            sb2.append(c17652f.f56441b);
            sb2.append(']');
            return new C10267f(sb2.toString(), i12, i11);
        }
        StringBuilder sb3 = new StringBuilder();
        int i13 = z6 ? i10 + 1 : i10;
        for (Object obj : ((InterfaceC17648b) abstractC17649c).mo19241a()) {
            int i14 = i12 + 1;
            if (i12 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            C10267f c10267fM10318a2 = m10318a((AbstractC17649c) obj, i13, true);
            if (i12 != 0 && (abstractC17649c instanceof C17650d)) {
                sb3.append("|");
            }
            sb3.append(c10267fM10318a2.f30497a);
            i13 += c10267fM10318a2.f30498b;
            i12 = i14;
        }
        int i15 = i13 - i10;
        if (z6) {
            i15--;
        }
        String string = sb3.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return new C10267f(string, i15, z6);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10319b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
