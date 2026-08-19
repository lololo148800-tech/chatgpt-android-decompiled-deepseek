package p318Mh;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import androidx.lifecycle.C11082S;
import kotlin.jvm.internal.AbstractC16544l;
import p1143z4.AbstractC21767I;

/* JADX INFO: renamed from: Mh.J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5370J0 {

    /* JADX INFO: renamed from: a */
    public final String f17614a;

    /* JADX INFO: renamed from: b */
    public final AbstractC21767I f17615b;

    /* JADX INFO: renamed from: c */
    public final boolean f17616c;

    /* JADX INFO: renamed from: d */
    public final Object f17617d;

    /* JADX INFO: renamed from: e */
    public final String f17618e;

    /* JADX INFO: renamed from: f */
    public final String f17619f;

    public C5370J0(String name, AbstractC21767I abstractC21767I, boolean z6, Object obj) {
        AbstractC16544l.m18094g(name, "name");
        this.f17614a = name;
        this.f17615b = abstractC21767I;
        this.f17616c = z6;
        this.f17617d = obj;
        this.f17618e = AbstractC10763a.m11054l("{", name, "}");
        this.f17619f = name + "={" + name + "}";
    }

    /* JADX INFO: renamed from: a */
    public final Object m5890a(Object obj) {
        if (obj == null) {
            obj = this.f17617d;
        }
        if (!this.f17616c || obj != null) {
            return obj;
        }
        throw new IllegalStateException(("No value for " + this.f17614a).toString());
    }

    /* JADX INFO: renamed from: b */
    public final Object m5891b(Bundle bundle) {
        AbstractC21767I abstractC21767I = this.f17615b;
        boolean z6 = abstractC21767I instanceof C5372K0;
        String str = this.f17614a;
        Object objMo5893a = null;
        if (z6) {
            if (bundle != null) {
                objMo5893a = abstractC21767I.mo5893a(str, bundle);
            }
        } else if (bundle != null) {
            objMo5893a = bundle.get(str);
        }
        return m5890a(objMo5893a);
    }

    /* JADX INFO: renamed from: c */
    public final Object m5892c(C11082S c11082s) {
        AbstractC21767I abstractC21767I = this.f17615b;
        boolean z6 = abstractC21767I instanceof C5372K0;
        Object objM12131b = null;
        String key = this.f17614a;
        if (z6) {
            C5372K0 c5372k0 = (C5372K0) abstractC21767I;
            AbstractC16544l.m18094g(key, "key");
            String str = c11082s != null ? (String) c11082s.m12131b(key) : null;
            if (str != null && !str.equals("null")) {
                objM12131b = c5372k0.mo5895c(str);
            } else if (!c5372k0.f69050a) {
                throw new IllegalStateException(("Missing nav arg for key " + key + Separators.DOT).toString());
            }
        } else if (c11082s != null) {
            objM12131b = c11082s.m12131b(key);
        }
        return m5890a(objM12131b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5370J0)) {
            return false;
        }
        C5370J0 c5370j0 = (C5370J0) obj;
        return AbstractC16544l.m18089b(this.f17614a, c5370j0.f17614a) && AbstractC16544l.m18089b(this.f17615b, c5370j0.f17615b) && this.f17616c == c5370j0.f17616c && AbstractC16544l.m18089b(this.f17617d, c5370j0.f17617d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f17615b.hashCode() + (this.f17614a.hashCode() * 31)) * 31) + (this.f17616c ? 1231 : 1237)) * 31;
        Object obj = this.f17617d;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
