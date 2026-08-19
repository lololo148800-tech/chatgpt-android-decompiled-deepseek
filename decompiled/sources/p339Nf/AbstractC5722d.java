package p339Nf;

import android.gov.nist.core.Separators;
import android.net.Uri;
import androidx.glance.appwidget.protobuf.C11043g0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Nf.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5722d {

    /* JADX INFO: renamed from: a */
    public static final List f18533a = AbstractC17681o.m19382k("co", "com", "net", "gov", "org", "ac", "edu");

    /* JADX INFO: renamed from: a */
    public static final String m6157a(String str) {
        Object objM9806b;
        String host;
        AbstractC16544l.m18094g(str, "<this>");
        try {
            objM9806b = Uri.parse(C11043g0.m12023e(str));
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        if (objM9806b instanceof C17311n) {
            objM9806b = null;
        }
        Uri uri = (Uri) objM9806b;
        if (uri == null || (host = uri.getHost()) == null) {
            return null;
        }
        List listM21697e0 = AbstractC21322p.m21697e0(AbstractC21329w.m21731r(host, "www.", ""), new String[]{Separators.DOT}, 0, 6);
        if (listM21697e0.size() <= 2) {
            return (String) AbstractC17680n.m19341Q(listM21697e0);
        }
        return f18533a.contains(listM21697e0.get(listM21697e0.size() - 2)) ? (String) listM21697e0.get(listM21697e0.size() - 3) : (String) listM21697e0.get(listM21697e0.size() - 2);
    }
}
