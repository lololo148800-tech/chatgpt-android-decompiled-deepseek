package p288Lb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p214Ib.C3679v;
import p265Kb.InterfaceC4623p;
import p379Pb.C6380a;
import p379Pb.C6381b;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Lb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4976i extends AbstractC3656B {

    /* JADX INFO: renamed from: a */
    public final C4987t f16216a;

    /* JADX INFO: renamed from: b */
    public final C4987t f16217b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4623p f16218c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C4970c f16219d;

    public C4976i(C4970c c4970c, C3669l c3669l, Type type, AbstractC3656B abstractC3656B, Type type2, AbstractC3656B abstractC3656B2, InterfaceC4623p interfaceC4623p) {
        this.f16219d = c4970c;
        this.f16216a = new C4987t(c3669l, abstractC3656B, type);
        this.f16217b = new C4987t(c3669l, abstractC3656B2, type2);
        this.f16218c = interfaceC4623p;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        int iMo5616N0 = c6381b.mo5616N0();
        if (iMo5616N0 == 9) {
            c6381b.mo5627e0();
            return null;
        }
        Map map = (Map) this.f16218c.mo3263R();
        C4987t c4987t = this.f16217b;
        C4987t c4987t2 = this.f16216a;
        AbstractC3656B abstractC3656B = (AbstractC3656B) c4987t.f16260c;
        AbstractC3656B abstractC3656B2 = (AbstractC3656B) c4987t2.f16260c;
        if (iMo5616N0 == 1) {
            c6381b.mo5621a();
            while (c6381b.hasNext()) {
                c6381b.mo5621a();
                Object objMo4358a = abstractC3656B2.mo4358a(c6381b);
                if (map.put(objMo4358a, abstractC3656B.mo4358a(c6381b)) != null) {
                    throw new C3679v(AbstractC10763a.m11051i(objMo4358a, "duplicate key: "));
                }
                c6381b.mo5614E();
            }
            c6381b.mo5614E();
        } else {
            c6381b.mo5626e();
            while (c6381b.hasNext()) {
                C6380a.f20774a.getClass();
                C6380a.m6991a(c6381b);
                Object objMo4358a2 = abstractC3656B2.mo4358a(c6381b);
                if (map.put(objMo4358a2, abstractC3656B.mo4358a(c6381b)) != null) {
                    throw new C3679v(AbstractC10763a.m11051i(objMo4358a2, "duplicate key: "));
                }
            }
            c6381b.mo5618P();
        }
        return map;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c6382c.m7016W();
            return;
        }
        this.f16219d.getClass();
        C4987t c4987t = this.f16217b;
        c6382c.m7020k();
        for (Map.Entry entry : map.entrySet()) {
            c6382c.m7013S(String.valueOf(entry.getKey()));
            c4987t.mo4359b(c6382c, entry.getValue());
        }
        c6382c.m7012P();
    }
}
