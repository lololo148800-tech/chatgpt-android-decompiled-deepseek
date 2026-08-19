package p929oi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.C16644c;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: oi.l */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C18211l extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C18211l f58045Y = new C18211l(1, C18216q.class, "parseObject", "parseObject()Lkotlinx/serialization/json/JsonElement;", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18216q p10 = (C18216q) obj;
        AbstractC16544l.m18094g(p10, "p0");
        p10.f58052b++;
        if (p10.m19727g('}')) {
            return new C16644c(C17690x.f56481Y);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (p10.m19724d()) {
            C18217r c18217rM19726f = p10.m19726f(true);
            if (!c18217rM19726f.f58055b) {
                break;
            }
            ArrayList arrayList = p10.f58053c;
            String str = c18217rM19726f.f58054a;
            arrayList.add(str);
            if (!p10.m19724d()) {
                break;
            }
            if (!p10.m19727g(':')) {
                throw new IllegalArgumentException("Malformed partial JSON object, parity with web implementation.");
            }
            if (!p10.m19724d()) {
                break;
            }
            linkedHashMap.put(str, p10.m19725e());
            if (!p10.m19724d()) {
                break;
            }
            if (p10.m19727g('}')) {
                arrayList.remove(AbstractC17681o.m19381j(arrayList));
                break;
            }
            if (!p10.m19727g(',')) {
                break;
            }
            arrayList.remove(AbstractC17681o.m19381j(arrayList));
        }
        return new C16644c(linkedHashMap);
    }
}
