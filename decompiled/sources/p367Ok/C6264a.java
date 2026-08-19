package p367Ok;

import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17312o;
import p027Ap.C0693a;
import p078Co.InterfaceC1760b;
import p1113xn.AbstractC21328v;
import p523V9.AbstractC8038Z3;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Ok.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6264a implements InterfaceC1760b {

    /* JADX INFO: renamed from: a */
    public static final C6264a f20357a = new C6264a();

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        Object objM9806b;
        Double dM21719f;
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        String strValueOf = String.valueOf(AbstractC17680n.m19343S(c0693aM8396e));
        String strValueOf2 = String.valueOf(AbstractC17680n.m19344T(1, c0693aM8396e));
        try {
            Pattern patternCompile = Pattern.compile("%[\\d|.]*[f]");
            AbstractC16544l.m18093f(patternCompile, "compile(...)");
            objM9806b = (!patternCompile.matcher(strValueOf).matches() || (dM21719f = AbstractC21328v.m21719f(strValueOf2)) == null) ? null : String.format(strValueOf, Double.valueOf(dM21719f.doubleValue()));
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        if (C17312o.m18979a(objM9806b) == null) {
            return (String) objM9806b;
        }
        return null;
    }
}
