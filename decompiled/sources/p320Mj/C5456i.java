package p320Mj;

import android.content.Context;
import bj.AbstractC11452Q;
import bj.C11447L;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import dj.AbstractC13178c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import org.json.JSONArray;
import org.json.JSONObject;
import p1027tp.C20048M;
import p109E3.C2292p;
import p1113xn.C21307a;
import p228J.AbstractC3794B0;
import p342Nj.C5813g;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7958O5;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Mj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5456i implements InterfaceC5448a {

    /* JADX INFO: renamed from: a */
    public final C11447L f17817a;

    /* JADX INFO: renamed from: b */
    public final Context f17818b;

    /* JADX INFO: renamed from: c */
    public final int f17819c;

    public C5456i(C11447L moshi, Context context, int i10) {
        AbstractC16544l.m18094g(moshi, "moshi");
        AbstractC16544l.m18094g(context, "context");
        this.f17817a = moshi;
        this.f17818b = context;
        this.f17819c = i10;
    }

    @Override // p320Mj.InterfaceC5448a
    /* JADX INFO: renamed from: a */
    public final Object mo5906a(String str, AbstractC17325B abstractC17325B, InterfaceC18770c interfaceC18770c) {
        return C20048M.m20869b();
    }

    @Override // p320Mj.InterfaceC5448a
    /* JADX INFO: renamed from: b */
    public final Object mo5907b(C5813g c5813g, InterfaceC18770c interfaceC18770c) {
        String string;
        try {
            InputStream inputStreamOpenRawResource = this.f17818b.getResources().openRawResource(this.f17819c);
            AbstractC16544l.m18093f(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, C21307a.f67720a), 8192);
            try {
                String strM8249b = AbstractC7958O5.m8249b(bufferedReader);
                ArrayList arrayList = null;
                AbstractC7942M5.m8232a(bufferedReader, null);
                JSONArray jSONArrayOptJSONArray = new JSONObject(strM8249b).optJSONArray("steps");
                if (jSONArrayOptJSONArray == null || (string = jSONArrayOptJSONArray.toString()) == null) {
                    return AbstractC9233X.m9806b(new C2292p("Failed to open resource as static template"));
                }
                Util$ParameterizedTypeImpl util$ParameterizedTypeImplM12856f = AbstractC11452Q.m12856f(List.class, NextStep.class);
                C11447L c11447l = this.f17817a;
                c11447l.getClass();
                List list = (List) c11447l.m12850b(util$ParameterizedTypeImplM12856f, AbstractC13178c.f41820a, null).fromJson(string);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((NextStep) it.next());
                    }
                }
                return (arrayList == null || arrayList.isEmpty()) ? AbstractC9233X.m9806b(new C2292p("Expected steps to contain at least one step")) : new C5462o(arrayList, AbstractC3794B0.m4498w("toString(...)"));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC7942M5.m8232a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return AbstractC9233X.m9806b(new C2292p("Failed to open resource as static template. Resource not found."));
        }
    }
}
