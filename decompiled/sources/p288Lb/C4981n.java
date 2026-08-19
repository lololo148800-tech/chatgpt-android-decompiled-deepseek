package p288Lb;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import p214Ib.C3674q;
import p265Kb.InterfaceC4623p;
import p335Nb.AbstractC5704c;
import p379Pb.C6381b;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Lb.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4981n extends AbstractC4980m {

    /* JADX INFO: renamed from: b */
    public final InterfaceC4623p f16239b;

    public C4981n(InterfaceC4623p interfaceC4623p, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f16239b = interfaceC4623p;
    }

    @Override // p288Lb.AbstractC4980m
    /* JADX INFO: renamed from: c */
    public final Object mo5637c() {
        return this.f16239b.mo3263R();
    }

    @Override // p288Lb.AbstractC4980m
    /* JADX INFO: renamed from: e */
    public final void mo5639e(Object obj, C6381b c6381b, C4979l c4979l) throws IllegalAccessException {
        Object objMo4358a = c4979l.f16233i.mo4358a(c6381b);
        if (objMo4358a == null && c4979l.f16236l) {
            return;
        }
        Field field = c4979l.f16226b;
        if (c4979l.f16230f) {
            C4983p.m5640b(obj, field);
        } else if (c4979l.f16237m) {
            throw new C3674q(AbstractC9306j0.m9889h("Cannot set value of 'static final' ", AbstractC5704c.m6150d(field, false)));
        }
        field.set(obj, objMo4358a);
    }

    @Override // p288Lb.AbstractC4980m
    /* JADX INFO: renamed from: d */
    public final Object mo5638d(Object obj) {
        return obj;
    }
}
