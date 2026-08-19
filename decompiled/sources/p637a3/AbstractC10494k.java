package p637a3;

import android.gov.nist.core.Separators;
import io.ktor.client.plugins.auth.C15058c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0740V;
import p1091wn.AbstractC21031l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: a3.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10494k implements InterfaceC10492i {

    /* JADX INFO: renamed from: a */
    public int f31094a;

    /* JADX INFO: renamed from: b */
    public final boolean f31095b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f31096c;

    public AbstractC10494k(int i10, int i11) {
        this.f31094a = (i11 & 1) != 0 ? Integer.MAX_VALUE : i10;
        this.f31095b = false;
        this.f31096c = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final String m10958d() {
        String strM19349Y = AbstractC17680n.m19349Y(this.f31096c, ",\n", null, null, 0, null, null, 62);
        AbstractC16544l.m18094g(strM19349Y, "<this>");
        return AbstractC21031l.m21493q(AbstractC21031l.m21495s(new C0740V(strM19349Y, 7), new C15058c(20)), Separators.RETURN, null, 62);
    }
}
