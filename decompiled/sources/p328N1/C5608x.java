package p328N1;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: N1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C5608x {

    /* JADX INFO: renamed from: a */
    public final ArrayList f18150a;

    public C5608x(InterfaceC5607w... interfaceC5607wArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC5607wArr.length > 0) {
            InterfaceC5607w interfaceC5607w = interfaceC5607wArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(AbstractC9306j0.m9892k(AbstractC10763a.m11058p(Separators.QUOTE, str, "' must be unique. Actual [ ["), AbstractC17680n.m19349Y(list, null, null, null, 0, null, null, 63), ']').toString());
            }
            AbstractC17686t.m19398v(list, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f18150a = arrayList2;
        if (arrayList2.size() > 0) {
            throw AbstractC14376f.m15860z(0, arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5608x) && AbstractC16544l.m18089b(this.f18150a, ((C5608x) obj).f18150a);
    }

    public final int hashCode() {
        return this.f18150a.hashCode();
    }
}
