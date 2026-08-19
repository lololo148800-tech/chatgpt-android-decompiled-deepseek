package p318Mh;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import bo.AbstractC11516d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1143z4.AbstractC21767I;

/* JADX INFO: renamed from: Mh.K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5372K0 extends AbstractC21767I {

    /* JADX INFO: renamed from: l */
    public final KSerializer f17621l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5372K0(KSerializer serializer, boolean z6) {
        super(z6);
        AbstractC16544l.m18094g(serializer, "serializer");
        this.f17621l = serializer;
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: a */
    public final Object mo5893a(String key, Bundle bundle) {
        AbstractC16544l.m18094g(bundle, "bundle");
        AbstractC16544l.m18094g(key, "key");
        String string = bundle.getString(key);
        if (string != null && !string.equals("null")) {
            return mo5895c(string);
        }
        if (this.f69050a) {
            return null;
        }
        throw new IllegalStateException(("Missing nav arg for key " + key + Separators.DOT).toString());
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: b */
    public final String mo5894b() {
        return "serializable";
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: c */
    public final Object mo5895c(String str) {
        return AbstractC11516d.f34842d.m12903b(AbstractC10763a.m11054l(Separators.DOUBLE_QUOTE, str, Separators.DOUBLE_QUOTE), this.f17621l);
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: e */
    public final void mo5896e(Bundle bundle, String key, Object obj) {
        AbstractC16544l.m18094g(key, "key");
        bundle.putSerializable(key, mo5897f(obj));
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: f */
    public final String mo5897f(Object obj) {
        if (obj == null) {
            if (this.f69050a) {
                return "null";
            }
            throw new IllegalStateException("Missing nav arg.");
        }
        String strM12905d = AbstractC11516d.f34842d.m12905d(this.f17621l, obj);
        if (strM12905d.charAt(0) != '\"' || strM12905d.charAt(strM12905d.length() - 1) != '\"') {
            throw new IllegalArgumentException("Serialized value must be a string.");
        }
        String strSubstring = strM12905d.substring(1, strM12905d.length() - 1);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }
}
