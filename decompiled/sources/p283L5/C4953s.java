package p283L5;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.protobuf.AbstractC12107L1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: L5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C4953s {

    /* JADX INFO: renamed from: b */
    public static final C4953s f16156b = new C4953s(AbstractC17659D.m19254p(new LinkedHashMap()));

    /* JADX INFO: renamed from: a */
    public final Map f16157a;

    public C4953s(Map map) {
        this.f16157a = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m5601a() {
        String lowerCase = SIPHeaderNames.CONTENT_TYPE.toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        List list = (List) this.f16157a.get(lowerCase);
        if (list != null) {
            return (String) AbstractC17680n.m19353c0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4953s) && AbstractC16544l.m18089b(this.f16157a, ((C4953s) obj).f16157a);
    }

    public final int hashCode() {
        return this.f16157a.hashCode();
    }

    public final String toString() {
        return AbstractC12107L1.m13827r(new StringBuilder("NetworkHeaders(data="), this.f16157a, ')');
    }
}
