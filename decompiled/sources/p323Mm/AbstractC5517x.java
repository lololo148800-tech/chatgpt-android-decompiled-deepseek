package p323Mm;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import p544W9.AbstractC8501J3;
import p588Y2.C9642z;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Mm.x */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5517x implements InterfaceC5500g {

    /* JADX INFO: renamed from: a */
    public final Member f17969a;

    /* JADX INFO: renamed from: b */
    public final Type f17970b;

    /* JADX INFO: renamed from: c */
    public final Class f17971c;

    /* JADX INFO: renamed from: d */
    public final List f17972d;

    public AbstractC5517x(Member member, Type type, Class cls, Type[] typeArr) {
        List listM19291N;
        this.f17969a = member;
        this.f17970b = type;
        this.f17971c = cls;
        if (cls != null) {
            C9642z c9642z = new C9642z(2);
            c9642z.m10200L(cls);
            c9642z.m10201M(typeArr);
            ArrayList arrayList = (ArrayList) c9642z.f29064Z;
            listM19291N = AbstractC17681o.m19382k(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listM19291N = AbstractC17678l.m19291N(typeArr);
        }
        this.f17972d = listM19291N;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: a */
    public final List mo5916a() {
        return this.f17972d;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: b */
    public final Member mo5917b() {
        return this.f17969a;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: c */
    public final boolean mo5918c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo5920d(Object[] objArr) {
        AbstractC8501J3.m9165a(this, objArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m5922e(Object obj) {
        if (obj == null || !this.f17969a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // p323Mm.InterfaceC5500g
    public final Type getReturnType() {
        return this.f17970b;
    }
}
