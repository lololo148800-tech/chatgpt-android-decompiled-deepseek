package p1027tp;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.Method;
import java.util.Map;
import p046Bk.p047Ep.QzvfuIgrngtl;

/* JADX INFO: renamed from: tp.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C20082z extends AbstractC20056V {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f63597b;

    /* JADX INFO: renamed from: c */
    public final Method f63598c;

    /* JADX INFO: renamed from: d */
    public final int f63599d;

    /* JADX INFO: renamed from: e */
    public final boolean f63600e;

    public /* synthetic */ C20082z(Method method, int i10, boolean z6, int i11) {
        this.f63597b = i11;
        this.f63598c = method;
        this.f63599d = i10;
        this.f63600e = z6;
    }

    @Override // p1027tp.AbstractC20056V
    /* JADX INFO: renamed from: a */
    public final void mo20858a(C20045J c20045j, Object obj) {
        switch (this.f63597b) {
            case 0:
                Map map = (Map) obj;
                int i10 = this.f63599d;
                Method method = this.f63598c;
                if (map == null) {
                    throw AbstractC20056V.m20885k(method, i10, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC20056V.m20885k(method, i10, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC20056V.m20885k(method, i10, AbstractC10763a.m11054l("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw AbstractC20056V.m20885k(method, i10, "Field map value '" + value + QzvfuIgrngtl.RtSxOn + C20057a.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    c20045j.m20861a(str, string, this.f63600e);
                }
                return;
            default:
                Map map2 = (Map) obj;
                int i11 = this.f63599d;
                Method method2 = this.f63598c;
                if (map2 == null) {
                    throw AbstractC20056V.m20885k(method2, i11, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw AbstractC20056V.m20885k(method2, i11, "Query map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw AbstractC20056V.m20885k(method2, i11, AbstractC10763a.m11054l("Query map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    String string2 = value2.toString();
                    if (string2 == null) {
                        throw AbstractC20056V.m20885k(method2, i11, "Query map value '" + value2 + "' converted to null by " + C20057a.class.getName() + " for key '" + str2 + "'.", new Object[0]);
                    }
                    c20045j.m20864d(str2, string2, this.f63600e);
                }
                return;
        }
    }
}
