package tf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8088f6;
import p586Y0.C9566r;
import p749fd.AbstractC13627l;
import p749fd.C13621f;
import p749fd.C13625j;
import p759g1.C13800b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: tf.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C19902G extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63059Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13625j f63060Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19902G(C13625j c13625j, int i10) {
        super(0);
        this.f63059Y = i10;
        this.f63060Z = c13625j;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f63059Y) {
            case 0:
                C13625j c13625j = this.f63060Z;
                C9566r c9566r = c13625j.f43050c;
                if (!c9566r.isEmpty()) {
                    C13621f c13621f = (C13621f) c9566r.remove(AbstractC17681o.m19381j(c9566r));
                    List list = c13621f.f43031a;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        long j10 = ((C13800b) it.next()).f43584a;
                        float fM15149a = AbstractC13627l.m15149a(c13625j.f43055h, c13625j.f43056i);
                        arrayList.add(new C13800b(AbstractC8088f6.m8536b(C13800b.m15306g(j10) * fM15149a, C13800b.m15307h(j10) * fM15149a)));
                    }
                    c13625j.f43049b.add(C13621f.m15145a(c13621f, AbstractC17680n.m19323D0(arrayList), 0.0f, 14));
                    c13625j.f43051d.add(c13621f);
                }
                return C17296C.f55119a;
            case 1:
                return Boolean.valueOf(!this.f63060Z.f43050c.isEmpty());
            default:
                return Boolean.valueOf(!this.f63060Z.f43049b.isEmpty());
        }
    }
}
