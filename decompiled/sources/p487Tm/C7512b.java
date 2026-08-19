package p487Tm;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Tm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7512b implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C7512b f23829Z = new C7512b(0);

    /* JADX INFO: renamed from: o0 */
    public static final C7512b f23830o0 = new C7512b(1);

    /* JADX INFO: renamed from: p0 */
    public static final C7512b f23831p0 = new C7512b(2);

    /* JADX INFO: renamed from: q0 */
    public static final C7512b f23832q0 = new C7512b(3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23833Y;

    public /* synthetic */ C7512b(int i10) {
        this.f23833Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f23833Y) {
            case 0:
                ParameterizedType it = (ParameterizedType) obj;
                List list = ReflectClassUtilKt.f51680a;
                AbstractC16544l.m18094g(it, "it");
                Type ownerType = it.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType it2 = (ParameterizedType) obj;
                List list2 = ReflectClassUtilKt.f51680a;
                AbstractC16544l.m18094g(it2, "it");
                Type[] actualTypeArguments = it2.getActualTypeArguments();
                AbstractC16544l.m18093f(actualTypeArguments, "getActualTypeArguments(...)");
                return AbstractC17678l.m19297d(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!Name.isValidIdentifier(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return Name.identifier(simpleName);
                }
                return null;
        }
    }
}
