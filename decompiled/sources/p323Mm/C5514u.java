package p323Mm;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p544W9.AbstractC8501J3;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9393x3;
import p588Y2.C9642z;
import p909nm.AbstractC17678l;
import p909nm.C17689w;

/* JADX INFO: renamed from: Mm.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C5514u extends AbstractC5516w implements InterfaceC5499f {

    /* JADX INFO: renamed from: f */
    public final Object[] f17966f;

    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        AbstractC8501J3.m9165a(this, args);
        C9642z c9642z = new C9642z(2);
        c9642z.m10201M(this.f17966f);
        c9642z.m10201M(args);
        ArrayList arrayList = (ArrayList) c9642z.f29064Z;
        return m5921f(null, arrayList.toArray(new Object[arrayList.size()]));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5514u(Method method, Object[] boundReceiverComponents) {
        Collection collectionM9974d;
        AbstractC16544l.m18094g(method, "method");
        AbstractC16544l.m18094g(boundReceiverComponents, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC16544l.m18093f(genericParameterTypes, "getGenericParameterTypes(...)");
        int length = boundReceiverComponents.length;
        String str = zakks.rSnaPYapzTCd;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(length, "Requested element count ", str).toString());
        }
        int length2 = genericParameterTypes.length - length;
        length2 = length2 < 0 ? 0 : length2;
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(length2, "Requested element count ", str).toString());
        }
        if (length2 == 0) {
            collectionM9974d = C17689w.f56480Y;
        } else {
            int length3 = genericParameterTypes.length;
            if (length2 >= length3) {
                collectionM9974d = AbstractC17678l.m19291N(genericParameterTypes);
            } else if (length2 == 1) {
                collectionM9974d = AbstractC9393x3.m9974d(genericParameterTypes[length3 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length2);
                for (int i10 = length3 - length2; i10 < length3; i10++) {
                    arrayList.add(genericParameterTypes[i10]);
                }
                collectionM9974d = arrayList;
            }
        }
        super(method, false, (Type[]) collectionM9974d.toArray(new Type[0]));
        this.f17966f = boundReceiverComponents;
    }
}
