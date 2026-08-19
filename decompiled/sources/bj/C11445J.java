package bj;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: bj.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C11445J extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final Type f34601a;

    /* JADX INFO: renamed from: b */
    public final String f34602b;

    /* JADX INFO: renamed from: c */
    public final Object f34603c;

    /* JADX INFO: renamed from: d */
    public AbstractC11471r f34604d;

    public C11445J(Type type, String str, Object obj) {
        this.f34601a = type;
        this.f34602b = str;
        this.f34603c = obj;
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        AbstractC11471r abstractC11471r = this.f34604d;
        if (abstractC11471r != null) {
            return abstractC11471r.fromJson(abstractC11477x);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        AbstractC11471r abstractC11471r = this.f34604d;
        if (abstractC11471r == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        abstractC11471r.toJson(abstractC11440E, obj);
    }

    public final String toString() {
        AbstractC11471r abstractC11471r = this.f34604d;
        return abstractC11471r != null ? abstractC11471r.toString() : super.toString();
    }
}
