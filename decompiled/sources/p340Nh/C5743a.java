package p340Nh;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p008A6.C0383c;
import p1113xn.AbstractC21322p;
import p229J0.C4171z3;
import p606Yn.C10106g;
import p664bc.AbstractC11336c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p929oi.AbstractC18201b;

/* JADX INFO: renamed from: Nh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5743a implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final KSerializer f18694a;

    /* JADX INFO: renamed from: b */
    public final C10106g f18695b;

    public C5743a(KSerializer itemSerializer) {
        AbstractC16544l.m18094g(itemSerializer, "itemSerializer");
        this.f18694a = itemSerializer;
        this.f18695b = AbstractC11336c.m12773c("EntryPointHintListSerializer", new SerialDescriptor[0], new C0383c(23));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        String strMo5479m = decoder.mo5479m();
        if (AbstractC21322p.m21681O(strMo5479m)) {
            return C17689w.f56480Y;
        }
        List listM21697e0 = AbstractC21322p.m21697e0(strMo5479m, new String[]{Separators.COMMA}, 0, 6);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM21697e0, 10));
        Iterator it = listM21697e0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC21322p.m21711s0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC18201b.f58034a.m12903b((String) it2.next(), this.f18694a));
        }
        return arrayList3;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f18695b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        List value = (List) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(AbstractC17680n.m19349Y(value, Separators.COMMA, null, null, 0, null, new C4171z3(this, 20), 30));
    }
}
