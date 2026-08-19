package p323Mm;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8501J3;
import p588Y2.C9642z;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C5513t extends AbstractC5516w implements InterfaceC5499f {

    /* JADX INFO: renamed from: f */
    public final boolean f17964f;

    /* JADX INFO: renamed from: g */
    public final Object f17965g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5513t(Method method, boolean z6, Object obj) {
        AbstractC16544l.m18094g(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC16544l.m18093f(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC17678l.m19310q(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f17964f = z6;
        this.f17965g = obj;
    }

    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        AbstractC8501J3.m9165a(this, args);
        C9642z c9642z = new C9642z(2);
        c9642z.m10200L(this.f17965g);
        c9642z.m10201M(args);
        ArrayList arrayList = (ArrayList) c9642z.f29064Z;
        return m5921f(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
