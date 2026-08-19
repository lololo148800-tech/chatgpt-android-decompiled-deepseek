package p060C6;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p037B9.MeDP.MpoABj;

/* JADX INFO: renamed from: C6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1608e extends AbstractC1604a {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1608e(String key, String str, boolean z6) {
        String strM20d;
        AbstractC16544l.m18094g(key, "key");
        if (str == null) {
            strM20d = AbstractC10763a.m11054l("Object '", key, MpoABj.uUjSRJqKpR);
        } else if (z6) {
            strM20d = AbstractC0010F.m20d("Field '", str, "' on object '", key, "' is stale");
        } else {
            strM20d = "Object '" + key + "' has no field named '" + str + '\'';
        }
        super(strM20d, null);
    }
}
