package p323Mm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8501J3;
import p588Y2.C9642z;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C5501h extends AbstractC5517x implements InterfaceC5499f {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f17955e;

    /* JADX INFO: renamed from: f */
    public final Object f17956f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5501h(Constructor constructor, Object obj, int i10) {
        this.f17955e = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                AbstractC16544l.m18093f(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                AbstractC16544l.m18093f(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f17956f = obj;
                break;
            default:
                AbstractC16544l.m18094g(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                AbstractC16544l.m18093f(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                AbstractC16544l.m18093f(genericParameterTypes2, "getGenericParameterTypes(...)");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : AbstractC17678l.m19310q(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f17956f = obj;
                break;
        }
    }

    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        switch (this.f17955e) {
            case 0:
                AbstractC16544l.m18094g(args, "args");
                AbstractC8501J3.m9165a(this, args);
                Constructor constructor = (Constructor) this.f17969a;
                C9642z c9642z = new C9642z(3);
                c9642z.m10200L(this.f17956f);
                c9642z.m10201M(args);
                c9642z.m10200L(null);
                ArrayList arrayList = (ArrayList) c9642z.f29064Z;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                AbstractC16544l.m18094g(args, "args");
                AbstractC8501J3.m9165a(this, args);
                Constructor constructor2 = (Constructor) this.f17969a;
                C9642z c9642z2 = new C9642z(2);
                c9642z2.m10200L(this.f17956f);
                c9642z2.m10201M(args);
                ArrayList arrayList2 = (ArrayList) c9642z2.f29064Z;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
