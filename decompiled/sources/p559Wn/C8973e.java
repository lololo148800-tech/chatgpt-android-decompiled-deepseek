package p559Wn;

import ao.C11163f0;
import ao.C11181o0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p509Uk.lpqL.SfpOlmlMATQ;
import p606Yn.C10100a;
import p606Yn.C10108i;
import p664bc.AbstractC11336c;
import p909nm.C17689w;

/* JADX INFO: renamed from: Wn.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8973e implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27409Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8974f f27410Z;

    public /* synthetic */ C8973e(C8974f c8974f, int i10) {
        this.f27409Y = i10;
        this.f27410Z = c8974f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10100a buildSerialDescriptor = (C10100a) obj;
        switch (this.f27409Y) {
            case 0:
                AbstractC16544l.m18094g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C11163f0 c11163f0 = C11181o0.f33828b;
                C17689w c17689w = C17689w.f56480Y;
                buildSerialDescriptor.m10678a(SfpOlmlMATQ.WreMrxudzGtUeEH, c11163f0, c17689w, false);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                C8974f c8974f = this.f27410Z;
                sb2.append(c8974f.f27411a.mo4448c());
                sb2.append('>');
                buildSerialDescriptor.m10678a("value", AbstractC11336c.m12774d(sb2.toString(), C10108i.f29933b, new SerialDescriptor[0], new C8973e(c8974f, 1)), c17689w, false);
                List list = c8974f.f27412b;
                AbstractC16544l.m18094g(list, "<set-?>");
                buildSerialDescriptor.f29899b = list;
                break;
            default:
                AbstractC16544l.m18094g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.f27410Z.f27415e.entrySet()) {
                    buildSerialDescriptor.m10678a((String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), C17689w.f56480Y, false);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
