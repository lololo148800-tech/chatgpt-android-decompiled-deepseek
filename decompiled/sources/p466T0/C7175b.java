package p466T0;

import java.util.NoSuchElementException;
import p076Cm.InterfaceC1726d;

/* JADX INFO: renamed from: T0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7175b extends C7174a implements InterfaceC1726d {

    /* JADX INFO: renamed from: o0 */
    public final C7181h f22808o0;

    /* JADX INFO: renamed from: p0 */
    public Object f22809p0;

    public C7175b(C7181h c7181h, Object obj, Object obj2) {
        super(obj, obj2);
        this.f22808o0 = c7181h;
        this.f22809p0 = obj2;
    }

    @Override // p466T0.C7174a, java.util.Map.Entry
    public final Object getValue() {
        return this.f22809p0;
    }

    @Override // p466T0.C7174a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f22809p0;
        this.f22809p0 = obj;
        C7179f c7179f = (C7179f) this.f22808o0.f22829Z;
        C7178e c7178e = c7179f.f22822p0;
        Object obj3 = this.f22806Y;
        if (c7178e.containsKey(obj3)) {
            boolean z6 = c7179f.f22815o0;
            if (!z6) {
                c7178e.put(obj3, obj);
            } else {
                if (!z6) {
                    throw new NoSuchElementException();
                }
                AbstractC7188o abstractC7188o = c7179f.f22813Y[c7179f.f22814Z];
                Object obj4 = abstractC7188o.f22841Y[abstractC7188o.f22843o0];
                c7178e.put(obj3, obj);
                c7179f.m7560c(obj4 != null ? obj4.hashCode() : 0, c7178e.f22818o0, obj4, 0);
            }
            c7179f.f22825s0 = c7178e.f22820q0;
        }
        return obj2;
    }
}
